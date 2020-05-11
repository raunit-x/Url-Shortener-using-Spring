package com.rauniturlproject.urlminiprojectmaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import javax.servlet.http.HttpSession;

@Controller
public class UrlController
{
    private final UrlRepository urlRepository;
    public UrlController(UrlRepository urlRepository)
    {
        this.urlRepository = urlRepository;
    }

    @RequestMapping("/home")
    public String home(HttpSession session)
    {
        return "home.jsp";
    }

    @GetMapping("/all")
    public List<Url> getAll()
    {
        return this.urlRepository.findAll();
    }

    @RequestMapping("/addUrl")
    public ModelAndView addUrl(Url url)
    {
        List<Url> tempUrl = this.urlRepository.findByUrlString(url.getUrlString());
        ModelAndView mv = new ModelAndView("home.jsp");
        if(tempUrl.size() == 0)
            this.urlRepository.save(url);
        else url = tempUrl.get(0);
        mv.addObject("longUrl", url);
        return mv;
    }

    @RequestMapping("/getUrl")
    public ModelAndView getUrl(@RequestParam String id)
    {
        Url url = this.urlRepository.findById(id).orElse(new Url(""));
        ModelAndView mv = new ModelAndView("home.jsp");
        mv.addObject("getUrl", url);
        return mv;
    }

    @RequestMapping("/showDatabase")
    public ModelAndView showDatabase()
    {
        List<Url> urls = this.urlRepository.findAll();
        ModelAndView mv = new ModelAndView("showDB.jsp");
        mv.addObject("urlsDb", urls);
        return mv;
    }

//    @GetMapping("/{id}")
//    public Optional<Url> findById(@PathVariable("id") String id)
//    {
//        return this.urlRepository.findById(id);
//    }
//
//    @GetMapping("/{urlString}")
//    public List<Url> getByUrlString(@PathVariable("urlString") String urlString)
//    {
//        return this.urlRepository.findByUrlString(urlString);
//    }
}

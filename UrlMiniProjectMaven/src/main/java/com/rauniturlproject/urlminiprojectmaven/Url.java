package com.rauniturlproject.urlminiprojectmaven;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;


public class Url
{
    @Id
    private String id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String urlString;

    public Url(String urlString)
    {
        this.urlString = urlString;
    }

    @Override
    public String toString()
    {
        return String.format("[ID:%s URL:%s]", this.id, this.urlString);
    }

    public void setUrlString(String urlString)
    {
        this.urlString = urlString;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return this.id;
    }

    public String getUrlString()
    {
        return this.urlString;
    }

}

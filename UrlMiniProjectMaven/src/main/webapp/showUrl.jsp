<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="../resources/static/homeCSS.css">
    <link href="https://fonts.googleapis.com/css2?family=Lato&family=Monoton&family=Press+Start+2P&display=swap"
          rel="stylesheet">
</head>
<body>
<h1 class="heading">URL SHORTENER</h1>
<div class="container">
    <form action="addUrl">
        <label for="urlInput">Enter the URL</label>
        <p class="warning">(The URL will be added to the database)</p>
        <input type="text" id="urlInput" name="urlString" placeholder="Url to be shrunk">
        <input type="submit" value="SHORTEN!">
        <h2>Tiny URL: </h2>
    </form>
</div>
<br>
<br>
<div class="container">
    <form action="getUrl">
        <label for="idInput">Enter the ID</label>
        <p class="warning">(A null object will returned if not present)</p>
        <input type="text" id="idInput" name="id" placeholder="ID to search URL">
        <input type="submit" value="GET URL!">
        <h2>Long URL for <span class="key">${url.id}</span> : <span class="value">${url.urlString}</span></h2>
    </form>
</div>
</body>
</html>

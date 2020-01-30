package com;
/*Creates static parts for HTML page*/
public class PageParts {
   public static String getPageTop(){
       return "<!DOCTYPE html>\n"+
"<html lang=\"en\">\n"+
"<head>\n"+
"<meta charset=\"utf-8\">\n"+
"<meta http-equiv=\"X-UA-Compatible\"\n"+
       "content=\"IE=edge\">\n"+
"<meta name=\"viewport\"\n"+
       "content=\"width=device-width, initial-\n"+
       "scale=1\">\n"+
               "<title>xKeep</title>\n"+
"<link href=\"css/bootstrap.min.css\"\n"+
       "rel=\"stylesheet\">\n"+
"<link href=\"css/myStyles.css\"\n"+
       "rel=\"stylesheet\">\n"+
"</head>\n"+
"<body>\n"+
getMenubar()+
"<div class=\"container marginmenu\"role=\"main\">\n";

   }

   public static String getPageBottom(){
       return "\n</div>\n" +
               "<script src=\"js/jquery.min.js\"></script>\n" +
               "<script src=\"js/bootstrap.min.js\"></script>\t" +
               "</body>\n" +
               "</html>";
   }

   public static String getMenubar(){
       return "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
               "  <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n" +
               "  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
               "    <span class=\"navbar-toggler-icon\"></span>\n" +
               "  </button>\n" +
               "\n" +
               "  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
               "    <ul class=\"navbar-nav mr-auto\">\n" +
               "      <li class=\"nav-item active\">\n" +
               "        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n" +
               "      </li>\n" +
               "      <li class=\"nav-item\">\n" +
               "        <a class=\"nav-link\" href=\"#\">Link</a>\n" +
               "      </li>\n" +
               "      <li class=\"nav-item dropdown\">\n" +
               "        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
               "          Dropdown\n" +
               "        </a>\n" +
               "        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
               "          <a class=\"dropdown-item\" href=\"#\">Action</a>\n" +
               "          <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
               "          <div class=\"dropdown-divider\"></div>\n" +
               "          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n" +
               "        </div>\n" +
               "      </li>\n" +
               "      <li class=\"nav-item\">\n" +
               "        <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n" +
               "      </li>\n" +
               "    </ul>\n" +
               "    <form class=\"form-inline my-2 my-lg-0\">\n" +
               "      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
               "      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n" +
               "    </form>\n" +
               "  </div>\n" +
               "</nav>";
   }
}

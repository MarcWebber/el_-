// "use strict"
function AppendHrefToContainer(title, text, time, href){
    var container = document.getElementById("container")
    var newhref = document.createElement("a")
    newhref.setAttribute("class", "pure_link")
    var new_title = document.createElement("p")
    new_title.setAttribute("class", "new_title")
    var title_txt = document.createTextNode(title)
    newhref.setAttribute("href", href)
    newhref.setAttribute("target", "_blank")
    new_title.appendChild(title_txt)
    newhref.appendChild(new_title)
    container.appendChild(newhref)

    var new_txt = document.createElement("p")
    new_txt.setAttribute("class", "new_text")
    var text_txt = document.createTextNode(text)
    new_txt.appendChild(text_txt)
    newhref.appendChild(new_txt)

    var new_time = document.createElement("p")
    new_time.setAttribute("class", "new_time")
    var time_txt = document.createTextNode(time)
    new_time.appendChild(time_txt)
    newhref.appendChild(new_time)

    var line_sep = document.createElement("hr")
    line_sep.setAttribute("class", "new_hr")
    container.appendChild(line_sep)
    
}
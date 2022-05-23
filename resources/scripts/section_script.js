"use strict"

class Section {
    constructor() {
    }

    setFont() {
        let new_font_size = $(".section_top").height() * 0.9;
        $(".tag_title").css("font-size",new_font_size*0.8);
        $(".tag_text").css("font-size",new_font_size*0.6);
        $(".tag_date").css("font-size",new_font_size*0.5);

    }

    setTextSize() {
        //设置字号大小
        let new_font_size = $(".section_top").height() * 0.9;
        let section_text = $(".section_text");
        let section_extra = $(".section_extra");
        // section_text.cssText("font-size",new_font_size);
        for (let t of section_text) {
            $(t).css("font-size", new_font_size, "font-family", "中华新魏");
        }
        for (let t of section_extra) {
            $(t).css("font-size", new_font_size * 0.4
                // ,"font-weight",300,"font-family","楷体"
            );
        }
    }

    selectFatherSection(fatherclassname) {
        return $(fatherclassname);
    }

    appendTag(father,title,text,time,i) {
        let a=title;
        let b=text;
        let c=time;
        let newhtml = "<div class=\"tag\">\n" +
            "                    <div class=\"tag_title\">\n" +
            "                        活动标题\n" +
            "                    </div>\n" +
            "                    <div class=\"tag_text\">\n" +
            "                        活动描述\n" +
            "                    </div>\n" +
            "                    <div class=\"tag_time\">\n" +
            "                        活动时间\n" +
            "                    </div>\n" +
            "                </div>";
        // console.log("father=",father);
        $(father).append(newhtml);
        // $(father)[0].innerHTML(newhtml);
        this.setFont();
    }

    // let father = selectFatherSection("section_left");
    // appendTag(father[0], null, null, null);
}

var section = new Section();
section.setTextSize();
var sections = section.selectFatherSection(".section_left");
section.appendTag(".section_left","震惊！","南京大学深夜放毒！","2022-1-1",1);
section.appendTag(".section_right","震惊！","南京大学深夜放毒！","2022-1-1",2);
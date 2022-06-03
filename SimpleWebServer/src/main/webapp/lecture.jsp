<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,user-scalable=0,initial-scale=1.0,
          minimum-scale=1.0, maximum-scale=1.0">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
    <script src="resources/scripts/bin.js"></script>
    <script src="./resources/scripts/lectureSQL.js"></script>
    <script>
        var window_width = $(window).width();//获取屏幕高度
        var window_height = $(window).height();
        // new_alert();
    </script>
    <link rel="stylesheet" href="resources/css/head_style.css">
    <link rel="stylesheet" href="resources/css/footer_style.css">
    <link rel="stylesheet" href="resources/css/banner_style.css">
    <link rel="stylesheet" href="resources/css/section_style.css">
    <link rel="stylesheet" href="resources/css/constant_present.css">

    <title>主页</title>

</head>
<body class="el-main-page">
<!--头部开始-->
<header>
    <div class="header-top">
        <div class="header-image">
            <img src="resources/images/news.png" alt="LOGO">
        </div>

        <div class="search">
            <input type="text" placeholder="搜索">
            <img src="resources/images/glass.png" alt="放大镜">
        </div>
        <div class="plus">
            <img src="resources/images/plus.png" alt="plus">
        </div>

    </div>

    <div class="header-navi">
        <div id="navi1">
            <a href="./activity.html" class="header_href">
                <p class="navi_line1">
                    <img src="resources/images/activity.png" width="25vh" height="25vh" alt="导航图1">
                </p>
                <p class="navi_line2">
                    <span class="header-text">最新活动</span>
                </p>
            </a>
        </div>

        <div id="navi2">
            <a href="./lecture.html" class="header_href">
                <p class="navi_line1">
                    <img src="resources/images/lecture.png" width="25vh" height="25vh" alt="导航图2">
                </p>
                <p class="navi_line2">
                    <span class="header-text">讲座信息</span>
                </p>
            </a>
        </div>

        <div id="navi3">
            <a href="./href.html" class="header_href">
                <p class="navi_line1">
                    <img src="resources/images/link.png" width=25vh height=25vh alt="导航图3">
                </p>
                <p class="navi_line2">
                    <span class="header-text">个人链接</span>
                </p>
            </a>
        </div>

        <div id="navi4">
            <a href="./home.html" class="header_href">
                <p class="navi_line1">
                    <img src="resources/images/personal_info.png" width=25vh height=25vh alt="!">
                </p>
                <p class="navi_line2">
                    <span class="header-text">个人中心</span>
                </p>
            </a>
        </div>
    </div>

</header>
<!--头部结束-->

<div id="container">

</div>

<footer>
    <div class="footer-navi">
        <div id="footer_navi1">
            <a href="./main.html" class="footer_href">
                <p class="navi_line1">
                    <img src="./resources/images/activity.png" alt="导航图1" width=25vh height=25vh>
                </p>
                <p class="navi_line2">
                    <span class="header-text">主页</span>
                </p>
            </a>
        </div>


        <div id="footer_navi2">
            <a href="./news.html" class="footer_href">
                <p class="navi_line1">
                    <img src="./resources/images/lecture.png" alt="导航图2" width=25vh height=25vh>
                </p>
                <p class="navi_line2">
                    <span class="header-text">新闻</span>
                </p>
            </a>
        </div>

        <div id="footer_navi3">
            <a href="./href.html" class="footer_href">
                <p class="navi_line1">
                    <img src="./resources/images/link.png" alt="导航图3" width=25vh height=25vh>
                </p>
                <p class="navi_line2">
                    <span class="header-text">优站</span>
                </p>
            </a>
        </div>

        <div id="footer_navi4" class="footer_href">
            <a href="./home.html" class="footer_href">
                <p class="navi_line1">
                    <img src="./resources/images/personal_info.png" alt="导航图4" width=25vh height=25vh>
                </p>
                <p class="navi_line2">
                    <span class="header-text">我的</span>
                </p>
            </a>
        </div>
    </div>
</footer>
</body>

<script type="text/javascript" src="resources/scripts/header_script.js"></script>

<script src="resources/scripts/section_script.js"></script>

<script src="./resources/scripts/render_content.js"></script>


<script>
    function CreateList(){
        for (let i = 0;  i < 12; i++){
            AppendHrefToContainer(i, "href_list", "title_list", "text_list", "date_list")
        }
    }
    
    function ResetList(){
        for (let i = 0; i < 12; i++){
            SetTitleFromLecturesSQL("title_list" + i, i)
            SetHrefFromLecturesSQL("href_list" + i, i)
            SetDateFromLecturesSQL("date_list"+i, i)
        }
        console.log("test")
    }
    RecreateLecturesTable()
    CreateList()
    ResetList()
    // AppendHrefToContainer("测试1", "这里放了一个测试网址", "1145-1-4", "https://www.baidu.com/")
    // AppendHrefToContainer("测试2", "这里放了一些测试网址", "1919-8-10", "https://www.youku.com/")
    var _element = document.getElementById('container'),   
    OriginalPos = _element.offsetTop,  // 初始的值  
    Container_height = _element.offsetHeight + OriginalPos; 
    var is_touching = false

    _element.addEventListener("touchstart", function(e){
        let touch_pl = e.touches[0].pageY;
        if (touch_pl > OriginalPos && touch_pl < OriginalPos + Container_height){
           is_touching = true // 记录差值
       }
    }, false);

    _element.addEventListener('touchmove', function(e) {  
    // e.touches[0].pageY 当前位置  
       let touch_pl = e.touches[0].pageY;
       if (is_touching){
           _element.style.setProperty("top", touch_pl) // 记录差值
       }
           
    }, false);

    _element.addEventListener('touchend', function(e) {  
        _element.style.setProperty("top", OriginalPos)
        RecreateLecturesTable()
        ResetList()

        is_touching = false
    }, false);
</script>
</html>

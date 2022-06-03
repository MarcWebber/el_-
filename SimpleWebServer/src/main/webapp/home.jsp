<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,user-scalable=0,initial-scale=1.0,
          minimum-scale=1.0, maximum-scale=1.0">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
    <script src="resources/scripts/bin.js"></script>
    <script>
        var window_width = $(window).width(); //获取屏幕高度
        var window_height = $(window).height();
        // new_alert();
    </script>
    <link rel="stylesheet" href="resources/css/head_style.css">
    <link rel="stylesheet" href="resources/css/footer_style.css">
    <link rel="stylesheet" href="resources/css/banner_style.css">
    <link rel="stylesheet" href="resources/css/section_style.css">
    <link rel="stylesheet" href="resources/css/homepg_style.css">
    <title>主页</title>
</head>

<body class="el-main-page" bgcolor="WhiteSmoke">
    <!-- 个人信息栏 -->
    <div class="infoline">
        <div class="pixmap">
            <img class="img" src=" " alt="用户照片">
        </div>
        <div class="name">
            <b><font size="5">用户名字</font></b>
            <br><br>
            <p><font size="2">用户介绍用户介绍用户介绍</font></p>
        </div>
    </div>
    <div class="voidline"></div>
    <div class="infoline">
        <div class="normalline">
            <!-- the first line -->
            <div class="smallpix"><img class="img" src=" " alt="志愿服务图标"></div>
            <div class="smallpix2"><p>志愿服务统计：</p></div>
        </div>
        <div class="normalline">
            <p>&nbsp;&nbsp;&nbsp;&nbsp;您的志愿服务时长：</p>
        </div>
        <div class="normalline">
            <p>&nbsp;&nbsp;&nbsp;&nbsp;所需志愿服务时长：</p>
        </div>
        <img class="specialpix" src="resources/images/hege.png" alt="合格">
    </div>
    <div class="voidline"></div>
    <div class="infoline">
        <div class="normalline">
            <!-- the first line -->
            <div class="smallpix"><img class="img" src=" " alt="劳育服务图标"></div>
            <div class="smallpix2">
                <p>劳育时长统计：</p>
            </div>
        </div>
        <div class="normalline">
            <p>&nbsp;&nbsp;&nbsp;&nbsp;您的劳育时长：</p>
        </div>
        <div class="normalline">
            <p>&nbsp;&nbsp;&nbsp;&nbsp;所需劳育时长：</p>
        </div>
        <img class="specialpix" src="resources/images/hege.png" alt="合格">

    </div>
    <div class="voidline"></div>
    <div class="sminfoline">
        <div class="normalline">
            <div class="smallpix">
                <img class="img" src=" " alt="设置图标">
            </div>
            <div class="smallpix2">
                <p>设置</p>
            </div>
        </div>
    </div>
    <!--底部栏-->
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

</html>
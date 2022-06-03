<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>用户登录</title>
    <link rel="stylesheet" href="resources/css/login.css"/>
    <style>
        #pic {
            border: black solid 2px;
            background-size: cover;
            height: 100px;
            width: 100px;
            background-image:url("resources/images/某猪的头像.jpg");
            border-radius: 51px;
        }
    </style>
</head>

<body>

<div id='stars2'></div>
<div id='stars3'></div>

<div class="login">

    <h2>用户登录</h2>
    <span class="login_box" id="pic"></span>
<!--    以post方式提交表单，提交到login    -->
    <form method="get" action="${pageContext.request.contextPath}/login">
        <div class="login_box">
            <input type="text" name='name' id='name' value="^(*￣(oo)￣)^" readonly required
                   placeholder="请输入用户名"/>
            <label for="name"></label>
        </div>

        <div class="login_box">
            <input type="password" name='pwd' id='pwd'
                   placeholder="请输入密码" required/>
            <label for="pwd"></label>
        </div>

        <input id="log" type="submit" value="登录">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
    </form>
</div>
<script>
<!--    登录验证    -->

</script>
<script>
    var login_box=document.getElementsByClassName("login");
    if (window.innerWidth>400){
        login_box[0].clientWidth=320;
    }
</script>
</body>
</html>

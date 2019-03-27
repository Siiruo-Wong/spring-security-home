<%--
  Created by IntelliJ IDEA.
  User: siiruo wong
  Date: 2019/3/26
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>html5制作超炫的用户登录框-www.srcfans.com</title>
    <style>
        body {
            font-family: Arial,serif;
        }

        /* BOX LOGIN */
        .box {
            position: relative;
            height: 410px;
            top: 40px;
            left: 0;
            z-index: 200;
            right: 0;
            width: 400px;
            color: #666;
            border-radius: 3px;
            background: #FFF;
            margin: auto auto 100px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px rgba(0, 0, 0, 0.23);
            overflow: hidden;
        }

        #header {
            background: #009688;
            position: relative;
            height: 100px;
            width: 100%;
            margin-bottom: 30px;
        }

        .box h1 {
            margin-top: 0;
            font-size: 24px;
            color: #FFF;
            text-align: center;
            line-height: 100px;
        }

        .box button {
            background: #cfd8dc;
            border: 0;
            color: #009688;
            padding: 10px;
            font-size: 16px;
            font-weight: 300;
            width: 330px;
            margin: 20px auto;
            display: block;
            cursor: pointer;
            -webkit-transition: all 0.4s;
            transition: all 0.4s;
            border-radius: 2px;
        }

        .box button:active {
            background: #009688;
            color: #263238;
        }

        .box button:hover {
            background: #009688;
            color: #FFF;
            -webkit-transition: all 0.4s;
            transition: all 0.4s;
        }

        .box p {
            font-size: 14px;
            text-align: center;
        }

        .group {
            position: relative;
            margin-bottom: 35px;
            margin-left: 40px;
        }

        .inputMaterial {
            font-size: 18px;
            padding: 10px 10px 10px 5px;
            display: block;
            width: 300px;
            border: none;
            border-bottom: 1px solid #757575;
        }

        .inputMaterial:focus {
            outline: none;
        }

        /* LABEL ======================================= */
        label {
            color: #999;
            font-size: 14px;
            font-weight: normal;
            position: absolute;
            pointer-events: none;
            left: 5px;
            top: 10px;
            transition: 0.2s ease all;
            -moz-transition: 0.2s ease all;
            -webkit-transition: 0.2s ease all;
        }

        /* active state */
        .inputMaterial:focus ~ label, .inputMaterial:valid ~ label {
            top: -20px;
            font-size: 14px;
            color: #009688;
        }

        /* BOTTOM BARS ================================= */
        .bar {
            position: relative;
            display: block;
            width: 315px;
        }

        .bar:before, .bar:after {
            content: '';
            height: 2px;
            width: 0;
            bottom: 1px;
            position: absolute;
            background: #009688;
            transition: 0.2s ease all;
            -moz-transition: 0.2s ease all;
            -webkit-transition: 0.2s ease all;
        }

        .bar:before {
            left: 50%;
        }

        .bar:after {
            right: 50%;
        }

        /* active state */
        .inputMaterial:focus ~ .bar:before, .inputMaterial:focus ~ .bar:after {
            width: 50%;
        }

        /* ANIMATIONS ================ */
        @-webkit-keyframes inputHighlighter {
            from {
                background: #5264AE;
            }
            to {
                width: 0;
                background: transparent;
            }
        }

        @-moz-keyframes inputHighlighter {
            from {
                background: #5264AE;
            }
            to {
                width: 0;
                background: transparent;
            }
        }

        @keyframes inputHighlighter {
            from {
                background: #5264AE;
            }
            to {
                width: 0;
                background: transparent;
            }
        }

        #footer-box {
            width: 100%;
            height: 50px;
            background: #00695c;
            position: absolute;
            bottom: 0;
        }

        .footer-text {
            color: #cfd8dc;
        }

        .sign-up {
            color: white;
            cursor: pointer;
        }

        .sign-up:hover {
            color: #b2dfdb;
        }
    </style>
</head>
<body>
<div class="box">
    <div id="header">
        <h1>LOGIN</h1>
    </div>
    <form action="/login2" method="post">
        <div class="group">
            <input name="username" class="inputMaterial" type="text" required>
            <span class="highlight"></span>
            <span class="bar"></span>
            <label>Username</label>
        </div>
        <div class="group">
            <input name="password" class="inputMaterial" type="password" required>
            <span class="highlight"></span>
            <span class="bar"></span>
            <label>Password</label>
        </div>
        <button id="buttonlogintoregister" type="submit">Login</button>
    </form>
    <div id="footer-box"><p class="footer-text">Not a member?<span class="sign-up"> Sign up now</span></p></div>
</div>
</body>
</html>
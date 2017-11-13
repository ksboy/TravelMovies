<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html lang="zh">
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
    <!-- 窗口适应各种设备的代码 -->
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Mono">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="css/material-components-web.css"/>
    <link rel="stylesheet" href="css/login_layout.css"/>
    <title>跟着电影  去旅行</title>
</head>
<body>
    <div class="mdc-layout-grid login_panel">
    <div class="mdc-layout-grid__inner login_grid">
      <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-6-desktop mdc-layout-grid__cell--span-12-tablet mdc-layout-grid__cell--align-middle">

          <section>
              <div class="mdc-card" style="padding: 10%">
              <section class="mdc-card__primary">
                  <h1 class="mdc-card__title mdc-card__title--large">跟着电影去旅行</h1>
              </section>
              <nav class="mdc-tab-bar">
                  <a class="mdc-tab " href="login.html">
                      <i class="material-icons mdc-tab__icon" aria-label="Login">person</i>
                  </a>
                  <a class="mdc-tab mdc-tab--active" href="signup.html">
                      <i class="material-icons mdc-tab__icon" aria-label="SignUp">person_add</i>
                  </a>
              </nav>
                  
                  <div id="signup">
                      <h2>注册</h2>
                      <section class="mdc-card__supporting-text">
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="name" autocomplete="name" name="name" required>
                                      <label for="name" class="mdc-textfield__label">用户名</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="password" autocomplete="password" name="password" required>
                                      <label for="password" class="mdc-textfield__label">密码</label>
                                  </div>
                              </section>
                               <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="nickname" autocomplete="nickname" name="nickname" required>
                                      <label for="nickname" class="mdc-textfield__label">昵称</label>
                                  </div>
                              </section>
                               <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="question" autocomplete="question" name="question" required>
                                      <label for="question" class="mdc-textfield__label">密保问题</label>
                                  </div>
                              </section>
                               <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="answer" autocomplete="answer" name="answer" required>
                                      <label for="answer" class="mdc-textfield__label">问题答案</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="age" autocomplete="age" name="age">
                                      <label for="age" class="mdc-textfield__label">年龄</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="gender" autocomplete="gender" name="gender">
                                      <label for="gender" class="mdc-textfield__label">性别</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="birth_date" autocomplete="birth_date" name="birth_date">
                                      <label for="birth_date" class="mdc-textfield__label">出生日期</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="bio" autocomplete="bio" name="bio">
                                      <label for="bio" class="mdc-textfield__label">简介</label>
                                  </div>
                              </section>
                              <section class="mdc-form-field max_width">
                                  <div class="mdc-textfield max_width" data-mdc-auto-init="MDCTextfield">
                                      <input type="text" class="mdc-textfield__input" id="tags" autocomplete="tags" name="tags">
                                      <label for="tags" class="mdc-textfield__label">标签</label>
                                  </div>
                              </section>
                              <section class="mdc-card__action" style="text-align: right">
                                  <input type="submit" class="mdc-button mdc-button--primary mdc-ripple-upgraded" data-mdc-auto-init="MDCRipple" style="text-align: right" onclick="signupPost()" value="下一步"/>
		                      </section>
                      </section>
                      
                  </div>
            </div>
        </section>
      </div>
    </div>
  </div>

  <div id="mdc-snackbar" class="mdc-snackbar demo-hidden" aria-live="assertive" aria-atomic="true" aria-hidden="true">
  <div class="mdc-snackbar__text">Message</div>
  <div class="mdc-snackbar__action-wrapper">
    <button type="button" class="mdc-snackbar__action-button" aria-hidden="true">Action</button>
  </div>
</div>

    <script type="text/javascript" src="js/material-components-web.js"></script>
    <script type="text/javascript">mdc.autoInit()</script>
    <script type="text/javascript">
      function signupPost(){
        var name = $("#name").val();
        var password = $("#password").val();
        var nickname = $("#nickname").val();
        var question = $("#question").val();
        var answer = $("#answer").val();
        var age = $("#age").val();
        var gender = $("#gender").val();
        var birth_date = $("#birth_date").val();
        var bio = $("#bio").val();
        var tags = $("#tags").val();
        $.ajax({
            url : "signup.action",
            type : "POST",
            data : {
                name,
                password,
                nickname,
                question,
                answer,
                age,
                gender,
                birth_date,
                bio,
                tags
            },
            success : function() {
              SnackbarMsg("注册成功，即将跳转到登陆页");
              setTimeout(function(){ window.location.href = "login.html"; }, 3000);
            },
            error : function() {
              SnackbarMsg("注册失败，用户名或昵称已被注册");
            }
        })

      }

      function SnackbarMsg(message){
        var MDCSnackbar = mdc.snackbar.MDCSnackbar;
        var MDCSnackbarFoundation = mdc.snackbar.MDCSnackbarFoundation;
        var snackbar = new MDCSnackbar(document.querySelector('.mdc-snackbar'));
        var data = {
          message
        };
        snackbar.show(data);
      }
    </script>
</body>
</html>
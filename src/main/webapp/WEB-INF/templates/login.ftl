<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>登录</title>
<#-- import css -->
<link rel="stylesheet" href="${ctx}/plugins/bootstrap/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/dist/css/adminlte.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/dist/css/skins/skin-blue.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/font-awesome/css/font-awesome.min.css" type="text/css" />
<#-- import js -->
<script src="${ctx}/js/jquery.min.js" type="text/javascript"></script>
<script src="${ctx}/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${ctx}/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
</head>
<body>

<div class="login-box">
  <div class="login-logo">
    <a href="/"><b>Personal CR</b></a>
  </div><!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">Sign in to start your session</p>
    <form action="${ctx}/user/login" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="Email"/>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password"/>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">    
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> Remember Me
            </label>
          </div>                        
        </div><!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
        </div><!-- /.col -->
      </div>
    </form>

    <div class="social-auth-links text-center">
      <p>- OR -</p>
      <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using Facebook</a>
      <a href="#" class="btn btn-block btn-social btn-google-plus btn-flat"><i class="fa fa-google-plus"></i> Sign in using Google+</a>
    </div><!-- /.social-auth-links -->

    <a href="#">I forgot my password</a><br>
    <a href="register.html" class="text-center">Register a new membership</a>

  </div><!-- /.login-box-body -->
</div><!-- /.login-box -->
	
<script type="text/javascript">
    $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
 </script>
</body>
</html>

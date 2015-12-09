<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>用户注册</title>
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

<div class="register-box">
  <div class="register-logo">
    <a href="/"><b>Personal CR</b></a>
  </div>

  <div class="register-box-body">
    <form action="${ctx}/user/register" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="用户名"/>
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="邮箱"/>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="密码"/>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="确认密码"/>
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-md-offset-8 col-md-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">注册</button>
        </div><!-- /.col -->
      </div>
    </form>        

  </div><!-- /.form-box -->
</div><!-- /.register-box -->
	
<script type="text/javascript">
    $(function () {
      $('input').iCheck({
        checkboxClass: 'icheckbox_square-blue',
        radioClass: 'iradio_square-blue',
        increaseArea: '20%'
      });
    });
</script>
</body>
</html>

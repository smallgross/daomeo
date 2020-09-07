function login() {
    $.ajax({
        url: '/loginsuc',
        type: 'post',
        async:true,
        cache:false,
        data: {"username": $('#username').val(), "password": $('#password').val()},
     
        success: function (result) {
     
           if (result) {
        	     
               console.log('true');
               $(location).attr('href','/userlist');
               $.cookie('username',result.username, { expires: 7 });
               $.cookie('password',result.password, { expires: 7 });
            } else {
            	
             alert("用户名或密码错误");
              return false;
        }
        }
        
    });
}
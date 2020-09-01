function login() {
    $.ajax({
        url: '/loginsuc',
        type: 'post',
        dataType: 'text',
        data: {"username": $('#username').val(), "password": $('#password').val()},
     
        success: function (dada) {
     
           if (dada ==="success") {
        	     
                window.location.href='/userlist';
            } else {
            	
            	window.location.href='/show2';
        }
        }
        
    })
}
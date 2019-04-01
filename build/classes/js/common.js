
$(function(){  
	//发送验证码
	$(".sendVerifyCode").on("click", function(){
		var user_phone = $("input[name=userPhone]").val();
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/sendSms",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: {"user_phone":user_phone},
	        success: function (data) {
	        	if(data.result){
	        		alert("已经发送成功");
	        		console.log(data);
	        		return ;
	        	}
	        	else
	        	{
	        		alert("发送验证码失败");
	        		return ;
	        	}
	        }
    	});
	}) 
	//提交
	$(".sub-btn").on("click", function(){
		var data = {};
	 
		data.user_phone = $.trim($("input[name=userPhone]").val());
		data.verifyCode = $.trim($("input[name=verifyCode]").val());
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/loginbyverifycode",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	if(data.result ){
	        		alert("成功");
	        		console.log(data);
	        		return ;
	        	}
	        	else
	        		{
		        		alert("失败,"+data.date);
		        		console.log(data);
		        		return ;
	        		}
	        	
	        }
    	});
	})
	
	
		$(".sub-btn2").on("click", function(){
		
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/carousel",
	        type: "post",
	        dataType: "json",
	        success: function (data) {
	        	console.log(data);
	        }
    	});
	})
		
		$(".sub-btn3").on("click", function(){
		
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/booklist",
	        type: "post",
	        dataType: "json",
	        success: function (data) {
	        	console.log(data);
	        }
    	});
	})
	
			$(".sub-btn4").on("click", function(){
		
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/bookrecommend",
	        type: "post",
	        dataType: "json",
	        success: function (data) {
	        	console.log(data);
	        }
    	});
	})
	
	
		$(".sub-btn5").on("click", function(){
		
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/booklistbytype",
	        type: "post",
	        dataType: "json",
	        data:{"video_type":0},
	        success: function (data) {
	        	console.log(data);
	        }
    	});
	})
			$(".sub-btn6").on("click", function(){
		
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/bookbyid",
	        type: "post",
	        dataType: "json",
	        data:{"video_id":1,"user_id":1},
	        success: function (data) {
	        	console.log(data);
	        }
    	});
	})
	$(".register_sub-btn").on("click", function(){
		var data = {};
	 
		data.user_phone = $.trim($("input[name=register_user_phone]").val());
		data.user_password = $.trim($("input[name=register_user_password]").val());
		data.verifyCode = $.trim($("input[name=register_verifyCode]").val());
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/register",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	if(data.result ){
	        		alert("成功"+data.information);
	        		console.log(data);
	        		return ;
	        	}
	        	else
	        		{
		        		alert("失败,"+data.information);
		        		return ;
	        		}
	        	
	        }
    	});
	})
	
	
	
		$(".sub-btn7").on("click", function(){
		var data = {};
	 
		data.user_phone = $.trim($("input[name=user_phone2]").val());
		data.user_password = $.trim($("input[name=user_password2]").val());
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/loginbypassword",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	if(data.result ){
	        		alert("成功");
	        		console.log(data);
	        		return ;
	        	}
	        	else
	        		{
		        		alert("失败,");
		        		return ;
	        		}
	        	
	        }
    	});
	})
	
	
	
			$(".sub-btn8").on("click", function(){
		var data = {};
		data.video_name = $.trim($("input[name=video_name]").val());
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/search",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	
	        		console.log(data);
	        	
	        	
	        }
    	});
	})

				$(".sub-btn9").on("click", function(){
		var data = {};
		data.video_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getcommentbyid",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	
	        		console.log(data);
	        	
	        	
	        }
    	});
	})
	
		$(".sub-btn10").on("click", function(){
		var data = {};
		data.video_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getparentguidancebyid",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        		console.log(data);
	        	
	        }
    	});
	})
	
	
	
	$(".sub-btn11").on("click", function(){
		var data = {};
		data.lecturer_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getlecturerbyid",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        		console.log(data);
	        	
	        }
    	});
	})
	
	
	
	$(".sub-btn12").on("click", function(){
		var data = {};
		data.lecturer_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getbooklistbyid",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        		console.log(data);
	        	
	        }
    	});
	})
	
	$(".sub-btn13").on("click", function(){
		var data = {};
		data.lecturer_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getalllecturer",
	        async : true,
	        type: "post",
	        dataType: "json",
	        success: function (data) {
	        		console.log(data);
	        	
	        }
    	});
	})
	
	
		$(".sub-btn14").on("click", function(){
		var data = {};
		data.user_id = 1;
		data.video_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/collecte",
	        async : true,
	        type: "post",
	        data:data,
	        dataType: "json",
	        success: function (data) {
	        		console.log(data);
	        }
    	});
	})
	
	
			$(".sub-btn15").on("click", function(){
		var data = {};
		data.user_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/getcollection",
	        async : true,
	        type: "post",
	        data:data,
	        dataType: "json",
	        success: function (data) {
	        		console.log(data);
	        }
    	});
	})
	
	
	
			$(".sub-btn16").on("click", function(){
		var data = {};
		data.user_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/gethistory",
	        async : true,
	        type: "post",
	        data:data,
	        dataType: "json",
	        success: function (data) {
	        		console.log(data);
	        }
    	});
	})
	
	
				$(".sub-btn17").on("click", function(){
		var data = {};
		data.video_id = 1;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/likebooklist",
	        async : true,
	        type: "post",
	        data:data,
	        dataType: "json",
	        success: function (data) {
	        		console.log(data);
	        }
    	});
	})
	
	
	
		$(".sub-btn_invite").on("click", function(){
		var data = {};
		data.user_phone = $.trim($("input[name=user_phone_invite]").val());;
		$.ajax({
	        url: "http://localhost:8080/QingzaoReading/invitee",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data:data,
	        success: function (data) {
	        		console.log(data);
	        	
	        }
    	});
	})
	
});

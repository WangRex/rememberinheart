var picModule = (function() {
	var my = {};

	function getPicList(userId) {
		console.log(123);
		$.ajax({
			type : "get",
			url : "/rmbih/pic/getPicList1",
			data : {
				userId : userId
			},
			dataType : "json",
			async : false,
			success : function(data) {
				console.log(data);
				$("#sb-slider").html(template('picList', {
					list : data
				}));
				slicebox = $('#sb-slider').slicebox({
					cuboidsCount:10,
					cuboidsRandom:true,
					autoplay:false,
					interval:3000,
					disperseFactor : 30
				});
//				Page.init();
			}
		});
	}

	my.getPicList = function(userId) {
		getPicList(userId);
	};

	return my;
}());
function post() {

	var temp1 = document.createElement("form");
	url = 'post';
	temp1.target = "_self";
	temp1.action = url;
	temp1.method = "post";

	var name = $('#name').val();
	var opt = document.createElement("textarea");
	opt.name = 'name';
	opt.value = name;
	temp1.appendChild(opt);

	var ID = $('#ID').val();
	var opt = document.createElement("textarea");
	opt.name = 'ID';
	opt.value = ID;
	temp1.appendChild(opt);

	var address = $('#address').val();
	var opt = document.createElement("textarea");
	opt.name = 'address';
	opt.value = address;
	temp1.appendChild(opt);

	var tel = $('#tel').val();
	var opt = document.createElement("textarea");
	opt.name = 'tel';
	opt.value = tel;
	temp1.appendChild(opt);

	var city = $('#city').val();
	var opt = document.createElement("textarea");
	opt.name = 'city';
	opt.value = city;
	temp1.appendChild(opt);

	var mask = $("input[name='mask']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'mask';
	opt.value = mask;
	temp1.appendChild(opt);

	var temp = $("input[name='temp']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'temp';
	opt.value = temp;
	temp1.appendChild(opt);

	var hb_go = $("input[name='hb_go']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'hb_go';
	opt.value = hb_go;
	temp1.appendChild(opt);

	var hb = $("input[name='hb']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'hb';
	opt.value = hb;
	temp1.appendChild(opt);

	var hb_touch = $("input[name='hb_touch']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'hb_touch';
	opt.value = hb_touch;
	temp1.appendChild(opt);

	var remarks = $('#remarks').val();
	var opt = document.createElement("textarea");
	opt.name = 'remarks';
	opt.value = remarks;
	temp1.appendChild(opt);

	var wz_go = $("input[name='wz_go']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'wz_go';
	opt.value = wz_go;
	temp1.appendChild(opt);

	var wz_touch = $("input[name='wz_touch']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'wz_touch';
	opt.value = wz_touch;
	temp1.appendChild(opt);

	var tz_go = $("input[name='tz_go']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'tz_go';
	opt.value = tz_go;
	temp1.appendChild(opt);

	var tz_touch = $("input[name='tz_touch']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'tz_touch';
	opt.value = tz_touch;
	temp1.appendChild(opt);

	var hz_go = $("input[name='hz_go']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'hz_go';
	opt.value = hz_go;
	temp1.appendChild(opt);

	var hz_touch = $("input[name='hz_touch']:checked").val();
	var opt = document.createElement("textarea");
	opt.name = 'hz_touch';
	opt.value = hz_touch;
	temp1.appendChild(opt);

	document.body.appendChild(temp1);
	temp1.submit();


}
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/easyUIDemo/jquery.min.js"></script>
<script type="text/javascript" src="js/easyUIDemo/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="js/easyUIDemo/themes/default/easyui.css"></link>
<link rel="stylesheet" type="text/css"
	href="js/easyUIDemo/themes/icon.css"></link>
<link rel="stylesheet" type="text/css"
	href="js/easyUIDemo/demo/demo.css"></link>
<title>人员信息登记</title>
</head>
<body>
	<div style="text-align: center">
		<font size="20px" color="red">航港物流防疫调查登记表</font>
	</div>
	<h1></h1>

	<div>
		<font size="6px">为应对来势汹汹的新型冠状病毒肺炎疫情，航港物流全面贯彻苏州市委、园区管委会和国资的指导文件，根据物流中心疫情防控组要求，航港物流疫情防控工作小组的意见，对于进出人员需要进行实名登记。
		</font>
	</div>
	<h1></h1>
	<div class="easyui-panel" title="">
		<form action="post" method="post">
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">1.姓名：</font>
				</div>
				<input class="easyui-textbox" name="name"
					style="width: 75%; height: 32px" required>

			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">2.身份证号码：</font>
				</div>
				<input class="easyui-textbox" name="ID"
					style="width: 75%; height: 32px" required>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">3.住址(XXX小区XXX幢XXX室)：</font>
				</div>
				<input class="easyui-textbox" name="address"
					style="width: 75%; height: 32px" required>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">4.联系方式：</font>
				</div>
				<input class="easyui-textbox" name="tel"
					style="width: 75%; height: 32px" required>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">5.所在城市：</font>
				</div>
				<input class="easyui-textbox" name="city"
					style="width: 75%; height: 32px" required>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">6.是否佩戴口罩：</font>
				</div>
				<div>
					<font size="5px"> <input id="mask" type="radio" name="mask"
						class="easyui-validatebox" checked="checked" value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="mask" type="radio" name="mask"
						class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">7.体温是否正常：</font>
				</div>
				<div>
					<font size="5px"> <input id="temp" type="radio" name="temp"
						class="easyui-validatebox" checked="checked" value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="temp" type="radio" name="temp"
						class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">8.您及您家人三周内是否去过湖北：</font>
				</div>
				<div>
					<font size="5px"> <input id="hb_go" type="radio"
						name="hb_go" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="hb_go" type="radio"
						name="hb_go" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">9.您或您家人是否为湖北籍：</font>
				</div>
				<div>
					<font size="5px"> <input id="hb" type="radio" name="hb"
						class="easyui-validatebox" checked="checked" value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="hb" type="radio" name="hb"
						class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">10.您或您家人是否密切接触过湖北归来人员：</font>
				</div>
				<div>
					<font size="5px"> <input id="hb_touch" type="radio"
						name="hb_touch" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="hb_touch" type="radio"
						name="hb_touch" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">11.如有特殊情况请说明（如途径武汉），没有则填无：</font>
				</div>
				<input class="easyui-textbox" name="remarks"
					style="width: 75%; height: 32px" required>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">12.三周内是否去过温州：</font>
				</div>
				<div>
					<font size="5px"> <input id="wz_go" type="radio"
						name="wz_go" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="wz_go" type="radio"
						name="wz_go" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">13.三周内是否与温州人员有接触史：</font>
				</div>
				<div>
					<font size="5px"> <input id="wz_touch" type="radio"
						name="wz_touch" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="wz_touch" type="radio"
						name="wz_touch" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">14.三周内是否去过台州：</font>
				</div>
				<div>
					<font size="5px"> <input id="tz_go" type="radio"
						name="tz_go" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="tz_go" type="radio"
						name="tz_go" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">15.三周内是否与台州人员有接触史：</font>
				</div>
				<div>
					<font size="5px"> <input id="tz_touch" type="radio"
						name="tz_touch" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="tz_touch" type="radio"
						name="tz_touch" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">16.三周内是否去过杭州：</font>
				</div>
				<div>
					<font size="5px"> <input id="hz_go" type="radio"
						name="hz_go" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="hz_go" type="radio"
						name="hz_go" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				<div>
					<font size="5px">17.三周内是否与杭州人员有接触史：</font>
				</div>
				<div>
					<font size="5px"> <input id="hz_touch" type="radio"
						name="hz_touch" class="easyui-validatebox" checked="checked"
						value="是"><label>是</label>
					</font>
				</div>
				<div>
					<font size="5px"> <input id="hz_touch" type="radio"
						name="hz_touch" class="easyui-validatebox" value="否"><label>否</label>
					</font>
				</div>
			</div>
			<div style="margin-bottom: 20px">
				 <input type="submit" value="提交"
					class="easyui-linkbutton" iconCls="icon-ok"
					style="width: 100%; height: 75px">
			</div>
		</form>
	</div>



	<script type="text/javascript" src="js/function.js"></script>
</body>
</html>
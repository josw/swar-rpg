<#if is_nwz?? && is_nwz>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>mbugs</title>
	<meta http-equiv="Cache-Control" content="no-cache" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="${url.css}/jquery.jqplot.css" />
	<script type="text/javascript" src="${url.js}/jquery-1.6.min.js"></script>
	<script type="text/javascript" src="${url.js}/jquery.json-2.2.min.js"></script>
	<script type="text/javascript" src="${url.js}/excanvas.min.js"></script>
	
	
	
<style type="text/css">
body { 
	font-family:'verdana';
	font-size : 10pt;
}
#container {
	width : 100%;
	height : 100%;
}
#left_pane {
	width : 200px;
	float : left;
}
#right_pane {
	float : left;
}	
	
</style>
</head>
<body>
<div id="container">
	<div id="left_pane">

	<ul>
		<li><a href="${url.base}/test/insert">data insert</a></li>
		<li><a href="${url.base}/test/view">data view</a></li>
	<li><a href="${url.base}/test/testput">testput</a></li>
	<li><a href="${url.base}/test/create">create api_key</a></li>


<br/>
<br/>
<br/>

	<li><a href="${url.base}/test/graph">graph</a></li>
	<li><a href="${url.base}/test/eventlog">event / error log</a></li>
<br/>
<br/>
<br/>


	<li><a href="${url.base}/test/plog">pmang log</a></li>
	
	
	</ul>
	
	</div>
	<div id="right_pane">
		right
	${body}
	
	</div>
</div>
</body>
</html>
</#if>
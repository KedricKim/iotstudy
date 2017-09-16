<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<c:url value="/goods/list" var="readUrl" />
<title>Insert title here</title>
</head>
<body>
<br><p/><br><p/><br><p/>
<kendo:grid title="그리드" name="grid" pageable="true" sortable="true" scrolllable="true" height="450">
	<kendo:grid-columns>
		<kendo:grid-column title="제품번호" field="giNum" />
		<kendo:grid-column title="제품이름" field="giName" />
		<kendo:grid-column title="제품설명" field="giDesc" />
		<kendo:grid-column title="회사번호" field="viNum"/>
		<kendo:grid-column title="생산일자" field="giCredat" />
		<kendo:grid-column title="생산시간" field="giCretim" />
	</kendo:grid-columns>
	<kendo:dataSource pageSize="20" batch="true">
		<kendo:dataSource-transport>
			<kendo:dataSource-transport-read url="${readUrl}" dataType="json" type="POST" contentType="application/json" />
		</kendo:dataSource-transport>
	</kendo:dataSource>
</kendo:grid>
</body>
</html>
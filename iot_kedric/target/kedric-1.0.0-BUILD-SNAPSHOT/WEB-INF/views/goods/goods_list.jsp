<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<c:url value="/goods/list" var="readUrl" />
<c:url value="/goods/create" var="createUrl" />
<title>Insert title here</title>
</head>
<body>
<br><p/><br><p/><br><p/>
<kendo:grid title="그리드" name="grid" pageable="true" sortable="true" scrolllable="true" height="450">
	<kendo:grid-editable mode="incell"/>
	<kendo:grid-toolbar>
		<kendo:grid-toolbarItem name="create" test="생성"/>
		<kendo:grid-toolbarItem name="save" text="저장"/>
	</kendo:grid-toolbar>
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
			<kendo:dataSource-transport-create url="${createUrl}" dataType="json" type="POST" contentType="application/json" />
			<kendo:dataSource-transport-parameterMap>
				<script>
				function parameterMap(options,type){
					if(type=="read"){
						return JSON.stringify(options);
					}else{
						return JSON.stringify(options.models);
					}
				}
				</script>
			</kendo:dataSource-transport-parameterMap>
		</kendo:dataSource-transport>
		
		<kendo:dataSource-schema>
			<kendo:dataSource-schema-model id="giNum">
			</kendo:dataSource-schema-model>
		</kendo:dataSource-schema>
	</kendo:dataSource>
</kendo:grid>
</body>
</html>
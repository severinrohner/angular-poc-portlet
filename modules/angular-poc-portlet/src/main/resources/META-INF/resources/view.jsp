<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="angular_poc_portlet_AngularPoc.caption"/></b>
</p>

<script>
	System.import('app').catch(function(err){ console.error(err); });
</script>

<my-app>Loading...</my-app>
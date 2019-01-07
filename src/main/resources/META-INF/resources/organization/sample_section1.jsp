<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ResourceBundleUtil"%>

<%@ page import="java.util.ResourceBundle"%>

<%
	boolean companyMyAppFeatureEnabled = GetterUtil.getBoolean(request.getAttribute("myAppFeatureEnabled"));

	ResourceBundle resourceBundle = ResourceBundleUtil.getBundle("content.Language", request.getLocale(),
			getClass());
%>
<h1>This is sample section ONE</h1>

<h3>
	<liferay-ui:message
		key='<%=resourceBundle.getString("my-app-features")%>' />
<h3>

<aui:input checked="<%=companyMyAppFeatureEnabled%>"
	label='<%=resourceBundle.getString("enable-my-app-feature")%>'
	name="settings--myAppFeatureEnabled--" type="checkbox"
	value="<%=companyMyAppFeatureEnabled%>" />
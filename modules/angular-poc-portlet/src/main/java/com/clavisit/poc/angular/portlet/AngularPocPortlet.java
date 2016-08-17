package com.clavisit.poc.angular.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.header-portal-javascript=/o/angular-poc/node_modules/core-js/client/shim.min.js",
		"com.liferay.portlet.header-portal-javascript=/o/angular-poc/node_modules/zone.js/dist/zone.js",
		"com.liferay.portlet.header-portal-javascript=/o/angular-poc/node_modules/reflect-metadata/Reflect.js",
		"com.liferay.portlet.header-portal-javascript=/o/angular-poc/node_modules/systemjs/dist/system.src.js,
		"com.liferay.portlet.header-portlet-javascript=/systemjs.config.js",
		"javax.portlet.display-name=angular-poc-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AngularPocPortlet extends MVCPortlet {
}
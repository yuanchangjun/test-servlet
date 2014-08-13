package com.baldurtech.turnt.octo.adventure.servlet;

import com.baldurtech.unit.MiniatureSpiceTestCase;

public class DispatchServletTest extends MiniatureSpiceTestCase {

    DispatchServlet dispatchServlet = new DispatchServlet();
    String contactActionClassName = "com.baldurtech.turnt.octo.adventure.action.ContactAction";

    public void test_uri_contact_show_应该由ContactAction来处理() {
        assertEquals(contactActionClassName
                     , dispatchServlet.getActionClassNameByUri("/contact/show.do"));
    }

    public void test_uri_contact_应该由ContactAction来处理() {
        assertEquals(contactActionClassName
                     , dispatchServlet.getActionClassNameByUri("/contact.do"));
    }

    public void test_uri_contact_show_的处理方法是show() {
        assertEquals("show", dispatchServlet.getMethodNameByUri("/contact/show.do"));
    }

    public void test_uri_contact_的处理方法是index() {
        assertEquals("index", dispatchServlet.getMethodNameByUri("/contact.do"));
    }

    public void test_uri_contact_show_的显示页面应该是_jsp_contact_show() {
        assertEquals("/WEB-INF/jsp/contact/show.jsp"
                     , dispatchServlet.getViewPage("/contact/show.do"));
    }
}

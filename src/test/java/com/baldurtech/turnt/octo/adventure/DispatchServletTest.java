package com.baldurtech.turnt.octo.adventure;

import com.baldurtech.unit.MiniatureSpiceTestCase;

public class DispatchServletTest extends MiniatureSpiceTestCase {

    public void test_uri_contat_show_应该由ContactAction来处理() {
        DispatchServlet dispatchServlet = new DispatchServlet();

        assertEquals("com.baldurtech.turnt.octo.adventure.ContactAction"
                     , dispatchServlet.getActionClassNameByUri("/contact/show"));
    }
}
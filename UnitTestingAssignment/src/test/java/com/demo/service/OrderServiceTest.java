package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;


import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @InjectMocks
    OrderService orderService;


    @Spy
    Order order;
    @Mock
    EmailService emailService;

    String cc;
    @Captor
    ArgumentCaptor<Boolean> booleanCaptor;

    @Test
    public void testPlaceOrder(){
        when(order.getPrice()).thenReturn(100.0);
        orderService.placeOrder(order);
        verify(order).setPriceWithTax(20.0);
        verify(emailService).sendEmail(order);
        verify(order).setCustomerNotified(true);
        //assertTrue(booleanCaptor.getValue());
    }
    @Test
    public void testPlaceOrder2(){
        when(order.getPrice()).thenReturn(200.0);
        when(emailService.sendEmail(order, "this is string")).thenReturn(true);
        boolean out1=orderService.placeOrder(order,"This is newer string");
        //orderService.placeOrder(order,anyString());
        //out2=emailService.sendEmail(order,anyString());
        //when(orderService.placeOrder(order,cc)).thenReturn(out2);
        verify(order).setPriceWithTax(40.0);
        verify(order).setCustomerNotified(out1);
        assertFalse(out1);
    }
}

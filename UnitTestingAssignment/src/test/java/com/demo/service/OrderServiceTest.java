package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;


import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
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
         orderService.placeOrder(order);
         verify(emailService).sendEmail(order);
         verify(order).setCustomerNotified(booleanCaptor.capture());
         assertTrue(booleanCaptor.getValue());
    }
    @Test
    public void testPlaceOrder2(){
        boolean out1,out2;
        orderService.placeOrder(order,anyString());
        out2=emailService.sendEmail(order,anyString());
        when(orderService.placeOrder(order,cc)).thenReturn(out2);
        verify(order).setCustomerNotified(booleanCaptor.capture());
        assertEquals(out2, booleanCaptor.getValue().booleanValue());
    }
}

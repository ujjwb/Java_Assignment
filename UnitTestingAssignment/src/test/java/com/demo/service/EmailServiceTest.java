package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    EmailService emailService;
    @Spy
    Order order;

    String cc;

    @Captor
    ArgumentCaptor<Boolean> booleanCaptor;

    @Test(expected=RuntimeException.class)
    public void testSendEmail(){
        emailService.sendEmail(order);
        verify(order).setCustomerNotified(booleanCaptor.capture());
        assertEquals(false,booleanCaptor.getValue());

    }

    @Test
    public void testSendEmail2(){
        when(emailService.sendEmail(order,anyString())).thenReturn(true);
        //verify(order).setCustomerNotified(booleanCaptor.capture());
        assertTrue(emailService.sendEmail(order,cc));
    }
}
package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @InjectMocks
    EmailService emailService;
    @Mock
    Order order;


    //@Captor
    //ArgumentCaptor<Boolean> booleanCaptor;

    @Test(expected=RuntimeException.class)
    public void testSendEmail(){
        emailService.sendEmail(order);
        //verify(order).setCustomerNotified(false);
        //assertEquals(false,booleanCaptor.getValue());
        doThrow(RuntimeException.class).when(order).setCustomerNotified(false);
    }

    @Test
    public void testSendEmail2(){
        boolean result=emailService.sendEmail(order,"Send Email");
        //verify(order).setCustomerNotified(booleanCaptor.capture());
        verify(order,times(1)).setCustomerNotified(true);
        assertTrue(result);
    }
}
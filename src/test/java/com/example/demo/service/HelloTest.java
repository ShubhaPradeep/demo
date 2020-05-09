package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
class HelloTest {

    @InjectMocks
    private Hello subject;

    @Test
    public void sayHello_shouldPrint_whenCalled() {
        assertThat(subject.sayHello()).isEqualTo(1);
    }

}
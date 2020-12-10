package com.au.studentpro.exe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.au.studentpro.dto")
@PropertySource({"student.properties","course.properties"})
@EnableAspectJAutoProxy
public class SpringConfig {

}

package com.PrimaryQualifier.Interface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component("Senior")
public class SeniorEmployee implements Employee {
	
	public String getMsg() {
		return "This is Senior Employee";
	}
}
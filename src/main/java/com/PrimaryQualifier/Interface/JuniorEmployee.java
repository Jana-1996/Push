package com.PrimaryQualifier.Interface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("Junior")
public class JuniorEmployee implements Employee {
	public String getMsg() {
		return "This is Junior Employee";
	}
}

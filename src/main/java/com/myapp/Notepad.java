package com.myapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//set scople in ComponentScan
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype") //not type safe
public class Notepad {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

package com.springapp.mvc.service.bo.impl;

import javax.inject.Named;

import com.springapp.mvc.service.bo.UserBo;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author victor
 * @since 4/1/14
 */

// @Service

@Named
public class UserBoImpl implements UserBo {

	public String getMessage() {

		return "JSF 2 + Spring Integration";

	}
}

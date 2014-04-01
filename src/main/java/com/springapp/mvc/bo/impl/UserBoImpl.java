package com.springapp.mvc.bo.impl;

import com.springapp.mvc.bo.UserBo;

import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 *
 * @author victor
 * @since 4/1/14
 */

//@Service

@Named
public class UserBoImpl implements UserBo {

    public String getMessage() {

        return "JSF 2 + Spring Integration";

    }
}

package com.vstratienco.gitproject.user.bo.impl;

import com.vstratienco.gitproject.user.bo.UserBo1;
import org.springframework.stereotype.Service;

import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 *
 * @author victor
 * @since 4/1/14
 */

//@Service

//@Named
public class UserBoImpl implements UserBo1 {

    public String getMessage() {

        return "JSF 2 + Spring Integration";

    }
}

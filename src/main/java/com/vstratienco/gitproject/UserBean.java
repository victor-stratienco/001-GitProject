package com.vstratienco.gitproject;

import com.vstratienco.gitproject.user.bo.UserBo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 *
 * @author victor
 * @since 4/1/14
 */

//@Component
//@ManagedBean
//@SessionScoped

//@Component
//@Scope("session")

//@Named
//@Scope("session")
public class UserBean {

    //later inject in faces-config.xml

    //@Autowired

    //@Inject
    UserBo1 userBo;

    public void setUserBo(UserBo1 userBo) {
        this.userBo = userBo;
    }

    public String printMsgFromSpring() {

        return userBo.getMessage();

    }
}

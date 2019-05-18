package com.speex.androiddagger.bean;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2019/5/18 17:24
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class Login {
    /**
     * 名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;


    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

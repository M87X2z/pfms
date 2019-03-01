package cn.org.xinke.entity;

/**
 * @description 账户实体
 * @author cinco
 * @date 2019-1-21
 */
public class User {

    /**
     * 账户
     */
    private String uname;

    /**
     * 密码
     */
    private String pwd;

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

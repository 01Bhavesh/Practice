public class Person {
    private  int id;
    private String pname;
    private String mobile;
    private String email;

    public Person() {
        this(0,null,null,null);
    }

    public Person(int id, String pname, String mobile, String email) {
        this.id = id;
        this.pname = pname;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

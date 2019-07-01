public class Info {

    private String name;
    private String eMail;
    private String phone;

    public Info(String name, String eMail, String phone) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
    }

    public Info() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Personal Information\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n" + getName() + "\n" + geteMail() + "\n" + getPhone();

    }
}

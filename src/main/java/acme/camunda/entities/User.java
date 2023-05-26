package acme.camunda.entities;

public class User {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String first_name;

    private String last_name;

    private String email;

    private String id;

    public User() {};

    public User(String first_name, String last_name, String email, String id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        return sb.append("[id: ").append(this.id).append(" || ")
                .append("firstName: ").append(this.first_name).append(" || ")
                .append("lastName: ").append(this.last_name).append(" || ")
                .append("email: ").append(this.email).append("]")
                .toString();
    }
}

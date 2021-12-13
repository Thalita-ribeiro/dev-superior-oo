package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " (" + simpleDateFormat.format(birthDate) + ") - " + email;
    }
}
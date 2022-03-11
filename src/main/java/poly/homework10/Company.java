package poly.homework10;

public class Company {
    private String nameOfCompany;
    private String dataOfEstablish;
    private String registrationNo;

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        if (!nameOfCompany.trim().isEmpty()) {
            this.nameOfCompany = nameOfCompany;
        } else {
            System.out.println("Invalid Company name!");
        }
    }

    public String getDataOfEstablish() {
        return dataOfEstablish;
    }

    public void setDataOfEstablish(String dataOfEstablish) {
        if (!dataOfEstablish.trim().isEmpty()) {
            this.dataOfEstablish = dataOfEstablish;
        } else {
            System.out.println("Invalid date of establish!");
        }
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        if (registrationNo.length() == 10) {
            this.registrationNo = registrationNo;
        } else {
            System.out.println("Invalid registration number!");
        }
    }

    public Company (String nameOfCompany, String dataOfEstablish, String registrationNo){
        setNameOfCompany(nameOfCompany);
        setDataOfEstablish(dataOfEstablish);
        setRegistrationNo(registrationNo);
    }
}
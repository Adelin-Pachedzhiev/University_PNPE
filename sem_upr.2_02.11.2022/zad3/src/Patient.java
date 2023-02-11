public abstract class Patient {
    private String name;
    private String address;
    private String egn;

    public Patient(String name, String address, String egn){
        this.name = name;
        this.address = address;
        this.egn = egn;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getEgn() {
        return egn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void cure(String drug, int dose);
}

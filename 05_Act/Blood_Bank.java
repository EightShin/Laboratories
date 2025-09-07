class Blood_Bank {
    private String bloodType;
    private String rhFactor;

    public Blood_Bank() {
        bloodType = "O";
        rhFactor = "+";
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}

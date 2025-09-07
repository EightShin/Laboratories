class blood_data {
    static String bloodtype;
    static String rhFactor;

    public blood_data() {
        bloodtype = "O";
        rhFactor = "+";
    }
        
    public blood_data(String bt, String rh) {
        bloodtype = bt;
        rhFactor = rh;

    }

    public void display() {
        System.out.println(bloodtype + rhFactor + " has been added to the bank. ");
    }


    }

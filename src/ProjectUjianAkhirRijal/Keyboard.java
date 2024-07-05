package ProjectUjianAkhirRijal;

class Keyboard {
    private String brand;
    private String model;
    private String type;

    public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        setType(type); 
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.equalsIgnoreCase("mechanical")) {
            this.type = "membrane";
        } else {
            this.type = type;
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Type: " + getType());
    }
}
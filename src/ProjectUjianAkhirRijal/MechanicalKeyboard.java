package ProjectUjianAkhirRijal;

class MechanicalKeyboard extends Keyboard {
    private String switchType;

    public MechanicalKeyboard(String brand, String model, String switchType) {
        super(brand, model, "mechanical");
        this.switchType = switchType;
    }
    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Switch Type: " + getSwitchType());
    }
}
package week5;

public enum OrderType {
    ONLINE("online"),
    SHOPE("shope"),
    WAREHOUSE("warehouse");

    private String strValue;

    OrderType(String strValue) {
        this.strValue = strValue;
    }

    public String getStrValue() {
        return strValue;
    }
}

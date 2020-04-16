package Task4;

public enum SweetType {
    Candy("Конфета"), JellyBean("Жевательная конфета"), Chocolate("Шоколад");

    private String type;
    SweetType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

}

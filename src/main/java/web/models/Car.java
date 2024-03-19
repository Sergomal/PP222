package web.models;

public class Car {

    private int id;

    private String modelCar;

    private int prodYear;

    public Car(int id, String modelCar, int prodYear) {
        this.id = id;
        this.modelCar = modelCar;
        this.prodYear = prodYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }


}

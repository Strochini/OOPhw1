import java.text.DecimalFormat;

public class Flower extends Main {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(){
        if (flowerColor == null || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        } if (name == null || name.isBlank()) {
            this.name = "Не указано";
        } else {
            this.name = name;
        } if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        } if(cost <= 0.00) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        } if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerColor, String name, String country, double cost, int lifeSpan) {
            this.flowerColor = flowerColor;
            this.name = name;
            this.country = country;
            this.cost = cost;
            this.lifeSpan = lifeSpan;
    }
    public Flower(String name, String country, double cost, int lifeSpan) {
            this.flowerColor = "Белый";
            this.name = name;
            this.country = country;
            this.cost = cost;
            this.lifeSpan = lifeSpan;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public double getCost() {
        return cost;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor == null || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        }
        this.country = country;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.00;
        }
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan == 0) {
            this.lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Название: "
                + name +
                ". Цвет: " + flowerColor +
                ". Страна: " + country +
                ". Цена: " + costFormat(cost) +
                ". Стоит: " + lifeSpan +
                " дней.";
    }
}

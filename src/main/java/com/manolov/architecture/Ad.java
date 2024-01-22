package com.manolov.architecture;

import java.awt.*;
import java.math.BigDecimal;

public class Ad {
    private final Car car;
    private final Motor motor;
    private final ProductStatus productStatus;
    private final User user;
    private final BigDecimal price;
    private String moreInformation;

    public Ad(Car car, ProductStatus productStatus,
              User user, BigDecimal price,
              String moreInformation) {
        this.motor = null;
        this.car = car;
        this.productStatus = productStatus;
        this.user = user;
        this.price = price;
        this.moreInformation = moreInformation;
    }

    public Ad(Motor motor, ProductStatus productStatus,
              User user,BigDecimal price, String moreInformation) {
        this.car = null;
        this.motor = motor;
        this.productStatus = productStatus;
        this.user = user;
        this.price = price;
        this.moreInformation = moreInformation;
    }

    public Car getCar() {
        return car;
    }

    public Motor getMotor() {
        return motor;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public User getUser() {
        return user;
    }

    public String getTextField() {
        return moreInformation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "car=" + car +
                ", motor=" + motor +
                ", productStatus=" + productStatus +
                ", user=" + user +
                ", price=" + price +
                ", moreInformation='" + moreInformation + '\'' +
                '}';
    }
}

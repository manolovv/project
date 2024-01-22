package com.manolov.architecture;

import java.awt.*;
import java.math.BigDecimal;

public class Ad {
    private final Car car;
    private final Motor motor;
    private final ProductStatus productStatus;
    private final User user;
    private final String phoneNumber;
    private final BigDecimal price;
    private TextField moreInformation;

    public Ad(Car car, ProductStatus productStatus,
              User user, String phoneNumber,
              BigDecimal price, TextField moreInformation) {
        this.motor = null;
        this.car = car;
        this.productStatus = productStatus;
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.price = price;
        if (moreInformation != null) {
            setMoreInformation(moreInformation);
        } else {
            this.moreInformation = null;
        }
    }

    public Ad(Motor motor, ProductStatus productStatus,
              User user, String phoneNumber,
              BigDecimal price, TextField moreInformation) {
        this.car = null;
        this.motor = motor;
        this.productStatus = productStatus;
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.price = price;
        if (moreInformation != null) {
            setMoreInformation(moreInformation);
        } else {
            this.moreInformation = null;
        }
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public TextField getTextField() {
        return moreInformation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setMoreInformation(TextField moreInformation) {
        this.moreInformation = moreInformation;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "car=" + car +
                ", motor=" + motor +
                ", productStatus=" + productStatus +
                ", user=" + user +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", price=" + price +
                ", moreInformation=" + moreInformation +
                '}';
    }
}

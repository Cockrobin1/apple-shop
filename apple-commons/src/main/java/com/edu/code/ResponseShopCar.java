package com.edu.code;

public class ResponseShopCar {
     private  String  resultCode = "00000";
    private  String  resultMsg;
    private  int total; //总数量
    private  float totalPrice;//总价格  购物车里面所有的总价格
    private  float currentPrice;//总价格，
    private  int currentNumber;//当前商品的数量

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
}

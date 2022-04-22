package org.dman;

import javafx.beans.property.SimpleStringProperty;

public class Deal {
    private SimpleStringProperty numberDeal, typeDeal, signalDeal, dateTimeDeal, priceDeal, contractsDeal, profitDeal, totalProfit, growthDeal, drawdownDeal;

    Deal(String numberDeal, String typeDeal, String signalDeal, String dateTimeDeal, String priceDeal, String contractsDeal, String profitDeal, String totalProfit, String growthDeal, String drawdownDeal){
        this.numberDeal = new SimpleStringProperty(numberDeal);
        this.typeDeal = new SimpleStringProperty(typeDeal);
        this.signalDeal = new SimpleStringProperty(signalDeal);
        this.dateTimeDeal = new SimpleStringProperty(dateTimeDeal);
        this.priceDeal = new SimpleStringProperty(priceDeal);
        this.contractsDeal = new SimpleStringProperty(contractsDeal);
        this.profitDeal = new SimpleStringProperty(profitDeal);
        this.totalProfit = new SimpleStringProperty(totalProfit);
        this.growthDeal = new SimpleStringProperty(growthDeal);
        this.drawdownDeal = new SimpleStringProperty(drawdownDeal);
    }

    public String getNumberDeal() {
        return numberDeal.get();
    }

    public void setNumberDeal(String numberDeal) {
        this.numberDeal.set(numberDeal);
    }

    public String getTypeDeal() {
        return typeDeal.get();
    }

    public void setTypeDeal(String typeDeal) {
        this.typeDeal.set(typeDeal);
    }

    public String getSignalDeal() {
        return signalDeal.get();
    }

    public void setSignalDeal(String signalDeal) {
        this.signalDeal.set(signalDeal);
    }

    public String getDateTimeDeal() {
        return dateTimeDeal.get();
    }

    public void setDateTimeDeal(String dateTimeDeal) {
        this.dateTimeDeal.set(dateTimeDeal);
    }

    public String getPriceDeal() {
        return priceDeal.get();
    }

    public void setPriceDeal(String priceDeal) {
        this.priceDeal.set(priceDeal);
    }

    public String getContractsDeal() {
        return contractsDeal.get();
    }

    public void setContractsDeal(String contractsDeal) {
        this.contractsDeal.set(contractsDeal);
    }

    public String getProfitDeal() {
        return profitDeal.get();
    }

    public void setProfitDeal(String profitDeal) {
        this.profitDeal.set(profitDeal);
    }

    public String getTotalProfit() {
        return totalProfit.get();
    }

    public void setTotalProfit(String totalProfit) {
        this.totalProfit.set(totalProfit);
    }

    public String getGrowthDeal() {
        return growthDeal.get();
    }

    public void setGrowthDeal(String growthDeal) {
        this.growthDeal.set(growthDeal);
    }

    public String getDrawdownDeal() {
        return drawdownDeal.get();
    }

    public void setDrawdownDeal(String drawdownDeal) {
        this.drawdownDeal.set(drawdownDeal);
    }
}

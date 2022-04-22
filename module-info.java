module TradingRobot {
    requires javafx.fxml;
    requires javafx.controls;
    requires BinanceFuturesSDK;
    requires com.google.gson;
    requires java.telegram.bot.api;

    opens org.dman to javafx.fxml;
    exports org.dman;
}
module net.murasakiyamaimo.javos {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.murasakiyamaimo.javos to javafx.fxml;
    exports net.murasakiyamaimo.javos;
}
module lk.ijse {
    requires javafx.controls;
    requires javafx.fxml;

    opens lk.ijse to javafx.fxml;
    exports lk.ijse;
}

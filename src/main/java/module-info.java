module cl.duoc.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens cl.duoc.ejemplo to javafx.fxml;
    exports cl.duoc.ejemplo;
}
module com.example.advwork {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.advwork to javafx.fxml;
    exports com.example.advwork;
}
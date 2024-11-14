module university.limkokwingsystem
{
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.reactivestreams;

    opens university.limkokwingsystem to javafx.fxml;
    exports university.limkokwingsystem;
}
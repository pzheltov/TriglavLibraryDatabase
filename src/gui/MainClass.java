
/*
THIS CLASS IS TEMPORARY. IT IS FOR TESTING SOME JAVAFX OBJECTS.

DO NOT ATTEMPT TO MAKE SENSE OF THIS CLASS.

THIS CLASS WILL BE DELETED AFTER TESTING IS DONE.

 */
package gui;

import inventory.FalseDatabaseStarter;
import inventory.Inventory;
import inventory.LibraryDatabase;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainClass extends Application {
    Stage window;
    TableView<Inventory> table;

    public static void main(String[] args) {
        FalseDatabaseStarter.startDatabase();
        launch(args);
    }

        @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");

        //Title column
        TableColumn<Inventory, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setMinWidth(200);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        //Type column
        TableColumn<Inventory, String> typeColumn = new TableColumn<>("Type");
        typeColumn.setMinWidth(100);
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        //Status column
        TableColumn<Inventory, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setMinWidth(100);
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));

        table = new TableView<Inventory>();
        table.setItems(getInventory());
        table.getColumns().addAll(titleColumn, typeColumn, statusColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Get all of the inventory
    public ObservableList<Inventory> getInventory() {
        ObservableList<Inventory> inventory = FXCollections.observableArrayList();

        for (int i = 0; i < LibraryDatabase.getInventoryList().size(); i++) {
            inventory.add(LibraryDatabase.getInventoryList().get(i));
        }
        
        return inventory;
    }


}
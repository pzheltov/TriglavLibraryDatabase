
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

        //Name column
        TableColumn<Inventory, String> nameColumn = new TableColumn<>("Title");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        //Price column
        TableColumn<Inventory, String> priceColumn = new TableColumn<>("Type");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        //Quantity column
        TableColumn<Inventory, String> quantityColumn = new TableColumn<>("Status");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));

        table = new TableView<Inventory>();
        table.setItems(getInventory());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<Inventory> getInventory() {
        ObservableList<Inventory> inventory = FXCollections.observableArrayList();

        for (int i = 0; i < LibraryDatabase.getInventoryList().size(); i++) {
            inventory.add(LibraryDatabase.getInventoryList().get(i));
        }
        
        return inventory;

        
    }


}
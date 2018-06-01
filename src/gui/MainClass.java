
/*
THIS CLASS IS TEMPORARY. IT IS FOR TESTING SOME JAVAFX OBJECTS.

DO NOT ATTEMPT TO MAKE SENSE OF THIS CLASS.

THIS CLASS WILL BE DELETED AFTER TESTING IS DONE.

 */
package gui;

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
    TableView<Product> table;

    public static void main(String[] args) {

        launch(args);
    }

        @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");

        //Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<Inventory> getProduct() {
        ObservableList<Inventory> inventory = FXCollections.observableArrayList();

        for (int i = 0; i < LibraryDatabase.getInventoryList().size(); i++) {
            inventory.add(LibraryDatabase.getInventoryList().get(i));
        }
        
        return inventory;

        
    }


}
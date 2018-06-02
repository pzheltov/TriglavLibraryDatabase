/*
This class is fully committed to creating windows for adding content to the library.
 */

package gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddItemBox {

    // Basic buttons
    private static Button accept;
    private static Button reject;

    // Layout Grid View is default for this action
    private static GridPane layout;

    // Scene
    private static Scene scene;

    // Stage
    private static Stage primaryStage;

    static void addNovel() {

        // Set the stage
        primaryStage = new Stage();
        primaryStage.setTitle("Novel");
        primaryStage.initModality(Modality.APPLICATION_MODAL);

        // Initiate Accept button
        accept = new Button("Save");
        accept.setMinSize(90, 30);
        accept.setMaxSize(30, 10);

        // Initiate Reject button
        reject = new Button("Cancel");
        reject.setMinSize(90, 30);
        reject.setMaxSize(30, 10);

        // Setting up button actions
        accept.setOnAction(event -> System.out.println("Not set up yet"));
        reject.setOnAction(event -> primaryStage.close());

        // Adding fields standard for all items - variables from inventory

        // Instructions
        Label instructionsLabel = new Label("Add a new novel: ");

        // Set title
        TextField titleInput = new TextField();
        titleInput.setPromptText("One Hundred Years of Solitude");
        Label titleLabel = new Label("Title: ");

        // Choice box for availability
        ChoiceBox<String> availableInput = new ChoiceBox<>();
        availableInput.getItems().addAll("Available", "Reserved", "Unavailable");
        availableInput.setValue("Available");
        availableInput.setMinWidth(190);
        Label availableLabel = new Label("Status: ");

        // Adding fields standard for all print

        // Text field for author
        TextField authorInput = new TextField();
        authorInput.setPromptText("Gabriel Garcia Marquez");
        Label authorLabel = new Label("Author: ");

        // Input genre
        ChoiceBox<String> genreInput = new ChoiceBox<>();
        genreInput.getItems().addAll("Fiction", "Thriller", "Tragedy", "Western", "Science Fiction", "Romance");
        genreInput.setValue("Fiction");
        genreInput.setMinWidth(190);
        Label genreLabel = new Label("Genre: ");

        // Adding fields specific for a book

        // Checkbox for hard-cover
        CheckBox hardCoverInput = new CheckBox();
        Label hardcoverLabel = new Label("Hard-cover: ");

        // Text field for year published
        TextField yearInput = new TextField();
        yearInput.setPromptText("2010");
        Label yearLabel = new Label("Year published: ");


        // Adding fields specific for a novel

        // Text field for entering DDC
        TextField ddcInput = new TextField();
        ddcInput.setPromptText("SF831.54");
        Label ddcLabel = new Label("Dewey Decimal System Location: ");

        // Choice box for language selection
        ChoiceBox<String> languageInput = new ChoiceBox<>();
        languageInput.getItems().addAll("English", "French", "German", "Italian", "Slovenian");
        languageInput.setValue("Slovenian");
        languageInput.setMinWidth(190);
        Label languageLabel = new Label("Language: ");

        // DELETE
        System.out.println(ddcInput.getWidth());

        // Setting up the Grid Pane
        layout = new GridPane();
        layout.setPadding(new Insets(20, 45, 45, 45));
        layout.setHgap(70);
        layout.setVgap(15);

        // Adding Items to the Grid Pane

        // First column
        layout.add(instructionsLabel, 0, 0);
        layout.add(titleLabel, 0, 1);
        layout.add(titleInput, 0, 2);
        layout.add(authorLabel, 0, 3);
        layout.add(authorInput, 0, 4);
        layout.add(yearLabel, 0, 5);
        layout.add(yearInput, 0, 6);
        layout.add(ddcLabel, 0, 7);
        layout.add(ddcInput, 0, 8);

        //Second column
        layout.add(languageLabel, 1, 1);
        layout.add(languageInput, 1, 2);
        layout.add(genreLabel, 1, 3);
        layout.add(genreInput, 1, 4);
        layout.add(availableLabel, 1, 5);
        layout.add(availableInput, 1, 6);
        layout.add(hardcoverLabel, 1, 7);
        layout.add(hardCoverInput, 1, 8);

        // Buttons
        layout.add(accept, 0, 11);
        layout.add(reject, 0, 12);

        // Set up the scene
        scene = new Scene(layout, 530, 510);

        // Set up the primary stage
        primaryStage.setScene(scene);
        primaryStage.showAndWait();

    }

    static void addTouristGuide() {

    }

    static void addChildrensLit() {

    }

    static void addNewspaper() {

    }

    static void addmagazine() {

    }

    static void addComics() {

    }

    static void addMovie() {

    }

    static void addDocumentary() {

    }

    static void addArchiveFootage() {

    }

    static void addMusic() {

    }

    static void addAudioBook() {

    }

    static void addPodcast() {

    }

    static void addBook() {

    }

    static void addPeriodical() {

    }

    static void addVideo() {

    }

    static void addAudio() {

    }

}


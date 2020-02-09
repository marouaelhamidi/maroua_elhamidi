package controllers;
import java.sql.*;
import java.util.logging.*;

import connectivity.Connectivity;
import javafx.application.Application;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class rvController extends Application {
  private static final Logger logger = Logger.getLogger(rvController.class.getName());
  private static final String[] SAMPLE_NAME_DATA = { "John", "Jill", "Jack", "Jerry" };

  public static void main(String[] args) { launch(args); }

  @Override public void start(Stage stage) {
    final ListView<String> nameView = new ListView();

    final Button fetchNames = new Button("Fetch rv from the database");
    fetchNames.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        fetchNamesFromDatabaseToListView(nameView);
      }
    });

    final Button clearNameList = new Button("Clear the name list");
    clearNameList.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        nameView.getItems().clear();
      }
    });

    VBox layout = new VBox(10);
    layout.setStyle("-fx-background-color: cornsilk; -fx-padding: 15;");
    layout.getChildren().setAll(
      HBoxBuilder.create().spacing(10).children(
        fetchNames, 
        clearNameList    
      ).build(),      
      nameView
    );
    layout.setPrefHeight(200);

    stage.setScene(new Scene(layout));
    stage.show();
  }

  private void fetchNamesFromDatabaseToListView(ListView listView) {
    try (Connection con = getConnection()) {
      if (!schemaExists(con)) {
        createSchema(con);
        populateDatabase(con);
      }
      listView.setItems(fetchNames(con));
    } catch (SQLException | ClassNotFoundException ex) {
      logger.log(Level.SEVERE, null, ex);
    }
  }

  private Connection getConnection() throws ClassNotFoundException, SQLException {
   Connection con = Connectivity.getCon();
    return con;
  }

  private void createSchema(Connection con) throws SQLException {

  }

  private void populateDatabase(Connection con) throws SQLException {

  }

  private boolean schemaExists(Connection con) {

    return true;
  }

  private ObservableList<String> fetchNames(Connection con) throws SQLException {
    logger.info("Fetching rv from database");

    ObservableList<String> jour = FXCollections.observableArrayList();

    Statement st = con.createStatement();      
    ResultSet rs = st.executeQuery("select * from rv");
    while (rs.next()) {

      jour.add(rs.getString("jour"));
    
    }

    logger.info("Found " + jour.size() + " jour");

    return jour;
  }
}
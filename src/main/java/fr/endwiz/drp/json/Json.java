package fr.endwiz.drp.json;

import fr.endwiz.drp.Main;
import fr.endwiz.drp.ui.panels.MainPanel;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Json {

    @SuppressWarnings("unchecked")
    public static void create(String fileName) {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Select directory");
        File dir = chooser.showDialog(null);

        JSONObject obj = new JSONObject();
        obj.put("id", MainPanel.getID());
        obj.put("detail", MainPanel.getDetails());
        obj.put("state", MainPanel.getState());
        obj.put("big_image", MainPanel.getBig());
        obj.put("big_text", MainPanel.getBigText());
        obj.put("small_image", MainPanel.getSmall());
        obj.put("small_text", MainPanel.getSmallText());
        obj.put("timer", MainPanel.haveTimer());

        try (FileWriter file = new FileWriter(dir + File.separator + fileName + ".json")) {
            file.write(obj.toJSONString());
            Main.logger.log("The file " + fileName + ".json have created whith success on directory " + dir + File.separator + fileName + ".json");
        } catch (IOException e) {
            e.printStackTrace();
            Main.logger.warn("Error writing file");
        }
    }

    public static void read() {
        // Choose File to Read
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Select File");
        File dir = chooser.showOpenDialog(null);

        try (Reader reader = new FileReader(dir)) {

            // Parsing Json File
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(reader);

            // Set all parameters
            String id = (String)jsonObject.get("id");
            MainPanel.setID(id);

            String detail = (String)jsonObject.get("detail");
            MainPanel.setDetails(detail);

            String state = (String)jsonObject.get("state");
            MainPanel.setState(state);

            String big_image = (String)jsonObject.get("big_image");
            MainPanel.setBig(big_image);

            String big_text = (String)jsonObject.get("big_text");
            MainPanel.setBigText(big_text);

            String small_image = (String)jsonObject.get("small_image");
            MainPanel.setSmall(small_image);

            String small_text = (String)jsonObject.get("small_text");
            MainPanel.setSmallText(small_text);

            boolean timer = (boolean)jsonObject.get("timer");
            MainPanel.setTimer(timer);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

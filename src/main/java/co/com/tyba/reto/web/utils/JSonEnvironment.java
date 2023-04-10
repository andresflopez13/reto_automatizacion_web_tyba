package co.com.tyba.reto.web.utils;

import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JSonEnvironment {

  private static JSonEnvironment environment;
  private JSONObject jsonObject = null;
  private static final String RESOURCE_NAME = "./src/test/resources/environments/settings.json";

  private JSonEnvironment() {
    try {
      InputStreamReader inputStreamReader =
          new InputStreamReader(new FileInputStream(RESOURCE_NAME), StandardCharsets.UTF_8);
      JSONTokener jsonTokener = new JSONTokener(inputStreamReader);
      jsonObject = new JSONObject(jsonTokener);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static JSonEnvironment fromSettings() {
    if (environment == null) environment = new JSonEnvironment();
    return environment;
  }

  public String getValue(String key) {
    String[] keys = key.split("\\.");
    if (keys.length == 1) return jsonObject.getString(key);
    else {
      JSONObject jsonKey = jsonObject.getJSONObject(keys[0]);
      String lastKey = keys[keys.length - 1];
      for (int i = 1; i < keys.length - 1; i++) {
        jsonKey = jsonKey.optJSONObject(keys[i]);
      }
      return jsonKey.getString(lastKey);
    }
  }
}

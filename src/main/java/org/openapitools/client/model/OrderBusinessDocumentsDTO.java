/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.DocumentDTO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Информация о документах. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBusinessDocumentsDTO {
  public static final String SERIALIZED_NAME_UPD = "upd";
  @SerializedName(SERIALIZED_NAME_UPD)
  private DocumentDTO upd;

  public static final String SERIALIZED_NAME_UKD = "ukd";
  @SerializedName(SERIALIZED_NAME_UKD)
  private DocumentDTO ukd;

  public static final String SERIALIZED_NAME_TORG_TWELVE = "torgTwelve";
  @SerializedName(SERIALIZED_NAME_TORG_TWELVE)
  private DocumentDTO torgTwelve;

  public static final String SERIALIZED_NAME_SF = "sf";
  @SerializedName(SERIALIZED_NAME_SF)
  private DocumentDTO sf;

  public static final String SERIALIZED_NAME_KSF = "ksf";
  @SerializedName(SERIALIZED_NAME_KSF)
  private DocumentDTO ksf;

  public OrderBusinessDocumentsDTO() {
  }

  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

  /**
   * Get upd
   * @return upd
   */
  @javax.annotation.Nullable
  public DocumentDTO getUpd() {
    return upd;
  }

  public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }


  public OrderBusinessDocumentsDTO ukd(DocumentDTO ukd) {
    this.ukd = ukd;
    return this;
  }

  /**
   * Get ukd
   * @return ukd
   */
  @javax.annotation.Nullable
  public DocumentDTO getUkd() {
    return ukd;
  }

  public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }


  public OrderBusinessDocumentsDTO torgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
    return this;
  }

  /**
   * Get torgTwelve
   * @return torgTwelve
   */
  @javax.annotation.Nullable
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }

  public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }


  public OrderBusinessDocumentsDTO sf(DocumentDTO sf) {
    this.sf = sf;
    return this;
  }

  /**
   * Get sf
   * @return sf
   */
  @javax.annotation.Nullable
  public DocumentDTO getSf() {
    return sf;
  }

  public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }


  public OrderBusinessDocumentsDTO ksf(DocumentDTO ksf) {
    this.ksf = ksf;
    return this;
  }

  /**
   * Get ksf
   * @return ksf
   */
  @javax.annotation.Nullable
  public DocumentDTO getKsf() {
    return ksf;
  }

  public void setKsf(DocumentDTO ksf) {
    this.ksf = ksf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBusinessDocumentsDTO orderBusinessDocumentsDTO = (OrderBusinessDocumentsDTO) o;
    return Objects.equals(this.upd, orderBusinessDocumentsDTO.upd) &&
        Objects.equals(this.ukd, orderBusinessDocumentsDTO.ukd) &&
        Objects.equals(this.torgTwelve, orderBusinessDocumentsDTO.torgTwelve) &&
        Objects.equals(this.sf, orderBusinessDocumentsDTO.sf) &&
        Objects.equals(this.ksf, orderBusinessDocumentsDTO.ksf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upd, ukd, torgTwelve, sf, ksf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBusinessDocumentsDTO {\n");
    sb.append("    upd: ").append(toIndentedString(upd)).append("\n");
    sb.append("    ukd: ").append(toIndentedString(ukd)).append("\n");
    sb.append("    torgTwelve: ").append(toIndentedString(torgTwelve)).append("\n");
    sb.append("    sf: ").append(toIndentedString(sf)).append("\n");
    sb.append("    ksf: ").append(toIndentedString(ksf)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("upd");
    openapiFields.add("ukd");
    openapiFields.add("torgTwelve");
    openapiFields.add("sf");
    openapiFields.add("ksf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderBusinessDocumentsDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderBusinessDocumentsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderBusinessDocumentsDTO is not found in the empty JSON string", OrderBusinessDocumentsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderBusinessDocumentsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderBusinessDocumentsDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `upd`
      if (jsonObj.get("upd") != null && !jsonObj.get("upd").isJsonNull()) {
        DocumentDTO.validateJsonElement(jsonObj.get("upd"));
      }
      // validate the optional field `ukd`
      if (jsonObj.get("ukd") != null && !jsonObj.get("ukd").isJsonNull()) {
        DocumentDTO.validateJsonElement(jsonObj.get("ukd"));
      }
      // validate the optional field `torgTwelve`
      if (jsonObj.get("torgTwelve") != null && !jsonObj.get("torgTwelve").isJsonNull()) {
        DocumentDTO.validateJsonElement(jsonObj.get("torgTwelve"));
      }
      // validate the optional field `sf`
      if (jsonObj.get("sf") != null && !jsonObj.get("sf").isJsonNull()) {
        DocumentDTO.validateJsonElement(jsonObj.get("sf"));
      }
      // validate the optional field `ksf`
      if (jsonObj.get("ksf") != null && !jsonObj.get("ksf").isJsonNull()) {
        DocumentDTO.validateJsonElement(jsonObj.get("ksf"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderBusinessDocumentsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderBusinessDocumentsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderBusinessDocumentsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderBusinessDocumentsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderBusinessDocumentsDTO>() {
           @Override
           public void write(JsonWriter out, OrderBusinessDocumentsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderBusinessDocumentsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderBusinessDocumentsDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderBusinessDocumentsDTO
   * @throws IOException if the JSON string is invalid with respect to OrderBusinessDocumentsDTO
   */
  public static OrderBusinessDocumentsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderBusinessDocumentsDTO.class);
  }

  /**
   * Convert an instance of OrderBusinessDocumentsDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


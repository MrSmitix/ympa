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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OfferContentDTO;

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
 * Запрос на установку новых значений для параметров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentRequest {
  public static final String SERIALIZED_NAME_OFFERS_CONTENT = "offersContent";
  @SerializedName(SERIALIZED_NAME_OFFERS_CONTENT)
  private List<OfferContentDTO> offersContent = new ArrayList<>();

  public UpdateOfferContentRequest() {
  }

  public UpdateOfferContentRequest offersContent(List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  public UpdateOfferContentRequest addOffersContentItem(OfferContentDTO offersContentItem) {
    if (this.offersContent == null) {
      this.offersContent = new ArrayList<>();
    }
    this.offersContent.add(offersContentItem);
    return this;
  }

  /**
   * Список товаров с указанными характеристиками.
   * @return offersContent
   */
  @javax.annotation.Nonnull
  public List<OfferContentDTO> getOffersContent() {
    return offersContent;
  }

  public void setOffersContent(List<OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentRequest updateOfferContentRequest = (UpdateOfferContentRequest) o;
    return Objects.equals(this.offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentRequest {\n");
    sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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
    openapiFields.add("offersContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offersContent");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateOfferContentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateOfferContentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateOfferContentRequest is not found in the empty JSON string", UpdateOfferContentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateOfferContentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateOfferContentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateOfferContentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("offersContent").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offersContent` to be an array in the JSON string but got `%s`", jsonObj.get("offersContent").toString()));
      }

      JsonArray jsonArrayoffersContent = jsonObj.getAsJsonArray("offersContent");
      // validate the required field `offersContent` (array)
      for (int i = 0; i < jsonArrayoffersContent.size(); i++) {
        OfferContentDTO.validateJsonElement(jsonArrayoffersContent.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOfferContentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOfferContentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOfferContentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOfferContentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOfferContentRequest>() {
           @Override
           public void write(JsonWriter out, UpdateOfferContentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOfferContentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateOfferContentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateOfferContentRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateOfferContentRequest
   */
  public static UpdateOfferContentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOfferContentRequest.class);
  }

  /**
   * Convert an instance of UpdateOfferContentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


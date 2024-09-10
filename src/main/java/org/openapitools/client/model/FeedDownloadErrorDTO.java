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
import org.openapitools.client.model.FeedDownloadErrorType;

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
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedDownloadErrorDTO {
  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private Integer httpStatusCode;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FeedDownloadErrorType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public FeedDownloadErrorDTO() {
  }

  public FeedDownloadErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. 
   * @return httpStatusCode
   */
  @javax.annotation.Nullable
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public FeedDownloadErrorDTO type(FeedDownloadErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public FeedDownloadErrorType getType() {
    return type;
  }

  public void setType(FeedDownloadErrorType type) {
    this.type = type;
  }


  public FeedDownloadErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. 
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDownloadErrorDTO feedDownloadErrorDTO = (FeedDownloadErrorDTO) o;
    return Objects.equals(this.httpStatusCode, feedDownloadErrorDTO.httpStatusCode) &&
        Objects.equals(this.type, feedDownloadErrorDTO.type) &&
        Objects.equals(this.description, feedDownloadErrorDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDownloadErrorDTO {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("httpStatusCode");
    openapiFields.add("type");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeedDownloadErrorDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedDownloadErrorDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedDownloadErrorDTO is not found in the empty JSON string", FeedDownloadErrorDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedDownloadErrorDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedDownloadErrorDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        FeedDownloadErrorType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedDownloadErrorDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedDownloadErrorDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedDownloadErrorDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedDownloadErrorDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedDownloadErrorDTO>() {
           @Override
           public void write(JsonWriter out, FeedDownloadErrorDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedDownloadErrorDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeedDownloadErrorDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeedDownloadErrorDTO
   * @throws IOException if the JSON string is invalid with respect to FeedDownloadErrorDTO
   */
  public static FeedDownloadErrorDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedDownloadErrorDTO.class);
  }

  /**
   * Convert an instance of FeedDownloadErrorDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


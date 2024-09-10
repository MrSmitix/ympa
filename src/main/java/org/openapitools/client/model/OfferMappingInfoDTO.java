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
import org.openapitools.client.model.OfferMappingDTO;

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
 * Информация о карточке товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingInfoDTO {
  public static final String SERIALIZED_NAME_MAPPING = "mapping";
  @SerializedName(SERIALIZED_NAME_MAPPING)
  private OfferMappingDTO mapping;

  public static final String SERIALIZED_NAME_AWAITING_MODERATION_MAPPING = "awaitingModerationMapping";
  @SerializedName(SERIALIZED_NAME_AWAITING_MODERATION_MAPPING)
  private OfferMappingDTO awaitingModerationMapping;

  public static final String SERIALIZED_NAME_REJECTED_MAPPING = "rejectedMapping";
  @SerializedName(SERIALIZED_NAME_REJECTED_MAPPING)
  private OfferMappingDTO rejectedMapping;

  public OfferMappingInfoDTO() {
  }

  public OfferMappingInfoDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   */
  @javax.annotation.Nullable
  public OfferMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }


  public OfferMappingInfoDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

  /**
   * Get awaitingModerationMapping
   * @return awaitingModerationMapping
   */
  @javax.annotation.Nullable
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }

  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }


  public OfferMappingInfoDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

  /**
   * Get rejectedMapping
   * @return rejectedMapping
   */
  @javax.annotation.Nullable
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }

  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingInfoDTO offerMappingInfoDTO = (OfferMappingInfoDTO) o;
    return Objects.equals(this.mapping, offerMappingInfoDTO.mapping) &&
        Objects.equals(this.awaitingModerationMapping, offerMappingInfoDTO.awaitingModerationMapping) &&
        Objects.equals(this.rejectedMapping, offerMappingInfoDTO.rejectedMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingInfoDTO {\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
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
    openapiFields.add("mapping");
    openapiFields.add("awaitingModerationMapping");
    openapiFields.add("rejectedMapping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferMappingInfoDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferMappingInfoDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferMappingInfoDTO is not found in the empty JSON string", OfferMappingInfoDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferMappingInfoDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferMappingInfoDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `mapping`
      if (jsonObj.get("mapping") != null && !jsonObj.get("mapping").isJsonNull()) {
        OfferMappingDTO.validateJsonElement(jsonObj.get("mapping"));
      }
      // validate the optional field `awaitingModerationMapping`
      if (jsonObj.get("awaitingModerationMapping") != null && !jsonObj.get("awaitingModerationMapping").isJsonNull()) {
        OfferMappingDTO.validateJsonElement(jsonObj.get("awaitingModerationMapping"));
      }
      // validate the optional field `rejectedMapping`
      if (jsonObj.get("rejectedMapping") != null && !jsonObj.get("rejectedMapping").isJsonNull()) {
        OfferMappingDTO.validateJsonElement(jsonObj.get("rejectedMapping"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferMappingInfoDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferMappingInfoDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferMappingInfoDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferMappingInfoDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferMappingInfoDTO>() {
           @Override
           public void write(JsonWriter out, OfferMappingInfoDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferMappingInfoDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferMappingInfoDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferMappingInfoDTO
   * @throws IOException if the JSON string is invalid with respect to OfferMappingInfoDTO
   */
  public static OfferMappingInfoDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferMappingInfoDTO.class);
  }

  /**
   * Convert an instance of OfferMappingInfoDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


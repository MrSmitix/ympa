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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteOffersDTO {
  public static final String SERIALIZED_NAME_NOT_DELETED_OFFER_IDS = "notDeletedOfferIds";
  @SerializedName(SERIALIZED_NAME_NOT_DELETED_OFFER_IDS)
  private List<String> notDeletedOfferIds;

  public DeleteOffersDTO() {
  }

  public DeleteOffersDTO notDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
    return this;
  }

  public DeleteOffersDTO addNotDeletedOfferIdsItem(String notDeletedOfferIdsItem) {
    if (this.notDeletedOfferIds == null) {
      this.notDeletedOfferIds = new ArrayList<>();
    }
    this.notDeletedOfferIds.add(notDeletedOfferIdsItem);
    return this;
  }

  /**
   * Список SKU товаров, которые не удалось удалить.
   * @return notDeletedOfferIds
   */
  @javax.annotation.Nullable
  public List<String> getNotDeletedOfferIds() {
    return notDeletedOfferIds;
  }

  public void setNotDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOffersDTO deleteOffersDTO = (DeleteOffersDTO) o;
    return Objects.equals(this.notDeletedOfferIds, deleteOffersDTO.notDeletedOfferIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(notDeletedOfferIds);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOffersDTO {\n");
    sb.append("    notDeletedOfferIds: ").append(toIndentedString(notDeletedOfferIds)).append("\n");
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
    openapiFields.add("notDeletedOfferIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteOffersDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteOffersDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteOffersDTO is not found in the empty JSON string", DeleteOffersDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteOffersDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteOffersDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("notDeletedOfferIds") != null && !jsonObj.get("notDeletedOfferIds").isJsonNull() && !jsonObj.get("notDeletedOfferIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notDeletedOfferIds` to be an array in the JSON string but got `%s`", jsonObj.get("notDeletedOfferIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteOffersDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteOffersDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteOffersDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteOffersDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteOffersDTO>() {
           @Override
           public void write(JsonWriter out, DeleteOffersDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteOffersDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteOffersDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteOffersDTO
   * @throws IOException if the JSON string is invalid with respect to DeleteOffersDTO
   */
  public static DeleteOffersDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteOffersDTO.class);
  }

  /**
   * Convert an instance of DeleteOffersDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


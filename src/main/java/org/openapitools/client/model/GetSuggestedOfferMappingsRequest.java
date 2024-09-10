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
import org.openapitools.client.model.SuggestedOfferDTO;
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
 * GetSuggestedOfferMappingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsRequest {
  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<SuggestedOfferDTO> offers;

  public GetSuggestedOfferMappingsRequest() {
  }

  public GetSuggestedOfferMappingsRequest offers(List<SuggestedOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetSuggestedOfferMappingsRequest addOffersItem(SuggestedOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров.
   * @return offers
   */
  @javax.annotation.Nullable
  public List<SuggestedOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<SuggestedOfferDTO> offers) {
    this.offers = offers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = (GetSuggestedOfferMappingsRequest) o;
    return Objects.equals(this.offers, getSuggestedOfferMappingsRequest.offers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
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
    sb.append("class GetSuggestedOfferMappingsRequest {\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
    openapiFields.add("offers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetSuggestedOfferMappingsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSuggestedOfferMappingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSuggestedOfferMappingsRequest is not found in the empty JSON string", GetSuggestedOfferMappingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSuggestedOfferMappingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSuggestedOfferMappingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("offers") != null && !jsonObj.get("offers").isJsonNull()) {
        JsonArray jsonArrayoffers = jsonObj.getAsJsonArray("offers");
        if (jsonArrayoffers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("offers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `offers` to be an array in the JSON string but got `%s`", jsonObj.get("offers").toString()));
          }

          // validate the optional field `offers` (array)
          for (int i = 0; i < jsonArrayoffers.size(); i++) {
            SuggestedOfferDTO.validateJsonElement(jsonArrayoffers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSuggestedOfferMappingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSuggestedOfferMappingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSuggestedOfferMappingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSuggestedOfferMappingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSuggestedOfferMappingsRequest>() {
           @Override
           public void write(JsonWriter out, GetSuggestedOfferMappingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSuggestedOfferMappingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetSuggestedOfferMappingsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetSuggestedOfferMappingsRequest
   * @throws IOException if the JSON string is invalid with respect to GetSuggestedOfferMappingsRequest
   */
  public static GetSuggestedOfferMappingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSuggestedOfferMappingsRequest.class);
  }

  /**
   * Convert an instance of GetSuggestedOfferMappingsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


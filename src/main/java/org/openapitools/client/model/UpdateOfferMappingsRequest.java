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
import org.openapitools.client.model.UpdateOfferMappingDTO;

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
 * UpdateOfferMappingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingsRequest {
  public static final String SERIALIZED_NAME_OFFER_MAPPINGS = "offerMappings";
  @SerializedName(SERIALIZED_NAME_OFFER_MAPPINGS)
  private List<UpdateOfferMappingDTO> offerMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_ONLY_PARTNER_MEDIA_CONTENT = "onlyPartnerMediaContent";
  @SerializedName(SERIALIZED_NAME_ONLY_PARTNER_MEDIA_CONTENT)
  private Boolean onlyPartnerMediaContent;

  public UpdateOfferMappingsRequest() {
  }

  public UpdateOfferMappingsRequest offerMappings(List<UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  public UpdateOfferMappingsRequest addOfferMappingsItem(UpdateOfferMappingDTO offerMappingsItem) {
    if (this.offerMappings == null) {
      this.offerMappings = new ArrayList<>();
    }
    this.offerMappings.add(offerMappingsItem);
    return this;
  }

  /**
   * Перечень товаров, которые нужно добавить или обновить.
   * @return offerMappings
   */
  @javax.annotation.Nonnull
  public List<UpdateOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<UpdateOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }


  public UpdateOfferMappingsRequest onlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
    return this;
  }

  /**
   * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. 
   * @return onlyPartnerMediaContent
   */
  @javax.annotation.Nullable
  public Boolean getOnlyPartnerMediaContent() {
    return onlyPartnerMediaContent;
  }

  public void setOnlyPartnerMediaContent(Boolean onlyPartnerMediaContent) {
    this.onlyPartnerMediaContent = onlyPartnerMediaContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingsRequest updateOfferMappingsRequest = (UpdateOfferMappingsRequest) o;
    return Objects.equals(this.offerMappings, updateOfferMappingsRequest.offerMappings) &&
        Objects.equals(this.onlyPartnerMediaContent, updateOfferMappingsRequest.onlyPartnerMediaContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappings, onlyPartnerMediaContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingsRequest {\n");
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
    sb.append("    onlyPartnerMediaContent: ").append(toIndentedString(onlyPartnerMediaContent)).append("\n");
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
    openapiFields.add("offerMappings");
    openapiFields.add("onlyPartnerMediaContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offerMappings");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateOfferMappingsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateOfferMappingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateOfferMappingsRequest is not found in the empty JSON string", UpdateOfferMappingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateOfferMappingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateOfferMappingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateOfferMappingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("offerMappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerMappings` to be an array in the JSON string but got `%s`", jsonObj.get("offerMappings").toString()));
      }

      JsonArray jsonArrayofferMappings = jsonObj.getAsJsonArray("offerMappings");
      // validate the required field `offerMappings` (array)
      for (int i = 0; i < jsonArrayofferMappings.size(); i++) {
        UpdateOfferMappingDTO.validateJsonElement(jsonArrayofferMappings.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOfferMappingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOfferMappingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOfferMappingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOfferMappingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOfferMappingsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateOfferMappingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOfferMappingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateOfferMappingsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateOfferMappingsRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateOfferMappingsRequest
   */
  public static UpdateOfferMappingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOfferMappingsRequest.class);
  }

  /**
   * Convert an instance of UpdateOfferMappingsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


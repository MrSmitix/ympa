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
import org.openapitools.client.model.ParameterValueDTO;

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
 * Товар с указанными характеристиками.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferContentDTO {
  public static final String SERIALIZED_NAME_OFFER_ID = "offerId";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_PARAMETER_VALUES = "parameterValues";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUES)
  private List<ParameterValueDTO> parameterValues = new ArrayList<>();

  public OfferContentDTO() {
  }

  public OfferContentDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @javax.annotation.Nonnull
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  public OfferContentDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   * @return categoryId
   */
  @javax.annotation.Nonnull
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public OfferContentDTO parameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  public OfferContentDTO addParameterValuesItem(ParameterValueDTO parameterValuesItem) {
    if (this.parameterValues == null) {
      this.parameterValues = new ArrayList<>();
    }
    this.parameterValues.add(parameterValuesItem);
    return this;
  }

  /**
   * Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300. 
   * @return parameterValues
   */
  @javax.annotation.Nonnull
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContentDTO offerContentDTO = (OfferContentDTO) o;
    return Objects.equals(this.offerId, offerContentDTO.offerId) &&
        Objects.equals(this.categoryId, offerContentDTO.categoryId) &&
        Objects.equals(this.parameterValues, offerContentDTO.parameterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, categoryId, parameterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContentDTO {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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
    openapiFields.add("offerId");
    openapiFields.add("categoryId");
    openapiFields.add("parameterValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offerId");
    openapiRequiredFields.add("categoryId");
    openapiRequiredFields.add("parameterValues");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferContentDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferContentDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferContentDTO is not found in the empty JSON string", OfferContentDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferContentDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferContentDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferContentDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("offerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("parameterValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterValues` to be an array in the JSON string but got `%s`", jsonObj.get("parameterValues").toString()));
      }

      JsonArray jsonArrayparameterValues = jsonObj.getAsJsonArray("parameterValues");
      // validate the required field `parameterValues` (array)
      for (int i = 0; i < jsonArrayparameterValues.size(); i++) {
        ParameterValueDTO.validateJsonElement(jsonArrayparameterValues.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferContentDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferContentDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferContentDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferContentDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferContentDTO>() {
           @Override
           public void write(JsonWriter out, OfferContentDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferContentDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferContentDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferContentDTO
   * @throws IOException if the JSON string is invalid with respect to OfferContentDTO
   */
  public static OfferContentDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferContentDTO.class);
  }

  /**
   * Convert an instance of OfferContentDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


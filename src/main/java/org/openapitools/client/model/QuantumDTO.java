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
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuantumDTO {
  public static final String SERIALIZED_NAME_MIN_QUANTITY = "minQuantity";
  @SerializedName(SERIALIZED_NAME_MIN_QUANTITY)
  private Integer minQuantity;

  public static final String SERIALIZED_NAME_STEP_QUANTITY = "stepQuantity";
  @SerializedName(SERIALIZED_NAME_STEP_QUANTITY)
  private Integer stepQuantity;

  public QuantumDTO() {
  }

  public QuantumDTO minQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
    return this;
  }

  /**
   * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
   * minimum: 1
   * @return minQuantity
   */
  @javax.annotation.Nullable
  public Integer getMinQuantity() {
    return minQuantity;
  }

  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }


  public QuantumDTO stepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
    return this;
  }

  /**
   * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
   * minimum: 1
   * maximum: 100
   * @return stepQuantity
   */
  @javax.annotation.Nullable
  public Integer getStepQuantity() {
    return stepQuantity;
  }

  public void setStepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantumDTO quantumDTO = (QuantumDTO) o;
    return Objects.equals(this.minQuantity, quantumDTO.minQuantity) &&
        Objects.equals(this.stepQuantity, quantumDTO.stepQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minQuantity, stepQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantumDTO {\n");
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    stepQuantity: ").append(toIndentedString(stepQuantity)).append("\n");
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
    openapiFields.add("minQuantity");
    openapiFields.add("stepQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuantumDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuantumDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuantumDTO is not found in the empty JSON string", QuantumDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuantumDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuantumDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuantumDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuantumDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuantumDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuantumDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<QuantumDTO>() {
           @Override
           public void write(JsonWriter out, QuantumDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuantumDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuantumDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuantumDTO
   * @throws IOException if the JSON string is invalid with respect to QuantumDTO
   */
  public static QuantumDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuantumDTO.class);
  }

  /**
   * Convert an instance of QuantumDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


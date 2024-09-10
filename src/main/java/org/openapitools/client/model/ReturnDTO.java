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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.LogisticPickupPointDTO;
import org.openapitools.client.model.RecipientType;
import org.openapitools.client.model.RefundStatusType;
import org.openapitools.client.model.ReturnItemDTO;
import org.openapitools.client.model.ReturnShipmentStatusType;
import org.openapitools.client.model.ReturnType;

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
 * Возврат заказа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refundStatus";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private RefundStatusType refundStatus;

  public static final String SERIALIZED_NAME_LOGISTIC_PICKUP_POINT = "logisticPickupPoint";
  @SerializedName(SERIALIZED_NAME_LOGISTIC_PICKUP_POINT)
  private LogisticPickupPointDTO logisticPickupPoint;

  public static final String SERIALIZED_NAME_SHIPMENT_RECIPIENT_TYPE = "shipmentRecipientType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_RECIPIENT_TYPE)
  private RecipientType shipmentRecipientType;

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "shipmentStatus";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATUS)
  private ReturnShipmentStatusType shipmentStatus;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refundAmount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private Long refundAmount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ReturnItemDTO> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETURN_TYPE = "returnType";
  @SerializedName(SERIALIZED_NAME_RETURN_TYPE)
  private ReturnType returnType;

  public static final String SERIALIZED_NAME_FAST_RETURN = "fastReturn";
  @SerializedName(SERIALIZED_NAME_FAST_RETURN)
  private Boolean fastReturn;

  public ReturnDTO() {
  }

  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор возврата.
   * @return id
   */
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public ReturnDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Номер заказа.
   * @return orderId
   */
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public ReturnDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания возврата клиентом.
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ReturnDTO updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Дата обновления возврата.
   * @return updateDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public ReturnDTO refundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

  /**
   * Get refundStatus
   * @return refundStatus
   */
  @javax.annotation.Nullable
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }


  public ReturnDTO logisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
    return this;
  }

  /**
   * Get logisticPickupPoint
   * @return logisticPickupPoint
   */
  @javax.annotation.Nullable
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }

  public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }


  public ReturnDTO shipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
    return this;
  }

  /**
   * Get shipmentRecipientType
   * @return shipmentRecipientType
   */
  @javax.annotation.Nullable
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }

  public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }


  public ReturnDTO shipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

  /**
   * Get shipmentStatus
   * @return shipmentStatus
   */
  @javax.annotation.Nullable
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }


  public ReturnDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Сумма возврата.
   * @return refundAmount
   */
  @javax.annotation.Nullable
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }


  public ReturnDTO items(List<ReturnItemDTO> items) {
    this.items = items;
    return this;
  }

  public ReturnDTO addItemsItem(ReturnItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в возврате.
   * @return items
   */
  @javax.annotation.Nonnull
  public List<ReturnItemDTO> getItems() {
    return items;
  }

  public void setItems(List<ReturnItemDTO> items) {
    this.items = items;
  }


  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

  /**
   * Get returnType
   * @return returnType
   */
  @javax.annotation.Nullable
  public ReturnType getReturnType() {
    return returnType;
  }

  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }


  public ReturnDTO fastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
    return this;
  }

  /**
   * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
   * @return fastReturn
   */
  @javax.annotation.Nullable
  public Boolean getFastReturn() {
    return fastReturn;
  }

  public void setFastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnDTO returnDTO = (ReturnDTO) o;
    return Objects.equals(this.id, returnDTO.id) &&
        Objects.equals(this.orderId, returnDTO.orderId) &&
        Objects.equals(this.creationDate, returnDTO.creationDate) &&
        Objects.equals(this.updateDate, returnDTO.updateDate) &&
        Objects.equals(this.refundStatus, returnDTO.refundStatus) &&
        Objects.equals(this.logisticPickupPoint, returnDTO.logisticPickupPoint) &&
        Objects.equals(this.shipmentRecipientType, returnDTO.shipmentRecipientType) &&
        Objects.equals(this.shipmentStatus, returnDTO.shipmentStatus) &&
        Objects.equals(this.refundAmount, returnDTO.refundAmount) &&
        Objects.equals(this.items, returnDTO.items) &&
        Objects.equals(this.returnType, returnDTO.returnType) &&
        Objects.equals(this.fastReturn, returnDTO.fastReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, creationDate, updateDate, refundStatus, logisticPickupPoint, shipmentRecipientType, shipmentStatus, refundAmount, items, returnType, fastReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    logisticPickupPoint: ").append(toIndentedString(logisticPickupPoint)).append("\n");
    sb.append("    shipmentRecipientType: ").append(toIndentedString(shipmentRecipientType)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    fastReturn: ").append(toIndentedString(fastReturn)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orderId");
    openapiFields.add("creationDate");
    openapiFields.add("updateDate");
    openapiFields.add("refundStatus");
    openapiFields.add("logisticPickupPoint");
    openapiFields.add("shipmentRecipientType");
    openapiFields.add("shipmentStatus");
    openapiFields.add("refundAmount");
    openapiFields.add("items");
    openapiFields.add("returnType");
    openapiFields.add("fastReturn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReturnDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnDTO is not found in the empty JSON string", ReturnDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReturnDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `refundStatus`
      if (jsonObj.get("refundStatus") != null && !jsonObj.get("refundStatus").isJsonNull()) {
        RefundStatusType.validateJsonElement(jsonObj.get("refundStatus"));
      }
      // validate the optional field `logisticPickupPoint`
      if (jsonObj.get("logisticPickupPoint") != null && !jsonObj.get("logisticPickupPoint").isJsonNull()) {
        LogisticPickupPointDTO.validateJsonElement(jsonObj.get("logisticPickupPoint"));
      }
      // validate the optional field `shipmentRecipientType`
      if (jsonObj.get("shipmentRecipientType") != null && !jsonObj.get("shipmentRecipientType").isJsonNull()) {
        RecipientType.validateJsonElement(jsonObj.get("shipmentRecipientType"));
      }
      // validate the optional field `shipmentStatus`
      if (jsonObj.get("shipmentStatus") != null && !jsonObj.get("shipmentStatus").isJsonNull()) {
        ReturnShipmentStatusType.validateJsonElement(jsonObj.get("shipmentStatus"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        ReturnItemDTO.validateJsonElement(jsonArrayitems.get(i));
      };
      // validate the optional field `returnType`
      if (jsonObj.get("returnType") != null && !jsonObj.get("returnType").isJsonNull()) {
        ReturnType.validateJsonElement(jsonObj.get("returnType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnDTO>() {
           @Override
           public void write(JsonWriter out, ReturnDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReturnDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnDTO
   * @throws IOException if the JSON string is invalid with respect to ReturnDTO
   */
  public static ReturnDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnDTO.class);
  }

  /**
   * Convert an instance of ReturnDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


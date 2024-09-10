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
import java.math.BigDecimal;
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
 * Информация о предложении.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T21:58:46.292387749Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelOfferDTO {
  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Integer discount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POS = "pos";
  @SerializedName(SERIALIZED_NAME_POS)
  private Integer pos;

  public static final String SERIALIZED_NAME_PRE_DISCOUNT_PRICE = "preDiscountPrice";
  @SerializedName(SERIALIZED_NAME_PRE_DISCOUNT_PRICE)
  private BigDecimal preDiscountPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_REGION_ID = "regionId";
  @SerializedName(SERIALIZED_NAME_REGION_ID)
  private Long regionId;

  public static final String SERIALIZED_NAME_SHIPPING_COST = "shippingCost";
  @SerializedName(SERIALIZED_NAME_SHIPPING_COST)
  private BigDecimal shippingCost;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shopName";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_SHOP_RATING = "shopRating";
  @SerializedName(SERIALIZED_NAME_SHOP_RATING)
  private Integer shopRating;

  public static final String SERIALIZED_NAME_IN_STOCK = "inStock";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_IN_STOCK)
  private Integer inStock;

  public ModelOfferDTO() {
  }

  public ModelOfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Скидка на предложение в процентах.
   * @return discount
   */
  @javax.annotation.Nullable
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }


  public ModelOfferDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование предложения.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModelOfferDTO pos(Integer pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Позиция предложения в выдаче Маркета на карточке модели.
   * @return pos
   */
  @javax.annotation.Nullable
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }


  public ModelOfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

  /**
   * Цена предложения без скидки магазина.
   * @return preDiscountPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }


  public ModelOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ModelOfferDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. 
   * @return regionId
   */
  @javax.annotation.Nullable
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }


  public ModelOfferDTO shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
   * @return shippingCost
   */
  @javax.annotation.Nullable
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }


  public ModelOfferDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

  /**
   * Название магазина (в том виде, в котором отображается на Маркете).
   * @return shopName
   */
  @javax.annotation.Nullable
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }


  public ModelOfferDTO shopRating(Integer shopRating) {
    this.shopRating = shopRating;
    return this;
  }

  /**
   * Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. 
   * @return shopRating
   */
  @javax.annotation.Nullable
  public Integer getShopRating() {
    return shopRating;
  }

  public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }


  @Deprecated
  public ModelOfferDTO inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return inStock
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public Integer getInStock() {
    return inStock;
  }

  @Deprecated
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOfferDTO modelOfferDTO = (ModelOfferDTO) o;
    return Objects.equals(this.discount, modelOfferDTO.discount) &&
        Objects.equals(this.name, modelOfferDTO.name) &&
        Objects.equals(this.pos, modelOfferDTO.pos) &&
        Objects.equals(this.preDiscountPrice, modelOfferDTO.preDiscountPrice) &&
        Objects.equals(this.price, modelOfferDTO.price) &&
        Objects.equals(this.regionId, modelOfferDTO.regionId) &&
        Objects.equals(this.shippingCost, modelOfferDTO.shippingCost) &&
        Objects.equals(this.shopName, modelOfferDTO.shopName) &&
        Objects.equals(this.shopRating, modelOfferDTO.shopRating) &&
        Objects.equals(this.inStock, modelOfferDTO.inStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, name, pos, preDiscountPrice, price, regionId, shippingCost, shopName, shopRating, inStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOfferDTO {\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopRating: ").append(toIndentedString(shopRating)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
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
    openapiFields.add("discount");
    openapiFields.add("name");
    openapiFields.add("pos");
    openapiFields.add("preDiscountPrice");
    openapiFields.add("price");
    openapiFields.add("regionId");
    openapiFields.add("shippingCost");
    openapiFields.add("shopName");
    openapiFields.add("shopRating");
    openapiFields.add("inStock");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelOfferDTO
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelOfferDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelOfferDTO is not found in the empty JSON string", ModelOfferDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelOfferDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelOfferDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("shopName") != null && !jsonObj.get("shopName").isJsonNull()) && !jsonObj.get("shopName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelOfferDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelOfferDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelOfferDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelOfferDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelOfferDTO>() {
           @Override
           public void write(JsonWriter out, ModelOfferDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelOfferDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelOfferDTO given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelOfferDTO
   * @throws IOException if the JSON string is invalid with respect to ModelOfferDTO
   */
  public static ModelOfferDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelOfferDTO.class);
  }

  /**
   * Convert an instance of ModelOfferDTO to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


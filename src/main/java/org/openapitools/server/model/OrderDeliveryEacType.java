/**
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

package org.openapitools.server.model;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


/**
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
 */
@JsonbTypeSerializer(OrderDeliveryEacType.Serializer.class)
@JsonbTypeDeserializer(OrderDeliveryEacType.Deserializer.class)
public enum OrderDeliveryEacType {
  
  MERCHANT_TO_COURIER("MERCHANT_TO_COURIER"),
  
  COURIER_TO_MERCHANT("COURIER_TO_MERCHANT"),
  
  CHECKING_BY_MERCHANT("CHECKING_BY_MERCHANT");

  private String value;

  OrderDeliveryEacType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static final class Deserializer implements JsonbDeserializer<OrderDeliveryEacType> {
    @Override
    public OrderDeliveryEacType deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
      return fromValue(parser.getString());
    }
  }

  public static final class Serializer implements JsonbSerializer<OrderDeliveryEacType> {
    @Override
    public void serialize(OrderDeliveryEacType obj, JsonGenerator generator, SerializationContext ctx) {
      generator.write(obj.value);
    }
  }

  public static OrderDeliveryEacType fromValue(String text) {
    for (OrderDeliveryEacType b : OrderDeliveryEacType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


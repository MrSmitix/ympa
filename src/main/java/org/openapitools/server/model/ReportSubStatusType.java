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
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 */
@JsonbTypeSerializer(ReportSubStatusType.Serializer.class)
@JsonbTypeDeserializer(ReportSubStatusType.Deserializer.class)
public enum ReportSubStatusType {
  
  NO_DATA("NO_DATA"),
  
  TOO_LARGE("TOO_LARGE"),
  
  RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND");

  private String value;

  ReportSubStatusType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static final class Deserializer implements JsonbDeserializer<ReportSubStatusType> {
    @Override
    public ReportSubStatusType deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
      return fromValue(parser.getString());
    }
  }

  public static final class Serializer implements JsonbSerializer<ReportSubStatusType> {
    @Override
    public void serialize(ReportSubStatusType obj, JsonGenerator generator, SerializationContext ctx) {
      generator.write(obj.value);
    }
  }

  public static ReportSubStatusType fromValue(String text) {
    for (ReportSubStatusType b : ReportSubStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


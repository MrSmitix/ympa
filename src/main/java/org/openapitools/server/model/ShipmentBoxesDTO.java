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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ParcelBoxDTO;
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
  * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
  */

public class ShipmentBoxesDTO  {
  
 /**
  * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
  */
  @JsonbProperty("boxes")
  private List<ParcelBoxDTO> boxes = new ArrayList<>();

  /**
   * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
   * @return boxes
   **/
  public List<ParcelBoxDTO> getBoxes() {
    return boxes;
  }

  /**
   * Set boxes
   */
  public void setBoxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public ShipmentBoxesDTO boxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ShipmentBoxesDTO addBoxesItem(ParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentBoxesDTO {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


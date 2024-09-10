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

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.QualityRatingAffectedOrderDTO;



/**
  * Информация о заказах, которые повлияли на индекс качества.
 **/

public class QualityRatingDetailsDTO  {
  
 /**
   * Список заказов, которые повлияли на индекс качества.
  **/
  private List<QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

 /**
   * Список заказов, которые повлияли на индекс качества.
   * @return affectedOrders
  **/
  public List<QualityRatingAffectedOrderDTO> getAffectedOrders() {
    return affectedOrders;
  }

  /**
    * Set affectedOrders
  **/
  public void setAffectedOrders(List<QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }

  public QualityRatingDetailsDTO affectedOrders(List<QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  public QualityRatingDetailsDTO addAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    this.affectedOrders.add(affectedOrdersItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingDetailsDTO {\n");
    
    sb.append("    affectedOrders: ").append(toIndentedString(affectedOrders)).append("\n");
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

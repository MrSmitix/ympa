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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.UpdateStockDTO;



/**
  * Запрос на изменение информации по остаткам товаров.
 **/

public class UpdateStocksRequest  {
  
 /**
   * Данные об остатках товаров. 
  **/
  private Set<UpdateStockDTO> skus = new LinkedHashSet<>();

 /**
   * Данные об остатках товаров. 
   * @return skus
  **/
  public Set<UpdateStockDTO> getSkus() {
    return skus;
  }

  /**
    * Set skus
  **/
    @JsonDeserialize(as = LinkedHashSet.class)
  public void setSkus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
  }

  public UpdateStocksRequest skus(Set<UpdateStockDTO> skus) {
    this.skus = skus;
    return this;
  }

  public UpdateStocksRequest addSkusItem(UpdateStockDTO skusItem) {
    this.skus.add(skusItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStocksRequest {\n");
    
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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

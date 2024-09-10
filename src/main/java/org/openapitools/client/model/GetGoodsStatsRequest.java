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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Запрос отчета по товарам.
 **/
@ApiModel(description = "Запрос отчета по товарам.")
public class GetGoodsStatsRequest {
  
  @SerializedName("shopSkus")
  private Set<String> shopSkus = null;

  /**
   * Список ваших идентификаторов SKU. 
   **/
  @ApiModelProperty(required = true, value = "Список ваших идентификаторов SKU. ")
  public Set<String> getShopSkus() {
    return shopSkus;
  }
  public void setShopSkus(Set<String> shopSkus) {
    this.shopSkus = shopSkus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGoodsStatsRequest getGoodsStatsRequest = (GetGoodsStatsRequest) o;
    return (this.shopSkus == null ? getGoodsStatsRequest.shopSkus == null : this.shopSkus.equals(getGoodsStatsRequest.shopSkus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.shopSkus == null ? 0: this.shopSkus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsStatsRequest {\n");
    
    sb.append("  shopSkus: ").append(shopSkus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

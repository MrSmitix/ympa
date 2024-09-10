/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;



/**
 * Запрос отчета по товарам.
 */

@ApiModel(description = "Запрос отчета по товарам.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsStatsRequest   {
  
  private Set<String> shopSkus = new LinkedHashSet<>();

  /**
   * Список ваших идентификаторов SKU. 
   */
  public GetGoodsStatsRequest shopSkus(Set<String> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список ваших идентификаторов SKU. ")
  @JsonProperty("shopSkus")
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
    return Objects.equals(shopSkus, getGoodsStatsRequest.shopSkus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSkus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsStatsRequest {\n");
    
    sb.append("    shopSkus: ").append(toIndentedString(shopSkus)).append("\n");
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
}


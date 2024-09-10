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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 **/
@ApiModel(description = "Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. ")
public class UpdateMappingDTO {
  
  @SerializedName("marketSku")
  private Long marketSku = null;

  /**
   * SKU на Маркете.
   **/
  @ApiModelProperty(value = "SKU на Маркете.")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMappingDTO updateMappingDTO = (UpdateMappingDTO) o;
    return (this.marketSku == null ? updateMappingDTO.marketSku == null : this.marketSku.equals(updateMappingDTO.marketSku));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.marketSku == null ? 0: this.marketSku.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMappingDTO {\n");
    
    sb.append("  marketSku: ").append(marketSku).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

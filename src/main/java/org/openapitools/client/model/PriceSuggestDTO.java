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

import java.math.BigDecimal;
import org.openapitools.client.model.PriceSuggestType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Тип цены.
 **/
@ApiModel(description = "Тип цены.")
public class PriceSuggestDTO {
  
  @SerializedName("type")
  private PriceSuggestType type = null;
  @SerializedName("price")
  private BigDecimal price = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public PriceSuggestType getType() {
    return type;
  }
  public void setType(PriceSuggestType type) {
    this.type = type;
  }

  /**
   * Цена в рублях.
   **/
  @ApiModelProperty(value = "Цена в рублях.")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceSuggestDTO priceSuggestDTO = (PriceSuggestDTO) o;
    return (this.type == null ? priceSuggestDTO.type == null : this.type.equals(priceSuggestDTO.type)) &&
        (this.price == null ? priceSuggestDTO.price == null : this.price.equals(priceSuggestDTO.price));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceSuggestDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

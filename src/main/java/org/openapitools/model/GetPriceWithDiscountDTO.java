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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.CurrencyType;



/**
 * Цена с указанием скидки и времени последнего обновления.
 */

@ApiModel(description = "Цена с указанием скидки и времени последнего обновления.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPriceWithDiscountDTO   {
  
  private BigDecimal value;
  private CurrencyType currencyId;
  private BigDecimal discountBase;
  private Date updatedAt;

  /**
   * Значение.
   * minimum: 0
   */
  public GetPriceWithDiscountDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение.")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   */
  public GetPriceWithDiscountDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * minimum: 0
   */
  public GetPriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

  
  @ApiModelProperty(value = "Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
  @JsonProperty("discountBase")
  public BigDecimal getDiscountBase() {
    return discountBase;
  }
  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

  /**
   * Время последнего обновления.
   */
  public GetPriceWithDiscountDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Время последнего обновления.")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceWithDiscountDTO getPriceWithDiscountDTO = (GetPriceWithDiscountDTO) o;
    return Objects.equals(value, getPriceWithDiscountDTO.value) &&
        Objects.equals(currencyId, getPriceWithDiscountDTO.currencyId) &&
        Objects.equals(discountBase, getPriceWithDiscountDTO.discountBase) &&
        Objects.equals(updatedAt, getPriceWithDiscountDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, discountBase, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceWithDiscountDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


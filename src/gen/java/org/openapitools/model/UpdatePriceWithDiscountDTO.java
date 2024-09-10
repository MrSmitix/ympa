/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Цена с указанием скидки.
 */
@ApiModel(description = "Цена с указанием скидки.")
@JsonPropertyOrder({
  UpdatePriceWithDiscountDTO.JSON_PROPERTY_VALUE,
  UpdatePriceWithDiscountDTO.JSON_PROPERTY_CURRENCY_ID,
  UpdatePriceWithDiscountDTO.JSON_PROPERTY_DISCOUNT_BASE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePriceWithDiscountDTO   {
  public static final String JSON_PROPERTY_VALUE = "value";
  @JsonProperty(JSON_PROPERTY_VALUE)
  private BigDecimal value;

  public static final String JSON_PROPERTY_CURRENCY_ID = "currencyId";
  @JsonProperty(JSON_PROPERTY_CURRENCY_ID)
  private CurrencyType currencyId;

  public static final String JSON_PROPERTY_DISCOUNT_BASE = "discountBase";
  @JsonProperty(JSON_PROPERTY_DISCOUNT_BASE)
  private BigDecimal discountBase;

  public UpdatePriceWithDiscountDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Значение.
   * minimum: 0
   * @return value
   **/
  @JsonProperty(value = "value")
  @ApiModelProperty(required = true, value = "Значение.")
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public UpdatePriceWithDiscountDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   **/
  @JsonProperty(value = "currencyId")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public UpdatePriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

  /**
   * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * minimum: 0
   * @return discountBase
   **/
  @JsonProperty(value = "discountBase")
  @ApiModelProperty(value = "Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
  @Valid  @DecimalMin(value="0",inclusive=false)
  public BigDecimal getDiscountBase() {
    return discountBase;
  }

  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePriceWithDiscountDTO updatePriceWithDiscountDTO = (UpdatePriceWithDiscountDTO) o;
    return Objects.equals(this.value, updatePriceWithDiscountDTO.value) &&
        Objects.equals(this.currencyId, updatePriceWithDiscountDTO.currencyId) &&
        Objects.equals(this.discountBase, updatePriceWithDiscountDTO.discountBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, discountBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePriceWithDiscountDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
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


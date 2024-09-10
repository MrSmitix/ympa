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
import org.openapitools.model.UpdatePromoOfferDiscountParamsDTO;



/**
 * Параметры товара, который участвует в акции.
 */

@ApiModel(description = "Параметры товара, который участвует в акции.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOfferParamsDTO   {
  
  private UpdatePromoOfferDiscountParamsDTO discountParams;

  /**
   */
  public UpdatePromoOfferParamsDTO discountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("discountParams")
  public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }
  public void setDiscountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOfferParamsDTO updatePromoOfferParamsDTO = (UpdatePromoOfferParamsDTO) o;
    return Objects.equals(discountParams, updatePromoOfferParamsDTO.discountParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferParamsDTO {\n");
    
    sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
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


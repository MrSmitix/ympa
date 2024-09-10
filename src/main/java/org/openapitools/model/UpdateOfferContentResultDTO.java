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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferContentErrorDTO;



/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */

@ApiModel(description = "Ошибки и предупреждения, которые появились из-за переданных характеристик.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentResultDTO   {
  
  private String offerId;
  private List<OfferContentErrorDTO> errors;
  private List<OfferContentErrorDTO> warnings;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   */
  public UpdateOfferContentResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Ошибки — информация в каталоге не обновится.
   */
  public UpdateOfferContentResultDTO errors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки — информация в каталоге не обновится.")
  @JsonProperty("errors")
  public List<OfferContentErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Предупреждения — информация в каталоге обновится.
   */
  public UpdateOfferContentResultDTO warnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Предупреждения — информация в каталоге обновится.")
  @JsonProperty("warnings")
  public List<OfferContentErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentResultDTO updateOfferContentResultDTO = (UpdateOfferContentResultDTO) o;
    return Objects.equals(offerId, updateOfferContentResultDTO.offerId) &&
        Objects.equals(errors, updateOfferContentResultDTO.errors) &&
        Objects.equals(warnings, updateOfferContentResultDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResultDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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


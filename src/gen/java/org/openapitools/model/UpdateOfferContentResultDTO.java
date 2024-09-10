package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferContentErrorDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/
@ApiModel(description="Ошибки и предупреждения, которые появились из-за переданных характеристик.")

public class UpdateOfferContentResultDTO  {
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

  @ApiModelProperty(value = "Ошибки — информация в каталоге не обновится.")
 /**
   * Ошибки — информация в каталоге не обновится.
  **/
  private List<OfferContentErrorDTO> errors;

  @ApiModelProperty(value = "Предупреждения — информация в каталоге обновится.")
 /**
   * Предупреждения — информация в каталоге обновится.
  **/
  private List<OfferContentErrorDTO> warnings;
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public UpdateOfferContentResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Ошибки — информация в каталоге не обновится.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<OfferContentErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
  }

  public UpdateOfferContentResultDTO errors(List<OfferContentErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public UpdateOfferContentResultDTO addErrorsItem(OfferContentErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Предупреждения — информация в каталоге обновится.
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<OfferContentErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
  }

  public UpdateOfferContentResultDTO warnings(List<OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public UpdateOfferContentResultDTO addWarningsItem(OfferContentErrorDTO warningsItem) {
    this.warnings.add(warningsItem);
    return this;
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
    return Objects.equals(this.offerId, updateOfferContentResultDTO.offerId) &&
        Objects.equals(this.errors, updateOfferContentResultDTO.errors) &&
        Objects.equals(this.warnings, updateOfferContentResultDTO.warnings);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


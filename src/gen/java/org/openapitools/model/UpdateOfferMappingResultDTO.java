package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferMappingErrorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */
@ApiModel(description="Ошибки и предупреждения, которые появились из-за переданных характеристик.")

public class UpdateOfferMappingResultDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

 /**
  * Ошибки — информация в каталоге не обновится.
  */
  @ApiModelProperty(value = "Ошибки — информация в каталоге не обновится.")
  @Valid
  private List<@Valid OfferMappingErrorDTO> errors;

 /**
  * Предупреждения — информация в каталоге обновится.
  */
  @ApiModelProperty(value = "Предупреждения — информация в каталоге обновится.")
  @Valid
  private List<@Valid OfferMappingErrorDTO> warnings;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public UpdateOfferMappingResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Ошибки — информация в каталоге не обновится.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid OfferMappingErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid OfferMappingErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public UpdateOfferMappingResultDTO errors(List<@Valid OfferMappingErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public UpdateOfferMappingResultDTO addErrorsItem(OfferMappingErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Предупреждения — информация в каталоге обновится.
  * @return warnings
  */
  @JsonProperty("warnings")
  public List<@Valid OfferMappingErrorDTO> getWarnings() {
    return warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
 public void setWarnings(List<@Valid OfferMappingErrorDTO> warnings) {
    this.warnings = warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
  public UpdateOfferMappingResultDTO warnings(List<@Valid OfferMappingErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Adds a new item to the <code>warnings</code> list.
   */
  public UpdateOfferMappingResultDTO addWarningsItem(OfferMappingErrorDTO warningsItem) {
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
    UpdateOfferMappingResultDTO updateOfferMappingResultDTO = (UpdateOfferMappingResultDTO) o;
    return Objects.equals(this.offerId, updateOfferMappingResultDTO.offerId) &&
        Objects.equals(this.errors, updateOfferMappingResultDTO.errors) &&
        Objects.equals(this.warnings, updateOfferMappingResultDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingResultDTO {\n");
    
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


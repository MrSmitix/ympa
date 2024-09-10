package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferContentErrorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/
@ApiModel(description = "Ошибки и предупреждения, которые появились из-за переданных характеристик.")
@JsonTypeName("UpdateOfferContentResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentResultDTO   {
  private String offerId;
  private @Valid List<@Valid OfferContentErrorDTO> errors;
  private @Valid List<@Valid OfferContentErrorDTO> warnings;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public UpdateOfferContentResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  @NotNull  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getOfferId() {
    return offerId;
  }

  @JsonProperty("offerId")
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Ошибки — информация в каталоге не обновится.
   **/
  public UpdateOfferContentResultDTO errors(List<@Valid OfferContentErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки — информация в каталоге не обновится.")
  @JsonProperty("errors")
  @Valid public List<@Valid OfferContentErrorDTO> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid OfferContentErrorDTO> errors) {
    this.errors = errors;
  }

  public UpdateOfferContentResultDTO addErrorsItem(OfferContentErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public UpdateOfferContentResultDTO removeErrorsItem(OfferContentErrorDTO errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * Предупреждения — информация в каталоге обновится.
   **/
  public UpdateOfferContentResultDTO warnings(List<@Valid OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Предупреждения — информация в каталоге обновится.")
  @JsonProperty("warnings")
  @Valid public List<@Valid OfferContentErrorDTO> getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
  public void setWarnings(List<@Valid OfferContentErrorDTO> warnings) {
    this.warnings = warnings;
  }

  public UpdateOfferContentResultDTO addWarningsItem(OfferContentErrorDTO warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }

    this.warnings.add(warningsItem);
    return this;
  }

  public UpdateOfferContentResultDTO removeWarningsItem(OfferContentErrorDTO warningsItem) {
    if (warningsItem != null && this.warnings != null) {
      this.warnings.remove(warningsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


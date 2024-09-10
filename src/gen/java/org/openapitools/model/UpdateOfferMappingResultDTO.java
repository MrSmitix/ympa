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
import org.openapitools.model.OfferMappingErrorDTO;



/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 **/

@ApiModel(description = "Ошибки и предупреждения, которые появились из-за переданных характеристик.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferMappingResultDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("errors")
  private List<OfferMappingErrorDTO> errors = null;

  @JsonProperty("warnings")
  private List<OfferMappingErrorDTO> warnings = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public UpdateOfferMappingResultDTO offerId(String offerId) {
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
   **/
  public UpdateOfferMappingResultDTO errors(List<OfferMappingErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки — информация в каталоге не обновится.")
  @JsonProperty("errors")
  public List<OfferMappingErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferMappingErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Предупреждения — информация в каталоге обновится.
   **/
  public UpdateOfferMappingResultDTO warnings(List<OfferMappingErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Предупреждения — информация в каталоге обновится.")
  @JsonProperty("warnings")
  public List<OfferMappingErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<OfferMappingErrorDTO> warnings) {
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
    UpdateOfferMappingResultDTO updateOfferMappingResultDTO = (UpdateOfferMappingResultDTO) o;
    return Objects.equals(offerId, updateOfferMappingResultDTO.offerId) &&
        Objects.equals(errors, updateOfferMappingResultDTO.errors) &&
        Objects.equals(warnings, updateOfferMappingResultDTO.warnings);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


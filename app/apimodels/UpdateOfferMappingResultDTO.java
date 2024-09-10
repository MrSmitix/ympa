package apimodels;

import apimodels.OfferMappingErrorDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOfferMappingResultDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("errors")
  @Valid

  private List<@Valid OfferMappingErrorDTO> errors = null;

  @JsonProperty("warnings")
  @Valid

  private List<@Valid OfferMappingErrorDTO> warnings = null;

  public UpdateOfferMappingResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public UpdateOfferMappingResultDTO errors(List<@Valid OfferMappingErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public UpdateOfferMappingResultDTO addErrorsItem(OfferMappingErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Ошибки — информация в каталоге не обновится.
   * @return errors
  **/
  public List<@Valid OfferMappingErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid OfferMappingErrorDTO> errors) {
    this.errors = errors;
  }

  public UpdateOfferMappingResultDTO warnings(List<@Valid OfferMappingErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public UpdateOfferMappingResultDTO addWarningsItem(OfferMappingErrorDTO warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Предупреждения — информация в каталоге обновится.
   * @return warnings
  **/
  public List<@Valid OfferMappingErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid OfferMappingErrorDTO> warnings) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


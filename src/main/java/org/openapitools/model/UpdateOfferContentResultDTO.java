package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferContentErrorDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */

@Schema(name = "UpdateOfferContentResultDTO", description = "Ошибки и предупреждения, которые появились из-за переданных характеристик.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentResultDTO {

  private String offerId;

  @Valid
  private JsonNullable<List<@Valid OfferContentErrorDTO>> errors = JsonNullable.<List<@Valid OfferContentErrorDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OfferContentErrorDTO>> warnings = JsonNullable.<List<@Valid OfferContentErrorDTO>>undefined();

  public UpdateOfferContentResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOfferContentResultDTO(String offerId) {
    this.offerId = offerId;
  }

  public UpdateOfferContentResultDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public UpdateOfferContentResultDTO errors(List<@Valid OfferContentErrorDTO> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public UpdateOfferContentResultDTO addErrorsItem(OfferContentErrorDTO errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Ошибки — информация в каталоге не обновится.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Ошибки — информация в каталоге не обновится.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public JsonNullable<List<@Valid OfferContentErrorDTO>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<@Valid OfferContentErrorDTO>> errors) {
    this.errors = errors;
  }

  public UpdateOfferContentResultDTO warnings(List<@Valid OfferContentErrorDTO> warnings) {
    this.warnings = JsonNullable.of(warnings);
    return this;
  }

  public UpdateOfferContentResultDTO addWarningsItem(OfferContentErrorDTO warningsItem) {
    if (this.warnings == null || !this.warnings.isPresent()) {
      this.warnings = JsonNullable.of(new ArrayList<>());
    }
    this.warnings.get().add(warningsItem);
    return this;
  }

  /**
   * Предупреждения — информация в каталоге обновится.
   * @return warnings
   */
  @Valid 
  @Schema(name = "warnings", description = "Предупреждения — информация в каталоге обновится.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public JsonNullable<List<@Valid OfferContentErrorDTO>> getWarnings() {
    return warnings;
  }

  public void setWarnings(JsonNullable<List<@Valid OfferContentErrorDTO>> warnings) {
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
    return Objects.equals(this.offerId, updateOfferContentResultDTO.offerId) &&
        equalsNullable(this.errors, updateOfferContentResultDTO.errors) &&
        equalsNullable(this.warnings, updateOfferContentResultDTO.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, hashCodeNullable(errors), hashCodeNullable(warnings));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


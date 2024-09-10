package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPriceWithDiscountDTO;
import org.openapitools.model.GetPriceWithVatDTO;
import org.openapitools.model.OfferCampaignStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.QuantumDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметры размещения товара в магазине.
 */

@Schema(name = "GetCampaignOfferDTO", description = "Параметры размещения товара в магазине.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOfferDTO {

  private String offerId;

  private QuantumDTO quantum;

  private Boolean available;

  private GetPriceWithDiscountDTO basicPrice;

  private GetPriceWithVatDTO campaignPrice;

  private OfferCampaignStatusType status;

  @Valid
  private JsonNullable<List<@Valid OfferErrorDTO>> errors = JsonNullable.<List<@Valid OfferErrorDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OfferErrorDTO>> warnings = JsonNullable.<List<@Valid OfferErrorDTO>>undefined();

  public GetCampaignOfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCampaignOfferDTO(String offerId) {
    this.offerId = offerId;
  }

  public GetCampaignOfferDTO offerId(String offerId) {
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

  public GetCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

  /**
   * Get quantum
   * @return quantum
   */
  @Valid 
  @Schema(name = "quantum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }

  public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  public GetCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * Есть ли товар в продаже. 
   * @return available
   */
  
  @Schema(name = "available", description = "Есть ли товар в продаже. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public GetCampaignOfferDTO basicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
    return this;
  }

  /**
   * Get basicPrice
   * @return basicPrice
   */
  @Valid 
  @Schema(name = "basicPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("basicPrice")
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }

  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  public GetCampaignOfferDTO campaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

  /**
   * Get campaignPrice
   * @return campaignPrice
   */
  @Valid 
  @Schema(name = "campaignPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaignPrice")
  public GetPriceWithVatDTO getCampaignPrice() {
    return campaignPrice;
  }

  public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

  public GetCampaignOfferDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  public GetCampaignOfferDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public GetCampaignOfferDTO addErrorsItem(OfferErrorDTO errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Ошибки, препятствующие размещению товара на витрине. 
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Ошибки, препятствующие размещению товара на витрине. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public JsonNullable<List<@Valid OfferErrorDTO>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<@Valid OfferErrorDTO>> errors) {
    this.errors = errors;
  }

  public GetCampaignOfferDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = JsonNullable.of(warnings);
    return this;
  }

  public GetCampaignOfferDTO addWarningsItem(OfferErrorDTO warningsItem) {
    if (this.warnings == null || !this.warnings.isPresent()) {
      this.warnings = JsonNullable.of(new ArrayList<>());
    }
    this.warnings.get().add(warningsItem);
    return this;
  }

  /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
   * @return warnings
   */
  @Valid 
  @Schema(name = "warnings", description = "Предупреждения, не препятствующие размещению товара на витрине. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public JsonNullable<List<@Valid OfferErrorDTO>> getWarnings() {
    return warnings;
  }

  public void setWarnings(JsonNullable<List<@Valid OfferErrorDTO>> warnings) {
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
    GetCampaignOfferDTO getCampaignOfferDTO = (GetCampaignOfferDTO) o;
    return Objects.equals(this.offerId, getCampaignOfferDTO.offerId) &&
        Objects.equals(this.quantum, getCampaignOfferDTO.quantum) &&
        Objects.equals(this.available, getCampaignOfferDTO.available) &&
        Objects.equals(this.basicPrice, getCampaignOfferDTO.basicPrice) &&
        Objects.equals(this.campaignPrice, getCampaignOfferDTO.campaignPrice) &&
        Objects.equals(this.status, getCampaignOfferDTO.status) &&
        equalsNullable(this.errors, getCampaignOfferDTO.errors) &&
        equalsNullable(this.warnings, getCampaignOfferDTO.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available, basicPrice, campaignPrice, status, hashCodeNullable(errors), hashCodeNullable(warnings));
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
    sb.append("class GetCampaignOfferDTO {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    basicPrice: ").append(toIndentedString(basicPrice)).append("\n");
    sb.append("    campaignPrice: ").append(toIndentedString(campaignPrice)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


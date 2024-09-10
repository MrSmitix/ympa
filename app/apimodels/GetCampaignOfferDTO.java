package apimodels;

import apimodels.GetPriceWithDiscountDTO;
import apimodels.GetPriceWithVatDTO;
import apimodels.OfferCampaignStatusType;
import apimodels.OfferErrorDTO;
import apimodels.QuantumDTO;
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
 * Параметры размещения товара в магазине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCampaignOfferDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("quantum")
  @Valid

  private QuantumDTO quantum;

  @JsonProperty("available")
  
  private Boolean available;

  @JsonProperty("basicPrice")
  @Valid

  private GetPriceWithDiscountDTO basicPrice;

  @JsonProperty("campaignPrice")
  @Valid

  private GetPriceWithVatDTO campaignPrice;

  @JsonProperty("status")
  @Valid

  private OfferCampaignStatusType status;

  @JsonProperty("errors")
  @Valid

  private List<@Valid OfferErrorDTO> errors = null;

  @JsonProperty("warnings")
  @Valid

  private List<@Valid OfferErrorDTO> warnings = null;

  public GetCampaignOfferDTO offerId(String offerId) {
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

  public GetCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

   /**
   * Get quantum
   * @return quantum
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  public GetCampaignOfferDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCampaignOfferDTO addErrorsItem(OfferErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Ошибки, препятствующие размещению товара на витрине. 
   * @return errors
  **/
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCampaignOfferDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public GetCampaignOfferDTO addWarningsItem(OfferErrorDTO warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
   * @return warnings
  **/
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
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
    return Objects.equals(offerId, getCampaignOfferDTO.offerId) &&
        Objects.equals(quantum, getCampaignOfferDTO.quantum) &&
        Objects.equals(available, getCampaignOfferDTO.available) &&
        Objects.equals(basicPrice, getCampaignOfferDTO.basicPrice) &&
        Objects.equals(campaignPrice, getCampaignOfferDTO.campaignPrice) &&
        Objects.equals(status, getCampaignOfferDTO.status) &&
        Objects.equals(errors, getCampaignOfferDTO.errors) &&
        Objects.equals(warnings, getCampaignOfferDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available, basicPrice, campaignPrice, status, errors, warnings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


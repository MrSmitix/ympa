package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.GetPriceWithDiscountDTO;
import com.prokarma.pkmst.model.GetPriceWithVatDTO;
import com.prokarma.pkmst.model.OfferCampaignStatusType;
import com.prokarma.pkmst.model.OfferErrorDTO;
import com.prokarma.pkmst.model.QuantumDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Параметры размещения товара в магазине.
 */
@ApiModel(description = "Параметры размещения товара в магазине.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOfferDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("quantum")
  private QuantumDTO quantum;

  @JsonProperty("available")
  private Boolean available;

  @JsonProperty("basicPrice")
  private GetPriceWithDiscountDTO basicPrice;

  @JsonProperty("campaignPrice")
  private GetPriceWithVatDTO campaignPrice;

  @JsonProperty("status")
  private OfferCampaignStatusType status;

  @JsonProperty("errors")
  
  private List<OfferErrorDTO> errors = null;

  @JsonProperty("warnings")
  
  private List<OfferErrorDTO> warnings = null;

  public GetCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Есть ли товар в продаже. ")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  public GetCampaignOfferDTO errors(List<OfferErrorDTO> errors) {
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
   */
  @ApiModelProperty(value = "Ошибки, препятствующие размещению товара на витрине. ")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCampaignOfferDTO warnings(List<OfferErrorDTO> warnings) {
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
   */
  @ApiModelProperty(value = "Предупреждения, не препятствующие размещению товара на витрине. ")
  public List<OfferErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<OfferErrorDTO> warnings) {
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
        Objects.equals(this.errors, getCampaignOfferDTO.errors) &&
        Objects.equals(this.warnings, getCampaignOfferDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available, basicPrice, campaignPrice, status, errors, warnings);
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


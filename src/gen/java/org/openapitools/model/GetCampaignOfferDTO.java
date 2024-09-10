package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPriceWithDiscountDTO;
import org.openapitools.model.GetPriceWithVatDTO;
import org.openapitools.model.OfferCampaignStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.QuantumDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметры размещения товара в магазине.
 **/
@ApiModel(description="Параметры размещения товара в магазине.")

public class GetCampaignOfferDTO  {
  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

  @ApiModelProperty(value = "")
  private QuantumDTO quantum;

  @ApiModelProperty(value = "Есть ли товар в продаже. ")
 /**
   * Есть ли товар в продаже. 
  **/
  private Boolean available;

  @ApiModelProperty(value = "")
  private GetPriceWithDiscountDTO basicPrice;

  @ApiModelProperty(value = "")
  private GetPriceWithVatDTO campaignPrice;

  @ApiModelProperty(value = "")
  private OfferCampaignStatusType status;

  @ApiModelProperty(value = "Ошибки, препятствующие размещению товара на витрине. ")
 /**
   * Ошибки, препятствующие размещению товара на витрине. 
  **/
  private List<OfferErrorDTO> errors;

  @ApiModelProperty(value = "Предупреждения, не препятствующие размещению товара на витрине. ")
 /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
  **/
  private List<OfferErrorDTO> warnings;
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

  public GetCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Get quantum
   * @return quantum
  **/
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }

  public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  public GetCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

 /**
   * Есть ли товар в продаже. 
   * @return available
  **/
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public GetCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

 /**
   * Get basicPrice
   * @return basicPrice
  **/
  @JsonProperty("basicPrice")
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }

  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  public GetCampaignOfferDTO basicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
    return this;
  }

 /**
   * Get campaignPrice
   * @return campaignPrice
  **/
  @JsonProperty("campaignPrice")
  public GetPriceWithVatDTO getCampaignPrice() {
    return campaignPrice;
  }

  public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

  public GetCampaignOfferDTO campaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  public GetCampaignOfferDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Ошибки, препятствующие размещению товара на витрине. 
   * @return errors
  **/
  @JsonProperty("errors")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCampaignOfferDTO errors(List<OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCampaignOfferDTO addErrorsItem(OfferErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
   * @return warnings
  **/
  @JsonProperty("warnings")
  public List<OfferErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }

  public GetCampaignOfferDTO warnings(List<OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public GetCampaignOfferDTO addWarningsItem(OfferErrorDTO warningsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


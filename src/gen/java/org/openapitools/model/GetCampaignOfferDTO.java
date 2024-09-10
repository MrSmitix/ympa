package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetPriceWithDiscountDTO;
import org.openapitools.model.GetPriceWithVatDTO;
import org.openapitools.model.OfferCampaignStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.QuantumDTO;



/**
 * Параметры размещения товара в магазине.
 **/

@ApiModel(description = "Параметры размещения товара в магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public GetCampaignOfferDTO offerId(String offerId) {
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
   **/
  public GetCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }
  public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  /**
   * Есть ли товар в продаже. 
   **/
  public GetCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

  
  @ApiModelProperty(value = "Есть ли товар в продаже. ")
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   **/
  public GetCampaignOfferDTO basicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("basicPrice")
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  /**
   **/
  public GetCampaignOfferDTO campaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaignPrice")
  public GetPriceWithVatDTO getCampaignPrice() {
    return campaignPrice;
  }
  public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

  /**
   **/
  public GetCampaignOfferDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OfferCampaignStatusType getStatus() {
    return status;
  }
  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  /**
   * Ошибки, препятствующие размещению товара на витрине. 
   **/
  public GetCampaignOfferDTO errors(List<OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки, препятствующие размещению товара на витрине. ")
  @JsonProperty("errors")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
   **/
  public GetCampaignOfferDTO warnings(List<OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Предупреждения, не препятствующие размещению товара на витрине. ")
  @JsonProperty("warnings")
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


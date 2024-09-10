package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Параметры размещения товара в магазине.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Параметры размещения товара в магазине.")
public class GetCampaignOfferDTO   {
  
  private String offerId;

  private QuantumDTO quantum;

  private Boolean available;

  private GetPriceWithDiscountDTO basicPrice;

  private GetPriceWithVatDTO campaignPrice;

  private OfferCampaignStatusType status;

  private List<@Valid OfferErrorDTO> errors;

  private List<@Valid OfferErrorDTO> warnings;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public GetCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
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
  public GetCampaignOfferDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки, препятствующие размещению товара на витрине. ")
  @JsonProperty("errors")
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCampaignOfferDTO addErrorsItem(OfferErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * Предупреждения, не препятствующие размещению товара на витрине. 
   **/
  public GetCampaignOfferDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Предупреждения, не препятствующие размещению товара на витрине. ")
  @JsonProperty("warnings")
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }

  public GetCampaignOfferDTO addWarningsItem(OfferErrorDTO warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры размещения товара в магазине.
 */
@ApiModel(description="Параметры размещения товара в магазине.")

public class GetCampaignOfferDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private QuantumDTO quantum;

 /**
  * Есть ли товар в продаже. 
  */
  @ApiModelProperty(value = "Есть ли товар в продаже. ")
  private Boolean available;

  @ApiModelProperty(value = "")
  @Valid
  private GetPriceWithDiscountDTO basicPrice;

  @ApiModelProperty(value = "")
  @Valid
  private GetPriceWithVatDTO campaignPrice;

  @ApiModelProperty(value = "")
  @Valid
  private OfferCampaignStatusType status;

 /**
  * Ошибки, препятствующие размещению товара на витрине. 
  */
  @ApiModelProperty(value = "Ошибки, препятствующие размещению товара на витрине. ")
  @Valid
  private List<@Valid OfferErrorDTO> errors;

 /**
  * Предупреждения, не препятствующие размещению товара на витрине. 
  */
  @ApiModelProperty(value = "Предупреждения, не препятствующие размещению товара на витрине. ")
  @Valid
  private List<@Valid OfferErrorDTO> warnings;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public GetCampaignOfferDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get quantum
  * @return quantum
  */
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }

  /**
   * Sets the <code>quantum</code> property.
   */
 public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

  /**
   * Sets the <code>quantum</code> property.
   */
  public GetCampaignOfferDTO quantum(QuantumDTO quantum) {
    this.quantum = quantum;
    return this;
  }

 /**
  * Есть ли товар в продаже. 
  * @return available
  */
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }

  /**
   * Sets the <code>available</code> property.
   */
 public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   * Sets the <code>available</code> property.
   */
  public GetCampaignOfferDTO available(Boolean available) {
    this.available = available;
    return this;
  }

 /**
  * Get basicPrice
  * @return basicPrice
  */
  @JsonProperty("basicPrice")
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }

  /**
   * Sets the <code>basicPrice</code> property.
   */
 public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

  /**
   * Sets the <code>basicPrice</code> property.
   */
  public GetCampaignOfferDTO basicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
    return this;
  }

 /**
  * Get campaignPrice
  * @return campaignPrice
  */
  @JsonProperty("campaignPrice")
  public GetPriceWithVatDTO getCampaignPrice() {
    return campaignPrice;
  }

  /**
   * Sets the <code>campaignPrice</code> property.
   */
 public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

  /**
   * Sets the <code>campaignPrice</code> property.
   */
  public GetCampaignOfferDTO campaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public GetCampaignOfferDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Ошибки, препятствующие размещению товара на витрине. 
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public GetCampaignOfferDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public GetCampaignOfferDTO addErrorsItem(OfferErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Предупреждения, не препятствующие размещению товара на витрине. 
  * @return warnings
  */
  @JsonProperty("warnings")
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
 public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
  public GetCampaignOfferDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Adds a new item to the <code>warnings</code> list.
   */
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


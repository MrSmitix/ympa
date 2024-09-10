package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.GetPriceWithDiscountDTO;
import org.openapitools.vertxweb.server.model.GetPriceWithVatDTO;
import org.openapitools.vertxweb.server.model.OfferCampaignStatusType;
import org.openapitools.vertxweb.server.model.OfferErrorDTO;
import org.openapitools.vertxweb.server.model.QuantumDTO;

/**
 * Параметры размещения товара в магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCampaignOfferDTO   {
  
  private String offerId;
  private QuantumDTO quantum;
  private Boolean available;
  private GetPriceWithDiscountDTO basicPrice;
  private GetPriceWithVatDTO campaignPrice;
  private OfferCampaignStatusType status;
  private List<OfferErrorDTO> errors;
  private List<OfferErrorDTO> warnings;

  public GetCampaignOfferDTO () {

  }

  public GetCampaignOfferDTO (String offerId, QuantumDTO quantum, Boolean available, GetPriceWithDiscountDTO basicPrice, GetPriceWithVatDTO campaignPrice, OfferCampaignStatusType status, List<OfferErrorDTO> errors, List<OfferErrorDTO> warnings) {
    this.offerId = offerId;
    this.quantum = quantum;
    this.available = available;
    this.basicPrice = basicPrice;
    this.campaignPrice = campaignPrice;
    this.status = status;
    this.errors = errors;
    this.warnings = warnings;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("quantum")
  public QuantumDTO getQuantum() {
    return quantum;
  }
  public void setQuantum(QuantumDTO quantum) {
    this.quantum = quantum;
  }

    
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  public void setAvailable(Boolean available) {
    this.available = available;
  }

    
  @JsonProperty("basicPrice")
  public GetPriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

    
  @JsonProperty("campaignPrice")
  public GetPriceWithVatDTO getCampaignPrice() {
    return campaignPrice;
  }
  public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

    
  @JsonProperty("status")
  public OfferCampaignStatusType getStatus() {
    return status;
  }
  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("errors")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

    
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

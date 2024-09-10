package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.QuantumDTO;

/**
 * Параметры размещения товара в магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCampaignOfferDTO   {
  
  private String offerId;
  private QuantumDTO quantum;
  private Boolean available;
  private Integer vat;

  public UpdateCampaignOfferDTO () {

  }

  public UpdateCampaignOfferDTO (String offerId, QuantumDTO quantum, Boolean available, Integer vat) {
    this.offerId = offerId;
    this.quantum = quantum;
    this.available = available;
    this.vat = vat;
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

    
  @JsonProperty("vat")
  public Integer getVat() {
    return vat;
  }
  public void setVat(Integer vat) {
    this.vat = vat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignOfferDTO updateCampaignOfferDTO = (UpdateCampaignOfferDTO) o;
    return Objects.equals(offerId, updateCampaignOfferDTO.offerId) &&
        Objects.equals(quantum, updateCampaignOfferDTO.quantum) &&
        Objects.equals(available, updateCampaignOfferDTO.available) &&
        Objects.equals(vat, updateCampaignOfferDTO.vat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available, vat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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

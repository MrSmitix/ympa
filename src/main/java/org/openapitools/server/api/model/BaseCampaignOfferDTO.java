package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.QuantumDTO;

/**
 * Информация о новой цене на товар.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseCampaignOfferDTO   {
  
  private String offerId;
  private QuantumDTO quantum;
  private Boolean available;

  public BaseCampaignOfferDTO () {

  }

  public BaseCampaignOfferDTO (String offerId, QuantumDTO quantum, Boolean available) {
    this.offerId = offerId;
    this.quantum = quantum;
    this.available = available;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCampaignOfferDTO baseCampaignOfferDTO = (BaseCampaignOfferDTO) o;
    return Objects.equals(offerId, baseCampaignOfferDTO.offerId) &&
        Objects.equals(quantum, baseCampaignOfferDTO.quantum) &&
        Objects.equals(available, baseCampaignOfferDTO.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, quantum, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCampaignOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

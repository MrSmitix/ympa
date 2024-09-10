package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о товарах в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoAssortmentInfoDTO   {
  
  private Integer activeOffers;
  private Integer potentialOffers;
  private Boolean processing;

  public GetPromoAssortmentInfoDTO () {

  }

  public GetPromoAssortmentInfoDTO (Integer activeOffers, Integer potentialOffers, Boolean processing) {
    this.activeOffers = activeOffers;
    this.potentialOffers = potentialOffers;
    this.processing = processing;
  }

    
  @JsonProperty("activeOffers")
  public Integer getActiveOffers() {
    return activeOffers;
  }
  public void setActiveOffers(Integer activeOffers) {
    this.activeOffers = activeOffers;
  }

    
  @JsonProperty("potentialOffers")
  public Integer getPotentialOffers() {
    return potentialOffers;
  }
  public void setPotentialOffers(Integer potentialOffers) {
    this.potentialOffers = potentialOffers;
  }

    
  @JsonProperty("processing")
  public Boolean getProcessing() {
    return processing;
  }
  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO = (GetPromoAssortmentInfoDTO) o;
    return Objects.equals(activeOffers, getPromoAssortmentInfoDTO.activeOffers) &&
        Objects.equals(potentialOffers, getPromoAssortmentInfoDTO.potentialOffers) &&
        Objects.equals(processing, getPromoAssortmentInfoDTO.processing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOffers, potentialOffers, processing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoAssortmentInfoDTO {\n");
    
    sb.append("    activeOffers: ").append(toIndentedString(activeOffers)).append("\n");
    sb.append("    potentialOffers: ").append(toIndentedString(potentialOffers)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
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

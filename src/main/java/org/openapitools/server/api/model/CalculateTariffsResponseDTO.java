package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CalculateTariffsOfferInfoDTO;

/**
 * Расчет стоимости услуг.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateTariffsResponseDTO   {
  
  private List<CalculateTariffsOfferInfoDTO> offers = new ArrayList<>();

  public CalculateTariffsResponseDTO () {

  }

  public CalculateTariffsResponseDTO (List<CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("offers")
  public List<CalculateTariffsOfferInfoDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsResponseDTO calculateTariffsResponseDTO = (CalculateTariffsResponseDTO) o;
    return Objects.equals(offers, calculateTariffsResponseDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CalculateTariffsOfferDTO;
import org.openapitools.server.api.model.CalculatedTariffDTO;

/**
 * Стоимость услуг.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateTariffsOfferInfoDTO   {
  
  private CalculateTariffsOfferDTO offer;
  private List<CalculatedTariffDTO> tariffs = new ArrayList<>();

  public CalculateTariffsOfferInfoDTO () {

  }

  public CalculateTariffsOfferInfoDTO (CalculateTariffsOfferDTO offer, List<CalculatedTariffDTO> tariffs) {
    this.offer = offer;
    this.tariffs = tariffs;
  }

    
  @JsonProperty("offer")
  public CalculateTariffsOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(CalculateTariffsOfferDTO offer) {
    this.offer = offer;
  }

    
  @JsonProperty("tariffs")
  public List<CalculatedTariffDTO> getTariffs() {
    return tariffs;
  }
  public void setTariffs(List<CalculatedTariffDTO> tariffs) {
    this.tariffs = tariffs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO = (CalculateTariffsOfferInfoDTO) o;
    return Objects.equals(offer, calculateTariffsOfferInfoDTO.offer) &&
        Objects.equals(tariffs, calculateTariffsOfferInfoDTO.tariffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, tariffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsOfferInfoDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
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

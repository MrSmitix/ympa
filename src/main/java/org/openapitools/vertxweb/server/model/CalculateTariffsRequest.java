package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CalculateTariffsOfferDTO;
import org.openapitools.vertxweb.server.model.CalculateTariffsParametersDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateTariffsRequest   {
  
  private CalculateTariffsParametersDTO parameters;
  private List<CalculateTariffsOfferDTO> offers = new ArrayList<>();

  public CalculateTariffsRequest () {

  }

  public CalculateTariffsRequest (CalculateTariffsParametersDTO parameters, List<CalculateTariffsOfferDTO> offers) {
    this.parameters = parameters;
    this.offers = offers;
  }

    
  @JsonProperty("parameters")
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }
  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

    
  @JsonProperty("offers")
  public List<CalculateTariffsOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<CalculateTariffsOfferDTO> offers) {
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
    CalculateTariffsRequest calculateTariffsRequest = (CalculateTariffsRequest) o;
    return Objects.equals(parameters, calculateTariffsRequest.parameters) &&
        Objects.equals(offers, calculateTariffsRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsRequest {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

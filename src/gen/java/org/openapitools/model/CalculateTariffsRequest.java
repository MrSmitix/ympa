package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculateTariffsParametersDTO;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsRequest   {
  @JsonProperty("parameters")
  private CalculateTariffsParametersDTO parameters;

  @JsonProperty("offers")
  private List<CalculateTariffsOfferDTO> offers = new ArrayList<>();

  /**
   **/
  public CalculateTariffsRequest parameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("parameters")
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }
  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  /**
   * Товары, для которых нужно рассчитать стоимость услуг.
   **/
  public CalculateTariffsRequest offers(List<CalculateTariffsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Товары, для которых нужно рассчитать стоимость услуг.")
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


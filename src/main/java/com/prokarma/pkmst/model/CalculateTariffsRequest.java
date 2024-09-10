package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CalculateTariffsOfferDTO;
import com.prokarma.pkmst.model.CalculateTariffsParametersDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CalculateTariffsRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsRequest   {
  @JsonProperty("parameters")
  private CalculateTariffsParametersDTO parameters;

  @JsonProperty("offers")
  
  private List<CalculateTariffsOfferDTO> offers = new ArrayList<>();

  public CalculateTariffsRequest parameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @ApiModelProperty(required = true, value = "")
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }

  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  public CalculateTariffsRequest offers(List<CalculateTariffsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public CalculateTariffsRequest addOffersItem(CalculateTariffsOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Товары, для которых нужно рассчитать стоимость услуг.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Товары, для которых нужно рассчитать стоимость услуг.")
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
    return Objects.equals(this.parameters, calculateTariffsRequest.parameters) &&
        Objects.equals(this.offers, calculateTariffsRequest.offers);
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


package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculateTariffsParametersDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CalculateTariffsRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CalculateTariffsParametersDTO parameters;

  @ApiModelProperty(required = true, value = "Товары, для которых нужно рассчитать стоимость услуг.")
  @Valid
 /**
   * Товары, для которых нужно рассчитать стоимость услуг.
  **/
  private List<@Valid CalculateTariffsOfferDTO> offers = new ArrayList<>();
 /**
   * Get parameters
   * @return parameters
  **/
  @JsonProperty("parameters")
  @NotNull
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }

  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  public CalculateTariffsRequest parameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
    return this;
  }

 /**
   * Товары, для которых нужно рассчитать стоимость услуг.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=200)  public List<@Valid CalculateTariffsOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid CalculateTariffsOfferDTO> offers) {
    this.offers = offers;
  }

  public CalculateTariffsRequest offers(List<@Valid CalculateTariffsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public CalculateTariffsRequest addOffersItem(CalculateTariffsOfferDTO offersItem) {
    this.offers.add(offersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


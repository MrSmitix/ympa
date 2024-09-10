package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculateTariffsParametersDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsRequest   {
  
  private CalculateTariffsParametersDTO parameters;
  private List<@Valid CalculateTariffsOfferDTO> offers = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("parameters")
  @NotNull
  @Valid
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }
  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  /**
   * Товары, для которых нужно рассчитать стоимость услуг.
   **/
  
  @ApiModelProperty(required = true, value = "Товары, для которых нужно рассчитать стоимость услуг.")
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=200)  @Valid
  public List<@Valid CalculateTariffsOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid CalculateTariffsOfferDTO> offers) {
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


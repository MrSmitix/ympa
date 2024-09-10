package apimodels;

import apimodels.CalculateTariffsOfferDTO;
import apimodels.CalculateTariffsParametersDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CalculateTariffsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CalculateTariffsRequest   {
  @JsonProperty("parameters")
  @NotNull
@Valid

  private CalculateTariffsParametersDTO parameters;

  @JsonProperty("offers")
  @NotNull
@Size(min=1,max=200)
@Valid

  private List<@Valid CalculateTariffsOfferDTO> offers = new ArrayList<>();

  public CalculateTariffsRequest parameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  public CalculateTariffsParametersDTO getParameters() {
    return parameters;
  }

  public void setParameters(CalculateTariffsParametersDTO parameters) {
    this.parameters = parameters;
  }

  public CalculateTariffsRequest offers(List<@Valid CalculateTariffsOfferDTO> offers) {
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
  **/
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
    return Objects.equals(parameters, calculateTariffsRequest.parameters) &&
        Objects.equals(offers, calculateTariffsRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, offers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


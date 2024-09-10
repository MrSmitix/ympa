package apimodels;

import apimodels.CalculateTariffsOfferInfoDTO;
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
 * Расчет стоимости услуг.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CalculateTariffsResponseDTO   {
  @JsonProperty("offers")
  @NotNull
@Valid

  private List<@Valid CalculateTariffsOfferInfoDTO> offers = new ArrayList<>();

  public CalculateTariffsResponseDTO offers(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
    return this;
  }

  public CalculateTariffsResponseDTO addOffersItem(CalculateTariffsOfferInfoDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Стоимость услуг.
   * @return offers
  **/
  public List<@Valid CalculateTariffsOfferInfoDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


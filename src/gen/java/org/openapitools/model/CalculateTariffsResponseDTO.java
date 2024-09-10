package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Расчет стоимости услуг.
 **/
@ApiModel(description="Расчет стоимости услуг.")

public class CalculateTariffsResponseDTO  {
  
  @ApiModelProperty(required = true, value = "Стоимость услуг.")
  @Valid
 /**
   * Стоимость услуг.
  **/
  private List<@Valid CalculateTariffsOfferInfoDTO> offers = new ArrayList<>();
 /**
   * Стоимость услуг.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
  public List<@Valid CalculateTariffsOfferInfoDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
  }

  public CalculateTariffsResponseDTO offers(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
    return this;
  }

  public CalculateTariffsResponseDTO addOffersItem(CalculateTariffsOfferInfoDTO offersItem) {
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
    CalculateTariffsResponseDTO calculateTariffsResponseDTO = (CalculateTariffsResponseDTO) o;
    return Objects.equals(this.offers, calculateTariffsResponseDTO.offers);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


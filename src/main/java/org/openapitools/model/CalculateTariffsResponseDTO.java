package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalculateTariffsOfferInfoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Расчет стоимости услуг.
 */

@Schema(name = "CalculateTariffsResponseDTO", description = "Расчет стоимости услуг.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsResponseDTO {

  @Valid
  private List<@Valid CalculateTariffsOfferInfoDTO> offers = new ArrayList<>();

  public CalculateTariffsResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CalculateTariffsResponseDTO(List<@Valid CalculateTariffsOfferInfoDTO> offers) {
    this.offers = offers;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Стоимость услуг.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HiddenOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на возобновление показа оферов.
 */

@Schema(name = "DeleteHiddenOffersRequest", description = "Запрос на возобновление показа оферов.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteHiddenOffersRequest {

  @Valid
  private List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  public DeleteHiddenOffersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteHiddenOffersRequest(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  public DeleteHiddenOffersRequest hiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
    return this;
  }

  public DeleteHiddenOffersRequest addHiddenOffersItem(HiddenOfferDTO hiddenOffersItem) {
    if (this.hiddenOffers == null) {
      this.hiddenOffers = new ArrayList<>();
    }
    this.hiddenOffers.add(hiddenOffersItem);
    return this;
  }

  /**
   * Список скрытых товаров. 
   * @return hiddenOffers
   */
  @NotNull @Valid @Size(min = 1, max = 500) 
  @Schema(name = "hiddenOffers", description = "Список скрытых товаров. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hiddenOffers")
  public List<@Valid HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }

  public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHiddenOffersRequest deleteHiddenOffersRequest = (DeleteHiddenOffersRequest) o;
    return Objects.equals(this.hiddenOffers, deleteHiddenOffersRequest.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHiddenOffersRequest {\n");
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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


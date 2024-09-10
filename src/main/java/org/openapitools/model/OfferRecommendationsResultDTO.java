package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferRecommendationDTO;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров с рекомендациями.
 */

@Schema(name = "OfferRecommendationsResultDTO", description = "Список товаров с рекомендациями.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationsResultDTO {

  private ScrollingPagerDTO paging;

  @Valid
  private List<@Valid OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

  public OfferRecommendationsResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferRecommendationsResultDTO(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }

  public OfferRecommendationsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public OfferRecommendationsResultDTO offerRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
    return this;
  }

  public OfferRecommendationsResultDTO addOfferRecommendationsItem(OfferRecommendationDTO offerRecommendationsItem) {
    if (this.offerRecommendations == null) {
      this.offerRecommendations = new ArrayList<>();
    }
    this.offerRecommendations.add(offerRecommendationsItem);
    return this;
  }

  /**
   * Страница списка товаров.
   * @return offerRecommendations
   */
  @NotNull @Valid 
  @Schema(name = "offerRecommendations", description = "Страница списка товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerRecommendations")
  public List<@Valid OfferRecommendationDTO> getOfferRecommendations() {
    return offerRecommendations;
  }

  public void setOfferRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRecommendationsResultDTO offerRecommendationsResultDTO = (OfferRecommendationsResultDTO) o;
    return Objects.equals(this.paging, offerRecommendationsResultDTO.paging) &&
        Objects.equals(this.offerRecommendations, offerRecommendationsResultDTO.offerRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerRecommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationsResultDTO {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerRecommendations: ").append(toIndentedString(offerRecommendations)).append("\n");
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


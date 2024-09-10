package apimodels;

import apimodels.OfferRecommendationDTO;
import apimodels.ScrollingPagerDTO;
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
 * Список товаров с рекомендациями.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferRecommendationsResultDTO   {
  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("offerRecommendations")
  @NotNull
@Valid

  private List<@Valid OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

  public OfferRecommendationsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
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
  **/
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
    return Objects.equals(paging, offerRecommendationsResultDTO.paging) &&
        Objects.equals(offerRecommendations, offerRecommendationsResultDTO.offerRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerRecommendations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


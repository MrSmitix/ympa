package apimodels;

import apimodels.FieldStateType;
import apimodels.PriceCompetitivenessType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetOfferRecommendationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferRecommendationsRequest   {
  @JsonProperty("offerIds")
  
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  @JsonProperty("cofinancePriceFilter")
  @Valid

  private FieldStateType cofinancePriceFilter;

  @JsonProperty("recommendedCofinancePriceFilter")
  @Valid

  private FieldStateType recommendedCofinancePriceFilter;

  @JsonProperty("competitivenessFilter")
  @Valid

  private PriceCompetitivenessType competitivenessFilter;

  public GetOfferRecommendationsRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferRecommendationsRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
   * @return offerIds
  **/
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferRecommendationsRequest cofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
    return this;
  }

   /**
   * Get cofinancePriceFilter
   * @return cofinancePriceFilter
  **/
  public FieldStateType getCofinancePriceFilter() {
    return cofinancePriceFilter;
  }

  public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
  }

  public GetOfferRecommendationsRequest recommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
    return this;
  }

   /**
   * Get recommendedCofinancePriceFilter
   * @return recommendedCofinancePriceFilter
  **/
  public FieldStateType getRecommendedCofinancePriceFilter() {
    return recommendedCofinancePriceFilter;
  }

  public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
  }

  public GetOfferRecommendationsRequest competitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
    this.competitivenessFilter = competitivenessFilter;
    return this;
  }

   /**
   * Get competitivenessFilter
   * @return competitivenessFilter
  **/
  public PriceCompetitivenessType getCompetitivenessFilter() {
    return competitivenessFilter;
  }

  public void setCompetitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
    this.competitivenessFilter = competitivenessFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferRecommendationsRequest getOfferRecommendationsRequest = (GetOfferRecommendationsRequest) o;
    return Objects.equals(offerIds, getOfferRecommendationsRequest.offerIds) &&
        Objects.equals(cofinancePriceFilter, getOfferRecommendationsRequest.cofinancePriceFilter) &&
        Objects.equals(recommendedCofinancePriceFilter, getOfferRecommendationsRequest.recommendedCofinancePriceFilter) &&
        Objects.equals(competitivenessFilter, getOfferRecommendationsRequest.competitivenessFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, cofinancePriceFilter, recommendedCofinancePriceFilter, competitivenessFilter);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferRecommendationsRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    cofinancePriceFilter: ").append(toIndentedString(cofinancePriceFilter)).append("\n");
    sb.append("    recommendedCofinancePriceFilter: ").append(toIndentedString(recommendedCofinancePriceFilter)).append("\n");
    sb.append("    competitivenessFilter: ").append(toIndentedString(competitivenessFilter)).append("\n");
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


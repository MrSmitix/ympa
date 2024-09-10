package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FieldStateType;
import org.openapitools.model.PriceCompetitivenessType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetOfferRecommendationsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferRecommendationsRequest {

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds = JsonNullable.<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>>undefined();

  private FieldStateType cofinancePriceFilter;

  private FieldStateType recommendedCofinancePriceFilter;

  private PriceCompetitivenessType competitivenessFilter;

  public GetOfferRecommendationsRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = JsonNullable.of(offerIds);
    return this;
  }

  public GetOfferRecommendationsRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null || !this.offerIds.isPresent()) {
      this.offerIds = JsonNullable.of(new ArrayList<>());
    }
    this.offerIds.get().add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
   * @return offerIds
   */
  
  @Schema(name = "offerIds", description = "Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerIds")
  public JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferRecommendationsRequest cofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
    return this;
  }

  /**
   * Get cofinancePriceFilter
   * @return cofinancePriceFilter
   */
  @Valid 
  @Schema(name = "cofinancePriceFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cofinancePriceFilter")
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
   */
  @Valid 
  @Schema(name = "recommendedCofinancePriceFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendedCofinancePriceFilter")
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
   */
  @Valid 
  @Schema(name = "competitivenessFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("competitivenessFilter")
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
    return equalsNullable(this.offerIds, getOfferRecommendationsRequest.offerIds) &&
        Objects.equals(this.cofinancePriceFilter, getOfferRecommendationsRequest.cofinancePriceFilter) &&
        Objects.equals(this.recommendedCofinancePriceFilter, getOfferRecommendationsRequest.recommendedCofinancePriceFilter) &&
        Objects.equals(this.competitivenessFilter, getOfferRecommendationsRequest.competitivenessFilter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offerIds), cofinancePriceFilter, recommendedCofinancePriceFilter, competitivenessFilter);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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


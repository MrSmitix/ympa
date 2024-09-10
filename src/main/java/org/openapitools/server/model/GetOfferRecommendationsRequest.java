package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.FieldStateType;
import org.openapitools.server.model.PriceCompetitivenessType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetOfferRecommendationsRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
    private FieldStateType cofinancePriceFilter;
    private FieldStateType recommendedCofinancePriceFilter;
    private PriceCompetitivenessType competitivenessFilter;

    /**
     * Default constructor.
     */
    public GetOfferRecommendationsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOfferRecommendationsRequest.
     *
     * @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @param cofinancePriceFilter cofinancePriceFilter
     * @param recommendedCofinancePriceFilter recommendedCofinancePriceFilter
     * @param competitivenessFilter competitivenessFilter
     */
    public GetOfferRecommendationsRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds, 
        FieldStateType cofinancePriceFilter, 
        FieldStateType recommendedCofinancePriceFilter, 
        PriceCompetitivenessType competitivenessFilter
    ) {
        this.offerIds = offerIds;
        this.cofinancePriceFilter = cofinancePriceFilter;
        this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
        this.competitivenessFilter = competitivenessFilter;
    }



    /**
     * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @return offerIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
     * Get cofinancePriceFilter
     * @return cofinancePriceFilter
     */
    public FieldStateType getCofinancePriceFilter() {
        return cofinancePriceFilter;
    }

    public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
        this.cofinancePriceFilter = cofinancePriceFilter;
    }

    /**
     * Get recommendedCofinancePriceFilter
     * @return recommendedCofinancePriceFilter
     */
    public FieldStateType getRecommendedCofinancePriceFilter() {
        return recommendedCofinancePriceFilter;
    }

    public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
        this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
    }

    /**
     * Get competitivenessFilter
     * @return competitivenessFilter
     */
    public PriceCompetitivenessType getCompetitivenessFilter() {
        return competitivenessFilter;
    }

    public void setCompetitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
        this.competitivenessFilter = competitivenessFilter;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


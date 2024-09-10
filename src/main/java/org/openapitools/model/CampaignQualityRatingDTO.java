/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация об индексе качества магазина.
 */
@Schema(name = "CampaignQualityRatingDTO", description = "Информация об индексе качества магазина.")
@JsonPropertyOrder({
  CampaignQualityRatingDTO.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignQualityRatingDTO.JSON_PROPERTY_RATINGS
})
@JsonTypeName("CampaignQualityRatingDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class CampaignQualityRatingDTO {
    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private Long campaignId;

    public static final String JSON_PROPERTY_RATINGS = "ratings";
    private List<@Valid QualityRatingDTO> ratings = new ArrayList<>();

    public CampaignQualityRatingDTO(Long campaignId, List<@Valid QualityRatingDTO> ratings) {
        this.campaignId = campaignId;
        this.ratings = ratings;
    }

    public CampaignQualityRatingDTO campaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Идентификатор магазина.
     * @return campaignId
     */
    @NotNull
    @Schema(name = "campaignId", description = "Идентификатор магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getCampaignId() {
        return campaignId;
    }

    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public CampaignQualityRatingDTO ratings(List<@Valid QualityRatingDTO> ratings) {
        this.ratings = ratings;
        return this;
    }

    public CampaignQualityRatingDTO addRatingsItem(QualityRatingDTO ratingsItem) {
        this.ratings.add(ratingsItem);
        return this;
    }

    /**
     * Список значений индекса качества.
     * @return ratings
     */
    @NotNull
    @Schema(name = "ratings", description = "Список значений индекса качества.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_RATINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid QualityRatingDTO> getRatings() {
        return ratings;
    }

    @JsonProperty(JSON_PROPERTY_RATINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRatings(List<@Valid QualityRatingDTO> ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignQualityRatingDTO campaignQualityRatingDTO = (CampaignQualityRatingDTO) o;
        return Objects.equals(this.campaignId, campaignQualityRatingDTO.campaignId) &&
            Objects.equals(this.ratings, campaignQualityRatingDTO.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, ratings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignQualityRatingDTO {\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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


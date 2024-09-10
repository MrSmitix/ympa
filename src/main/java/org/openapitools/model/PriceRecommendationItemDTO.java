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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Рекомендованная цена.
 */
@JsonPropertyOrder({
  PriceRecommendationItemDTO.JSON_PROPERTY_CAMPAIGN_ID,
  PriceRecommendationItemDTO.JSON_PROPERTY_PRICE
})
@JsonTypeName("PriceRecommendationItemDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class PriceRecommendationItemDTO {
    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private Long campaignId;

    public static final String JSON_PROPERTY_PRICE = "price";
    private BigDecimal price;

    public PriceRecommendationItemDTO(Long campaignId, BigDecimal price) {
        this.campaignId = campaignId;
        this.price = price;
    }

    public PriceRecommendationItemDTO campaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Идентификатор кампании.
     * @return campaignId
     */
    @NotNull
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

    public PriceRecommendationItemDTO price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
     * minimum: 1
     * @return price
     */
    @NotNull
    @DecimalMin("1")
    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PriceRecommendationItemDTO priceRecommendationItemDTO = (PriceRecommendationItemDTO) o;
        return Objects.equals(this.campaignId, priceRecommendationItemDTO.campaignId) &&
            Objects.equals(this.price, priceRecommendationItemDTO.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceRecommendationItemDTO {\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


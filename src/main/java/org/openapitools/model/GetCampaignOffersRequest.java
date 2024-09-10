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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
@JsonPropertyOrder({
  GetCampaignOffersRequest.JSON_PROPERTY_OFFER_IDS,
  GetCampaignOffersRequest.JSON_PROPERTY_STATUSES,
  GetCampaignOffersRequest.JSON_PROPERTY_CATEGORY_IDS,
  GetCampaignOffersRequest.JSON_PROPERTY_VENDOR_NAMES,
  GetCampaignOffersRequest.JSON_PROPERTY_TAGS
})
@JsonTypeName("GetCampaignOffersRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetCampaignOffersRequest {
    public static final String JSON_PROPERTY_OFFER_IDS = "offerIds";
    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

    public static final String JSON_PROPERTY_STATUSES = "statuses";
    private List<OfferCampaignStatusType> statuses = null;

    public static final String JSON_PROPERTY_CATEGORY_IDS = "categoryIds";
    private List<Integer> categoryIds = null;

    public static final String JSON_PROPERTY_VENDOR_NAMES = "vendorNames";
    private List<String> vendorNames = null;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public GetCampaignOffersRequest() {
    }

    public GetCampaignOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
        return this;
    }

    public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
        if (this.offerIds == null) {
            this.offerIds = new ArrayList<>();
        }
        this.offerIds.add(offerIdsItem);
        return this;
    }

    /**
     * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
     * @return offerIds
     */
    @Nullable
    @Size(max=200)
    @JsonProperty(JSON_PROPERTY_OFFER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
        this.statuses = statuses;
        return this;
    }

    public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
        if (this.statuses == null) {
            this.statuses = new ArrayList<>();
        }
        this.statuses.add(statusesItem);
        return this;
    }

    /**
     * Фильтр по статусам товаров. 
     * @return statuses
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<OfferCampaignStatusType> getStatuses() {
        return statuses;
    }

    @JsonProperty(JSON_PROPERTY_STATUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatuses(List<OfferCampaignStatusType> statuses) {
        this.statuses = statuses;
    }

    public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }

    public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
        if (this.categoryIds == null) {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIdsItem);
        return this;
    }

    /**
     * Фильтр по категориям на Маркете.
     * @return categoryIds
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
        this.vendorNames = vendorNames;
        return this;
    }

    public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
        if (this.vendorNames == null) {
            this.vendorNames = new ArrayList<>();
        }
        this.vendorNames.add(vendorNamesItem);
        return this;
    }

    /**
     * Фильтр по брендам.
     * @return vendorNames
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_VENDOR_NAMES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getVendorNames() {
        return vendorNames;
    }

    @JsonProperty(JSON_PROPERTY_VENDOR_NAMES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVendorNames(List<String> vendorNames) {
        this.vendorNames = vendorNames;
    }

    public GetCampaignOffersRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public GetCampaignOffersRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Фильтр по тегам.
     * @return tags
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCampaignOffersRequest getCampaignOffersRequest = (GetCampaignOffersRequest) o;
        return Objects.equals(this.offerIds, getCampaignOffersRequest.offerIds) &&
            Objects.equals(this.statuses, getCampaignOffersRequest.statuses) &&
            Objects.equals(this.categoryIds, getCampaignOffersRequest.categoryIds) &&
            Objects.equals(this.vendorNames, getCampaignOffersRequest.vendorNames) &&
            Objects.equals(this.tags, getCampaignOffersRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerIds, statuses, categoryIds, vendorNames, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignOffersRequest {\n");
        sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
        sb.append("    vendorNames: ").append(toIndentedString(vendorNames)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


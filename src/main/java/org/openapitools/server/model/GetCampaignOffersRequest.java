package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferCampaignStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
public class GetCampaignOffersRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
    private List<OfferCampaignStatusType> statuses;
    private List<Integer> categoryIds;
    private List<String> vendorNames;
    private List<String> tags;

    /**
     * Default constructor.
     */
    public GetCampaignOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignOffersRequest.
     *
     * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
     * @param statuses Фильтр по статусам товаров. 
     * @param categoryIds Фильтр по категориям на Маркете.
     * @param vendorNames Фильтр по брендам.
     * @param tags Фильтр по тегам.
     */
    public GetCampaignOffersRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds, 
        List<OfferCampaignStatusType> statuses, 
        List<Integer> categoryIds, 
        List<String> vendorNames, 
        List<String> tags
    ) {
        this.offerIds = offerIds;
        this.statuses = statuses;
        this.categoryIds = categoryIds;
        this.vendorNames = vendorNames;
        this.tags = tags;
    }



    /**
     * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
     * @return offerIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
     * Фильтр по статусам товаров. 
     * @return statuses
     */
    public List<OfferCampaignStatusType> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<OfferCampaignStatusType> statuses) {
        this.statuses = statuses;
    }

    /**
     * Фильтр по категориям на Маркете.
     * @return categoryIds
     */
    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
     * Фильтр по брендам.
     * @return vendorNames
     */
    public List<String> getVendorNames() {
        return vendorNames;
    }

    public void setVendorNames(List<String> vendorNames) {
        this.vendorNames = vendorNames;
    }

    /**
     * Фильтр по тегам.
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


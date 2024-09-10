package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BusinessDTO;
import org.openapitools.server.model.PlacementType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о магазине.
 */
public class CampaignDTO   {

    private String domain;
    private Long id;
    private Long clientId;
    private BusinessDTO business;
    private PlacementType placementType;

    /**
     * Default constructor.
     */
    public CampaignDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignDTO.
     *
     * @param domain URL магазина.
     * @param id Идентификатор кампании.
     * @param clientId Идентификатор плательщика в Яндекс Балансе.
     * @param business business
     * @param placementType placementType
     */
    public CampaignDTO(
        String domain, 
        Long id, 
        Long clientId, 
        BusinessDTO business, 
        PlacementType placementType
    ) {
        this.domain = domain;
        this.id = id;
        this.clientId = clientId;
        this.business = business;
        this.placementType = placementType;
    }



    /**
     * URL магазина.
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Идентификатор кампании.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Идентификатор плательщика в Яндекс Балансе.
     * @return clientId
     */
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * Get business
     * @return business
     */
    public BusinessDTO getBusiness() {
        return business;
    }

    public void setBusiness(BusinessDTO business) {
        this.business = business;
    }

    /**
     * Get placementType
     * @return placementType
     */
    public PlacementType getPlacementType() {
        return placementType;
    }

    public void setPlacementType(PlacementType placementType) {
        this.placementType = placementType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignDTO {\n");
        
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
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


package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignSettingsDeliveryDTO;
import org.openapitools.server.model.CampaignSettingsScheduleSourceType;
import org.openapitools.server.model.RegionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о своем регионе магазина.
 */
public class CampaignSettingsLocalRegionDTO   {

    private Long id;
    private String name;
    private RegionType type;
    private CampaignSettingsScheduleSourceType deliveryOptionsSource;
    private CampaignSettingsDeliveryDTO delivery;

    /**
     * Default constructor.
     */
    public CampaignSettingsLocalRegionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignSettingsLocalRegionDTO.
     *
     * @param id Идентификатор региона.
     * @param name Название региона.
     * @param type type
     * @param deliveryOptionsSource deliveryOptionsSource
     * @param delivery delivery
     */
    public CampaignSettingsLocalRegionDTO(
        Long id, 
        String name, 
        RegionType type, 
        CampaignSettingsScheduleSourceType deliveryOptionsSource, 
        CampaignSettingsDeliveryDTO delivery
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.deliveryOptionsSource = deliveryOptionsSource;
        this.delivery = delivery;
    }



    /**
     * Идентификатор региона.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название региона.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get type
     * @return type
     */
    public RegionType getType() {
        return type;
    }

    public void setType(RegionType type) {
        this.type = type;
    }

    /**
     * Get deliveryOptionsSource
     * @return deliveryOptionsSource
     */
    public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
        return deliveryOptionsSource;
    }

    public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
        this.deliveryOptionsSource = deliveryOptionsSource;
    }

    /**
     * Get delivery
     * @return delivery
     */
    public CampaignSettingsDeliveryDTO getDelivery() {
        return delivery;
    }

    public void setDelivery(CampaignSettingsDeliveryDTO delivery) {
        this.delivery = delivery;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSettingsLocalRegionDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deliveryOptionsSource: ").append(toIndentedString(deliveryOptionsSource)).append("\n");
        sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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


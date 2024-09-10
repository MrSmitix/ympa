package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignSettingsDeliveryDTO;
import org.openapitools.vertxweb.server.model.CampaignSettingsScheduleSourceType;
import org.openapitools.vertxweb.server.model.RegionType;

/**
 * Информация о своем регионе магазина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignSettingsLocalRegionDTO   {
  
  private Long id;
  private String name;
  private RegionType type;
  private CampaignSettingsScheduleSourceType deliveryOptionsSource;
  private CampaignSettingsDeliveryDTO delivery;

  public CampaignSettingsLocalRegionDTO () {

  }

  public CampaignSettingsLocalRegionDTO (Long id, String name, RegionType type, CampaignSettingsScheduleSourceType deliveryOptionsSource, CampaignSettingsDeliveryDTO delivery) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.deliveryOptionsSource = deliveryOptionsSource;
    this.delivery = delivery;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }

    
  @JsonProperty("deliveryOptionsSource")
  public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
    return deliveryOptionsSource;
  }
  public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
  }

    
  @JsonProperty("delivery")
  public CampaignSettingsDeliveryDTO getDelivery() {
    return delivery;
  }
  public void setDelivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO = (CampaignSettingsLocalRegionDTO) o;
    return Objects.equals(id, campaignSettingsLocalRegionDTO.id) &&
        Objects.equals(name, campaignSettingsLocalRegionDTO.name) &&
        Objects.equals(type, campaignSettingsLocalRegionDTO.type) &&
        Objects.equals(deliveryOptionsSource, campaignSettingsLocalRegionDTO.deliveryOptionsSource) &&
        Objects.equals(delivery, campaignSettingsLocalRegionDTO.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, deliveryOptionsSource, delivery);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

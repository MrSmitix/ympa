package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSettingsDeliveryDTO;
import org.openapitools.model.CampaignSettingsScheduleSourceType;
import org.openapitools.model.RegionType;



/**
 * Информация о своем регионе магазина.
 **/

@ApiModel(description = "Информация о своем регионе магазина.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsLocalRegionDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private RegionType type;

  @JsonProperty("deliveryOptionsSource")
  private CampaignSettingsScheduleSourceType deliveryOptionsSource;

  @JsonProperty("delivery")
  private CampaignSettingsDeliveryDTO delivery;

  /**
   * Идентификатор региона.
   **/
  public CampaignSettingsLocalRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор региона.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название региона.
   **/
  public CampaignSettingsLocalRegionDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название региона.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CampaignSettingsLocalRegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }
  public void setType(RegionType type) {
    this.type = type;
  }

  /**
   **/
  public CampaignSettingsLocalRegionDTO deliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryOptionsSource")
  public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
    return deliveryOptionsSource;
  }
  public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
  }

  /**
   **/
  public CampaignSettingsLocalRegionDTO delivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
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


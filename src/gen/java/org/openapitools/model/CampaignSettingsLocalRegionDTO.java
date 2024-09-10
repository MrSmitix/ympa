package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CampaignSettingsDeliveryDTO;
import org.openapitools.model.CampaignSettingsScheduleSourceType;
import org.openapitools.model.RegionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о своем регионе магазина.
 **/
@ApiModel(description="Информация о своем регионе магазина.")

public class CampaignSettingsLocalRegionDTO  {
  
  @ApiModelProperty(value = "Идентификатор региона.")
 /**
   * Идентификатор региона.
  **/
  private Long id;

  @ApiModelProperty(value = "Название региона.")
 /**
   * Название региона.
  **/
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private RegionType type;

  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsScheduleSourceType deliveryOptionsSource;

  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsDeliveryDTO delivery;
 /**
   * Идентификатор региона.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CampaignSettingsLocalRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название региона.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignSettingsLocalRegionDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public RegionType getType() {
    return type;
  }

  public void setType(RegionType type) {
    this.type = type;
  }

  public CampaignSettingsLocalRegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

 /**
   * Get deliveryOptionsSource
   * @return deliveryOptionsSource
  **/
  @JsonProperty("deliveryOptionsSource")
  public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
    return deliveryOptionsSource;
  }

  public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
  }

  public CampaignSettingsLocalRegionDTO deliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
    return this;
  }

 /**
   * Get delivery
   * @return delivery
  **/
  @JsonProperty("delivery")
  public CampaignSettingsDeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public CampaignSettingsLocalRegionDTO delivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
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
    return Objects.equals(this.id, campaignSettingsLocalRegionDTO.id) &&
        Objects.equals(this.name, campaignSettingsLocalRegionDTO.name) &&
        Objects.equals(this.type, campaignSettingsLocalRegionDTO.type) &&
        Objects.equals(this.deliveryOptionsSource, campaignSettingsLocalRegionDTO.deliveryOptionsSource) &&
        Objects.equals(this.delivery, campaignSettingsLocalRegionDTO.delivery);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


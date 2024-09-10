package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CampaignSettingsDeliveryDTO;
import com.prokarma.pkmst.model.CampaignSettingsScheduleSourceType;
import com.prokarma.pkmst.model.RegionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о своем регионе магазина.
 */
@ApiModel(description = "Информация о своем регионе магазина.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  public CampaignSettingsLocalRegionDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор региона.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CampaignSettingsLocalRegionDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона.
   * @return name
   */
  @ApiModelProperty(value = "Название региона.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignSettingsLocalRegionDTO type(RegionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(value = "")
  public RegionType getType() {
    return type;
  }

  public void setType(RegionType type) {
    this.type = type;
  }

  public CampaignSettingsLocalRegionDTO deliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
    return this;
  }

  /**
   * Get deliveryOptionsSource
   * @return deliveryOptionsSource
   */
  @ApiModelProperty(value = "")
  public CampaignSettingsScheduleSourceType getDeliveryOptionsSource() {
    return deliveryOptionsSource;
  }

  public void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType deliveryOptionsSource) {
    this.deliveryOptionsSource = deliveryOptionsSource;
  }

  public CampaignSettingsLocalRegionDTO delivery(CampaignSettingsDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


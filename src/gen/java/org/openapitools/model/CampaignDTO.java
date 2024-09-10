package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.PlacementType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о магазине.
 */
@ApiModel(description="Информация о магазине.")

public class CampaignDTO  {
  
 /**
  * URL магазина.
  */
  @ApiModelProperty(value = "URL магазина.")
  private String domain;

 /**
  * Идентификатор кампании.
  */
  @ApiModelProperty(value = "Идентификатор кампании.")
  private Long id;

 /**
  * Идентификатор плательщика в Яндекс Балансе.
  */
  @ApiModelProperty(value = "Идентификатор плательщика в Яндекс Балансе.")
  private Long clientId;

  @ApiModelProperty(value = "")
  @Valid
  private BusinessDTO business;

  @ApiModelProperty(value = "")
  @Valid
  private PlacementType placementType;
 /**
  * URL магазина.
  * @return domain
  */
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Sets the <code>domain</code> property.
   */
 public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Sets the <code>domain</code> property.
   */
  public CampaignDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

 /**
  * Идентификатор кампании.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CampaignDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Идентификатор плательщика в Яндекс Балансе.
  * @return clientId
  */
  @JsonProperty("clientId")
  public Long getClientId() {
    return clientId;
  }

  /**
   * Sets the <code>clientId</code> property.
   */
 public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  /**
   * Sets the <code>clientId</code> property.
   */
  public CampaignDTO clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
  * Get business
  * @return business
  */
  @JsonProperty("business")
  public BusinessDTO getBusiness() {
    return business;
  }

  /**
   * Sets the <code>business</code> property.
   */
 public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

  /**
   * Sets the <code>business</code> property.
   */
  public CampaignDTO business(BusinessDTO business) {
    this.business = business;
    return this;
  }

 /**
  * Get placementType
  * @return placementType
  */
  @JsonProperty("placementType")
  public PlacementType getPlacementType() {
    return placementType;
  }

  /**
   * Sets the <code>placementType</code> property.
   */
 public void setPlacementType(PlacementType placementType) {
    this.placementType = placementType;
  }

  /**
   * Sets the <code>placementType</code> property.
   */
  public CampaignDTO placementType(PlacementType placementType) {
    this.placementType = placementType;
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
    CampaignDTO campaignDTO = (CampaignDTO) o;
    return Objects.equals(this.domain, campaignDTO.domain) &&
        Objects.equals(this.id, campaignDTO.id) &&
        Objects.equals(this.clientId, campaignDTO.clientId) &&
        Objects.equals(this.business, campaignDTO.business) &&
        Objects.equals(this.placementType, campaignDTO.placementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, id, clientId, business, placementType);
  }

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


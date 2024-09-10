package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.PlacementType;



/**
 * Информация о магазине.
 **/

@ApiModel(description = "Информация о магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignDTO   {
  @JsonProperty("domain")
  private String domain;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("clientId")
  private Long clientId;

  @JsonProperty("business")
  private BusinessDTO business;

  @JsonProperty("placementType")
  private PlacementType placementType;

  /**
   * URL магазина.
   **/
  public CampaignDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

  
  @ApiModelProperty(value = "URL магазина.")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Идентификатор кампании.
   **/
  public CampaignDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор кампании.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Идентификатор плательщика в Яндекс Балансе.
   **/
  public CampaignDTO clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор плательщика в Яндекс Балансе.")
  @JsonProperty("clientId")
  public Long getClientId() {
    return clientId;
  }
  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  public CampaignDTO business(BusinessDTO business) {
    this.business = business;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("business")
  public BusinessDTO getBusiness() {
    return business;
  }
  public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

  /**
   **/
  public CampaignDTO placementType(PlacementType placementType) {
    this.placementType = placementType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placementType")
  public PlacementType getPlacementType() {
    return placementType;
  }
  public void setPlacementType(PlacementType placementType) {
    this.placementType = placementType;
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
    return Objects.equals(domain, campaignDTO.domain) &&
        Objects.equals(id, campaignDTO.id) &&
        Objects.equals(clientId, campaignDTO.clientId) &&
        Objects.equals(business, campaignDTO.business) &&
        Objects.equals(placementType, campaignDTO.placementType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


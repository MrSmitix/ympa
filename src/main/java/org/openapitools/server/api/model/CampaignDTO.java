package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.BusinessDTO;
import org.openapitools.server.api.model.PlacementType;

/**
 * Информация о магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignDTO   {
  
  private String domain;
  private Long id;
  private Long clientId;
  private BusinessDTO business;
  private PlacementType placementType;

  public CampaignDTO () {

  }

  public CampaignDTO (String domain, Long id, Long clientId, BusinessDTO business, PlacementType placementType) {
    this.domain = domain;
    this.id = id;
    this.clientId = clientId;
    this.business = business;
    this.placementType = placementType;
  }

    
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("clientId")
  public Long getClientId() {
    return clientId;
  }
  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

    
  @JsonProperty("business")
  public BusinessDTO getBusiness() {
    return business;
  }
  public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

    
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

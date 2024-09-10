package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.PlacementType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о магазине.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignDTO   {
  
  private String domain;
  private Long id;
  private Long clientId;
  private BusinessDTO business;
  private PlacementType placementType;

  /**
   * URL магазина.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("business")
  @Valid
  public BusinessDTO getBusiness() {
    return business;
  }
  public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placementType")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


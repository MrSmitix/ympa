package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BusinessDTO;
import org.openapitools.model.PlacementType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о магазине.
 */

@Schema(name = "CampaignDTO", description = "Информация о магазине.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignDTO {

  private String domain;

  private Long id;

  private Long clientId;

  private BusinessDTO business;

  private PlacementType placementType;

  public CampaignDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * URL магазина.
   * @return domain
   */
  
  @Schema(name = "domain", description = "URL магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public CampaignDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор кампании.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CampaignDTO clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Идентификатор плательщика в Яндекс Балансе.
   * @return clientId
   */
  
  @Schema(name = "clientId", description = "Идентификатор плательщика в Яндекс Балансе.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public CampaignDTO business(BusinessDTO business) {
    this.business = business;
    return this;
  }

  /**
   * Get business
   * @return business
   */
  @Valid 
  @Schema(name = "business", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business")
  public BusinessDTO getBusiness() {
    return business;
  }

  public void setBusiness(BusinessDTO business) {
    this.business = business;
  }

  public CampaignDTO placementType(PlacementType placementType) {
    this.placementType = placementType;
    return this;
  }

  /**
   * Get placementType
   * @return placementType
   */
  @Valid 
  @Schema(name = "placementType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


package apimodels;

import apimodels.BusinessDTO;
import apimodels.PlacementType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о магазине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignDTO   {
  @JsonProperty("domain")
  
  private String domain;

  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("clientId")
  
  private Long clientId;

  @JsonProperty("business")
  @Valid

  private BusinessDTO business;

  @JsonProperty("placementType")
  @Valid

  private PlacementType placementType;

  public CampaignDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * URL магазина.
   * @return domain
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


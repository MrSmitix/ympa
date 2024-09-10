package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignSettingsLocalRegionDTO;

/**
 * Настройки магазина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignSettingsDTO   {
  
  private Long countryRegion;
  private String shopName;
  private Boolean showInContext;
  private Boolean showInPremium;
  private Boolean useOpenStat;
  private CampaignSettingsLocalRegionDTO localRegion;

  public CampaignSettingsDTO () {

  }

  public CampaignSettingsDTO (Long countryRegion, String shopName, Boolean showInContext, Boolean showInPremium, Boolean useOpenStat, CampaignSettingsLocalRegionDTO localRegion) {
    this.countryRegion = countryRegion;
    this.shopName = shopName;
    this.showInContext = showInContext;
    this.showInPremium = showInPremium;
    this.useOpenStat = useOpenStat;
    this.localRegion = localRegion;
  }

    
  @JsonProperty("countryRegion")
  public Long getCountryRegion() {
    return countryRegion;
  }
  public void setCountryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
  }

    
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

    
  @JsonProperty("showInContext")
  public Boolean getShowInContext() {
    return showInContext;
  }
  public void setShowInContext(Boolean showInContext) {
    this.showInContext = showInContext;
  }

    
  @JsonProperty("showInPremium")
  public Boolean getShowInPremium() {
    return showInPremium;
  }
  public void setShowInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
  }

    
  @JsonProperty("useOpenStat")
  public Boolean getUseOpenStat() {
    return useOpenStat;
  }
  public void setUseOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
  }

    
  @JsonProperty("localRegion")
  public CampaignSettingsLocalRegionDTO getLocalRegion() {
    return localRegion;
  }
  public void setLocalRegion(CampaignSettingsLocalRegionDTO localRegion) {
    this.localRegion = localRegion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettingsDTO campaignSettingsDTO = (CampaignSettingsDTO) o;
    return Objects.equals(countryRegion, campaignSettingsDTO.countryRegion) &&
        Objects.equals(shopName, campaignSettingsDTO.shopName) &&
        Objects.equals(showInContext, campaignSettingsDTO.showInContext) &&
        Objects.equals(showInPremium, campaignSettingsDTO.showInPremium) &&
        Objects.equals(useOpenStat, campaignSettingsDTO.useOpenStat) &&
        Objects.equals(localRegion, campaignSettingsDTO.localRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryRegion, shopName, showInContext, showInPremium, useOpenStat, localRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsDTO {\n");
    
    sb.append("    countryRegion: ").append(toIndentedString(countryRegion)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    showInContext: ").append(toIndentedString(showInContext)).append("\n");
    sb.append("    showInPremium: ").append(toIndentedString(showInPremium)).append("\n");
    sb.append("    useOpenStat: ").append(toIndentedString(useOpenStat)).append("\n");
    sb.append("    localRegion: ").append(toIndentedString(localRegion)).append("\n");
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

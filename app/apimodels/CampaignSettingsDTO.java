package apimodels;

import apimodels.CampaignSettingsLocalRegionDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Настройки магазина.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignSettingsDTO   {
  @JsonProperty("countryRegion")
  
  private Long countryRegion;

  @JsonProperty("shopName")
  
  private String shopName;

  @JsonProperty("showInContext")
  
  private Boolean showInContext;

  @JsonProperty("showInPremium")
  
  private Boolean showInPremium;

  @JsonProperty("useOpenStat")
  
  private Boolean useOpenStat;

  @JsonProperty("localRegion")
  @Valid

  private CampaignSettingsLocalRegionDTO localRegion;

  public CampaignSettingsDTO countryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
    return this;
  }

   /**
   * Идентификатор региона, в котором находится магазин.
   * @return countryRegion
  **/
  public Long getCountryRegion() {
    return countryRegion;
  }

  public void setCountryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
  }

  public CampaignSettingsDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

   /**
   * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
   * @return shopName
  **/
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public CampaignSettingsDTO showInContext(Boolean showInContext) {
    this.showInContext = showInContext;
    return this;
  }

   /**
   * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
   * @return showInContext
  **/
  public Boolean getShowInContext() {
    return showInContext;
  }

  public void setShowInContext(Boolean showInContext) {
    this.showInContext = showInContext;
  }

  public CampaignSettingsDTO showInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
    return this;
  }

   /**
   * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
   * @return showInPremium
  **/
  public Boolean getShowInPremium() {
    return showInPremium;
  }

  public void setShowInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
  }

  public CampaignSettingsDTO useOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
    return this;
  }

   /**
   * Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
   * @return useOpenStat
  **/
  public Boolean getUseOpenStat() {
    return useOpenStat;
  }

  public void setUseOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
  }

  public CampaignSettingsDTO localRegion(CampaignSettingsLocalRegionDTO localRegion) {
    this.localRegion = localRegion;
    return this;
  }

   /**
   * Get localRegion
   * @return localRegion
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


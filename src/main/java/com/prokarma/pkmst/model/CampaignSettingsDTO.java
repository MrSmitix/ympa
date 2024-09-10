package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CampaignSettingsLocalRegionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Настройки магазина.
 */
@ApiModel(description = "Настройки магазина.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
  private CampaignSettingsLocalRegionDTO localRegion;

  public CampaignSettingsDTO countryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
    return this;
  }

  /**
   * Идентификатор региона, в котором находится магазин.
   * @return countryRegion
   */
  @ApiModelProperty(value = "Идентификатор региона, в котором находится магазин.")
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
   */
  @ApiModelProperty(value = "Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. ")
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
   */
  @ApiModelProperty(value = "Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ")
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
   */
  @ApiModelProperty(value = "Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. ")
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
   */
  @ApiModelProperty(value = "Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. ")
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
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.countryRegion, campaignSettingsDTO.countryRegion) &&
        Objects.equals(this.shopName, campaignSettingsDTO.shopName) &&
        Objects.equals(this.showInContext, campaignSettingsDTO.showInContext) &&
        Objects.equals(this.showInPremium, campaignSettingsDTO.showInPremium) &&
        Objects.equals(this.useOpenStat, campaignSettingsDTO.useOpenStat) &&
        Objects.equals(this.localRegion, campaignSettingsDTO.localRegion);
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


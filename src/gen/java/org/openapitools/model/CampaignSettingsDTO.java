package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CampaignSettingsLocalRegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Настройки магазина.
 */
@ApiModel(description="Настройки магазина.")

public class CampaignSettingsDTO  {
  
 /**
  * Идентификатор региона, в котором находится магазин.
  */
  @ApiModelProperty(value = "Идентификатор региона, в котором находится магазин.")
  private Long countryRegion;

 /**
  * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
  */
  @ApiModelProperty(value = "Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. ")
  private String shopName;

 /**
  * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
  */
  @ApiModelProperty(value = "Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ")
  private Boolean showInContext;

 /**
  * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
  */
  @ApiModelProperty(value = "Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. ")
  private Boolean showInPremium;

 /**
  * Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
  */
  @ApiModelProperty(value = "Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. ")
  private Boolean useOpenStat;

  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsLocalRegionDTO localRegion;
 /**
  * Идентификатор региона, в котором находится магазин.
  * @return countryRegion
  */
  @JsonProperty("countryRegion")
  public Long getCountryRegion() {
    return countryRegion;
  }

  /**
   * Sets the <code>countryRegion</code> property.
   */
 public void setCountryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
  }

  /**
   * Sets the <code>countryRegion</code> property.
   */
  public CampaignSettingsDTO countryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
    return this;
  }

 /**
  * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. 
  * @return shopName
  */
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }

  /**
   * Sets the <code>shopName</code> property.
   */
 public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Sets the <code>shopName</code> property.
   */
  public CampaignSettingsDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

 /**
  * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
  * @return showInContext
  */
  @JsonProperty("showInContext")
  public Boolean getShowInContext() {
    return showInContext;
  }

  /**
   * Sets the <code>showInContext</code> property.
   */
 public void setShowInContext(Boolean showInContext) {
    this.showInContext = showInContext;
  }

  /**
   * Sets the <code>showInContext</code> property.
   */
  public CampaignSettingsDTO showInContext(Boolean showInContext) {
    this.showInContext = showInContext;
    return this;
  }

 /**
  * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. 
  * @return showInPremium
  */
  @JsonProperty("showInPremium")
  public Boolean getShowInPremium() {
    return showInPremium;
  }

  /**
   * Sets the <code>showInPremium</code> property.
   */
 public void setShowInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
  }

  /**
   * Sets the <code>showInPremium</code> property.
   */
  public CampaignSettingsDTO showInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
    return this;
  }

 /**
  * Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. 
  * @return useOpenStat
  */
  @JsonProperty("useOpenStat")
  public Boolean getUseOpenStat() {
    return useOpenStat;
  }

  /**
   * Sets the <code>useOpenStat</code> property.
   */
 public void setUseOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
  }

  /**
   * Sets the <code>useOpenStat</code> property.
   */
  public CampaignSettingsDTO useOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
    return this;
  }

 /**
  * Get localRegion
  * @return localRegion
  */
  @JsonProperty("localRegion")
  public CampaignSettingsLocalRegionDTO getLocalRegion() {
    return localRegion;
  }

  /**
   * Sets the <code>localRegion</code> property.
   */
 public void setLocalRegion(CampaignSettingsLocalRegionDTO localRegion) {
    this.localRegion = localRegion;
  }

  /**
   * Sets the <code>localRegion</code> property.
   */
  public CampaignSettingsDTO localRegion(CampaignSettingsLocalRegionDTO localRegion) {
    this.localRegion = localRegion;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


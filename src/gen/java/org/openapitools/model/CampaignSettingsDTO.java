package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSettingsLocalRegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Настройки магазина.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsDTO   {
  
  private Long countryRegion;
  private String shopName;
  private Boolean showInContext;
  private Boolean showInPremium;
  private Boolean useOpenStat;
  private CampaignSettingsLocalRegionDTO localRegion;

  /**
   * Идентификатор региона, в котором находится магазин.
   **/
  
  @ApiModelProperty(value = "Идентификатор региона, в котором находится магазин.")
  @JsonProperty("countryRegion")
  public Long getCountryRegion() {
    return countryRegion;
  }
  public void setCountryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
  }

  /**
   * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. 
   **/
  
  @ApiModelProperty(value = "Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. ")
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
   **/
  
  @ApiModelProperty(value = "Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ")
  @JsonProperty("showInContext")
  public Boolean getShowInContext() {
    return showInContext;
  }
  public void setShowInContext(Boolean showInContext) {
    this.showInContext = showInContext;
  }

  /**
   * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. 
   **/
  
  @ApiModelProperty(value = "Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. ")
  @JsonProperty("showInPremium")
  public Boolean getShowInPremium() {
    return showInPremium;
  }
  public void setShowInPremium(Boolean showInPremium) {
    this.showInPremium = showInPremium;
  }

  /**
   * Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. 
   **/
  
  @ApiModelProperty(value = "Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. ")
  @JsonProperty("useOpenStat")
  public Boolean getUseOpenStat() {
    return useOpenStat;
  }
  public void setUseOpenStat(Boolean useOpenStat) {
    this.useOpenStat = useOpenStat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("localRegion")
  @Valid
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


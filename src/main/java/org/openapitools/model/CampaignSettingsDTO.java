package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CampaignSettingsLocalRegionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Настройки магазина.
 */

@Schema(name = "CampaignSettingsDTO", description = "Настройки магазина.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsDTO {

  private Long countryRegion;

  private String shopName;

  private Boolean showInContext;

  private Boolean showInPremium;

  private Boolean useOpenStat;

  private CampaignSettingsLocalRegionDTO localRegion;

  public CampaignSettingsDTO countryRegion(Long countryRegion) {
    this.countryRegion = countryRegion;
    return this;
  }

  /**
   * Идентификатор региона, в котором находится магазин.
   * @return countryRegion
   */
  
  @Schema(name = "countryRegion", description = "Идентификатор региона, в котором находится магазин.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryRegion")
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
  
  @Schema(name = "shopName", description = "Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopName")
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
  
  @Schema(name = "showInContext", description = "Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showInContext")
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
  
  @Schema(name = "showInPremium", description = "Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showInPremium")
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
  
  @Schema(name = "useOpenStat", description = "Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useOpenStat")
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
  @Valid 
  @Schema(name = "localRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


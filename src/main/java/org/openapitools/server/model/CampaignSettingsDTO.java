package org.openapitools.server.model;

import org.openapitools.server.model.CampaignSettingsLocalRegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Настройки магазина.
 */
public class CampaignSettingsDTO   {

    private Long countryRegion;
    private String shopName;
    private Boolean showInContext;
    private Boolean showInPremium;
    private Boolean useOpenStat;
    private CampaignSettingsLocalRegionDTO localRegion;

    /**
     * Default constructor.
     */
    public CampaignSettingsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignSettingsDTO.
     *
     * @param countryRegion Идентификатор региона, в котором находится магазин.
     * @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. 
     * @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
     * @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. 
     * @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. 
     * @param localRegion localRegion
     */
    public CampaignSettingsDTO(
        Long countryRegion, 
        String shopName, 
        Boolean showInContext, 
        Boolean showInPremium, 
        Boolean useOpenStat, 
        CampaignSettingsLocalRegionDTO localRegion
    ) {
        this.countryRegion = countryRegion;
        this.shopName = shopName;
        this.showInContext = showInContext;
        this.showInPremium = showInPremium;
        this.useOpenStat = useOpenStat;
        this.localRegion = localRegion;
    }



    /**
     * Идентификатор региона, в котором находится магазин.
     * @return countryRegion
     */
    public Long getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(Long countryRegion) {
        this.countryRegion = countryRegion;
    }

    /**
     * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
     * @return showInContext
     */
    public Boolean getShowInContext() {
        return showInContext;
    }

    public void setShowInContext(Boolean showInContext) {
        this.showInContext = showInContext;
    }

    /**
     * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
     * @return showInPremium
     */
    public Boolean getShowInPremium() {
        return showInPremium;
    }

    public void setShowInPremium(Boolean showInPremium) {
        this.showInPremium = showInPremium;
    }

    /**
     * Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
     * @return useOpenStat
     */
    public Boolean getUseOpenStat() {
        return useOpenStat;
    }

    public void setUseOpenStat(Boolean useOpenStat) {
        this.useOpenStat = useOpenStat;
    }

    /**
     * Get localRegion
     * @return localRegion
     */
    public CampaignSettingsLocalRegionDTO getLocalRegion() {
        return localRegion;
    }

    public void setLocalRegion(CampaignSettingsLocalRegionDTO localRegion) {
        this.localRegion = localRegion;
    }

    /**
      * Create a string representation of this pojo.
    **/
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


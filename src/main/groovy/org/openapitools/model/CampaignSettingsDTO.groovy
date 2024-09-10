package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignSettingsLocalRegionDTO;

@Canonical
class CampaignSettingsDTO {
    /* Идентификатор региона, в котором находится магазин. */
    Long countryRegion
    /* Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  */
    String shopName
    /* Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  */
    Boolean showInContext
    /* Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  */
    Boolean showInPremium
    /* Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  */
    Boolean useOpenStat
    
    CampaignSettingsLocalRegionDTO localRegion
}

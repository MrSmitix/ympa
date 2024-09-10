goog.provide('API.Client.CampaignSettingsDTO');

/**
 * Настройки магазина.
 * @record
 */
API.Client.CampaignSettingsDTO = function() {}

/**
 * Идентификатор региона, в котором находится магазин.
 * @type {!number}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.countryRegion;

/**
 * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
 * @type {!string}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.shopName;

/**
 * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
 * @type {!boolean}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.showInContext;

/**
 * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
 * @type {!boolean}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.showInPremium;

/**
 * Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
 * @type {!boolean}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.useOpenStat;

/**
 * @type {!API.Client.CampaignSettingsLocalRegionDTO}
 * @export
 */
API.Client.CampaignSettingsDTO.prototype.localRegion;


<?php
/**
 * CampaignSettingsDTO
 */
namespace app\Models;

/**
 * CampaignSettingsDTO
 * @description Настройки магазина.
 */
class CampaignSettingsDTO {

    /** @var int $countryRegion Идентификатор региона, в котором находится магазин.*/
    public $countryRegion = 0;

    /** @var string $shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.*/
    public $shopName = "";

    /** @var bool $showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.*/
    public $showInContext = false;

    /** @var bool $showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.*/
    public $showInPremium = false;

    /** @var bool $useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.*/
    public $useOpenStat = false;

    /** @var \app\Models\CampaignSettingsLocalRegionDTO $localRegion */
    public $localRegion;

}

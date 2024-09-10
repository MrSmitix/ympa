<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Настройки магазина.
 */
class CampaignSettingsDTO
{
    /**
     * Идентификатор региона, в котором находится магазин.
     * @DTA\Data(field="countryRegion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $country_region = null;

    /**
     * Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.
     * @DTA\Data(field="shopName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shop_name = null;

    /**
     * Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.
     * @DTA\Data(field="showInContext", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $show_in_context = null;

    /**
     * Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.
     * @DTA\Data(field="showInPremium", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $show_in_premium = null;

    /**
     * Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.
     * @DTA\Data(field="useOpenStat", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $use_open_stat = null;

    /**
     * @DTA\Data(field="localRegion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsLocalRegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsLocalRegionDTO::class})
     */
    public ?\App\DTO\CampaignSettingsLocalRegionDTO $local_region = null;

}

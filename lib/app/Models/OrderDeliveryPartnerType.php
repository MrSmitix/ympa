<?php
/**
 * OrderDeliveryPartnerType
 */
namespace app\Models;

/**
 * OrderDeliveryPartnerType
 * @description Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип.
 */
class OrderDeliveryPartnerType
{
    /**
     * Possible values of this enum
     */
    const SHOP = 'SHOP';

    const YANDEX_MARKET = 'YANDEX_MARKET';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::SHOP,
            self::YANDEX_MARKET,
            self::UNKNOWN
        ];
    }
}

<?php
/**
 * RecipientType
 */
namespace app\Models;

/**
 * RecipientType
 * @description Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта.
 */
class RecipientType
{
    /**
     * Possible values of this enum
     */
    const SHOP = 'SHOP';

    const DELIVERY_SERVICE = 'DELIVERY_SERVICE';

    const POST = 'POST';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::SHOP,
            self::DELIVERY_SERVICE,
            self::POST
        ];
    }
}

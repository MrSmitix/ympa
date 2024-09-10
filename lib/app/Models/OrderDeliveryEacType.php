<?php
/**
 * OrderDeliveryEacType
 */
namespace app\Models;

/**
 * OrderDeliveryEacType
 * @description Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне.
 */
class OrderDeliveryEacType
{
    /**
     * Possible values of this enum
     */
    const MERCHANT_TO_COURIER = 'MERCHANT_TO_COURIER';

    const COURIER_TO_MERCHANT = 'COURIER_TO_MERCHANT';

    const CHECKING_BY_MERCHANT = 'CHECKING_BY_MERCHANT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::MERCHANT_TO_COURIER,
            self::COURIER_TO_MERCHANT,
            self::CHECKING_BY_MERCHANT
        ];
    }
}

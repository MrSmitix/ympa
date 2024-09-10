<?php
/**
 * OrderDeliveryType
 */
namespace app\Models;

/**
 * OrderDeliveryType
 * @description Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип.
 */
class OrderDeliveryType
{
    /**
     * Possible values of this enum
     */
    const DELIVERY = 'DELIVERY';

    const PICKUP = 'PICKUP';

    const POST = 'POST';

    const DIGITAL = 'DIGITAL';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DELIVERY,
            self::PICKUP,
            self::POST,
            self::DIGITAL,
            self::UNKNOWN
        ];
    }
}

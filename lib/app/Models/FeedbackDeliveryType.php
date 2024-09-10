<?php
/**
 * FeedbackDeliveryType
 */
namespace app\Models;

/**
 * FeedbackDeliveryType
 * @description Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине.
 */
class FeedbackDeliveryType
{
    /**
     * Possible values of this enum
     */
    const DELIVERY = 'DELIVERY';

    const PICKUP = 'PICKUP';

    const INSTORE = 'INSTORE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DELIVERY,
            self::PICKUP,
            self::INSTORE
        ];
    }
}

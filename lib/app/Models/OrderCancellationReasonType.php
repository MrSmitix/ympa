<?php
/**
 * OrderCancellationReasonType
 */
namespace app\Models;

/**
 * OrderCancellationReasonType
 * @description Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера.
 */
class OrderCancellationReasonType
{
    /**
     * Possible values of this enum
     */
    const DELIVERED = 'ORDER_DELIVERED';

    const IN_DELIVERY = 'ORDER_IN_DELIVERY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DELIVERED,
            self::IN_DELIVERY
        ];
    }
}

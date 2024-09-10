<?php
/**
 * OrderDeliveryDateReasonType
 */
namespace app\Models;

/**
 * OrderDeliveryDateReasonType
 * @description Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок.
 */
class OrderDeliveryDateReasonType
{
    /**
     * Possible values of this enum
     */
    const USER_MOVED_DELIVERY_DATES = 'USER_MOVED_DELIVERY_DATES';

    const PARTNER_MOVED_DELIVERY_DATES = 'PARTNER_MOVED_DELIVERY_DATES';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::USER_MOVED_DELIVERY_DATES,
            self::PARTNER_MOVED_DELIVERY_DATES
        ];
    }
}

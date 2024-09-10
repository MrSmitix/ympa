<?php
/**
 * OrdersStatsItemStatusType
 */
namespace app\Models;

/**
 * OrdersStatsItemStatusType
 * @description Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули.
 */
class OrdersStatsItemStatusType
{
    /**
     * Possible values of this enum
     */
    const REJECTED = 'REJECTED';

    const RETURNED = 'RETURNED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::REJECTED,
            self::RETURNED
        ];
    }
}

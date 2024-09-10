<?php
/**
 * OrderItemStatusType
 */
namespace app\Models;

/**
 * OrderItemStatusType
 * @description Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный.
 */
class OrderItemStatusType
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

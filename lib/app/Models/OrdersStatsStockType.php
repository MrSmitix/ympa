<?php
/**
 * OrdersStatsStockType
 */
namespace app\Models;

/**
 * OrdersStatsStockType
 * @description Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества.
 */
class OrdersStatsStockType
{
    /**
     * Possible values of this enum
     */
    const FIT = 'FIT';

    const FREEZE = 'FREEZE';

    const AVAILABLE = 'AVAILABLE';

    const QUARANTINE = 'QUARANTINE';

    const UTILIZATION = 'UTILIZATION';

    const DEFECT = 'DEFECT';

    const EXPIRED = 'EXPIRED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FIT,
            self::FREEZE,
            self::AVAILABLE,
            self::QUARANTINE,
            self::UTILIZATION,
            self::DEFECT,
            self::EXPIRED
        ];
    }
}

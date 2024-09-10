<?php
/**
 * LogisticPointType
 */
namespace app\Models;

/**
 * LogisticPointType
 * @description Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал.
 */
class LogisticPointType
{
    /**
     * Possible values of this enum
     */
    const WAREHOUSE = 'WAREHOUSE';

    const PICKUP_POINT = 'PICKUP_POINT';

    const PICKUP_TERMINAL = 'PICKUP_TERMINAL';

    const PICKUP_POST_OFFICE = 'PICKUP_POST_OFFICE';

    const PICKUP_MIXED = 'PICKUP_MIXED';

    const PICKUP_RETAIL = 'PICKUP_RETAIL';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::WAREHOUSE,
            self::PICKUP_POINT,
            self::PICKUP_TERMINAL,
            self::PICKUP_POST_OFFICE,
            self::PICKUP_MIXED,
            self::PICKUP_RETAIL,
            self::UNKNOWN
        ];
    }
}

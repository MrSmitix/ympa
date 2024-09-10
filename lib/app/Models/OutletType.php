<?php
/**
 * OutletType
 */
namespace app\Models;

/**
 * OutletType
 * @description Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал).
 */
class OutletType
{
    /**
     * Possible values of this enum
     */
    const DEPOT = 'DEPOT';

    const MIXED = 'MIXED';

    const RETAIL = 'RETAIL';

    const NOT_DEFINED = 'NOT_DEFINED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DEPOT,
            self::MIXED,
            self::RETAIL,
            self::NOT_DEFINED
        ];
    }
}

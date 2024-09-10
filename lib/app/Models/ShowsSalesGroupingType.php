<?php
/**
 * ShowsSalesGroupingType
 */
namespace app\Models;

/**
 * ShowsSalesGroupingType
 * @description Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам.
 */
class ShowsSalesGroupingType
{
    /**
     * Possible values of this enum
     */
    const CATEGORIES = 'CATEGORIES';

    const OFFERS = 'OFFERS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CATEGORIES,
            self::OFFERS
        ];
    }
}

<?php
/**
 * AgeUnitType
 */
namespace app\Models;

/**
 * AgeUnitType
 * @description Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц.
 */
class AgeUnitType
{
    /**
     * Possible values of this enum
     */
    const YEAR = 'YEAR';

    const MONTH = 'MONTH';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::YEAR,
            self::MONTH
        ];
    }
}

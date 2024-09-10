<?php
/**
 * TimeUnitType
 */
namespace app\Models;

/**
 * TimeUnitType
 * @description Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год.
 */
class TimeUnitType
{
    /**
     * Possible values of this enum
     */
    const HOUR = 'HOUR';

    const DAY = 'DAY';

    const WEEK = 'WEEK';

    const MONTH = 'MONTH';

    const YEAR = 'YEAR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::HOUR,
            self::DAY,
            self::WEEK,
            self::MONTH,
            self::YEAR
        ];
    }
}

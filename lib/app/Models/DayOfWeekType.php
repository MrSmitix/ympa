<?php
/**
 * DayOfWeekType
 */
namespace app\Models;

/**
 * DayOfWeekType
 * @description День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье.
 */
class DayOfWeekType
{
    /**
     * Possible values of this enum
     */
    const MONDAY = 'MONDAY';

    const TUESDAY = 'TUESDAY';

    const WEDNESDAY = 'WEDNESDAY';

    const THURSDAY = 'THURSDAY';

    const FRIDAY = 'FRIDAY';

    const SATURDAY = 'SATURDAY';

    const SUNDAY = 'SUNDAY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::MONDAY,
            self::TUESDAY,
            self::WEDNESDAY,
            self::THURSDAY,
            self::FRIDAY,
            self::SATURDAY,
            self::SUNDAY
        ];
    }
}

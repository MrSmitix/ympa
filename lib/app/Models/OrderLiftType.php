<?php
/**
 * OrderLiftType
 */
namespace app\Models;

/**
 * OrderLiftType
 * @description Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип.
 */
class OrderLiftType
{
    /**
     * Possible values of this enum
     */
    const NOT_NEEDED = 'NOT_NEEDED';

    const MANUAL = 'MANUAL';

    const ELEVATOR = 'ELEVATOR';

    const CARGO_ELEVATOR = 'CARGO_ELEVATOR';

    const FREE = 'FREE';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::NOT_NEEDED,
            self::MANUAL,
            self::ELEVATOR,
            self::CARGO_ELEVATOR,
            self::FREE,
            self::UNKNOWN
        ];
    }
}

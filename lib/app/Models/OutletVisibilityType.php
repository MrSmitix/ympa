<?php
/**
 * OutletVisibilityType
 */
namespace app\Models;

/**
 * OutletVisibilityType
 * @description Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена.
 */
class OutletVisibilityType
{
    /**
     * Possible values of this enum
     */
    const HIDDEN = 'HIDDEN';

    const VISIBLE = 'VISIBLE';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::HIDDEN,
            self::VISIBLE,
            self::UNKNOWN
        ];
    }
}

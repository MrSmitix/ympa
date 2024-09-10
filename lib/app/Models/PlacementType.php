<?php
/**
 * PlacementType
 */
namespace app\Models;

/**
 * PlacementType
 * @description Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS.
 */
class PlacementType
{
    /**
     * Possible values of this enum
     */
    const FBS = 'FBS';

    const FBY = 'FBY';

    const DBS = 'DBS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FBS,
            self::FBY,
            self::DBS
        ];
    }
}

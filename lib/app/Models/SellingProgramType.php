<?php
/**
 * SellingProgramType
 */
namespace app\Models;

/**
 * SellingProgramType
 * @description Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс.
 */
class SellingProgramType
{
    /**
     * Possible values of this enum
     */
    const FBY = 'FBY';

    const FBS = 'FBS';

    const DBS = 'DBS';

    const EXPRESS = 'EXPRESS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FBY,
            self::FBS,
            self::DBS,
            self::EXPRESS
        ];
    }
}

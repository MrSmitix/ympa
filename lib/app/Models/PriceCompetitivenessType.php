<?php
/**
 * PriceCompetitivenessType
 */
namespace app\Models;

/**
 * PriceCompetitivenessType
 * @description Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная.
 */
class PriceCompetitivenessType
{
    /**
     * Possible values of this enum
     */
    const OPTIMAL = 'OPTIMAL';

    const AVERAGE = 'AVERAGE';

    const LOW = 'LOW';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OPTIMAL,
            self::AVERAGE,
            self::LOW
        ];
    }
}

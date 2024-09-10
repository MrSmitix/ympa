<?php
/**
 * OfferConditionQualityType
 */
namespace app\Models;

/**
 * OfferConditionQualityType
 * @description Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран.
 */
class OfferConditionQualityType
{
    /**
     * Possible values of this enum
     */
    const PERFECT = 'PERFECT';

    const EXCELLENT = 'EXCELLENT';

    const GOOD = 'GOOD';

    const NOT_SPECIFIED = 'NOT_SPECIFIED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PERFECT,
            self::EXCELLENT,
            self::GOOD,
            self::NOT_SPECIFIED
        ];
    }
}

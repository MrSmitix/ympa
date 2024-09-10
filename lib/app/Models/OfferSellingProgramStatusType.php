<?php
/**
 * OfferSellingProgramStatusType
 */
namespace app\Models;

/**
 * OfferSellingProgramStatusType
 * @description Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно.
 */
class OfferSellingProgramStatusType
{
    /**
     * Possible values of this enum
     */
    const FINE = 'FINE';

    const REJECT = 'REJECT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FINE,
            self::REJECT
        ];
    }
}

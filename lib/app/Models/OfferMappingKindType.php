<?php
/**
 * OfferMappingKindType
 */
namespace app\Models;

/**
 * OfferMappingKindType
 * @description Вид маппинга.
 */
class OfferMappingKindType
{
    /**
     * Possible values of this enum
     */
    const ACTIVE = 'ACTIVE';

    const ALL = 'ALL';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ACTIVE,
            self::ALL
        ];
    }
}

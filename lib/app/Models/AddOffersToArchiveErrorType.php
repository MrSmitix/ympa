<?php
/**
 * AddOffersToArchiveErrorType
 */
namespace app\Models;

/**
 * AddOffersToArchiveErrorType
 * @description Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета.
 */
class AddOffersToArchiveErrorType
{
    /**
     * Possible values of this enum
     */
    const OFFER_HAS_STOCKS = 'OFFER_HAS_STOCKS';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OFFER_HAS_STOCKS,
            self::UNKNOWN
        ];
    }
}

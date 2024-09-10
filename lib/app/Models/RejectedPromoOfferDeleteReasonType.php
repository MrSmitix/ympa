<?php
/**
 * RejectedPromoOfferDeleteReasonType
 */
namespace app\Models;

/**
 * RejectedPromoOfferDeleteReasonType
 * @description Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.
 */
class RejectedPromoOfferDeleteReasonType
{
    /**
     * Possible values of this enum
     */
    const OFFER_DOES_NOT_EXIST = 'OFFER_DOES_NOT_EXIST';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OFFER_DOES_NOT_EXIST
        ];
    }
}

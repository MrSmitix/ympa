<?php
/**
 * OrderBuyerType
 */
namespace app\Models;

/**
 * OrderBuyerType
 * @description Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация.
 */
class OrderBuyerType
{
    /**
     * Possible values of this enum
     */
    const PERSON = 'PERSON';

    const BUSINESS = 'BUSINESS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PERSON,
            self::BUSINESS
        ];
    }
}

<?php
/**
 * PriceQuarantineVerdictParamNameType
 */
namespace app\Models;

/**
 * PriceQuarantineVerdictParamNameType
 * @description Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта.
 */
class PriceQuarantineVerdictParamNameType
{
    /**
     * Possible values of this enum
     */
    const CURRENT_PRICE = 'CURRENT_PRICE';

    const LAST_VALID_PRICE = 'LAST_VALID_PRICE';

    const MIN_PRICE = 'MIN_PRICE';

    const CURRENCY = 'CURRENCY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CURRENT_PRICE,
            self::LAST_VALID_PRICE,
            self::MIN_PRICE,
            self::CURRENCY
        ];
    }
}

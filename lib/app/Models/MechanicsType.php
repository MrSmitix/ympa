<?php
/**
 * MechanicsType
 */
namespace app\Models;

/**
 * MechanicsType
 * @description Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду.
 */
class MechanicsType
{
    /**
     * Possible values of this enum
     */
    const DIRECT_DISCOUNT = 'DIRECT_DISCOUNT';

    const BLUE_FLASH = 'BLUE_FLASH';

    const MARKET_PROMOCODE = 'MARKET_PROMOCODE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DIRECT_DISCOUNT,
            self::BLUE_FLASH,
            self::MARKET_PROMOCODE
        ];
    }
}

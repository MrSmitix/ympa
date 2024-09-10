<?php
/**
 * OrderItemInstanceType
 */
namespace app\Models;

/**
 * OrderItemInstanceType
 * @description Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации.
 */
class OrderItemInstanceType
{
    /**
     * Possible values of this enum
     */
    const CIS = 'CIS';

    const UIN = 'UIN';

    const RNPT = 'RNPT';

    const GTD = 'GTD';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CIS,
            self::UIN,
            self::RNPT,
            self::GTD
        ];
    }
}

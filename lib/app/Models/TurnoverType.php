<?php
/**
 * TurnoverType
 */
namespace app\Models;

/**
 * TurnoverType
 * @description Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.|
 */
class TurnoverType
{
    /**
     * Possible values of this enum
     */
    const LOW = 'LOW';

    const ALMOST_LOW = 'ALMOST_LOW';

    const HIGH = 'HIGH';

    const VERY_HIGH = 'VERY_HIGH';

    const NO_SALES = 'NO_SALES';

    const FREE_STORE = 'FREE_STORE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::LOW,
            self::ALMOST_LOW,
            self::HIGH,
            self::VERY_HIGH,
            self::NO_SALES,
            self::FREE_STORE
        ];
    }
}

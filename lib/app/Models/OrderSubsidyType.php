<?php
/**
 * OrderSubsidyType
 */
namespace app\Models;

/**
 * OrderSubsidyType
 * @description Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * `DELIVERY` — скидка за доставку (DBS).
 */
class OrderSubsidyType
{
    /**
     * Possible values of this enum
     */
    const YANDEX_CASHBACK = 'YANDEX_CASHBACK';

    const SUBSIDY = 'SUBSIDY';

    const DELIVERY = 'DELIVERY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::YANDEX_CASHBACK,
            self::SUBSIDY,
            self::DELIVERY
        ];
    }
}

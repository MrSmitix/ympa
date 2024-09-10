<?php
/**
 * OrderItemSubsidyType
 */
namespace app\Models;

/**
 * OrderItemSubsidyType
 * @description Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.).
 */
class OrderItemSubsidyType
{
    /**
     * Possible values of this enum
     */
    const YANDEX_CASHBACK = 'YANDEX_CASHBACK';

    const SUBSIDY = 'SUBSIDY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::YANDEX_CASHBACK,
            self::SUBSIDY
        ];
    }
}

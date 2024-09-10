<?php
/**
 * OrdersStatsPaymentSourceType
 */
namespace app\Models;

/**
 * OrdersStatsPaymentSourceType
 * @description Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит).
 */
class OrdersStatsPaymentSourceType
{
    /**
     * Possible values of this enum
     */
    const BUYER = 'BUYER';

    const CASHBACK = 'CASHBACK';

    const MARKETPLACE = 'MARKETPLACE';

    const SPLIT = 'SPLIT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::BUYER,
            self::CASHBACK,
            self::MARKETPLACE,
            self::SPLIT
        ];
    }
}

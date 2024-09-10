<?php
/**
 * OrdersStatsPaymentType
 */
namespace app\Models;

/**
 * OrdersStatsPaymentType
 * @description Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат.
 */
class OrdersStatsPaymentType
{
    /**
     * Possible values of this enum
     */
    const PAYMENT = 'PAYMENT';

    const REFUND = 'REFUND';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PAYMENT,
            self::REFUND,
            self::UNKNOWN
        ];
    }
}

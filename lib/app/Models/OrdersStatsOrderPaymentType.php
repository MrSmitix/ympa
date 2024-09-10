<?php
/**
 * OrdersStatsOrderPaymentType
 */
namespace app\Models;

/**
 * OrdersStatsOrderPaymentType
 * @description Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен.
 */
class OrdersStatsOrderPaymentType
{
    /**
     * Possible values of this enum
     */
    const CREDIT = 'CREDIT';

    const POSTPAID = 'POSTPAID';

    const PREPAID = 'PREPAID';

    const TINKOFF_CREDIT = 'TINKOFF_CREDIT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CREDIT,
            self::POSTPAID,
            self::PREPAID,
            self::TINKOFF_CREDIT
        ];
    }
}

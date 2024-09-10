<?php
/**
 * OrderPaymentType
 */
namespace app\Models;

/**
 * OrderPaymentType
 * @description Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении.
 */
class OrderPaymentType
{
    /**
     * Possible values of this enum
     */
    const PREPAID = 'PREPAID';

    const POSTPAID = 'POSTPAID';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PREPAID,
            self::POSTPAID,
            self::UNKNOWN
        ];
    }
}

<?php
/**
 * OrderStatsStatusType
 */
namespace app\Models;

/**
 * OrderStatsStatusType
 * @description Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян.
 */
class OrderStatsStatusType
{
    /**
     * Possible values of this enum
     */
    const CANCELLED_BEFORE_PROCESSING = 'CANCELLED_BEFORE_PROCESSING';

    const CANCELLED_IN_DELIVERY = 'CANCELLED_IN_DELIVERY';

    const CANCELLED_IN_PROCESSING = 'CANCELLED_IN_PROCESSING';

    const DELIVERY = 'DELIVERY';

    const DELIVERED = 'DELIVERED';

    const PARTIALLY_DELIVERED = 'PARTIALLY_DELIVERED';

    const PARTIALLY_RETURNED = 'PARTIALLY_RETURNED';

    const PENDING = 'PENDING';

    const PICKUP = 'PICKUP';

    const PROCESSING = 'PROCESSING';

    const RESERVED = 'RESERVED';

    const RETURNED = 'RETURNED';

    const UNKNOWN = 'UNKNOWN';

    const UNPAID = 'UNPAID';

    const LOST = 'LOST';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CANCELLED_BEFORE_PROCESSING,
            self::CANCELLED_IN_DELIVERY,
            self::CANCELLED_IN_PROCESSING,
            self::DELIVERY,
            self::DELIVERED,
            self::PARTIALLY_DELIVERED,
            self::PARTIALLY_RETURNED,
            self::PENDING,
            self::PICKUP,
            self::PROCESSING,
            self::RESERVED,
            self::RETURNED,
            self::UNKNOWN,
            self::UNPAID,
            self::LOST
        ];
    }
}

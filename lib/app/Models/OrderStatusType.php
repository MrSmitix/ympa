<?php
/**
 * OrderStatusType
 */
namespace app\Models;

/**
 * OrderStatusType
 * @description Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется.
 */
class OrderStatusType
{
    /**
     * Possible values of this enum
     */
    const PLACING = 'PLACING';

    const RESERVED = 'RESERVED';

    const UNPAID = 'UNPAID';

    const PROCESSING = 'PROCESSING';

    const DELIVERY = 'DELIVERY';

    const PICKUP = 'PICKUP';

    const DELIVERED = 'DELIVERED';

    const CANCELLED = 'CANCELLED';

    const PENDING = 'PENDING';

    const PARTIALLY_RETURNED = 'PARTIALLY_RETURNED';

    const RETURNED = 'RETURNED';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PLACING,
            self::RESERVED,
            self::UNPAID,
            self::PROCESSING,
            self::DELIVERY,
            self::PICKUP,
            self::DELIVERED,
            self::CANCELLED,
            self::PENDING,
            self::PARTIALLY_RETURNED,
            self::RETURNED,
            self::UNKNOWN
        ];
    }
}

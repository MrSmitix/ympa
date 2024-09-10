<?php
/**
 * ReturnShipmentStatusType
 */
namespace app\Models;

/**
 * ReturnShipmentStatusType
 * @description Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован.
 */
class ReturnShipmentStatusType
{
    /**
     * Possible values of this enum
     */
    const CREATED = 'CREATED';

    const RECEIVED = 'RECEIVED';

    const IN_TRANSIT = 'IN_TRANSIT';

    const READY_FOR_PICKUP = 'READY_FOR_PICKUP';

    const PICKED = 'PICKED';

    const LOST = 'LOST';

    const EXPIRED = 'EXPIRED';

    const CANCELLED = 'CANCELLED';

    const FULFILMENT_RECEIVED = 'FULFILMENT_RECEIVED';

    const PREPARED_FOR_UTILIZATION = 'PREPARED_FOR_UTILIZATION';

    const NOT_IN_DEMAND = 'NOT_IN_DEMAND';

    const UTILIZED = 'UTILIZED';

    const READY_FOR_EXPROPRIATION = 'READY_FOR_EXPROPRIATION';

    const RECEIVED_FOR_EXPROPRIATION = 'RECEIVED_FOR_EXPROPRIATION';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CREATED,
            self::RECEIVED,
            self::IN_TRANSIT,
            self::READY_FOR_PICKUP,
            self::PICKED,
            self::LOST,
            self::EXPIRED,
            self::CANCELLED,
            self::FULFILMENT_RECEIVED,
            self::PREPARED_FOR_UTILIZATION,
            self::NOT_IN_DEMAND,
            self::UTILIZED,
            self::READY_FOR_EXPROPRIATION,
            self::RECEIVED_FOR_EXPROPRIATION
        ];
    }
}

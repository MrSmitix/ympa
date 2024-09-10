<?php
/**
 * ReturnInstanceStatusType
 */
namespace app\Models;

/**
 * ReturnInstanceStatusType
 * @description Логистический статус конкретного товара.
 */
class ReturnInstanceStatusType
{
    /**
     * Possible values of this enum
     */
    const CREATED = 'CREATED';

    const RECEIVED = 'RECEIVED';

    const IN_TRANSIT = 'IN_TRANSIT';

    const READY_FOR_PICKUP = 'READY_FOR_PICKUP';

    const PICKED = 'PICKED';

    const RECEIVED_ON_FULFILLMENT = 'RECEIVED_ON_FULFILLMENT';

    const CANCELLED = 'CANCELLED';

    const LOST = 'LOST';

    const UTILIZED = 'UTILIZED';

    const PREPARED_FOR_UTILIZATION = 'PREPARED_FOR_UTILIZATION';

    const EXPROPRIATED = 'EXPROPRIATED';

    const NOT_IN_DEMAND = 'NOT_IN_DEMAND';

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
            self::RECEIVED_ON_FULFILLMENT,
            self::CANCELLED,
            self::LOST,
            self::UTILIZED,
            self::PREPARED_FOR_UTILIZATION,
            self::EXPROPRIATED,
            self::NOT_IN_DEMAND
        ];
    }
}

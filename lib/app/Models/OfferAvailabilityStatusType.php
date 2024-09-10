<?php
/**
 * OfferAvailabilityStatusType
 */
namespace app\Models;

/**
 * OfferAvailabilityStatusType
 * @description Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`.
 */
class OfferAvailabilityStatusType
{
    /**
     * Possible values of this enum
     */
    const ACTIVE = 'ACTIVE';

    const INACTIVE = 'INACTIVE';

    const DELISTED = 'DELISTED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ACTIVE,
            self::INACTIVE,
            self::DELISTED
        ];
    }
}

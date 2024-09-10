<?php
/**
 * AffectedOrderQualityRatingComponentType
 */
namespace app\Models;

/**
 * AffectedOrderQualityRatingComponentType
 * @description Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.
 */
class AffectedOrderQualityRatingComponentType
{
    /**
     * Possible values of this enum
     */
    const DBS_CANCELLATION_RATE = 'DBS_CANCELLATION_RATE';

    const DBS_LATE_DELIVERY_RATE = 'DBS_LATE_DELIVERY_RATE';

    const FBS_CANCELLATION_RATE = 'FBS_CANCELLATION_RATE';

    const FBS_LATE_SHIP_RATE = 'FBS_LATE_SHIP_RATE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DBS_CANCELLATION_RATE,
            self::DBS_LATE_DELIVERY_RATE,
            self::FBS_CANCELLATION_RATE,
            self::FBS_LATE_SHIP_RATE
        ];
    }
}

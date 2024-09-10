<?php
/**
 * QualityRatingComponentType
 */
namespace app\Models;

/**
 * QualityRatingComponentType
 * @description Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки.
 */
class QualityRatingComponentType
{
    /**
     * Possible values of this enum
     */
    const DBS_CANCELLATION_RATE = 'DBS_CANCELLATION_RATE';

    const DBS_LATE_DELIVERY_RATE = 'DBS_LATE_DELIVERY_RATE';

    const FBS_CANCELLATION_RATE = 'FBS_CANCELLATION_RATE';

    const FBS_LATE_SHIP_RATE = 'FBS_LATE_SHIP_RATE';

    const FBY_LATE_DELIVERY_RATE = 'FBY_LATE_DELIVERY_RATE';

    const FBY_CANCELLATION_RATE = 'FBY_CANCELLATION_RATE';

    const FBY_DELIVERY_DIFF_RATE = 'FBY_DELIVERY_DIFF_RATE';

    const FBY_LATE_EDITING_RATE = 'FBY_LATE_EDITING_RATE';

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
            self::FBS_LATE_SHIP_RATE,
            self::FBY_LATE_DELIVERY_RATE,
            self::FBY_CANCELLATION_RATE,
            self::FBY_DELIVERY_DIFF_RATE,
            self::FBY_LATE_EDITING_RATE
        ];
    }
}

<?php
/**
 * FeedIndexLogsIndexType
 */
namespace app\Models;

/**
 * FeedIndexLogsIndexType
 * @description Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете.
 */
class FeedIndexLogsIndexType
{
    /**
     * Possible values of this enum
     */
    const DIFF = 'DIFF';

    const FAST_PRICE = 'FAST_PRICE';

    const FULL = 'FULL';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DIFF,
            self::FAST_PRICE,
            self::FULL
        ];
    }
}

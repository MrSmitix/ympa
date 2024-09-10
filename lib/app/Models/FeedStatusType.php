<?php
/**
 * FeedStatusType
 */
namespace app\Models;

/**
 * FeedStatusType
 * @description Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено.
 */
class FeedStatusType
{
    /**
     * Possible values of this enum
     */
    const ERROR = 'ERROR';

    const NA = 'NA';

    const OK = 'OK';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ERROR,
            self::NA,
            self::OK
        ];
    }
}

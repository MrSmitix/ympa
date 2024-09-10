<?php
/**
 * ShelfsStatisticsAttributionType
 */
namespace app\Models;

/**
 * ShelfsStatisticsAttributionType
 * @description Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats).
 */
class ShelfsStatisticsAttributionType
{
    /**
     * Possible values of this enum
     */
    const CLICKS = 'CLICKS';

    const SHOWS = 'SHOWS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CLICKS,
            self::SHOWS
        ];
    }
}

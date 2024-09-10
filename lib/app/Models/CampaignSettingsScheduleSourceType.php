<?php
/**
 * CampaignSettingsScheduleSourceType
 */
namespace app\Models;

/**
 * CampaignSettingsScheduleSourceType
 * @description Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина.
 */
class CampaignSettingsScheduleSourceType
{
    /**
     * Possible values of this enum
     */
    const WEB = 'WEB';

    const YML = 'YML';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::WEB,
            self::YML
        ];
    }
}

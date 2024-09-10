<?php
/**
 * FeedIndexLogsStatusType
 */
namespace app\Models;

/**
 * FeedIndexLogsStatusType
 * @description Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы.
 */
class FeedIndexLogsStatusType
{
    /**
     * Possible values of this enum
     */
    const ERROR = 'ERROR';

    const OK = 'OK';

    const WARNING = 'WARNING';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ERROR,
            self::OK,
            self::WARNING
        ];
    }
}

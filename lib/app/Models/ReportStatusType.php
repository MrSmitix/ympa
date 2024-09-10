<?php
/**
 * ReportStatusType
 */
namespace app\Models;

/**
 * ReportStatusType
 * @description Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов.
 */
class ReportStatusType
{
    /**
     * Possible values of this enum
     */
    const PENDING = 'PENDING';

    const PROCESSING = 'PROCESSING';

    const FAILED = 'FAILED';

    const DONE = 'DONE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PENDING,
            self::PROCESSING,
            self::FAILED,
            self::DONE
        ];
    }
}

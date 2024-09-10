<?php
/**
 * ReportSubStatusType
 */
namespace app\Models;

/**
 * ReportSubStatusType
 * @description Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей.
 */
class ReportSubStatusType
{
    /**
     * Possible values of this enum
     */
    const NO_DATA = 'NO_DATA';

    const TOO_LARGE = 'TOO_LARGE';

    const RESOURCE_NOT_FOUND = 'RESOURCE_NOT_FOUND';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::NO_DATA,
            self::TOO_LARGE,
            self::RESOURCE_NOT_FOUND
        ];
    }
}

<?php
/**
 * ReportFormatType
 */
namespace app\Models;

/**
 * ReportFormatType
 * @description Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета.
 */
class ReportFormatType
{
    /**
     * Possible values of this enum
     */
    const FILE = 'FILE';

    const CSV = 'CSV';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FILE,
            self::CSV
        ];
    }
}

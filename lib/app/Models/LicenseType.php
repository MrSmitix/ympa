<?php
/**
 * LicenseType
 */
namespace app\Models;

/**
 * LicenseType
 * @description Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции.
 */
class LicenseType
{
    /**
     * Possible values of this enum
     */
    const ALCOHOL = 'ALCOHOL';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ALCOHOL,
            self::UNKNOWN
        ];
    }
}

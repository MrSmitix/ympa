<?php
/**
 * LanguageType
 */
namespace app\Models;

/**
 * LanguageType
 * @description Язык:  * `RU` — русский.  * `EN` — английский.
 */
class LanguageType
{
    /**
     * Possible values of this enum
     */
    const RU = 'RU';

    const EN = 'EN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::RU,
            self::EN
        ];
    }
}

<?php
/**
 * ParameterType
 */
namespace app\Models;

/**
 * ParameterType
 * @description Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число.
 */
class ParameterType
{
    /**
     * Possible values of this enum
     */
    const TEXT = 'TEXT';

    const ENUM = 'ENUM';

    const BOOLEAN = 'BOOLEAN';

    const NUMERIC = 'NUMERIC';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::TEXT,
            self::ENUM,
            self::BOOLEAN,
            self::NUMERIC
        ];
    }
}

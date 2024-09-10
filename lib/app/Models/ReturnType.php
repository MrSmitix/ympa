<?php
/**
 * ReturnType
 */
namespace app\Models;

/**
 * ReturnType
 * @description Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.
 */
class ReturnType
{
    /**
     * Possible values of this enum
     */
    const UNREDEEMED = 'UNREDEEMED';

    const _RETURN = 'RETURN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::UNREDEEMED,
            self::_RETURN
        ];
    }
}

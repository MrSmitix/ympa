<?php
/**
 * OrderUpdateStatusType
 */
namespace app\Models;

/**
 * OrderUpdateStatusType
 * @description Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`.
 */
class OrderUpdateStatusType
{
    /**
     * Possible values of this enum
     */
    const OK = 'OK';

    const ERROR = 'ERROR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OK,
            self::ERROR
        ];
    }
}

<?php
/**
 * EacVerificationStatusType
 */
namespace app\Models;

/**
 * EacVerificationStatusType
 * @description Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода.
 */
class EacVerificationStatusType
{
    /**
     * Possible values of this enum
     */
    const ACCEPTED = 'ACCEPTED';

    const REJECTED = 'REJECTED';

    const NEED_UPDATE = 'NEED_UPDATE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ACCEPTED,
            self::REJECTED,
            self::NEED_UPDATE
        ];
    }
}

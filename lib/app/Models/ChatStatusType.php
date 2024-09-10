<?php
/**
 * ChatStatusType
 */
namespace app\Models;

/**
 * ChatStatusType
 * @description Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен.
 */
class ChatStatusType
{
    /**
     * Possible values of this enum
     */
    const _NEW = 'NEW';

    const WAITING_FOR_CUSTOMER = 'WAITING_FOR_CUSTOMER';

    const WAITING_FOR_PARTNER = 'WAITING_FOR_PARTNER';

    const WAITING_FOR_ARBITER = 'WAITING_FOR_ARBITER';

    const WAITING_FOR_MARKET = 'WAITING_FOR_MARKET';

    const FINISHED = 'FINISHED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::_NEW,
            self::WAITING_FOR_CUSTOMER,
            self::WAITING_FOR_PARTNER,
            self::WAITING_FOR_ARBITER,
            self::WAITING_FOR_MARKET,
            self::FINISHED
        ];
    }
}

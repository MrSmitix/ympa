<?php
/**
 * ChatMessageSenderType
 */
namespace app\Models;

/**
 * ChatMessageSenderType
 * @description Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета.
 */
class ChatMessageSenderType
{
    /**
     * Possible values of this enum
     */
    const PARTNER = 'PARTNER';

    const CUSTOMER = 'CUSTOMER';

    const MARKET = 'MARKET';

    const SUPPORT = 'SUPPORT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PARTNER,
            self::CUSTOMER,
            self::MARKET,
            self::SUPPORT
        ];
    }
}

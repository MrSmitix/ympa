<?php
/**
 * ChatType
 */
namespace app\Models;

/**
 * ChatType
 * @description Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор.
 */
class ChatType
{
    /**
     * Possible values of this enum
     */
    const CHAT = 'CHAT';

    const ARBITRAGE = 'ARBITRAGE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CHAT,
            self::ARBITRAGE
        ];
    }
}

<?php
/**
 * ReturnDecisionReasonType
 */
namespace app\Models;

/**
 * ReturnDecisionReasonType
 * @description Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна.
 */
class ReturnDecisionReasonType
{
    /**
     * Possible values of this enum
     */
    const BAD_QUALITY = 'BAD_QUALITY';

    const DOES_NOT_FIT = 'DOES_NOT_FIT';

    const WRONG_ITEM = 'WRONG_ITEM';

    const DAMAGE_DELIVERY = 'DAMAGE_DELIVERY';

    const LOYALTY_FAIL = 'LOYALTY_FAIL';

    const CONTENT_FAIL = 'CONTENT_FAIL';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::BAD_QUALITY,
            self::DOES_NOT_FIT,
            self::WRONG_ITEM,
            self::DAMAGE_DELIVERY,
            self::LOYALTY_FAIL,
            self::CONTENT_FAIL,
            self::UNKNOWN
        ];
    }
}

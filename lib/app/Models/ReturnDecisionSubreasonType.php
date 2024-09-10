<?php
/**
 * ReturnDecisionSubreasonType
 */
namespace app\Models;

/**
 * ReturnDecisionSubreasonType
 * @description Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию.
 */
class ReturnDecisionSubreasonType
{
    /**
     * Possible values of this enum
     */
    const USER_DID_NOT_LIKE = 'USER_DID_NOT_LIKE';

    const USER_CHANGED_MIND = 'USER_CHANGED_MIND';

    const DELIVERED_TOO_LONG = 'DELIVERED_TOO_LONG';

    const BAD_PACKAGE = 'BAD_PACKAGE';

    const DAMAGED = 'DAMAGED';

    const NOT_WORKING = 'NOT_WORKING';

    const INCOMPLETENESS = 'INCOMPLETENESS';

    const WRONG_ITEM = 'WRONG_ITEM';

    const WRONG_COLOR = 'WRONG_COLOR';

    const DID_NOT_MATCH_DESCRIPTION = 'DID_NOT_MATCH_DESCRIPTION';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::USER_DID_NOT_LIKE,
            self::USER_CHANGED_MIND,
            self::DELIVERED_TOO_LONG,
            self::BAD_PACKAGE,
            self::DAMAGED,
            self::NOT_WORKING,
            self::INCOMPLETENESS,
            self::WRONG_ITEM,
            self::WRONG_COLOR,
            self::DID_NOT_MATCH_DESCRIPTION,
            self::UNKNOWN
        ];
    }
}

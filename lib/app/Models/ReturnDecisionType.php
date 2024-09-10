<?php
/**
 * ReturnDecisionType
 */
namespace app\Models;

/**
 * ReturnDecisionType
 * @description Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение.
 */
class ReturnDecisionType
{
    /**
     * Possible values of this enum
     */
    const REFUND_MONEY = 'REFUND_MONEY';

    const REFUND_MONEY_INCLUDING_SHIPMENT = 'REFUND_MONEY_INCLUDING_SHIPMENT';

    const REPAIR = 'REPAIR';

    const REPLACE = 'REPLACE';

    const SEND_TO_EXAMINATION = 'SEND_TO_EXAMINATION';

    const DECLINE_REFUND = 'DECLINE_REFUND';

    const OTHER_DECISION = 'OTHER_DECISION';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::REFUND_MONEY,
            self::REFUND_MONEY_INCLUDING_SHIPMENT,
            self::REPAIR,
            self::REPLACE,
            self::SEND_TO_EXAMINATION,
            self::DECLINE_REFUND,
            self::OTHER_DECISION,
            self::UNKNOWN
        ];
    }
}

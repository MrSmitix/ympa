<?php
/**
 * PaymentFrequencyType
 */
namespace app\Models;

/**
 * PaymentFrequencyType
 * @description Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html).
 */
class PaymentFrequencyType
{
    /**
     * Possible values of this enum
     */
    const DAILY = 'DAILY';

    const WEEKLY = 'WEEKLY';

    const BIWEEKLY = 'BIWEEKLY';

    const MONTHLY = 'MONTHLY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DAILY,
            self::WEEKLY,
            self::BIWEEKLY,
            self::MONTHLY
        ];
    }
}

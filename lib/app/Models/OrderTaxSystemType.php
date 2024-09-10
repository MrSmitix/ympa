<?php
/**
 * OrderTaxSystemType
 */
namespace app\Models;

/**
 * OrderTaxSystemType
 * @description Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`.
 */
class OrderTaxSystemType
{
    /**
     * Possible values of this enum
     */
    const OSN = 'OSN';

    const USN = 'USN';

    const USN_MINUS_COST = 'USN_MINUS_COST';

    const ENVD = 'ENVD';

    const ECHN = 'ECHN';

    const PSN = 'PSN';

    const NPD = 'NPD';

    const UNKNOWN_VALUE = 'UNKNOWN_VALUE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OSN,
            self::USN,
            self::USN_MINUS_COST,
            self::ENVD,
            self::ECHN,
            self::PSN,
            self::NPD,
            self::UNKNOWN_VALUE
        ];
    }
}

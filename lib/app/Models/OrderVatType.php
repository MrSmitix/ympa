<?php
/**
 * OrderVatType
 */
namespace app\Models;

/**
 * OrderVatType
 * @description Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`.
 */
class OrderVatType
{
    /**
     * Possible values of this enum
     */
    const NO_VAT = 'NO_VAT';

    const VAT_0 = 'VAT_0';

    const VAT_10 = 'VAT_10';

    const VAT_10_110 = 'VAT_10_110';

    const VAT_20 = 'VAT_20';

    const VAT_20_120 = 'VAT_20_120';

    const VAT_18 = 'VAT_18';

    const VAT_18_118 = 'VAT_18_118';

    const UNKNOWN_VALUE = 'UNKNOWN_VALUE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::NO_VAT,
            self::VAT_0,
            self::VAT_10,
            self::VAT_10_110,
            self::VAT_20,
            self::VAT_20_120,
            self::VAT_18,
            self::VAT_18_118,
            self::UNKNOWN_VALUE
        ];
    }
}

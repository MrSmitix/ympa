/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. 
 */
export type OrderVatType = 'NO_VAT' | 'VAT_0' | 'VAT_10' | 'VAT_10_110' | 'VAT_20' | 'VAT_20_120' | 'VAT_18' | 'VAT_18_118' | 'UNKNOWN_VALUE';

export const OrderVatType = {
    NoVat: 'NO_VAT' as OrderVatType,
    Vat0: 'VAT_0' as OrderVatType,
    Vat10: 'VAT_10' as OrderVatType,
    Vat10110: 'VAT_10_110' as OrderVatType,
    Vat20: 'VAT_20' as OrderVatType,
    Vat20120: 'VAT_20_120' as OrderVatType,
    Vat18: 'VAT_18' as OrderVatType,
    Vat18118: 'VAT_18_118' as OrderVatType,
    UnknownValue: 'UNKNOWN_VALUE' as OrderVatType
};


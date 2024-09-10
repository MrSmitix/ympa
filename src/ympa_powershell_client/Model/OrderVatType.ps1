#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum OrderVatType.

.DESCRIPTION

Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. 
#>

enum OrderVatType {
    # enum value: "NO_VAT"
    NO_VAT
    # enum value: "VAT_0"
    VAT_0
    # enum value: "VAT_10"
    VAT_10
    # enum value: "VAT_10_110"
    VAT_10_110
    # enum value: "VAT_20"
    VAT_20
    # enum value: "VAT_20_120"
    VAT_20_120
    # enum value: "VAT_18"
    VAT_18
    # enum value: "VAT_18_118"
    VAT_18_118
    # enum value: "UNKNOWN_VALUE"
    UNKNOWN_VALUE
}


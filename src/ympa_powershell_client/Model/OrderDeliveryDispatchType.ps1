#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum OrderDeliveryDispatchType.

.DESCRIPTION

Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. 
#>

enum OrderDeliveryDispatchType {
    # enum value: "UNKNOWN"
    UNKNOWN
    # enum value: "BUYER"
    BUYER
    # enum value: "MARKET_PARTNER_OUTLET"
    MARKET_PARTNER_OUTLET
    # enum value: "MARKET_BRANDED_OUTLET"
    MARKET_BRANDED_OUTLET
    # enum value: "SHOP_OUTLET"
    SHOP_OUTLET
    # enum value: "DROPOFF"
    DROPOFF
}


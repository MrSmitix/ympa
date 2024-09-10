#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum ShipmentActionType.

.DESCRIPTION

Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
#>

enum ShipmentActionType {
    # enum value: "CONFIRM"
    CONFIRM
    # enum value: "DOWNLOAD_ACT"
    DOWNLOAD_ACT
    # enum value: "DOWNLOAD_INBOUND_ACT"
    DOWNLOAD_INBOUND_ACT
    # enum value: "DOWNLOAD_DISCREPANCY_ACT"
    DOWNLOAD_DISCREPANCY_ACT
    # enum value: "CHANGE_PALLETS_COUNT"
    CHANGE_PALLETS_COUNT
}


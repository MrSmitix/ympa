#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum ReturnInstanceStatusType.

.DESCRIPTION

Логистический статус конкретного товара.
#>

enum ReturnInstanceStatusType {
    # enum value: "CREATED"
    CREATED
    # enum value: "RECEIVED"
    RECEIVED
    # enum value: "IN_TRANSIT"
    IN_TRANSIT
    # enum value: "READY_FOR_PICKUP"
    READY_FOR_PICKUP
    # enum value: "PICKED"
    PICKED
    # enum value: "RECEIVED_ON_FULFILLMENT"
    RECEIVED_ON_FULFILLMENT
    # enum value: "CANCELLED"
    CANCELLED
    # enum value: "LOST"
    LOST
    # enum value: "UTILIZED"
    UTILIZED
    # enum value: "PREPARED_FOR_UTILIZATION"
    PREPARED_FOR_UTILIZATION
    # enum value: "EXPROPRIATED"
    EXPROPRIATED
    # enum value: "NOT_IN_DEMAND"
    NOT_IN_DEMAND
}


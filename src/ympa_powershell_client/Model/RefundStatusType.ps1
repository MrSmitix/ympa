#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum RefundStatusType.

.DESCRIPTION

Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
#>

enum RefundStatusType {
    # enum value: "STARTED_BY_USER"
    STARTED_BY_USER
    # enum value: "REFUND_IN_PROGRESS"
    REFUND_IN_PROGRESS
    # enum value: "REFUNDED"
    REFUNDED
    # enum value: "FAILED"
    FAILED
    # enum value: "WAITING_FOR_DECISION"
    WAITING_FOR_DECISION
    # enum value: "DECISION_MADE"
    DECISION_MADE
    # enum value: "REFUNDED_WITH_BONUSES"
    REFUNDED_WITH_BONUSES
    # enum value: "REFUNDED_BY_SHOP"
    REFUNDED_BY_SHOP
    # enum value: "CANCELLED"
    CANCELLED
    # enum value: "COMPLETE_WITHOUT_REFUND"
    COMPLETE_WITHOUT_REFUND
    # enum value: "UNKNOWN"
    UNKNOWN
}


#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum ReportStatusType.

.DESCRIPTION

Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
#>

enum ReportStatusType {
    # enum value: "PENDING"
    PENDING
    # enum value: "PROCESSING"
    PROCESSING
    # enum value: "FAILED"
    FAILED
    # enum value: "DONE"
    DONE
}


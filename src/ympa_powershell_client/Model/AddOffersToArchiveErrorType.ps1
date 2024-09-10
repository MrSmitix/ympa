#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum AddOffersToArchiveErrorType.

.DESCRIPTION

Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
#>

enum AddOffersToArchiveErrorType {
    # enum value: "OFFER_HAS_STOCKS"
    OFFER_HAS_STOCKS
    # enum value: "UNKNOWN"
    UNKNOWN
}


#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum PromoParticipationType.

.DESCRIPTION

Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
#>

enum PromoParticipationType {
    # enum value: "PARTICIPATING_NOW"
    PARTICIPATING_NOW
    # enum value: "PARTICIPATED"
    PARTICIPATED
}


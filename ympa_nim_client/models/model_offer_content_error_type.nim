#
# Партнерский API Маркета
# 
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# The version of the OpenAPI document: LATEST
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables


type OfferContentErrorType* = object
  ## Типы ошибок:  * `OFFER_NOT_FOUND` — такого товара нет в каталоге. * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). 

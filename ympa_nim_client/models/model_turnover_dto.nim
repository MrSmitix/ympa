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

import model_turnover_type

type TurnoverDTO* = object
  ## Информация об оборачиваемости товара.
  turnover*: TurnoverType
  turnoverDays*: float64 ## Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
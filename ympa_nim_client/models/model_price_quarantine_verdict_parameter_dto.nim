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

import model_price_quarantine_verdict_param_name_type

type PriceQuarantineVerdictParameterDTO* = object
  ## Параметр карантина.
  name*: PriceQuarantineVerdictParamNameType
  value*: string ## Значение параметра.

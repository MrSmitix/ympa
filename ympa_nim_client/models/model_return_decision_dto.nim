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

import model_return_decision_reason_type
import model_return_decision_subreason_type
import model_return_decision_type

type ReturnDecisionDTO* = object
  ## Решения по возвратам.
  returnItemId*: int64 ## Идентификатор товара в возврате.
  count*: int ## Количество единиц товара.
  comment*: string ## Комментарий.
  reasonType*: ReturnDecisionReasonType
  subreasonType*: ReturnDecisionSubreasonType
  decisionType*: ReturnDecisionType
  refundAmount*: int64 ## Сумма возврата.
  partnerCompensation*: int64 ## Компенсация за обратную доставку.
  images*: seq[string] ## Список хеш-кодов фотографий товара от покупателя.

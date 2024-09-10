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

import model_set

type SkipGoodsFeedbackReactionRequest* = object
  ## Идентификаторы отзывов.
  feedbackIds*: seq[int64] ## Список идентификаторов отзывов, на которые магазин не будет отвечать.

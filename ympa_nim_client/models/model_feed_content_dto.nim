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

import model_feed_content_error_dto
import model_feed_status_type

type FeedContentDTO* = object
  ## Информация о проверке содержимого прайс-листа, загруженного на Маркет.
  rejectedOffersCount*: int64 ## Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
  status*: FeedStatusType
  totalOffersCount*: int64 ## Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
  error*: FeedContentErrorDTO
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

import model_feed_index_logs_error_dto
import model_feed_index_logs_index_type
import model_feed_index_logs_offers_dto
import model_feed_index_logs_status_type

type FeedIndexLogsRecordDTO* = object
  ## Список отчетов по индексации прайс-листа.
  downloadTime*: string ## Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  fileTime*: string ## Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  generationId*: int64 ## Идентификатор индексации.
  indexType*: FeedIndexLogsIndexType
  publishedTime*: string ## Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  status*: FeedIndexLogsStatusType
  error*: FeedIndexLogsErrorDTO
  offers*: FeedIndexLogsOffersDTO
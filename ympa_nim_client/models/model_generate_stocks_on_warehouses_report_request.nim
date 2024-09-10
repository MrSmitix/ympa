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


type GenerateStocksOnWarehousesReportRequest* = object
  ## Данные, необходимые для генерации отчета. 
  campaignId*: int64 ## Идентификатор магазина.
  warehouseIds*: seq[int64] ## Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  reportDate*: string ## Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  categoryIds*: seq[int64] ## Фильтр по категориям на Маркете (кроме модели FBY).
  hasStocks*: bool ## Фильтр по наличию остатков (кроме модели FBY).
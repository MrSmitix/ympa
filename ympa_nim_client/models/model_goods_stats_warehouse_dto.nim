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

import model_warehouse_stock_dto

type GoodsStatsWarehouseDTO* = object
  ## Информация о складе.
  id*: int64 ## Идентификатор склада.
  name*: string ## Название склада.
  stocks*: seq[WarehouseStockDTO] ## Информация об остатках товаров на складе.

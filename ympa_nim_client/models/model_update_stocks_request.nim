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
import model_update_stock_dto

type UpdateStocksRequest* = object
  ## Запрос на изменение информации по остаткам товаров.
  skus*: seq[UpdateStockDTO] ## Данные об остатках товаров. 
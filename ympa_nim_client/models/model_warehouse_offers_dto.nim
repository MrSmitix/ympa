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

import model_warehouse_offer_dto

type WarehouseOffersDTO* = object
  ## Информация об остатках товаров на складе.
  warehouseId*: int64 ## Идентификатор склада.
  offers*: seq[WarehouseOfferDTO] ## Информация об остатках.
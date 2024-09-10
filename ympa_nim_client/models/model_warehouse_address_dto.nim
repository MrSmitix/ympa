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

import model_gps_dto

type WarehouseAddressDTO* = object
  ## Адрес склада.
  city*: string ## Город.
  street*: string ## Улица.
  number*: string ## Номер дома.
  building*: string ## Номер строения.
  `block`*: string ## Номер корпуса.
  gps*: GpsDTO
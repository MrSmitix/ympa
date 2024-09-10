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

import model_unit_dto

type CategoryParameterUnitDTO* = object
  ## Единицы измерения характеристики товара.
  defaultUnitId*: int64 ## Единица измерения по умолчанию.
  units*: seq[UnitDTO] ## Допустимые единицы измерения.
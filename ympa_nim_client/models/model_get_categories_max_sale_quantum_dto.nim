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

import model_category_error_dto
import model_max_sale_quantum_dto

type GetCategoriesMaxSaleQuantumDTO* = object
  ## Категории и лимит на установку кванта и минимального количества товаров.
  results*: seq[MaxSaleQuantumDTO] ## Категории и лимит на установку кванта и минимального количества товаров.
  errors*: seq[CategoryErrorDTO] ## Ошибки, которые появились из-за переданных категорий.
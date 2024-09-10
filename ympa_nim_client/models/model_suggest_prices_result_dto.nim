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

import model_price_suggest_offer_dto

type SuggestPricesResultDTO* = object
  ## Результат запроса цен для продвижения.
  offers*: seq[PriceSuggestOfferDTO] ## Список товаров с ценами для продвижения.

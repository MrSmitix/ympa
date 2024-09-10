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


type DeleteCampaignOffersDTO* = object
  ## Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
  notDeletedOfferIds*: seq[string] ## Список SKU.

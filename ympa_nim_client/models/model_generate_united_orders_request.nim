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


type GenerateUnitedOrdersRequest* = object
  ## Данные, необходимые для генерации отчета. 
  businessId*: int64 ## Идентификатор бизнеса.
  dateFrom*: string ## Начало периода, включительно.
  dateTo*: string ## Конец периода, включительно. Максимальный период — 1 год.
  campaignIds*: seq[int64] ## Список магазинов, которые нужны в отчете.
  promoId*: string ## Идентификатор акции, товары из которой нужны в отчете.
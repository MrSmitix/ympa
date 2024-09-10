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


type GetPromoPromocodeInfoDTO* = object
  ## Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
  promocode*: string ## Промокод.
  discount*: int ## Процент скидки по промокоду.
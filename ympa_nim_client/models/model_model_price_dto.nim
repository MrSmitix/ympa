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


type ModelPriceDTO* = object
  ## Информация о ценах на модель товара.
  avg*: float ## Средняя цена предложения для модели в регионе.
  max*: float ## Максимальная цена предложения для модели в регионе.
  min*: float ## Минимальная цена предложения для модели в регионе.

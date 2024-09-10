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

import model_quarantine_offer_dto
import model_scrolling_pager_dto

type GetQuarantineOffersResultDTO* = object
  ## Список товаров в карантине.
  paging*: ScrollingPagerDTO
  offers*: seq[QuarantineOfferDTO] ## Страница списка товаров в карантине.
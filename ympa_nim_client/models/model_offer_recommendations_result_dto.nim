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

import model_offer_recommendation_dto
import model_scrolling_pager_dto

type OfferRecommendationsResultDTO* = object
  ## Список товаров с рекомендациями.
  paging*: ScrollingPagerDTO
  offerRecommendations*: seq[OfferRecommendationDTO] ## Страница списка товаров.

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

import model_promo_offer_participation_status_filter_type

type GetPromoOffersRequest* = object
  ## Получение списка товаров, которые участвуют или могут участвовать в акции.
  promoId*: string ## Идентификатор акции.
  statusType*: PromoOfferParticipationStatusFilterType

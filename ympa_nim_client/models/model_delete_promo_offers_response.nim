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

import model_api_response_status_type
import model_delete_promo_offers_result_dto

type DeletePromoOffersResponse* = object
  ## Результат удаления товаров из акции.
  status*: ApiResponseStatusType
  result*: DeletePromoOffersResultDTO

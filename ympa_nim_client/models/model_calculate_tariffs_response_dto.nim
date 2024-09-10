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

import model_calculate_tariffs_offer_info_dto

type CalculateTariffsResponseDTO* = object
  ## Расчет стоимости услуг.
  offers*: seq[CalculateTariffsOfferInfoDTO] ## Стоимость услуг.

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

import model_get_mapping_dto
import model_offer_card_recommendation_dto
import model_offer_card_status_type
import model_offer_error_dto
import model_parameter_value_dto

type OfferCardDTO* = object
  ## Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
  offerId*: string ## Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  mapping*: GetMappingDTO
  parameterValues*: seq[ParameterValueDTO] ## Список характеристик с их значениями. 
  cardStatus*: OfferCardStatusType
  contentRating*: int ## Процент заполненности карточки.
  recommendations*: seq[OfferCardRecommendationDTO] ## Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  errors*: seq[OfferErrorDTO] ## Ошибки в контенте, препятствующие размещению товара на витрине.
  warnings*: seq[OfferErrorDTO] ## Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
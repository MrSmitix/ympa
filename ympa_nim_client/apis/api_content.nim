#
# Партнерский API Маркета
# 
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# The version of the OpenAPI document: LATEST
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_api_client_data_error_response
import ../models/model_api_forbidden_error_response
import ../models/model_api_limit_error_response
import ../models/model_api_locked_error_response
import ../models/model_api_not_found_error_response
import ../models/model_api_server_error_response
import ../models/model_api_unauthorized_error_response
import ../models/model_get_category_content_parameters_response
import ../models/model_get_offer_cards_content_status_request
import ../models/model_get_offer_cards_content_status_response
import ../models/model_update_offer_content_request
import ../models/model_update_offer_content_response

const basepath = "https://api.partner.market.yandex.ru"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc getCategoryContentParameters*(httpClient: HttpClient, categoryId: int64): (Option[GetCategoryContentParametersResponse], Response) =
  ## Списки характеристик товаров по категориям

  let response = httpClient.post(basepath & fmt"/category/{categoryId}/parameters")
  constructResult[GetCategoryContentParametersResponse](response)


proc getOfferCardsContentStatus*(httpClient: HttpClient, businessId: int64, pageToken: string, limit: int, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest): (Option[GetOfferCardsContentStatusResponse], Response) =
  ## Получение информации о заполненности карточек магазина
  httpClient.headers["Content-Type"] = "application/json"
  let query_for_api_call = encodeQuery([
    ("page_token", $pageToken), # Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    ("limit", $limit), # Количество значений на одной странице. 
  ])

  let response = httpClient.post(basepath & fmt"/businesses/{businessId}/offer-cards" & "?" & query_for_api_call, $(%getOfferCardsContentStatusRequest))
  constructResult[GetOfferCardsContentStatusResponse](response)


proc updateOfferContent*(httpClient: HttpClient, businessId: int64, updateOfferContentRequest: UpdateOfferContentRequest): (Option[UpdateOfferContentResponse], Response) =
  ## Редактирование категорийных характеристик товара
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/businesses/{businessId}/offer-cards/update", $(%updateOfferContentRequest))
  constructResult[UpdateOfferContentResponse](response)

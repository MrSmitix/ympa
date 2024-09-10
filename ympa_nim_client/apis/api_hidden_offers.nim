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

import ../models/model_add_hidden_offers_request
import ../models/model_api_client_data_error_response
import ../models/model_api_forbidden_error_response
import ../models/model_api_limit_error_response
import ../models/model_api_locked_error_response
import ../models/model_api_not_found_error_response
import ../models/model_api_server_error_response
import ../models/model_api_unauthorized_error_response
import ../models/model_delete_hidden_offers_request
import ../models/model_empty_api_response
import ../models/model_get_hidden_offers_response

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


proc addHiddenOffers*(httpClient: HttpClient, campaignId: int64, addHiddenOffersRequest: AddHiddenOffersRequest): (Option[EmptyApiResponse], Response) =
  ## Скрытие товаров и настройки скрытия
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/campaigns/{campaignId}/hidden-offers", $(%addHiddenOffersRequest))
  constructResult[EmptyApiResponse](response)


proc deleteHiddenOffers*(httpClient: HttpClient, campaignId: int64, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): (Option[EmptyApiResponse], Response) =
  ## Возобновление показа товаров
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/campaigns/{campaignId}/hidden-offers/delete", $(%deleteHiddenOffersRequest))
  constructResult[EmptyApiResponse](response)


proc getHiddenOffers*(httpClient: HttpClient, campaignId: int64, offerId: seq[string], pageToken: string, limit: int, offset: int, page: int, pageSize: int): (Option[GetHiddenOffersResponse], Response) =
  ## Информация о скрытых вами товарах
  let query_for_api_call = encodeQuery([
    ("offer_id", $offerId.join(",")), # Идентификатор скрытого предложения. 
    ("page_token", $pageToken), # Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    ("limit", $limit), # Количество значений на одной странице. 
    ("offset", $offset), # Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
    ("page", $page), # Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
    ("pageSize", $pageSize), # Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
  ])

  let response = httpClient.get(basepath & fmt"/campaigns/{campaignId}/hidden-offers" & "?" & query_for_api_call)
  constructResult[GetHiddenOffersResponse](response)


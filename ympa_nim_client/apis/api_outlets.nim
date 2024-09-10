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
import ../models/model_api_not_found_error_response
import ../models/model_api_server_error_response
import ../models/model_api_unauthorized_error_response
import ../models/model_change_outlet_request
import ../models/model_create_outlet_response
import ../models/model_empty_api_response
import ../models/model_get_outlet_response
import ../models/model_get_outlets_response

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


proc createOutlet*(httpClient: HttpClient, campaignId: int64, changeOutletRequest: ChangeOutletRequest): (Option[CreateOutletResponse], Response) =
  ## Создание точки продаж
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/campaigns/{campaignId}/outlets", $(%changeOutletRequest))
  constructResult[CreateOutletResponse](response)


proc deleteOutlet*(httpClient: HttpClient, campaignId: int64, outletId: int64): (Option[EmptyApiResponse], Response) =
  ## Удаление точки продаж

  let response = httpClient.delete(basepath & fmt"/campaigns/{campaignId}/outlets/{outletId}")
  constructResult[EmptyApiResponse](response)


proc getOutlet*(httpClient: HttpClient, campaignId: int64, outletId: int64): (Option[GetOutletResponse], Response) =
  ## Информация об одной точке продаж

  let response = httpClient.get(basepath & fmt"/campaigns/{campaignId}/outlets/{outletId}")
  constructResult[GetOutletResponse](response)


proc getOutlets*(httpClient: HttpClient, campaignId: int64, pageToken: string, regionId: int64, shopOutletCode: string, regionId2: int64): (Option[GetOutletsResponse], Response) =
  ## Информация о нескольких точках продаж
  let query_for_api_call = encodeQuery([
    ("page_token", $pageToken), # Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    ("region_id", $regionId), # Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
    ("shop_outlet_code", $shopOutletCode), # Идентификатор точки продаж, присвоенный магазином.
    ("regionId", $regionId2), # {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
  ])

  let response = httpClient.get(basepath & fmt"/campaigns/{campaignId}/outlets" & "?" & query_for_api_call)
  constructResult[GetOutletsResponse](response)


proc updateOutlet*(httpClient: HttpClient, campaignId: int64, outletId: int64, changeOutletRequest: ChangeOutletRequest): (Option[EmptyApiResponse], Response) =
  ## Изменение информации о точке продаж
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/outlets/{outletId}", $(%changeOutletRequest))
  constructResult[EmptyApiResponse](response)


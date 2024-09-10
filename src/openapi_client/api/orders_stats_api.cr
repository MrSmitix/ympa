# #Партнерский API Маркета
#
##API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
#
#The version of the OpenAPI document: LATEST
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.8.0
#

require "uri"

module OpenAPIClient
  class OrdersStatsApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Детальная информация по заказам
    # Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [GetOrdersStatsResponse]
    def get_orders_stats(campaign_id : Int64, page_token : String?, limit : Int32?, get_orders_stats_request : GetOrdersStatsRequest?)
      data, _status_code, _headers = get_orders_stats_with_http_info(campaign_id, page_token, limit, get_orders_stats_request)
      data
    end

    # Детальная информация по заказам
    # Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [Array<(GetOrdersStatsResponse, Integer, Hash)>] GetOrdersStatsResponse data, response status code and response headers
    def get_orders_stats_with_http_info(campaign_id : Int64, page_token : String?, limit : Int32?, get_orders_stats_request : GetOrdersStatsRequest?)
      if @api_client.config.debugging
        Log.debug {"Calling API: OrdersStatsApi.get_orders_stats ..."}
      end
      # verify the required parameter "campaign_id" is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        raise ArgumentError.new("Missing the required parameter 'campaign_id' when calling OrdersStatsApi.get_orders_stats")
      end
      # resource path
      local_var_path = "/campaigns/{campaignId}/stats/orders".sub("{" + "campaignId" + "}", URI.encode_path(campaign_id.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["page_token"] = page_token.to_s unless page_token.nil?
      query_params["limit"] = limit.to_s unless limit.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = get_orders_stats_request.to_json

      # return_type
      return_type = "GetOrdersStatsResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"OrdersStatsApi.get_orders_stats",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: OrdersStatsApi#get_orders_stats\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return GetOrdersStatsResponse.from_json(data), status_code, headers
    end
  end
end

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
  class PricesApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Список цен
    # {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [GetPricesResponse]
    def get_prices(campaign_id : Int64, page_token : String?, limit : Int32?, archived : Bool?)
      data, _status_code, _headers = get_prices_with_http_info(campaign_id, page_token, limit, archived)
      data
    end

    # Список цен
    # {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [Array<(GetPricesResponse, Integer, Hash)>] GetPricesResponse data, response status code and response headers
    def get_prices_with_http_info(campaign_id : Int64, page_token : String?, limit : Int32?, archived : Bool?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PricesApi.get_prices ..."}
      end
      # verify the required parameter "campaign_id" is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        raise ArgumentError.new("Missing the required parameter 'campaign_id' when calling PricesApi.get_prices")
      end
      # resource path
      local_var_path = "/campaigns/{campaignId}/offer-prices".sub("{" + "campaignId" + "}", URI.encode_path(campaign_id.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["page_token"] = page_token.to_s unless page_token.nil?
      query_params["limit"] = limit.to_s unless limit.nil?
      query_params["archived"] = archived.to_s unless archived.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "GetPricesResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PricesApi.get_prices",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PricesApi#get_prices\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return GetPricesResponse.from_json(data), status_code, headers
    end

    # Просмотр цен на указанные товары в магазине
    # Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [GetPricesByOfferIdsResponse]
    def get_prices_by_offer_ids(campaign_id : Int64, page_token : String?, limit : Int32?, get_prices_by_offer_ids_request : GetPricesByOfferIdsRequest?)
      data, _status_code, _headers = get_prices_by_offer_ids_with_http_info(campaign_id, page_token, limit, get_prices_by_offer_ids_request)
      data
    end

    # Просмотр цен на указанные товары в магазине
    # Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [Array<(GetPricesByOfferIdsResponse, Integer, Hash)>] GetPricesByOfferIdsResponse data, response status code and response headers
    def get_prices_by_offer_ids_with_http_info(campaign_id : Int64, page_token : String?, limit : Int32?, get_prices_by_offer_ids_request : GetPricesByOfferIdsRequest?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PricesApi.get_prices_by_offer_ids ..."}
      end
      # verify the required parameter "campaign_id" is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        raise ArgumentError.new("Missing the required parameter 'campaign_id' when calling PricesApi.get_prices_by_offer_ids")
      end
      # resource path
      local_var_path = "/campaigns/{campaignId}/offer-prices".sub("{" + "campaignId" + "}", URI.encode_path(campaign_id.to_s))

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
      post_body = get_prices_by_offer_ids_request.to_json

      # return_type
      return_type = "GetPricesByOfferIdsResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PricesApi.get_prices_by_offer_ids",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PricesApi#get_prices_by_offer_ids\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return GetPricesByOfferIdsResponse.from_json(data), status_code, headers
    end

    # Цены для продвижения товаров
    # {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param suggest_prices_request [SuggestPricesRequest] 
    # @return [SuggestPricesResponse]
    def get_suggested_prices(campaign_id : Int64, suggest_prices_request : SuggestPricesRequest)
      data, _status_code, _headers = get_suggested_prices_with_http_info(campaign_id, suggest_prices_request)
      data
    end

    # Цены для продвижения товаров
    # {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param suggest_prices_request [SuggestPricesRequest] 
    # @return [Array<(SuggestPricesResponse, Integer, Hash)>] SuggestPricesResponse data, response status code and response headers
    def get_suggested_prices_with_http_info(campaign_id : Int64, suggest_prices_request : SuggestPricesRequest)
      if @api_client.config.debugging
        Log.debug {"Calling API: PricesApi.get_suggested_prices ..."}
      end
      # verify the required parameter "campaign_id" is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        raise ArgumentError.new("Missing the required parameter 'campaign_id' when calling PricesApi.get_suggested_prices")
      end
      # verify the required parameter "suggest_prices_request" is set
      if @api_client.config.client_side_validation && suggest_prices_request.nil?
        raise ArgumentError.new("Missing the required parameter 'suggest_prices_request' when calling PricesApi.get_suggested_prices")
      end
      # resource path
      local_var_path = "/campaigns/{campaignId}/offer-prices/suggestions".sub("{" + "campaignId" + "}", URI.encode_path(campaign_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = suggest_prices_request.to_json

      # return_type
      return_type = "SuggestPricesResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PricesApi.get_suggested_prices",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PricesApi#get_suggested_prices\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return SuggestPricesResponse.from_json(data), status_code, headers
    end

    # Установка цен на товары во всех магазинах
    # Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_business_prices_request [UpdateBusinessPricesRequest] 
    # @return [EmptyApiResponse]
    def update_business_prices(business_id : Int64, update_business_prices_request : UpdateBusinessPricesRequest)
      data, _status_code, _headers = update_business_prices_with_http_info(business_id, update_business_prices_request)
      data
    end

    # Установка цен на товары во всех магазинах
    # Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_business_prices_request [UpdateBusinessPricesRequest] 
    # @return [Array<(EmptyApiResponse, Integer, Hash)>] EmptyApiResponse data, response status code and response headers
    def update_business_prices_with_http_info(business_id : Int64, update_business_prices_request : UpdateBusinessPricesRequest)
      if @api_client.config.debugging
        Log.debug {"Calling API: PricesApi.update_business_prices ..."}
      end
      # verify the required parameter "business_id" is set
      if @api_client.config.client_side_validation && business_id.nil?
        raise ArgumentError.new("Missing the required parameter 'business_id' when calling PricesApi.update_business_prices")
      end
      # verify the required parameter "update_business_prices_request" is set
      if @api_client.config.client_side_validation && update_business_prices_request.nil?
        raise ArgumentError.new("Missing the required parameter 'update_business_prices_request' when calling PricesApi.update_business_prices")
      end
      # resource path
      local_var_path = "/businesses/{businessId}/offer-prices/updates".sub("{" + "businessId" + "}", URI.encode_path(business_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = update_business_prices_request.to_json

      # return_type
      return_type = "EmptyApiResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PricesApi.update_business_prices",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PricesApi#update_business_prices\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return EmptyApiResponse.from_json(data), status_code, headers
    end

    # Установка цен на товары в конкретном магазине
    # Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_prices_request [UpdatePricesRequest] 
    # @return [EmptyApiResponse]
    def update_prices(campaign_id : Int64, update_prices_request : UpdatePricesRequest)
      data, _status_code, _headers = update_prices_with_http_info(campaign_id, update_prices_request)
      data
    end

    # Установка цен на товары в конкретном магазине
    # Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    # @param campaign_id [Int64] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_prices_request [UpdatePricesRequest] 
    # @return [Array<(EmptyApiResponse, Integer, Hash)>] EmptyApiResponse data, response status code and response headers
    def update_prices_with_http_info(campaign_id : Int64, update_prices_request : UpdatePricesRequest)
      if @api_client.config.debugging
        Log.debug {"Calling API: PricesApi.update_prices ..."}
      end
      # verify the required parameter "campaign_id" is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        raise ArgumentError.new("Missing the required parameter 'campaign_id' when calling PricesApi.update_prices")
      end
      # verify the required parameter "update_prices_request" is set
      if @api_client.config.client_side_validation && update_prices_request.nil?
        raise ArgumentError.new("Missing the required parameter 'update_prices_request' when calling PricesApi.update_prices")
      end
      # resource path
      local_var_path = "/campaigns/{campaignId}/offer-prices/updates".sub("{" + "campaignId" + "}", URI.encode_path(campaign_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = update_prices_request.to_json

      # return_type
      return_type = "EmptyApiResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PricesApi.update_prices",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PricesApi#update_prices\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return EmptyApiResponse.from_json(data), status_code, headers
    end
  end
end

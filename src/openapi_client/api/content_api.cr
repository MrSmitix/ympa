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
  class ContentApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Списки характеристик товаров по категориям
    # Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    # @param category_id [Int64] Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    # @return [GetCategoryContentParametersResponse]
    def get_category_content_parameters(category_id : Int64)
      data, _status_code, _headers = get_category_content_parameters_with_http_info(category_id)
      data
    end

    # Списки характеристик товаров по категориям
    # Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    # @param category_id [Int64] Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    # @return [Array<(GetCategoryContentParametersResponse, Integer, Hash)>] GetCategoryContentParametersResponse data, response status code and response headers
    def get_category_content_parameters_with_http_info(category_id : Int64)
      if @api_client.config.debugging
        Log.debug {"Calling API: ContentApi.get_category_content_parameters ..."}
      end
      # verify the required parameter "category_id" is set
      if @api_client.config.client_side_validation && category_id.nil?
        raise ArgumentError.new("Missing the required parameter 'category_id' when calling ContentApi.get_category_content_parameters")
      end
      # resource path
      local_var_path = "/category/{categoryId}/parameters".sub("{" + "categoryId" + "}", URI.encode_path(category_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "GetCategoryContentParametersResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"ContentApi.get_category_content_parameters",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: ContentApi#get_category_content_parameters\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return GetCategoryContentParametersResponse.from_json(data), status_code, headers
    end

    # Получение информации о заполненности карточек магазина
    # Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [GetOfferCardsContentStatusResponse]
    def get_offer_cards_content_status(business_id : Int64, page_token : String?, limit : Int32?, get_offer_cards_content_status_request : GetOfferCardsContentStatusRequest?)
      data, _status_code, _headers = get_offer_cards_content_status_with_http_info(business_id, page_token, limit, get_offer_cards_content_status_request)
      data
    end

    # Получение информации о заполненности карточек магазина
    # Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @return [Array<(GetOfferCardsContentStatusResponse, Integer, Hash)>] GetOfferCardsContentStatusResponse data, response status code and response headers
    def get_offer_cards_content_status_with_http_info(business_id : Int64, page_token : String?, limit : Int32?, get_offer_cards_content_status_request : GetOfferCardsContentStatusRequest?)
      if @api_client.config.debugging
        Log.debug {"Calling API: ContentApi.get_offer_cards_content_status ..."}
      end
      # verify the required parameter "business_id" is set
      if @api_client.config.client_side_validation && business_id.nil?
        raise ArgumentError.new("Missing the required parameter 'business_id' when calling ContentApi.get_offer_cards_content_status")
      end
      # resource path
      local_var_path = "/businesses/{businessId}/offer-cards".sub("{" + "businessId" + "}", URI.encode_path(business_id.to_s))

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
      post_body = get_offer_cards_content_status_request.to_json

      # return_type
      return_type = "GetOfferCardsContentStatusResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"ContentApi.get_offer_cards_content_status",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: ContentApi#get_offer_cards_content_status\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return GetOfferCardsContentStatusResponse.from_json(data), status_code, headers
    end

    # Редактирование категорийных характеристик товара
    # Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_offer_content_request [UpdateOfferContentRequest] 
    # @return [UpdateOfferContentResponse]
    def update_offer_content(business_id : Int64, update_offer_content_request : UpdateOfferContentRequest)
      data, _status_code, _headers = update_offer_content_with_http_info(business_id, update_offer_content_request)
      data
    end

    # Редактирование категорийных характеристик товара
    # Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    # @param business_id [Int64] Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_offer_content_request [UpdateOfferContentRequest] 
    # @return [Array<(UpdateOfferContentResponse, Integer, Hash)>] UpdateOfferContentResponse data, response status code and response headers
    def update_offer_content_with_http_info(business_id : Int64, update_offer_content_request : UpdateOfferContentRequest)
      if @api_client.config.debugging
        Log.debug {"Calling API: ContentApi.update_offer_content ..."}
      end
      # verify the required parameter "business_id" is set
      if @api_client.config.client_side_validation && business_id.nil?
        raise ArgumentError.new("Missing the required parameter 'business_id' when calling ContentApi.update_offer_content")
      end
      # verify the required parameter "update_offer_content_request" is set
      if @api_client.config.client_side_validation && update_offer_content_request.nil?
        raise ArgumentError.new("Missing the required parameter 'update_offer_content_request' when calling ContentApi.update_offer_content")
      end
      # resource path
      local_var_path = "/businesses/{businessId}/offer-cards/update".sub("{" + "businessId" + "}", URI.encode_path(business_id.to_s))

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
      post_body = update_offer_content_request.to_json

      # return_type
      return_type = "UpdateOfferContentResponse"

      # auth_names
      auth_names = ["OAuth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"ContentApi.update_offer_content",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: ContentApi#update_offer_content\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return UpdateOfferContentResponse.from_json(data), status_code, headers
    end
  end
end

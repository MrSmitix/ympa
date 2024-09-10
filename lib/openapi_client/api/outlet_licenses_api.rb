=begin
#Партнерский API Маркета

#API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech
Generator version: 7.8.0

=end

require 'cgi'

module OpenapiClient
  class OutletLicensesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Удаление лицензий для точек продаж
    # Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :ids Список идентификаторов лицензий.
    # @return [EmptyApiResponse]
    def delete_outlet_licenses(campaign_id, opts = {})
      data, _status_code, _headers = delete_outlet_licenses_with_http_info(campaign_id, opts)
      data
    end

    # Удаление лицензий для точек продаж
    # Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :ids Список идентификаторов лицензий.
    # @return [Array<(EmptyApiResponse, Integer, Hash)>] EmptyApiResponse data, response status code and response headers
    def delete_outlet_licenses_with_http_info(campaign_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OutletLicensesApi.delete_outlet_licenses ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OutletLicensesApi.delete_outlet_licenses"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/outlets/licenses'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'ids'] = @api_client.build_collection_param(opts[:'ids'], :csv) if !opts[:'ids'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'EmptyApiResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OutletLicensesApi.delete_outlet_licenses",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OutletLicensesApi#delete_outlet_licenses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Информация о лицензиях для точек продаж
    # Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :outlet_ids Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке. 
    # @option opts [Array<Integer>] :ids Список идентификаторов лицензий.
    # @return [GetOutletLicensesResponse]
    def get_outlet_licenses(campaign_id, opts = {})
      data, _status_code, _headers = get_outlet_licenses_with_http_info(campaign_id, opts)
      data
    end

    # Информация о лицензиях для точек продаж
    # Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Integer>] :outlet_ids Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке. 
    # @option opts [Array<Integer>] :ids Список идентификаторов лицензий.
    # @return [Array<(GetOutletLicensesResponse, Integer, Hash)>] GetOutletLicensesResponse data, response status code and response headers
    def get_outlet_licenses_with_http_info(campaign_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OutletLicensesApi.get_outlet_licenses ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OutletLicensesApi.get_outlet_licenses"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/outlets/licenses'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'outletIds'] = @api_client.build_collection_param(opts[:'outlet_ids'], :csv) if !opts[:'outlet_ids'].nil?
      query_params[:'ids'] = @api_client.build_collection_param(opts[:'ids'], :csv) if !opts[:'ids'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'GetOutletLicensesResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OutletLicensesApi.get_outlet_licenses",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OutletLicensesApi#get_outlet_licenses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Создание и изменение лицензий для точек продаж
    # Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_outlet_license_request [UpdateOutletLicenseRequest] 
    # @param [Hash] opts the optional parameters
    # @return [EmptyApiResponse]
    def update_outlet_licenses(campaign_id, update_outlet_license_request, opts = {})
      data, _status_code, _headers = update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request, opts)
      data
    end

    # Создание и изменение лицензий для точек продаж
    # Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param update_outlet_license_request [UpdateOutletLicenseRequest] 
    # @param [Hash] opts the optional parameters
    # @return [Array<(EmptyApiResponse, Integer, Hash)>] EmptyApiResponse data, response status code and response headers
    def update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OutletLicensesApi.update_outlet_licenses ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OutletLicensesApi.update_outlet_licenses"
      end
      # verify the required parameter 'update_outlet_license_request' is set
      if @api_client.config.client_side_validation && update_outlet_license_request.nil?
        fail ArgumentError, "Missing the required parameter 'update_outlet_license_request' when calling OutletLicensesApi.update_outlet_licenses"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/outlets/licenses'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(update_outlet_license_request)

      # return_type
      return_type = opts[:debug_return_type] || 'EmptyApiResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OutletLicensesApi.update_outlet_licenses",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OutletLicensesApi#update_outlet_licenses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

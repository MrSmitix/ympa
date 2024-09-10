=begin
#Партнерский API Маркета

#API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech
Generator version: 7.8.0

=end

require 'cgi'

module OpenapiClient
  class OrderLabelsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Готовый ярлык‑наклейка для коробки в заказе
    # Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param shipment_id [Integer] Идентификатор грузоместа.
    # @param box_id [Integer] Идентификатор коробки.
    # @param [Hash] opts the optional parameters
    # @option opts [PageFormatType] :format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    # @return [File]
    def generate_order_label(campaign_id, order_id, shipment_id, box_id, opts = {})
      data, _status_code, _headers = generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts)
      data
    end

    # Готовый ярлык‑наклейка для коробки в заказе
    # Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param shipment_id [Integer] Идентификатор грузоместа.
    # @param box_id [Integer] Идентификатор коробки.
    # @param [Hash] opts the optional parameters
    # @option opts [PageFormatType] :format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    # @return [Array<(File, Integer, Hash)>] File data, response status code and response headers
    def generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrderLabelsApi.generate_order_label ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OrderLabelsApi.generate_order_label"
      end
      # verify the required parameter 'order_id' is set
      if @api_client.config.client_side_validation && order_id.nil?
        fail ArgumentError, "Missing the required parameter 'order_id' when calling OrderLabelsApi.generate_order_label"
      end
      # verify the required parameter 'shipment_id' is set
      if @api_client.config.client_side_validation && shipment_id.nil?
        fail ArgumentError, "Missing the required parameter 'shipment_id' when calling OrderLabelsApi.generate_order_label"
      end
      # verify the required parameter 'box_id' is set
      if @api_client.config.client_side_validation && box_id.nil?
        fail ArgumentError, "Missing the required parameter 'box_id' when calling OrderLabelsApi.generate_order_label"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s)).sub('{' + 'orderId' + '}', CGI.escape(order_id.to_s)).sub('{' + 'shipmentId' + '}', CGI.escape(shipment_id.to_s)).sub('{' + 'boxId' + '}', CGI.escape(box_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'format'] = opts[:'format'] if !opts[:'format'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/pdf', 'application/json']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'File'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OrderLabelsApi.generate_order_label",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrderLabelsApi#generate_order_label\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Готовые ярлыки‑наклейки на все коробки в одном заказе
    # Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param [Hash] opts the optional parameters
    # @option opts [PageFormatType] :format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    # @return [File]
    def generate_order_labels(campaign_id, order_id, opts = {})
      data, _status_code, _headers = generate_order_labels_with_http_info(campaign_id, order_id, opts)
      data
    end

    # Готовые ярлыки‑наклейки на все коробки в одном заказе
    # Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param [Hash] opts the optional parameters
    # @option opts [PageFormatType] :format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    # @return [Array<(File, Integer, Hash)>] File data, response status code and response headers
    def generate_order_labels_with_http_info(campaign_id, order_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrderLabelsApi.generate_order_labels ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OrderLabelsApi.generate_order_labels"
      end
      # verify the required parameter 'order_id' is set
      if @api_client.config.client_side_validation && order_id.nil?
        fail ArgumentError, "Missing the required parameter 'order_id' when calling OrderLabelsApi.generate_order_labels"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/orders/{orderId}/delivery/labels'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s)).sub('{' + 'orderId' + '}', CGI.escape(order_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'format'] = opts[:'format'] if !opts[:'format'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/pdf', 'application/json']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'File'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OrderLabelsApi.generate_order_labels",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrderLabelsApi#generate_order_labels\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Данные для самостоятельного изготовления ярлыков
    # Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param [Hash] opts the optional parameters
    # @return [GetOrderLabelsDataResponse]
    def get_order_labels_data(campaign_id, order_id, opts = {})
      data, _status_code, _headers = get_order_labels_data_with_http_info(campaign_id, order_id, opts)
      data
    end

    # Данные для самостоятельного изготовления ярлыков
    # Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    # @param campaign_id [Integer] Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    # @param order_id [Integer] Идентификатор заказа.
    # @param [Hash] opts the optional parameters
    # @return [Array<(GetOrderLabelsDataResponse, Integer, Hash)>] GetOrderLabelsDataResponse data, response status code and response headers
    def get_order_labels_data_with_http_info(campaign_id, order_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrderLabelsApi.get_order_labels_data ...'
      end
      # verify the required parameter 'campaign_id' is set
      if @api_client.config.client_side_validation && campaign_id.nil?
        fail ArgumentError, "Missing the required parameter 'campaign_id' when calling OrderLabelsApi.get_order_labels_data"
      end
      # verify the required parameter 'order_id' is set
      if @api_client.config.client_side_validation && order_id.nil?
        fail ArgumentError, "Missing the required parameter 'order_id' when calling OrderLabelsApi.get_order_labels_data"
      end
      # resource path
      local_var_path = '/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data'.sub('{' + 'campaignId' + '}', CGI.escape(campaign_id.to_s)).sub('{' + 'orderId' + '}', CGI.escape(order_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'GetOrderLabelsDataResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"OrderLabelsApi.get_order_labels_data",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrderLabelsApi#get_order_labels_data\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

=begin
#Партнерский API Маркета

#API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech
Generator version: 7.8.0

=end

require 'cgi'

module OpenapiClient
  class DeliveryServicesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Справочник служб доставки
    # Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    # @param [Hash] opts the optional parameters
    # @return [GetDeliveryServicesResponse]
    def get_delivery_services(opts = {})
      data, _status_code, _headers = get_delivery_services_with_http_info(opts)
      data
    end

    # Справочник служб доставки
    # Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    # @param [Hash] opts the optional parameters
    # @return [Array<(GetDeliveryServicesResponse, Integer, Hash)>] GetDeliveryServicesResponse data, response status code and response headers
    def get_delivery_services_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DeliveryServicesApi.get_delivery_services ...'
      end
      # resource path
      local_var_path = '/delivery/services'

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
      return_type = opts[:debug_return_type] || 'GetDeliveryServicesResponse'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['OAuth']

      new_options = opts.merge(
        :operation => :"DeliveryServicesApi.get_delivery_services",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DeliveryServicesApi#get_delivery_services\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

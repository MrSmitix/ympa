# OpenapiClient::TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**calculate_tariffs**](TariffsApi.md#calculate_tariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |


## calculate_tariffs

> <CalculateTariffsResponse> calculate_tariffs(calculate_tariffs_request)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::TariffsApi.new
calculate_tariffs_request = OpenapiClient::CalculateTariffsRequest.new({parameters: OpenapiClient::CalculateTariffsParametersDTO.new, offers: [OpenapiClient::CalculateTariffsOfferDTO.new({category_id: 3.56, price: 3.56, length: 3.56, width: 3.56, height: 3.56, weight: 3.56})]}) # CalculateTariffsRequest | 

begin
  # Калькулятор стоимости услуг
  result = api_instance.calculate_tariffs(calculate_tariffs_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling TariffsApi->calculate_tariffs: #{e}"
end
```

#### Using the calculate_tariffs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CalculateTariffsResponse>, Integer, Hash)> calculate_tariffs_with_http_info(calculate_tariffs_request)

```ruby
begin
  # Калькулятор стоимости услуг
  data, status_code, headers = api_instance.calculate_tariffs_with_http_info(calculate_tariffs_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CalculateTariffsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling TariffsApi->calculate_tariffs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **calculate_tariffs_request** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md) |  |  |

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


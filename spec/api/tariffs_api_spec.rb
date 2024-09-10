=begin
#Партнерский API Маркета

#API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech
Generator version: 7.8.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::TariffsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'TariffsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::TariffsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TariffsApi' do
    it 'should create an instance of TariffsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::TariffsApi)
    end
  end

  # unit tests for calculate_tariffs
  # Калькулятор стоимости услуг
  # Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
  # @param calculate_tariffs_request 
  # @param [Hash] opts the optional parameters
  # @return [CalculateTariffsResponse]
  describe 'calculate_tariffs test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end

# #Партнерский API Маркета
#
##API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
#
#The version of the OpenAPI document: LATEST
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.8.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::PromosApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "PromosApi" do
  describe "test an instance of PromosApi" do
    it "should create an instance of PromosApi" do
      api_instance = OpenAPIClient::PromosApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::PromosApi)
    end
  end

  # unit tests for delete_promo_offers
  # Удаление товаров из акции
  # Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param delete_promo_offers_request 
  # @param [Hash] opts the optional parameters
  # @return [DeletePromoOffersResponse]
  describe "delete_promo_offers test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_promo_offers
  # Получение списка товаров, которые участвуют или могут участвовать в акции
  # Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param get_promo_offers_request 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
  # @option opts [Int32] :limit Количество значений на одной странице. 
  # @return [GetPromoOffersResponse]
  describe "get_promo_offers test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_promos
  # Получение списка акций
  # Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param [Hash] opts the optional parameters
  # @option opts [GetPromosRequest] :get_promos_request 
  # @return [GetPromosResponse]
  describe "get_promos test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for update_promo_offers
  # Добавление товаров в акцию или изменение их цен
  # Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param update_promo_offers_request 
  # @param [Hash] opts the optional parameters
  # @return [UpdatePromoOffersResponse]
  describe "update_promo_offers test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end

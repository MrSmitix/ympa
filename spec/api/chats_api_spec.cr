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

# Unit tests for OpenAPIClient::ChatsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "ChatsApi" do
  describe "test an instance of ChatsApi" do
    it "should create an instance of ChatsApi" do
      api_instance = OpenAPIClient::ChatsApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::ChatsApi)
    end
  end

  # unit tests for create_chat
  # Создание нового чата с покупателем
  # Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param create_chat_request description
  # @param [Hash] opts the optional parameters
  # @return [CreateChatResponse]
  describe "create_chat test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_chat_history
  # Получение истории сообщений в чате
  # Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param chat_id Идентификатор чата.
  # @param get_chat_history_request description
  # @param [Hash] opts the optional parameters
  # @option opts [String] :page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
  # @option opts [Int32] :limit Количество значений на одной странице. 
  # @return [GetChatHistoryResponse]
  describe "get_chat_history test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_chats
  # Получение доступных чатов
  # Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param get_chats_request description
  # @param [Hash] opts the optional parameters
  # @option opts [String] :page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
  # @option opts [Int32] :limit Количество значений на одной странице. 
  # @return [GetChatsResponse]
  describe "get_chats test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for send_file_to_chat
  # Отправка файла в чат
  # Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param chat_id Идентификатор чата.
  # @param file Содержимое файла. Максимальный размер файла — 5 Мбайт.
  # @param [Hash] opts the optional parameters
  # @return [EmptyApiResponse]
  describe "send_file_to_chat test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for send_message_to_chat
  # Отправка сообщения в чат
  # Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
  # @param business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  # @param chat_id Идентификатор чата.
  # @param send_message_to_chat_request description
  # @param [Hash] opts the optional parameters
  # @return [EmptyApiResponse]
  describe "send_message_to_chat test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end

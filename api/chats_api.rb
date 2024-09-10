require 'json'


MyApp.add_route('POST', '/businesses/{businessId}/chats/new', {
  "resourcePath" => "/Chats",
  "summary" => "Создание нового чата с покупателем",
  "nickname" => "create_chat",
  "responseClass" => "CreateChatResponse",
  "endpoint" => "/businesses/{businessId}/chats/new",
  "notes" => "Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "description",
      "dataType" => "CreateChatRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/businesses/{businessId}/chats/history', {
  "resourcePath" => "/Chats",
  "summary" => "Получение истории сообщений в чате",
  "nickname" => "get_chat_history",
  "responseClass" => "GetChatHistoryResponse",
  "endpoint" => "/businesses/{businessId}/chats/history",
  "notes" => "Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "chat_id",
      "description" => "Идентификатор чата.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_token",
      "description" => "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Количество значений на одной странице. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "description",
      "dataType" => "GetChatHistoryRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/businesses/{businessId}/chats', {
  "resourcePath" => "/Chats",
  "summary" => "Получение доступных чатов",
  "nickname" => "get_chats",
  "responseClass" => "GetChatsResponse",
  "endpoint" => "/businesses/{businessId}/chats",
  "notes" => "Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "page_token",
      "description" => "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Количество значений на одной странице. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "description",
      "dataType" => "GetChatsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/businesses/{businessId}/chats/file/send', {
  "resourcePath" => "/Chats",
  "summary" => "Отправка файла в чат",
  "nickname" => "send_file_to_chat",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/businesses/{businessId}/chats/file/send",
  "notes" => "Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "chat_id",
      "description" => "Идентификатор чата.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/businesses/{businessId}/chats/message', {
  "resourcePath" => "/Chats",
  "summary" => "Отправка сообщения в чат",
  "nickname" => "send_message_to_chat",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/businesses/{businessId}/chats/message",
  "notes" => "Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "chat_id",
      "description" => "Идентификатор чата.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "description",
      "dataType" => "SendMessageToChatRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


require 'json'


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}', {
  "resourcePath" => "/Returns",
  "summary" => "Информация о невыкупе или возврате",
  "nickname" => "get_return",
  "responseClass" => "GetReturnResponse",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}",
  "notes" => "Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "return_id",
      "description" => "Идентификатор возврата.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application', {
  "resourcePath" => "/Returns",
  "summary" => "Получение заявления на возврат",
  "nickname" => "get_return_application",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application",
  "notes" => "Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "return_id",
      "description" => "Идентификатор возврата.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}', {
  "resourcePath" => "/Returns",
  "summary" => "Получение фотографии возврата",
  "nickname" => "get_return_photo",
  "responseClass" => "File",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}",
  "notes" => "Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "return_id",
      "description" => "Идентификатор возврата.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "item_id",
      "description" => "Идентификатор товара в возврате.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "image_hash",
      "description" => "Хеш ссылки изображения для загрузки.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/returns', {
  "resourcePath" => "/Returns",
  "summary" => "Список невыкупов и возвратов",
  "nickname" => "get_returns",
  "responseClass" => "GetReturnsResponse",
  "endpoint" => "/campaigns/{campaignId}/returns",
  "notes" => "Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
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
      "name" => "order_ids",
      "description" => "Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "statuses",
      "description" => "Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. ",
      "dataType" => "Array<RefundStatusType>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. ",
      "dataType" => "ReturnType",
      "allowableValues" => "[UNREDEEMED, RETURN]",
      "paramType" => "query",
    },
    {
      "name" => "from_date",
      "description" => "Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "to_date",
      "description" => "Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "from_date2",
      "description" => "{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. ",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "to_date2",
      "description" => "{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. ",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision', {
  "resourcePath" => "/Returns",
  "summary" => "Принятие или изменение решения по возврату",
  "nickname" => "set_return_decision",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision",
  "notes" => "Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "return_id",
      "description" => "Идентификатор возврата.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SetReturnDecisionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit', {
  "resourcePath" => "/Returns",
  "summary" => "Подтверждение решения по возврату",
  "nickname" => "submit_return_decision",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit",
  "notes" => "Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "Идентификатор заказа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "return_id",
      "description" => "Идентификатор возврата.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


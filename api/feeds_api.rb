require 'json'


MyApp.add_route('GET', '/campaigns/{campaignId}/feeds/{feedId}', {
  "resourcePath" => "/Feeds",
  "summary" => "Информация о прайс-листе",
  "nickname" => "get_feed",
  "responseClass" => "GetFeedResponse",
  "endpoint" => "/campaigns/{campaignId}/feeds/{feedId}",
  "notes" => "{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "feed_id",
      "description" => "Идентификатор прайс-листа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/feeds/{feedId}/index-logs', {
  "resourcePath" => "/Feeds",
  "summary" => "Отчет по индексации прайс-листа",
  "nickname" => "get_feed_index_logs",
  "responseClass" => "GetFeedIndexLogsResponse",
  "endpoint" => "/campaigns/{campaignId}/feeds/{feedId}/index-logs",
  "notes" => "{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "Количество значений на одной странице. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "published_time_from",
      "description" => "Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. ",
      "dataType" => "Time",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "published_time_to",
      "description" => "Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} ",
      "dataType" => "Time",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "status",
      "description" => "Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. ",
      "dataType" => "FeedIndexLogsStatusType",
      "allowableValues" => "[ERROR, OK, WARNING]",
      "paramType" => "query",
    },
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "feed_id",
      "description" => "Идентификатор прайс-листа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/campaigns/{campaignId}/feeds', {
  "resourcePath" => "/Feeds",
  "summary" => "Список прайс-листов магазина",
  "nickname" => "get_feeds",
  "responseClass" => "GetFeedsResponse",
  "endpoint" => "/campaigns/{campaignId}/feeds",
  "notes" => "{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
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


MyApp.add_route('POST', '/campaigns/{campaignId}/feeds/{feedId}/refresh', {
  "resourcePath" => "/Feeds",
  "summary" => "Сообщить, что прайс-лист обновился",
  "nickname" => "refresh_feed",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/feeds/{feedId}/refresh",
  "notes" => "{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "feed_id",
      "description" => "Идентификатор прайс-листа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/campaigns/{campaignId}/feeds/{feedId}/params', {
  "resourcePath" => "/Feeds",
  "summary" => "Изменение параметров прайс-листа",
  "nickname" => "set_feed_params",
  "responseClass" => "EmptyApiResponse",
  "endpoint" => "/campaigns/{campaignId}/feeds/{feedId}/params",
  "notes" => "{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| ",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "feed_id",
      "description" => "Идентификатор прайс-листа.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SetFeedParamsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


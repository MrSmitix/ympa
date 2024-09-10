# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Api.Feeds do
  @moduledoc """
  API calls for all endpoints tagged `Feeds`.
  """

  alias ПартнерскийAPIМаркета.Connection
  import ПартнерскийAPIМаркета.RequestBuilder

  @doc """
  Информация о прайс-листе
  {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `campaign_id` (integer()): Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  - `feed_id` (integer()): Идентификатор прайс-листа.
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GetFeedResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_feed(Tesla.Env.client, integer(), integer(), keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GetFeedResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def get_feed(connection, campaign_id, feed_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/campaigns/#{campaign_id}/feeds/#{feed_id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GetFeedResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по индексации прайс-листа
  {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `campaign_id` (integer()): Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  - `feed_id` (integer()): Идентификатор прайс-листа.
  - `opts` (keyword): Optional parameters
    - `:limit` (integer()): Количество значений на одной странице. 
    - `:published_time_from` (DateTime.t): Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса. 
    - `:published_time_to` (DateTime.t): Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %} 
    - `:status` (FeedIndexLogsStatusType): Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GetFeedIndexLogsResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_feed_index_logs(Tesla.Env.client, integer(), integer(), keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GetFeedIndexLogsResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def get_feed_index_logs(connection, campaign_id, feed_id, opts \\ []) do
    optional_params = %{
      :limit => :query,
      :published_time_from => :query,
      :published_time_to => :query,
      :status => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/campaigns/#{campaign_id}/feeds/#{feed_id}/index-logs")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GetFeedIndexLogsResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Список прайс-листов магазина
  {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `campaign_id` (integer()): Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GetFeedsResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_feeds(Tesla.Env.client, integer(), keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.GetFeedsResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def get_feeds(connection, campaign_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/campaigns/#{campaign_id}/feeds")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GetFeedsResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Сообщить, что прайс-лист обновился
  {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `campaign_id` (integer()): Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  - `feed_id` (integer()): Идентификатор прайс-листа.
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.EmptyApiResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec refresh_feed(Tesla.Env.client, integer(), integer(), keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.EmptyApiResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def refresh_feed(connection, campaign_id, feed_id, _opts \\ []) do
    request =
      %{}
      |> method(:post)
      |> url("/campaigns/#{campaign_id}/feeds/#{feed_id}/refresh")
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.EmptyApiResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Изменение параметров прайс-листа
  {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `campaign_id` (integer()): Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
  - `feed_id` (integer()): Идентификатор прайс-листа.
  - `set_feed_params_request` (SetFeedParamsRequest): 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.EmptyApiResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec set_feed_params(Tesla.Env.client, integer(), integer(), ПартнерскийAPIМаркета.Model.SetFeedParamsRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.EmptyApiResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLockedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def set_feed_params(connection, campaign_id, feed_id, set_feed_params_request, _opts \\ []) do
    request =
      %{}
      |> method(:post)
      |> url("/campaigns/#{campaign_id}/feeds/#{feed_id}/params")
      |> add_param(:body, :body, set_feed_params_request)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.EmptyApiResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {423, ПартнерскийAPIМаркета.Model.ApiLockedErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end
end

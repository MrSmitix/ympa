# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Api.Reports do
  @moduledoc """
  API calls for all endpoints tagged `Reports`.
  """

  alias ПартнерскийAPIМаркета.Connection
  import ПартнерскийAPIМаркета.RequestBuilder

  @doc """
  Отчет по бусту продаж
  Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_boost_consolidated_request` (GenerateBoostConsolidatedRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_boost_consolidated_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateBoostConsolidatedRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_boost_consolidated_report(connection, generate_boost_consolidated_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/boost-consolidated/generate")
      |> add_param(:body, :body, generate_boost_consolidated_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет «Конкурентная позиция»
  Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_competitors_position_report_request` (GenerateCompetitorsPositionReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_competitors_position_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateCompetitorsPositionReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_competitors_position_report(connection, generate_competitors_position_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/competitors-position/generate")
      |> add_param(:body, :body, generate_competitors_position_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по отзывам о товарах
  Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_goods_feedback_request` (GenerateGoodsFeedbackRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_goods_feedback_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateGoodsFeedbackRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_goods_feedback_report(connection, generate_goods_feedback_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/goods-feedback/generate")
      |> add_param(:body, :body, generate_goods_feedback_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по движению товаров
  Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_goods_movement_report_request` (GenerateGoodsMovementReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_goods_movement_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateGoodsMovementReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_goods_movement_report(connection, generate_goods_movement_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/goods-movement/generate")
      |> add_param(:body, :body, generate_goods_movement_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по реализации
  Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_goods_realization_report_request` (GenerateGoodsRealizationReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_goods_realization_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateGoodsRealizationReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_goods_realization_report(connection, generate_goods_realization_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/goods-realization/generate")
      |> add_param(:body, :body, generate_goods_realization_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по оборачиваемости
  Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_goods_turnover_request` (GenerateGoodsTurnoverRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_goods_turnover_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateGoodsTurnoverRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_goods_turnover_report(connection, generate_goods_turnover_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/goods-turnover/generate")
      |> add_param(:body, :body, generate_goods_turnover_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_mass_order_labels_request` (GenerateMassOrderLabelsRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (PageFormatType): Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_mass_order_labels_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateMassOrderLabelsRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_mass_order_labels_report(connection, generate_mass_order_labels_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/documents/labels/generate")
      |> add_param(:body, :body, generate_mass_order_labels_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет «Цены на рынке»
  Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_prices_report_request` (GeneratePricesReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_prices_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GeneratePricesReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_prices_report(connection, generate_prices_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/prices/generate")
      |> add_param(:body, :body, generate_prices_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по полкам
  Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_shelfs_statistics_request` (GenerateShelfsStatisticsRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_shelfs_statistics_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateShelfsStatisticsRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_shelfs_statistics_report(connection, generate_shelfs_statistics_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/shelf-statistics/generate")
      |> add_param(:body, :body, generate_shelfs_statistics_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Получение листа сборки
  Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_shipment_list_document_report_request` (GenerateShipmentListDocumentReportRequest): 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_shipment_list_document_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateShipmentListDocumentReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_shipment_list_document_report(connection, generate_shipment_list_document_report_request, _opts \\ []) do
    request =
      %{}
      |> method(:post)
      |> url("/reports/documents/shipment-list/generate")
      |> add_param(:body, :body, generate_shipment_list_document_report_request)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет «Аналитика продаж»
  Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_shows_sales_report_request` (GenerateShowsSalesReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_shows_sales_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateShowsSalesReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_shows_sales_report(connection, generate_shows_sales_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/shows-sales/generate")
      |> add_param(:body, :body, generate_shows_sales_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по остаткам на складах
  Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_stocks_on_warehouses_report_request` (GenerateStocksOnWarehousesReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_stocks_on_warehouses_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateStocksOnWarehousesReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_stocks_on_warehouses_report(connection, generate_stocks_on_warehouses_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/stocks-on-warehouses/generate")
      |> add_param(:body, :body, generate_stocks_on_warehouses_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по стоимости услуг
  Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_united_marketplace_services_report_request` (GenerateUnitedMarketplaceServicesReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_united_marketplace_services_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateUnitedMarketplaceServicesReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_united_marketplace_services_report(connection, generate_united_marketplace_services_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/united-marketplace-services/generate")
      |> add_param(:body, :body, generate_united_marketplace_services_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по платежам
  Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_united_netting_report_request` (GenerateUnitedNettingReportRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_united_netting_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateUnitedNettingReportRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_united_netting_report(connection, generate_united_netting_report_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/united-netting/generate")
      |> add_param(:body, :body, generate_united_netting_report_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Отчет по заказам
  Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `generate_united_orders_request` (GenerateUnitedOrdersRequest): 
  - `opts` (keyword): Optional parameters
    - `:format` (ReportFormatType): Формат отчета.

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec generate_united_orders_report(Tesla.Env.client, ПартнерскийAPIМаркета.Model.GenerateUnitedOrdersRequest.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.GenerateReportResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def generate_united_orders_report(connection, generate_united_orders_request, opts \\ []) do
    optional_params = %{
      :format => :query
    }

    request =
      %{}
      |> method(:post)
      |> url("/reports/united-orders/generate")
      |> add_param(:body, :body, generate_united_orders_request)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GenerateReportResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end

  @doc """
  Получение заданного отчета
  Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

  ### Parameters

  - `connection` (ПартнерскийAPIМаркета.Connection): Connection to server
  - `report_id` (String.t): Идентификатор отчета, который вы получили после запуска генерации. 
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, ПартнерскийAPIМаркета.Model.GetReportInfoResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_report_info(Tesla.Env.client, String.t, keyword()) :: {:ok, ПартнерскийAPIМаркета.Model.GetReportInfoResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse.t} | {:ok, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse.t} | {:error, Tesla.Env.t}
  def get_report_info(connection, report_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/reports/info/#{report_id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, ПартнерскийAPIМаркета.Model.GetReportInfoResponse},
      {400, ПартнерскийAPIМаркета.Model.ApiClientDataErrorResponse},
      {401, ПартнерскийAPIМаркета.Model.ApiUnauthorizedErrorResponse},
      {403, ПартнерскийAPIМаркета.Model.ApiForbiddenErrorResponse},
      {404, ПартнерскийAPIМаркета.Model.ApiNotFoundErrorResponse},
      {420, ПартнерскийAPIМаркета.Model.ApiLimitErrorResponse},
      {500, ПартнерскийAPIМаркета.Model.ApiServerErrorResponse}
    ])
  end
end

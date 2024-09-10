namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open ReportsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ReportsApiHandler
open ympa_fsharp_giraffe_server.ReportsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GenerateBoostConsolidatedRequest
open ympa_fsharp_giraffe_server.Model.GenerateCompetitorsPositionReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsFeedbackRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsMovementReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsRealizationReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsTurnoverRequest
open ympa_fsharp_giraffe_server.Model.GenerateMassOrderLabelsRequest
open ympa_fsharp_giraffe_server.Model.GeneratePricesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateReportResponse
open ympa_fsharp_giraffe_server.Model.GenerateShelfsStatisticsRequest
open ympa_fsharp_giraffe_server.Model.GenerateShipmentListDocumentReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateShowsSalesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateStocksOnWarehousesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedMarketplaceServicesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedNettingReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedOrdersRequest
open ympa_fsharp_giraffe_server.Model.GetReportInfoResponse
open ympa_fsharp_giraffe_server.Model.PageFormatType
open ympa_fsharp_giraffe_server.Model.ReportFormatType

module ReportsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsMovementReport - Отчет по движению товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-movement/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsMovementReportExample "application/json")
      // or pass a body of type GenerateGoodsMovementReportRequest
      let body = obj() :?> GenerateGoodsMovementReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsTurnoverReport - Отчет по оборачиваемости returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-turnover/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsTurnoverReportExample "application/json")
      // or pass a body of type GenerateGoodsTurnoverRequest
      let body = obj() :?> GenerateGoodsTurnoverRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 200 where Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


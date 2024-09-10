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
open FeedsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.FeedsApiHandler
open ympa_fsharp_giraffe_server.FeedsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsStatusType
open ympa_fsharp_giraffe_server.Model.GetFeedIndexLogsResponse
open ympa_fsharp_giraffe_server.Model.GetFeedResponse
open ympa_fsharp_giraffe_server.Model.GetFeedsResponse
open ympa_fsharp_giraffe_server.Model.SetFeedParamsRequest

module FeedsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 200 where Информация о прайс-листе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 200 where Отчет по индексации прайс-листа.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 200 where Список прайс-листов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 200 where Статус выполнения операции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


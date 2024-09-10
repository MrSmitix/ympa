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
open RatingsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.RatingsApiHandler
open ympa_fsharp_giraffe_server.RatingsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingDetailsResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingRequest
open ympa_fsharp_giraffe_server.Model.GetQualityRatingResponse

module RatingsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 200 where Информация о заказах, которые повлияли на индекс качества.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 200 where Значение индекса качества магазинов и его составляющие.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


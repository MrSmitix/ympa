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
open GoodsStatsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.GoodsStatsApiHandler
open ympa_fsharp_giraffe_server.GoodsStatsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsResponse

module GoodsStatsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 200 where Отчет по товарам.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


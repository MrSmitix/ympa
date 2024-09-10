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
open StocksApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.StocksApiHandler
open ympa_fsharp_giraffe_server.StocksApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksRequest
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksResponse
open ympa_fsharp_giraffe_server.Model.UpdateStocksRequest

module StocksApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 200 where Остатки товаров на складах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


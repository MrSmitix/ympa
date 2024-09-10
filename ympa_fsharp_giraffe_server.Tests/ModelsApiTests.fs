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
open ModelsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ModelsApiHandler
open ympa_fsharp_giraffe_server.ModelsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.GetModelsOffersResponse
open ympa_fsharp_giraffe_server.Model.GetModelsRequest
open ympa_fsharp_giraffe_server.Model.GetModelsResponse
open ympa_fsharp_giraffe_server.Model.SearchModelsResponse
open ympa_fsharp_giraffe_server.Model.SortOrderType

module ModelsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 200 where Информация о модели.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModel - Информация об одной модели returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 200 where Список предложений для модели.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModelOffers - Список предложений для одной модели returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/{modelId}/offers".Replace("modelId", "ADDME") + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME&count=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 200 where Информация о моделях.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModels - Информация о нескольких моделях returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?regionId=ADDME&currency=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 200 where Список предложений для моделей.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetModelsOffers - Список предложений для нескольких моделей returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models/offers" + "?regionId=ADDME&currency=ADDME&orderByPrice=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetModelsOffersExample "application/json")
      // or pass a body of type GetModelsRequest
      let body = obj() :?> GetModelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 200 where Информация о моделях.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchModels - Поиск модели товара returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/models" + "?query=ADDME&regionId=ADDME&currency=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


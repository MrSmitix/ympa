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
open CategoriesApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.CategoriesApiHandler
open ympa_fsharp_giraffe_server.CategoriesApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesResponse

module CategoriesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 200 where Лимит на установку кванта и минимального количества товаров.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 200 where Категории Маркета.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


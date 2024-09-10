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
open OutletsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.OutletsApiHandler
open ympa_fsharp_giraffe_server.OutletsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ChangeOutletRequest
open ympa_fsharp_giraffe_server.Model.CreateOutletResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOutletResponse
open ympa_fsharp_giraffe_server.Model.GetOutletsResponse

module OutletsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 200 where Информация о созданной точке продаж.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateOutlet - Создание точки продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteOutlet - Удаление точки продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 200 where Информация о точке продаж.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlet - Информация об одной точке продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 200 where Информация о точках продаж.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOutlets - Информация о нескольких точках продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets".Replace("campaignId", "ADDME") + "?pageToken=ADDME&regionId=ADDME&shopOutletCode=ADDME&regionId2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOutlet - Изменение информации о точке продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/outlets/{outletId}".Replace("campaignId", "ADDME").Replace("outletId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOutletExample "application/json")
      // or pass a body of type ChangeOutletRequest
      let body = obj() :?> ChangeOutletRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


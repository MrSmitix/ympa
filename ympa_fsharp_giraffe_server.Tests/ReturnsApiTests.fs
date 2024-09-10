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
open ReturnsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ReturnsApiHandler
open ympa_fsharp_giraffe_server.ReturnsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetReturnResponse
open ympa_fsharp_giraffe_server.Model.GetReturnsResponse
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReturnType
open ympa_fsharp_giraffe_server.Model.SetReturnDecisionRequest

module ReturnsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 200 where Детали возврата.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 200 where Заявление на возврат.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 200 where Фотография возврата.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 200 where Постраничные возвраты партнера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 200 where Детали возврата.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetReturnDecision - Принятие или изменение решения по возврату returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetReturnDecisionExample "application/json")
      // or pass a body of type SetReturnDecisionRequest
      let body = obj() :?> SetReturnDecisionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 200 where Статус выполнения операции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SubmitReturnDecision - Подтверждение решения по возврату returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


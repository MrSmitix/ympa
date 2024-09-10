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
open OrderDeliveryApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.OrderDeliveryApiHandler
open ympa_fsharp_giraffe_server.OrderDeliveryApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOrderBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryDateRequest
open ympa_fsharp_giraffe_server.Model.SetOrderDeliveryTrackCodeRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStorageLimitRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacResponse

module OrderDeliveryApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 200 where Информация о покупателе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBuyerInfo - Информация о покупателе — физическом лице returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 200 where Успешное изменение даты доставки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryDate - Изменение даты доставки заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryDateExample "application/json")
      // or pass a body of type SetOrderDeliveryDateRequest
      let body = obj() :?> SetOrderDeliveryDateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 200 where Трек‑номер посылки и идентификатор службы доставки были успешно переданы.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderDeliveryTrackCode - Передача трек‑номера посылки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderDeliveryTrackCodeExample "application/json")
      // or pass a body of type SetOrderDeliveryTrackCodeRequest
      let body = obj() :?> SetOrderDeliveryTrackCodeRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStorageLimit - Продление срока хранения заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStorageLimitExample "application/json")
      // or pass a body of type UpdateOrderStorageLimitRequest
      let body = obj() :?> UpdateOrderStorageLimitRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 200 where Проверка кода выполнена успешно.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``VerifyOrderEac - Передача кода подтверждения returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getVerifyOrderEacExample "application/json")
      // or pass a body of type VerifyOrderEacRequest
      let body = obj() :?> VerifyOrderEacRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


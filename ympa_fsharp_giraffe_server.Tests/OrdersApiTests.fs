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
open OrdersApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.OrdersApiHandler
open ympa_fsharp_giraffe_server.OrdersApiHandlerParams
open ympa_fsharp_giraffe_server.Model.AcceptOrderCancellationRequest
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetOrderResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersResponse
open ympa_fsharp_giraffe_server.Model.OrderBuyerType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.ProvideOrderDigitalCodesRequest
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersRequest
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersResponse
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutResponse
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesRequest
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesResponse
open ympa_fsharp_giraffe_server.Model.UpdateOrderItemRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusResponse
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesResponse

module OrdersApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 200 where Ответ на отмену заказа был успешно передан.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AcceptOrderCancellation - Отмена заказа покупателем returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAcceptOrderCancellationExample "application/json")
      // or pass a body of type AcceptOrderCancellationRequest
      let body = obj() :?> AcceptOrderCancellationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 200 where Информация о заказе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 200 where Информация о заказах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderDigitalCodes - Передача ключей цифровых товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderDigitalCodesExample "application/json")
      // or pass a body of type ProvideOrderDigitalCodesRequest
      let body = obj() :?> ProvideOrderDigitalCodesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 200 where Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 200 where В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 200 where Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество грузомест записано.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 200 where Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 200 where В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 200 where Возвращается информация об обновленных статусах заказов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


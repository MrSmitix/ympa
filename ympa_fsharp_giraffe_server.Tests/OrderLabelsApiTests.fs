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
open OrderLabelsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.OrderLabelsApiHandler
open ympa_fsharp_giraffe_server.OrderLabelsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetOrderLabelsDataResponse
open ympa_fsharp_giraffe_server.Model.PageFormatType

module OrderLabelsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 200 where PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 200 where PDF‑файл с ярлыками на все коробки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 200 where Информация для печати ярлыков.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }


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
open ShipmentsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ShipmentsApiHandler
open ympa_fsharp_giraffe_server.ShipmentsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ConfirmShipmentRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetShipmentOrdersInfoResponse
open ympa_fsharp_giraffe_server.Model.GetShipmentResponse
open ympa_fsharp_giraffe_server.Model.SearchShipmentsRequest
open ympa_fsharp_giraffe_server.Model.SearchShipmentsResponse
open ympa_fsharp_giraffe_server.Model.SetShipmentPalletsCountRequest
open ympa_fsharp_giraffe_server.Model.ShipmentPalletLabelPageFormatType
open ympa_fsharp_giraffe_server.Model.TransferOrdersFromShipmentRequest

module ShipmentsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 200 where Акт приема-передачи для отгрузки в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 200 where Акт расхождений в формате XLSX.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 200 where Акт в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 200 where PDF‑файл с ярлыками на все упаковки в отгрузке.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 200 where Акт приема-передачи в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 200 where Транспортная накладная в формате XLSX.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 200 where Найденная отгрузка.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 200 where Информация по годным/негодным для печати ярлыков заказам в отгрузке.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 200 where Найденные отгрузки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 200 where Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество упаковок записано.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 200 where Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }


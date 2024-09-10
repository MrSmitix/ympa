namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrdersStatsPaymentOrderDTO
open ympa_fsharp_functions_server.Model.OrdersStatsPaymentSourceType
open ympa_fsharp_functions_server.Model.OrdersStatsPaymentType

module OrdersStatsPaymentDTO =

  //#region OrdersStatsPaymentDTO

  [<CLIMutable>]
  type OrdersStatsPaymentDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
    [<JsonProperty(PropertyName = "type")>]
    Type : OrdersStatsPaymentType;
    [<JsonProperty(PropertyName = "source")>]
    Source : OrdersStatsPaymentSourceType;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
    [<JsonProperty(PropertyName = "paymentOrder")>]
    PaymentOrder : OrdersStatsPaymentOrderDTO;
  }

  //#endregion

namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrdersStatsPaymentOrderDTO =

  //#region OrdersStatsPaymentOrderDTO

  [<CLIMutable>]
  type OrdersStatsPaymentOrderDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion

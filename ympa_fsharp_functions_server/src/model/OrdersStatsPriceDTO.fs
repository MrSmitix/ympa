namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrdersStatsPriceType

module OrdersStatsPriceDTO =

  //#region OrdersStatsPriceDTO

  [<CLIMutable>]
  type OrdersStatsPriceDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OrdersStatsPriceType;
    [<JsonProperty(PropertyName = "costPerItem")>]
    CostPerItem : decimal;
    [<JsonProperty(PropertyName = "total")>]
    Total : decimal;
  }

  //#endregion

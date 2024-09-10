namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryDatesDTO =

  //#region OrderDeliveryDatesDTO

  [<CLIMutable>]
  type OrderDeliveryDatesDTO = {
    [<JsonProperty(PropertyName = "fromDate")>]
    FromDate : string;
    [<JsonProperty(PropertyName = "toDate")>]
    ToDate : string;
    [<JsonProperty(PropertyName = "fromTime")>]
    FromTime : string;
    [<JsonProperty(PropertyName = "toTime")>]
    ToTime : string;
    [<JsonProperty(PropertyName = "realDeliveryDate")>]
    RealDeliveryDate : string;
  }

  //#endregion

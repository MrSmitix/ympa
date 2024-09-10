namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ParcelBoxLabelDTO

module OrderLabelDTO =

  //#region OrderLabelDTO

  [<CLIMutable>]
  type OrderLabelDTO = {
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "placesNumber")>]
    PlacesNumber : int;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "parcelBoxLabels")>]
    ParcelBoxLabels : ParcelBoxLabelDTO[];
  }

  //#endregion

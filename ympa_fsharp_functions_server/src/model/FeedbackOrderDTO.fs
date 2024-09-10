namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackDeliveryType

module FeedbackOrderDTO =

  //#region FeedbackOrderDTO

  [<CLIMutable>]
  type FeedbackOrderDTO = {
    [<JsonProperty(PropertyName = "shopOrderId")>]
    ShopOrderId : string;
    [<JsonProperty(PropertyName = "delivery")>]
    Delivery : FeedbackDeliveryType;
  }

  //#endregion

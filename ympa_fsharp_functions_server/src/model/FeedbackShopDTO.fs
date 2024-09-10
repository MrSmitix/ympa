namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FeedbackShopDTO =

  //#region FeedbackShopDTO

  [<CLIMutable>]
  type FeedbackShopDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion

namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GoodsFeedbackIdentifiersDTO =

  //#region GoodsFeedbackIdentifiersDTO

  [<CLIMutable>]
  type GoodsFeedbackIdentifiersDTO = {
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "modelId")>]
    ModelId : int64;
  }

  //#endregion

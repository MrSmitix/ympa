namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderSubsidyType

module OrderSubsidyDTO =

  //#region OrderSubsidyDTO

  [<CLIMutable>]
  type OrderSubsidyDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OrderSubsidyType;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : decimal;
  }

  //#endregion

namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemSubsidyType

module OrderItemSubsidyDTO =

  //#region OrderItemSubsidyDTO

  [<CLIMutable>]
  type OrderItemSubsidyDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OrderItemSubsidyType;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : decimal;
  }

  //#endregion

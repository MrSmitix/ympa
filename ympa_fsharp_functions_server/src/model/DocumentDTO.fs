namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderDocumentStatusType

module DocumentDTO =

  //#region DocumentDTO

  [<CLIMutable>]
  type DocumentDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderDocumentStatusType;
    [<JsonProperty(PropertyName = "number")>]
    Number : string;
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion

namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.DocumentDTO

module OrderBusinessDocumentsDTO =

  //#region OrderBusinessDocumentsDTO

  [<CLIMutable>]
  type OrderBusinessDocumentsDTO = {
    [<JsonProperty(PropertyName = "upd")>]
    Upd : DocumentDTO;
    [<JsonProperty(PropertyName = "ukd")>]
    Ukd : DocumentDTO;
    [<JsonProperty(PropertyName = "torgTwelve")>]
    TorgTwelve : DocumentDTO;
    [<JsonProperty(PropertyName = "sf")>]
    Sf : DocumentDTO;
    [<JsonProperty(PropertyName = "ksf")>]
    Ksf : DocumentDTO;
  }

  //#endregion

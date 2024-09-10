namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BriefOrderItemInstanceDTO =

  //#region BriefOrderItemInstanceDTO

  [<CLIMutable>]
  type BriefOrderItemInstanceDTO = {
    [<JsonProperty(PropertyName = "cis")>]
    Cis : string;
    [<JsonProperty(PropertyName = "uin")>]
    Uin : string;
    [<JsonProperty(PropertyName = "rnpt")>]
    Rnpt : string;
    [<JsonProperty(PropertyName = "gtd")>]
    Gtd : string;
  }

  //#endregion

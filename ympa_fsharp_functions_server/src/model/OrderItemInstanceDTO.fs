namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderItemInstanceDTO =

  //#region OrderItemInstanceDTO

  [<CLIMutable>]
  type OrderItemInstanceDTO = {
    [<JsonProperty(PropertyName = "cis")>]
    Cis : string;
    [<JsonProperty(PropertyName = "cisFull")>]
    CisFull : string;
    [<JsonProperty(PropertyName = "uin")>]
    Uin : string;
    [<JsonProperty(PropertyName = "rnpt")>]
    Rnpt : string;
    [<JsonProperty(PropertyName = "gtd")>]
    Gtd : string;
  }

  //#endregion

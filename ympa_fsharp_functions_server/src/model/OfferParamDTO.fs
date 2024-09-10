namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferParamDTO =

  //#region OfferParamDTO

  [<CLIMutable>]
  type OfferParamDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion

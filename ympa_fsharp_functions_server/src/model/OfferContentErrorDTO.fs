namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferContentErrorType

module OfferContentErrorDTO =

  //#region OfferContentErrorDTO

  [<CLIMutable>]
  type OfferContentErrorDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferContentErrorType;
    [<JsonProperty(PropertyName = "parameterId")>]
    ParameterId : int64;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion

namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferMappingErrorType

module OfferMappingErrorDTO =

  //#region OfferMappingErrorDTO

  [<CLIMutable>]
  type OfferMappingErrorDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferMappingErrorType;
    [<JsonProperty(PropertyName = "parameterId")>]
    ParameterId : int64;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion

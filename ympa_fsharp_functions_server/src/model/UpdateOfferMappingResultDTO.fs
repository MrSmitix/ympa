namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferMappingErrorDTO

module UpdateOfferMappingResultDTO =

  //#region UpdateOfferMappingResultDTO

  [<CLIMutable>]
  type UpdateOfferMappingResultDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : OfferMappingErrorDTO[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : OfferMappingErrorDTO[];
  }

  //#endregion

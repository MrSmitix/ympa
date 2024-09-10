namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetMappingDTO
open ympa_fsharp_functions_server.Model.GetOfferDTO

module GetOfferMappingDTO =

  //#region GetOfferMappingDTO

  [<CLIMutable>]
  type GetOfferMappingDTO = {
    [<JsonProperty(PropertyName = "offer")>]
    Offer : GetOfferDTO;
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : GetMappingDTO;
  }

  //#endregion

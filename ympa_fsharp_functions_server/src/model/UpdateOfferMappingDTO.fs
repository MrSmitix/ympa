namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateMappingDTO
open ympa_fsharp_functions_server.Model.UpdateOfferDTO

module UpdateOfferMappingDTO =

  //#region UpdateOfferMappingDTO

  [<CLIMutable>]
  type UpdateOfferMappingDTO = {
    [<JsonProperty(PropertyName = "offer")>]
    Offer : UpdateOfferDTO;
    [<JsonProperty(PropertyName = "mapping")>]
    Mapping : UpdateMappingDTO;
  }

  //#endregion

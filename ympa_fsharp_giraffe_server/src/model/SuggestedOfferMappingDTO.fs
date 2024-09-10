namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetMappingDTO
open ympa_fsharp_giraffe_server.Model.SuggestedOfferDTO

module SuggestedOfferMappingDTO =

  //#region SuggestedOfferMappingDTO


  type SuggestedOfferMappingDTO = {
    Offer : SuggestedOfferDTO;
    Mapping : GetMappingDTO;
  }
  //#endregion

namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetMappingDTO
open ympa_fsharp_giraffe_server.Model.GetOfferDTO

module GetOfferMappingDTO =

  //#region GetOfferMappingDTO


  type GetOfferMappingDTO = {
    Offer : GetOfferDTO;
    Mapping : GetMappingDTO;
  }
  //#endregion

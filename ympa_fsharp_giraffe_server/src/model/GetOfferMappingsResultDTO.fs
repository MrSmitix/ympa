namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetOfferMappingDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module GetOfferMappingsResultDTO =

  //#region GetOfferMappingsResultDTO


  type GetOfferMappingsResultDTO = {
    Paging : ScrollingPagerDTO;
    OfferMappings : GetOfferMappingDTO[];
  }
  //#endregion

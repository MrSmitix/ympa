namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OfferCardStatusType

module GetOfferMappingsRequest =

  //#region GetOfferMappingsRequest


  type GetOfferMappingsRequest = {
    OfferIds : string[];
    CardStatuses : OfferCardStatusType[];
    CategoryIds : int[];
    VendorNames : string[];
    Tags : string[];
    Archived : bool;
  }
  //#endregion

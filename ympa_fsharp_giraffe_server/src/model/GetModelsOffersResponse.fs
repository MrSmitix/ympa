namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.EnrichedModelDTO

module GetModelsOffersResponse =

  //#region GetModelsOffersResponse


  type GetModelsOffersResponse = {
    Models : EnrichedModelDTO[];
    Currency : CurrencyType;
    RegionId : int64;
  }
  //#endregion

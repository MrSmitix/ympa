namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO
open ympa_fsharp_giraffe_server.Model.ModelDTO

module SearchModelsResponse =

  //#region SearchModelsResponse


  type SearchModelsResponse = {
    Models : ModelDTO[];
    Currency : CurrencyType;
    RegionId : int64;
    Pager : FlippingPagerDTO;
  }
  //#endregion

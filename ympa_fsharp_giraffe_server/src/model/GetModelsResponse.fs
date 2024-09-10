namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.ModelDTO

module GetModelsResponse =

  //#region GetModelsResponse


  type GetModelsResponse = {
    Models : ModelDTO[];
    Currency : CurrencyType;
    RegionId : int64;
  }
  //#endregion

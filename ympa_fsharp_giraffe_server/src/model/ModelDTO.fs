namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ModelPriceDTO

module ModelDTO =

  //#region ModelDTO


  type ModelDTO = {
    Id : int64;
    Name : string;
    Prices : ModelPriceDTO;
  }
  //#endregion

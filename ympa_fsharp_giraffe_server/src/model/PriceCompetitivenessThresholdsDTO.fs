namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BasePriceDTO

module PriceCompetitivenessThresholdsDTO =

  //#region PriceCompetitivenessThresholdsDTO


  type PriceCompetitivenessThresholdsDTO = {
    OptimalPrice : BasePriceDTO;
    AveragePrice : BasePriceDTO;
  }
  //#endregion

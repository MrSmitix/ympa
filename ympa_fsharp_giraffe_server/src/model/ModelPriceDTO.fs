namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ModelPriceDTO =

  //#region ModelPriceDTO


  type ModelPriceDTO = {
    Avg : decimal;
    Max : decimal;
    Min : decimal;
  }
  //#endregion

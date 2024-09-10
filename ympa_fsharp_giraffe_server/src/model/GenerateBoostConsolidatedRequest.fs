namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateBoostConsolidatedRequest =

  //#region GenerateBoostConsolidatedRequest


  type GenerateBoostConsolidatedRequest = {
    BusinessId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
  }
  //#endregion

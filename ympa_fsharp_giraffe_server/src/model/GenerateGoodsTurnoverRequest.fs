namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateGoodsTurnoverRequest =

  //#region GenerateGoodsTurnoverRequest


  type GenerateGoodsTurnoverRequest = {
    CampaignId : int64;
    Date : DateTime;
  }
  //#endregion

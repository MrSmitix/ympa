namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BusinessDTO
open ympa_fsharp_giraffe_server.Model.PlacementType

module CampaignDTO =

  //#region CampaignDTO


  type CampaignDTO = {
    Domain : string;
    Id : int64;
    ClientId : int64;
    Business : BusinessDTO;
    PlacementType : PlacementType;
  }
  //#endregion

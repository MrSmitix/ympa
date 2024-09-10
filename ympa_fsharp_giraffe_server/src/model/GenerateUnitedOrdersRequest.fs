namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GenerateUnitedOrdersRequest =

  //#region GenerateUnitedOrdersRequest


  type GenerateUnitedOrdersRequest = {
    BusinessId : int64;
    DateFrom : DateTime;
    DateTo : DateTime;
    CampaignIds : int64[];
    PromoId : string;
  }
  //#endregion

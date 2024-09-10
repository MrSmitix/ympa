namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderBuyerType

module OrderBuyerBasicInfoDTO =

  //#region OrderBuyerBasicInfoDTO


  type OrderBuyerBasicInfoDTO = {
    Id : string;
    LastName : string;
    FirstName : string;
    MiddleName : string;
    Type : OrderBuyerType;
  }
  //#endregion

namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module OrderBusinessBuyerDTO =

  //#region OrderBusinessBuyerDTO


  type OrderBusinessBuyerDTO = {
    Inn : string;
    Kpp : string;
    OrganizationName : string;
    OrganizationJurAddress : string;
  }
  //#endregion

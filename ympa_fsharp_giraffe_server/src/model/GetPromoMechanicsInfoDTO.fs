namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetPromoPromocodeInfoDTO
open ympa_fsharp_giraffe_server.Model.MechanicsType

module GetPromoMechanicsInfoDTO =

  //#region GetPromoMechanicsInfoDTO


  type GetPromoMechanicsInfoDTO = {
    Type : MechanicsType;
    PromocodeInfo : GetPromoPromocodeInfoDTO;
  }
  //#endregion

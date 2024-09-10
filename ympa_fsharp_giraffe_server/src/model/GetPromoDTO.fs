namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ChannelType
open ympa_fsharp_giraffe_server.Model.GetPromoAssortmentInfoDTO
open ympa_fsharp_giraffe_server.Model.GetPromoBestsellerInfoDTO
open ympa_fsharp_giraffe_server.Model.GetPromoConstraintsDTO
open ympa_fsharp_giraffe_server.Model.GetPromoMechanicsInfoDTO
open ympa_fsharp_giraffe_server.Model.PromoPeriodDTO

module GetPromoDTO =

  //#region GetPromoDTO


  type GetPromoDTO = {
    Id : string;
    Name : string;
    Period : PromoPeriodDTO;
    Participating : bool;
    AssortmentInfo : GetPromoAssortmentInfoDTO;
    MechanicsInfo : GetPromoMechanicsInfoDTO;
    BestsellerInfo : GetPromoBestsellerInfoDTO;
    Channels : ChannelType[];
    Constraints : GetPromoConstraintsDTO;
  }
  //#endregion

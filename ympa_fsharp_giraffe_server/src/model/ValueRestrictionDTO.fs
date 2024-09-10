namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OptionValuesLimitedDTO

module ValueRestrictionDTO =

  //#region ValueRestrictionDTO


  type ValueRestrictionDTO = {
    LimitingParameterId : int64;
    LimitedValues : OptionValuesLimitedDTO[];
  }
  //#endregion

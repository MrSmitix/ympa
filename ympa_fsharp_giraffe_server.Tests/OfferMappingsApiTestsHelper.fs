namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open ympa_fsharp_giraffe_server.OfferMappingsApiHandler
open ympa_fsharp_giraffe_server.OfferMappingsApiHandlerParams

module OfferMappingsApiHandlerTestsHelper =

  ()


  let mutable GetSuggestedOfferMappingEntriesExamples = Map.empty
  let mutable GetSuggestedOfferMappingEntriesBody = ""

  GetSuggestedOfferMappingEntriesBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  } ]
}"
  GetSuggestedOfferMappingEntriesExamples <- GetSuggestedOfferMappingEntriesExamples.Add("application/json", GetSuggestedOfferMappingEntriesBody)

  let getGetSuggestedOfferMappingEntriesExample mediaType =
    GetSuggestedOfferMappingEntriesExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOfferMappingEntriesExamples = Map.empty
  let mutable UpdateOfferMappingEntriesBody = ""

  UpdateOfferMappingEntriesBody <- WebUtility.HtmlDecode "{
  &quot;offerMappingEntries&quot; : [ {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  } ]
}"
  UpdateOfferMappingEntriesExamples <- UpdateOfferMappingEntriesExamples.Add("application/json", UpdateOfferMappingEntriesBody)

  let getUpdateOfferMappingEntriesExample mediaType =
    UpdateOfferMappingEntriesExamples.[mediaType]
      |> getConverter mediaType

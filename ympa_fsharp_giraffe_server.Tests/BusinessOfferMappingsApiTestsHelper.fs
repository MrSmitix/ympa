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
open ympa_fsharp_giraffe_server.BusinessOfferMappingsApiHandler
open ympa_fsharp_giraffe_server.BusinessOfferMappingsApiHandlerParams

module BusinessOfferMappingsApiHandlerTestsHelper =


  let mutable AddOffersToArchiveExamples = Map.empty
  let mutable AddOffersToArchiveBody = ""

  AddOffersToArchiveBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  AddOffersToArchiveExamples <- AddOffersToArchiveExamples.Add("application/json", AddOffersToArchiveBody)

  let getAddOffersToArchiveExample mediaType =
    AddOffersToArchiveExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteOffersExamples = Map.empty
  let mutable DeleteOffersBody = ""

  DeleteOffersBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteOffersExamples <- DeleteOffersExamples.Add("application/json", DeleteOffersBody)

  let getDeleteOffersExample mediaType =
    DeleteOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteOffersFromArchiveExamples = Map.empty
  let mutable DeleteOffersFromArchiveBody = ""

  DeleteOffersFromArchiveBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteOffersFromArchiveExamples <- DeleteOffersFromArchiveExamples.Add("application/json", DeleteOffersFromArchiveBody)

  let getDeleteOffersFromArchiveExample mediaType =
    DeleteOffersFromArchiveExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetOfferMappingsExamples = Map.empty
  let mutable GetOfferMappingsBody = ""

  GetOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;archived&quot; : true,
  &quot;categoryIds&quot; : [ 0, 0 ],
  &quot;vendorNames&quot; : [ &quot;vendorNames&quot;, &quot;vendorNames&quot; ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;cardStatuses&quot; : [ &quot;HAS_CARD_CAN_NOT_UPDATE&quot;, &quot;HAS_CARD_CAN_NOT_UPDATE&quot; ],
  &quot;tags&quot; : [ &quot;tags&quot;, &quot;tags&quot; ]
}"
  GetOfferMappingsExamples <- GetOfferMappingsExamples.Add("application/json", GetOfferMappingsBody)

  let getGetOfferMappingsExample mediaType =
    GetOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetSuggestedOfferMappingsExamples = Map.empty
  let mutable GetSuggestedOfferMappingsBody = ""

  GetSuggestedOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  } ]
}"
  GetSuggestedOfferMappingsExamples <- GetSuggestedOfferMappingsExamples.Add("application/json", GetSuggestedOfferMappingsBody)

  let getGetSuggestedOfferMappingsExample mediaType =
    GetSuggestedOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOfferMappingsExamples = Map.empty
  let mutable UpdateOfferMappingsBody = ""

  UpdateOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;offerMappings&quot; : [ {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
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
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
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
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
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
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
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
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
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
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
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
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
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
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
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
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
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
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
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
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  } ],
  &quot;onlyPartnerMediaContent&quot; : true
}"
  UpdateOfferMappingsExamples <- UpdateOfferMappingsExamples.Add("application/json", UpdateOfferMappingsBody)

  let getUpdateOfferMappingsExample mediaType =
    UpdateOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

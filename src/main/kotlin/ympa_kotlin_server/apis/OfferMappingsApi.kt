/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package ympa_kotlin_server.apis

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import ympa_kotlin_server.Paths
import io.ktor.server.resources.options
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.resources.put
import io.ktor.server.resources.delete
import io.ktor.server.resources.head
import io.ktor.server.resources.patch
import io.ktor.server.routing.*
import ympa_kotlin_server.infrastructure.ApiPrincipal
import ympa_kotlin_server.models.ApiClientDataErrorResponse
import ympa_kotlin_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_server.models.ApiLimitErrorResponse
import ympa_kotlin_server.models.ApiLockedErrorResponse
import ympa_kotlin_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_server.models.ApiServerErrorResponse
import ympa_kotlin_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_server.models.EmptyApiResponse
import ympa_kotlin_server.models.GetOfferMappingEntriesResponse
import ympa_kotlin_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_server.models.OfferAvailabilityStatusType
import ympa_kotlin_server.models.OfferMappingKindType
import ympa_kotlin_server.models.OfferProcessingStatusType
import ympa_kotlin_server.models.UpdateOfferMappingEntryRequest

fun Route.OfferMappingsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("OAuth") {
    get<Paths.getOfferMappingEntries> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "offerMappingEntries" : [ {
                  "offer" : {
                    "manufacturerCountries" : [ "manufacturerCountries", "manufacturerCountries" ],
                    "certificate" : "certificate",
                    "description" : "description",
                    "availability" : "ACTIVE",
                    "pictures" : [ "pictures", "pictures" ],
                    "vendorCode" : "VNDR-0005A",
                    "manufacturer" : "manufacturer",
                    "urls" : [ "urls", "urls" ],
                    "deliveryDurationDays" : 5,
                    "feedId" : 0,
                    "vendor" : "LEVENHUK",
                    "price" : 2.027123023002322,
                    "transportUnitSize" : 1,
                    "id" : "id",
                    "lifeTime" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "shelfLife" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "supplyScheduleDays" : [ "MONDAY", "MONDAY" ],
                    "lifeTimeDays" : 9,
                    "quantumOfSupply" : 5,
                    "barcodes" : [ "46012300000000", "46012300000000" ],
                    "customsCommodityCodes" : [ "customsCommodityCodes", "customsCommodityCodes" ],
                    "processingState" : {
                      "notes" : [ {
                        "payload" : "payload",
                        "type" : "ASSORTMENT"
                      }, {
                        "payload" : "payload",
                        "type" : "ASSORTMENT"
                      } ],
                      "status" : "UNKNOWN"
                    },
                    "shopSku" : "shopSku",
                    "boxCount" : 2,
                    "minShipment" : 6,
                    "name" : "Ударная дрель Makita HP1630, 710 Вт",
                    "shelfLifeDays" : 7,
                    "guaranteePeriod" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "weightDimensions" : {
                      "length" : 65.55,
                      "width" : 50.7,
                      "weight" : 1.001,
                      "height" : 20
                    },
                    "category" : "category",
                    "guaranteePeriodDays" : 3
                  },
                  "mapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  },
                  "awaitingModerationMapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  },
                  "rejectedMapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  }
                }, {
                  "offer" : {
                    "manufacturerCountries" : [ "manufacturerCountries", "manufacturerCountries" ],
                    "certificate" : "certificate",
                    "description" : "description",
                    "availability" : "ACTIVE",
                    "pictures" : [ "pictures", "pictures" ],
                    "vendorCode" : "VNDR-0005A",
                    "manufacturer" : "manufacturer",
                    "urls" : [ "urls", "urls" ],
                    "deliveryDurationDays" : 5,
                    "feedId" : 0,
                    "vendor" : "LEVENHUK",
                    "price" : 2.027123023002322,
                    "transportUnitSize" : 1,
                    "id" : "id",
                    "lifeTime" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "shelfLife" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "supplyScheduleDays" : [ "MONDAY", "MONDAY" ],
                    "lifeTimeDays" : 9,
                    "quantumOfSupply" : 5,
                    "barcodes" : [ "46012300000000", "46012300000000" ],
                    "customsCommodityCodes" : [ "customsCommodityCodes", "customsCommodityCodes" ],
                    "processingState" : {
                      "notes" : [ {
                        "payload" : "payload",
                        "type" : "ASSORTMENT"
                      }, {
                        "payload" : "payload",
                        "type" : "ASSORTMENT"
                      } ],
                      "status" : "UNKNOWN"
                    },
                    "shopSku" : "shopSku",
                    "boxCount" : 2,
                    "minShipment" : 6,
                    "name" : "Ударная дрель Makita HP1630, 710 Вт",
                    "shelfLifeDays" : 7,
                    "guaranteePeriod" : {
                      "timePeriod" : 6,
                      "comment" : "comment",
                      "timeUnit" : "HOUR"
                    },
                    "weightDimensions" : {
                      "length" : 65.55,
                      "width" : 50.7,
                      "weight" : 1.001,
                      "height" : 20
                    },
                    "category" : "category",
                    "guaranteePeriodDays" : 3
                  },
                  "mapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  },
                  "awaitingModerationMapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  },
                  "rejectedMapping" : {
                    "modelId" : 7,
                    "marketSku" : 4,
                    "categoryId" : 1
                  }
                } ],
                "paging" : {
                  "prevPageToken" : "prevPageToken",
                  "nextPageToken" : "nextPageToken"
                }
              },
              "status" : "OK"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("OAuth") {
    post<Paths.getSuggestedOfferMappingEntries> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "offers" : [ {
                  "manufacturerCountries" : [ "manufacturerCountries", "manufacturerCountries" ],
                  "marketCategoryId" : 4,
                  "certificate" : "certificate",
                  "description" : "description",
                  "availability" : "ACTIVE",
                  "marketModelId" : 7,
                  "pictures" : [ "pictures", "pictures" ],
                  "vendorCode" : "VNDR-0005A",
                  "manufacturer" : "manufacturer",
                  "marketSkuName" : "marketSkuName",
                  "urls" : [ "urls", "urls" ],
                  "deliveryDurationDays" : 5,
                  "feedId" : 0,
                  "vendor" : "LEVENHUK",
                  "price" : 2.027123023002322,
                  "transportUnitSize" : 1,
                  "id" : "id",
                  "lifeTime" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "shelfLife" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "supplyScheduleDays" : [ "MONDAY", "MONDAY" ],
                  "marketModelName" : "marketModelName",
                  "lifeTimeDays" : 9,
                  "quantumOfSupply" : 5,
                  "barcodes" : [ "46012300000000", "46012300000000" ],
                  "customsCommodityCodes" : [ "customsCommodityCodes", "customsCommodityCodes" ],
                  "processingState" : {
                    "notes" : [ {
                      "payload" : "payload",
                      "type" : "ASSORTMENT"
                    }, {
                      "payload" : "payload",
                      "type" : "ASSORTMENT"
                    } ],
                    "status" : "UNKNOWN"
                  },
                  "marketCategoryName" : "marketCategoryName",
                  "shopSku" : "shopSku",
                  "boxCount" : 2,
                  "minShipment" : 6,
                  "name" : "Ударная дрель Makita HP1630, 710 Вт",
                  "shelfLifeDays" : 7,
                  "guaranteePeriod" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "weightDimensions" : {
                    "length" : 65.55,
                    "width" : 50.7,
                    "weight" : 1.001,
                    "height" : 20
                  },
                  "category" : "category",
                  "guaranteePeriodDays" : 3
                }, {
                  "manufacturerCountries" : [ "manufacturerCountries", "manufacturerCountries" ],
                  "marketCategoryId" : 4,
                  "certificate" : "certificate",
                  "description" : "description",
                  "availability" : "ACTIVE",
                  "marketModelId" : 7,
                  "pictures" : [ "pictures", "pictures" ],
                  "vendorCode" : "VNDR-0005A",
                  "manufacturer" : "manufacturer",
                  "marketSkuName" : "marketSkuName",
                  "urls" : [ "urls", "urls" ],
                  "deliveryDurationDays" : 5,
                  "feedId" : 0,
                  "vendor" : "LEVENHUK",
                  "price" : 2.027123023002322,
                  "transportUnitSize" : 1,
                  "id" : "id",
                  "lifeTime" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "shelfLife" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "supplyScheduleDays" : [ "MONDAY", "MONDAY" ],
                  "marketModelName" : "marketModelName",
                  "lifeTimeDays" : 9,
                  "quantumOfSupply" : 5,
                  "barcodes" : [ "46012300000000", "46012300000000" ],
                  "customsCommodityCodes" : [ "customsCommodityCodes", "customsCommodityCodes" ],
                  "processingState" : {
                    "notes" : [ {
                      "payload" : "payload",
                      "type" : "ASSORTMENT"
                    }, {
                      "payload" : "payload",
                      "type" : "ASSORTMENT"
                    } ],
                    "status" : "UNKNOWN"
                  },
                  "marketCategoryName" : "marketCategoryName",
                  "shopSku" : "shopSku",
                  "boxCount" : 2,
                  "minShipment" : 6,
                  "name" : "Ударная дрель Makita HP1630, 710 Вт",
                  "shelfLifeDays" : 7,
                  "guaranteePeriod" : {
                    "timePeriod" : 6,
                    "comment" : "comment",
                    "timeUnit" : "HOUR"
                  },
                  "weightDimensions" : {
                    "length" : 65.55,
                    "width" : 50.7,
                    "weight" : 1.001,
                    "height" : 20
                  },
                  "category" : "category",
                  "guaranteePeriodDays" : 3
                } ]
              },
              "status" : "OK"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("OAuth") {
    post<Paths.updateOfferMappingEntries> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "status" : "OK"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}

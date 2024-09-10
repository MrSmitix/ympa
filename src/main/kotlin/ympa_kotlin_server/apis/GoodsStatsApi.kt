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
import ympa_kotlin_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_server.models.ApiServerErrorResponse
import ympa_kotlin_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_server.models.GetGoodsStatsRequest
import ympa_kotlin_server.models.GetGoodsStatsResponse

fun Route.GoodsStatsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("OAuth") {
    post<Paths.getGoodsStats> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "shopSkus" : [ {
                  "shopSku" : "shopSku",
                  "marketSku" : 0,
                  "price" : 6.027456183070403,
                  "name" : "name",
                  "warehouses" : [ {
                    "name" : "name",
                    "id" : 9,
                    "stocks" : [ {
                      "count" : 1,
                      "type" : "FIT"
                    }, {
                      "count" : 1,
                      "type" : "FIT"
                    } ]
                  }, {
                    "name" : "name",
                    "id" : 9,
                    "stocks" : [ {
                      "count" : 1,
                      "type" : "FIT"
                    }, {
                      "count" : 1,
                      "type" : "FIT"
                    } ]
                  } ],
                  "weightDimensions" : {
                    "length" : 5.962133916683182,
                    "width" : 5.637376656633329,
                    "weight" : 7.061401241503109,
                    "height" : 2.3021358869347655
                  },
                  "categoryName" : "categoryName",
                  "categoryId" : 1,
                  "pictures" : [ "pictures", "pictures" ],
                  "tariffs" : [ {
                    "amount" : 2.027123023002322,
                    "type" : "AGENCY_COMMISSION",
                    "percent" : 3.616076749251911,
                    "parameters" : [ {
                      "name" : "name",
                      "value" : "value"
                    }, {
                      "name" : "name",
                      "value" : "value"
                    } ]
                  }, {
                    "amount" : 2.027123023002322,
                    "type" : "AGENCY_COMMISSION",
                    "percent" : 3.616076749251911,
                    "parameters" : [ {
                      "name" : "name",
                      "value" : "value"
                    }, {
                      "name" : "name",
                      "value" : "value"
                    } ]
                  } ]
                }, {
                  "shopSku" : "shopSku",
                  "marketSku" : 0,
                  "price" : 6.027456183070403,
                  "name" : "name",
                  "warehouses" : [ {
                    "name" : "name",
                    "id" : 9,
                    "stocks" : [ {
                      "count" : 1,
                      "type" : "FIT"
                    }, {
                      "count" : 1,
                      "type" : "FIT"
                    } ]
                  }, {
                    "name" : "name",
                    "id" : 9,
                    "stocks" : [ {
                      "count" : 1,
                      "type" : "FIT"
                    }, {
                      "count" : 1,
                      "type" : "FIT"
                    } ]
                  } ],
                  "weightDimensions" : {
                    "length" : 5.962133916683182,
                    "width" : 5.637376656633329,
                    "weight" : 7.061401241503109,
                    "height" : 2.3021358869347655
                  },
                  "categoryName" : "categoryName",
                  "categoryId" : 1,
                  "pictures" : [ "pictures", "pictures" ],
                  "tariffs" : [ {
                    "amount" : 2.027123023002322,
                    "type" : "AGENCY_COMMISSION",
                    "percent" : 3.616076749251911,
                    "parameters" : [ {
                      "name" : "name",
                      "value" : "value"
                    }, {
                      "name" : "name",
                      "value" : "value"
                    } ]
                  }, {
                    "amount" : 2.027123023002322,
                    "type" : "AGENCY_COMMISSION",
                    "percent" : 3.616076749251911,
                    "parameters" : [ {
                      "name" : "name",
                      "value" : "value"
                    }, {
                      "name" : "name",
                      "value" : "value"
                    } ]
                  } ]
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

}

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
import ympa_kotlin_server.models.GetFeedbackListResponse

fun Route.FeedbacksApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("OAuth") {
    get<Paths.getFeedbackAndCommentUpdates> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "paging" : {
                  "prevPageToken" : "prevPageToken",
                  "nextPageToken" : "nextPageToken"
                },
                "feedbackList" : [ {
                  "comments" : [ {
                    "createdAt" : "2000-01-23T04:56:07.000+00:00",
                    "children" : [ null, null ],
                    "author" : {
                      "name" : "name",
                      "type" : "USER"
                    },
                    "id" : 6,
                    "body" : "body",
                    "parentId" : 1,
                    "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                  }, {
                    "createdAt" : "2000-01-23T04:56:07.000+00:00",
                    "children" : [ null, null ],
                    "author" : {
                      "name" : "name",
                      "type" : "USER"
                    },
                    "id" : 6,
                    "body" : "body",
                    "parentId" : 1,
                    "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                  } ],
                  "shop" : {
                    "name" : "name"
                  },
                  "author" : {
                    "name" : "name",
                    "region" : {
                      "children" : [ null, null ],
                      "name" : "name",
                      "id" : 0,
                      "type" : "OTHER"
                    }
                  },
                  "verified" : true,
                  "recommend" : true,
                  "grades" : {
                    "average" : 5.962133916683182,
                    "agreeCount" : 5,
                    "rejectCount" : 2,
                    "factors" : [ {
                      "description" : "description",
                      "id" : 7,
                      "title" : "title",
                      "value" : 9
                    }, {
                      "description" : "description",
                      "id" : 7,
                      "title" : "title",
                      "value" : 9
                    } ]
                  },
                  "pro" : "pro",
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "id" : 0,
                  "text" : "text",
                  "state" : "LAST",
                  "contra" : "contra",
                  "resolved" : true,
                  "order" : {
                    "delivery" : "DELIVERY",
                    "shopOrderId" : "shopOrderId"
                  }
                }, {
                  "comments" : [ {
                    "createdAt" : "2000-01-23T04:56:07.000+00:00",
                    "children" : [ null, null ],
                    "author" : {
                      "name" : "name",
                      "type" : "USER"
                    },
                    "id" : 6,
                    "body" : "body",
                    "parentId" : 1,
                    "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                  }, {
                    "createdAt" : "2000-01-23T04:56:07.000+00:00",
                    "children" : [ null, null ],
                    "author" : {
                      "name" : "name",
                      "type" : "USER"
                    },
                    "id" : 6,
                    "body" : "body",
                    "parentId" : 1,
                    "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                  } ],
                  "shop" : {
                    "name" : "name"
                  },
                  "author" : {
                    "name" : "name",
                    "region" : {
                      "children" : [ null, null ],
                      "name" : "name",
                      "id" : 0,
                      "type" : "OTHER"
                    }
                  },
                  "verified" : true,
                  "recommend" : true,
                  "grades" : {
                    "average" : 5.962133916683182,
                    "agreeCount" : 5,
                    "rejectCount" : 2,
                    "factors" : [ {
                      "description" : "description",
                      "id" : 7,
                      "title" : "title",
                      "value" : 9
                    }, {
                      "description" : "description",
                      "id" : 7,
                      "title" : "title",
                      "value" : 9
                    } ]
                  },
                  "pro" : "pro",
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "id" : 0,
                  "text" : "text",
                  "state" : "LAST",
                  "contra" : "contra",
                  "resolved" : true,
                  "order" : {
                    "delivery" : "DELIVERY",
                    "shopOrderId" : "shopOrderId"
                  }
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

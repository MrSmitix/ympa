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
import ympa_kotlin_server.models.CreateChatRequest
import ympa_kotlin_server.models.CreateChatResponse
import ympa_kotlin_server.models.EmptyApiResponse
import ympa_kotlin_server.models.GetChatHistoryRequest
import ympa_kotlin_server.models.GetChatHistoryResponse
import ympa_kotlin_server.models.GetChatsRequest
import ympa_kotlin_server.models.GetChatsResponse
import ympa_kotlin_server.models.SendMessageToChatRequest

fun Route.ChatsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("OAuth") {
    post<Paths.createChat> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "chatId" : 0
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
    post<Paths.getChatHistory> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "orderId" : 0,
                "messages" : [ {
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "sender" : "PARTNER",
                  "payload" : [ {
                    "size" : 1,
                    "name" : "name",
                    "url" : "url"
                  }, {
                    "size" : 1,
                    "name" : "name",
                    "url" : "url"
                  } ],
                  "messageId" : 6,
                  "message" : "message"
                }, {
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "sender" : "PARTNER",
                  "payload" : [ {
                    "size" : 1,
                    "name" : "name",
                    "url" : "url"
                  }, {
                    "size" : 1,
                    "name" : "name",
                    "url" : "url"
                  } ],
                  "messageId" : 6,
                  "message" : "message"
                } ],
                "paging" : {
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
    post<Paths.getChats> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "result" : {
                "chats" : [ {
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "chatId" : 0,
                  "orderId" : 6,
                  "type" : "CHAT",
                  "status" : "NEW",
                  "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                }, {
                  "createdAt" : "2000-01-23T04:56:07.000+00:00",
                  "chatId" : 0,
                  "orderId" : 6,
                  "type" : "CHAT",
                  "status" : "NEW",
                  "updatedAt" : "2000-01-23T04:56:07.000+00:00"
                } ],
                "paging" : {
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
    post<Paths.sendFileToChat> {
        
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

    authenticate("OAuth") {
    post<Paths.sendMessageToChat> {
        
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

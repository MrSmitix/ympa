/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.GetBusinessSettingsResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class BusinessesApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "BusinessesApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val getBusinessSettingsOperation = (apiOperation[GetBusinessSettingsResponse]("getBusinessSettings")
    summary "Настройки кабинета"
    parameters(pathParam[Long]("businessId").description(""))
  )

  post("/businesses/:businessId/settings", operation(getBusinessSettingsOperation)) {
    val businessId = params.getOrElse("businessId", halt(400))
    //println("businessId: " + businessId)
  }

}

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
import org.openapitools.server.model.GetGoodsStatsRequest
import org.openapitools.server.model.GetGoodsStatsResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class GoodsStatsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "GoodsStatsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val getGoodsStatsOperation = (apiOperation[GetGoodsStatsResponse]("getGoodsStats")
    summary "Отчет по товарам"
    parameters(pathParam[Long]("campaignId").description(""), bodyParam[GetGoodsStatsRequest]("getGoodsStatsRequest").description(""))
  )

  post("/campaigns/:campaignId/stats/skus", operation(getGoodsStatsOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    //println("getGoodsStatsRequest: " + getGoodsStatsRequest)
  }

}
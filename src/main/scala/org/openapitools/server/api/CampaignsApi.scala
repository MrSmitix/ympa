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
import org.openapitools.server.model.GetCampaignLoginsResponse
import org.openapitools.server.model.GetCampaignRegionResponse
import org.openapitools.server.model.GetCampaignResponse
import org.openapitools.server.model.GetCampaignSettingsResponse
import org.openapitools.server.model.GetCampaignsResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class CampaignsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CampaignsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val getCampaignOperation = (apiOperation[GetCampaignResponse]("getCampaign")
    summary "Информация о магазине"
    parameters(pathParam[Long]("campaignId").description(""))
  )

  get("/campaigns/:campaignId", operation(getCampaignOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
  }

  

  val getCampaignLoginsOperation = (apiOperation[GetCampaignLoginsResponse]("getCampaignLogins")
    summary "Логины, связанные с магазином"
    parameters(pathParam[Long]("campaignId").description(""))
  )

  get("/campaigns/:campaignId/logins", operation(getCampaignLoginsOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
  }

  

  val getCampaignRegionOperation = (apiOperation[GetCampaignRegionResponse]("getCampaignRegion")
    summary "Регион магазина"
    parameters(pathParam[Long]("campaignId").description(""))
  )

  get("/campaigns/:campaignId/region", operation(getCampaignRegionOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
  }

  

  val getCampaignSettingsOperation = (apiOperation[GetCampaignSettingsResponse]("getCampaignSettings")
    summary "Настройки магазина"
    parameters(pathParam[Long]("campaignId").description(""))
  )

  get("/campaigns/:campaignId/settings", operation(getCampaignSettingsOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
  }

  

  val getCampaignsOperation = (apiOperation[GetCampaignsResponse]("getCampaigns")
    summary "Список магазинов пользователя"
    parameters(queryParam[Int]("page").description("").optional.defaultValue(1), queryParam[Int]("pageSize").description("").optional)
  )

  get("/campaigns", operation(getCampaignsOperation)) {
            val page = params.getAs[Int]("page")

    //println("page: " + page)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
  }

  

  val getCampaignsByLoginOperation = (apiOperation[GetCampaignsResponse]("getCampaignsByLogin")
    summary "Магазины, доступные логину"
    parameters(pathParam[String]("login").description(""), queryParam[Int]("page").description("").optional.defaultValue(1), queryParam[Int]("pageSize").description("").optional)
  )

  get("/campaigns/by_login/:login", operation(getCampaignsByLoginOperation)) {
    val login = params.getOrElse("login", halt(400))
    //println("login: " + login)
            val page = params.getAs[Int]("page")

    //println("page: " + page)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
  }

}

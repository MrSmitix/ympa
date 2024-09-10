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

import org.openapitools.server.model.AddHiddenOffersRequest
import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiLockedErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.DeleteHiddenOffersRequest
import org.openapitools.server.model.EmptyApiResponse
import org.openapitools.server.model.GetHiddenOffersResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class HiddenOffersApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "HiddenOffersApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val addHiddenOffersOperation = (apiOperation[EmptyApiResponse]("addHiddenOffers")
    summary "Скрытие товаров и настройки скрытия"
    parameters(pathParam[Long]("campaignId").description(""), bodyParam[AddHiddenOffersRequest]("addHiddenOffersRequest").description(""))
  )

  post("/campaigns/:campaignId/hidden-offers", operation(addHiddenOffersOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    //println("addHiddenOffersRequest: " + addHiddenOffersRequest)
  }

  

  val deleteHiddenOffersOperation = (apiOperation[EmptyApiResponse]("deleteHiddenOffers")
    summary "Возобновление показа товаров"
    parameters(pathParam[Long]("campaignId").description(""), bodyParam[DeleteHiddenOffersRequest]("deleteHiddenOffersRequest").description(""))
  )

  post("/campaigns/:campaignId/hidden-offers/delete", operation(deleteHiddenOffersOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    //println("deleteHiddenOffersRequest: " + deleteHiddenOffersRequest)
  }

  

  val getHiddenOffersOperation = (apiOperation[GetHiddenOffersResponse]("getHiddenOffers")
    summary "Информация о скрытых вами товарах"
    parameters(pathParam[Long]("campaignId").description(""), queryParam[List[String]]("offerId").description("").optional.defaultValue(List.empty[String] ), queryParam[String]("pageToken").description("").optional, queryParam[Int]("limit").description("").optional, queryParam[Int]("offset").description("").optional, queryParam[Int]("page").description("").optional.defaultValue(1), queryParam[Int]("pageSize").description("").optional)
  )

  get("/campaigns/:campaignId/hidden-offers", operation(getHiddenOffersOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
        val offerIdString = params.getAs[String]("offerId")
    val offerId = if("csv" == "default" || "csv" == "csv") {
      offerIdString match {
        case Some(str) => str.split(",").toSeq
        case None => Seq()
      }
    } else
      Seq()

    //println("offerId: " + offerId)
            val pageToken = params.getAs[String]("pageToken")

    //println("pageToken: " + pageToken)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val offset = params.getAs[Int]("offset")

    //println("offset: " + offset)
            val page = params.getAs[Int]("page")

    //println("page: " + page)
            val pageSize = params.getAs[Int]("pageSize")

    //println("pageSize: " + pageSize)
  }

}

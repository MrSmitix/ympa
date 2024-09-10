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
import org.openapitools.server.model.ConfirmShipmentRequest
import org.openapitools.server.model.EmptyApiResponse
import java.io.File
import org.openapitools.server.model.GetShipmentOrdersInfoResponse
import org.openapitools.server.model.GetShipmentResponse
import org.openapitools.server.model.SearchShipmentsRequest
import org.openapitools.server.model.SearchShipmentsResponse
import org.openapitools.server.model.SetShipmentPalletsCountRequest
import org.openapitools.server.model.ShipmentPalletLabelPageFormatType
import org.openapitools.server.model.TransferOrdersFromShipmentRequest

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class ShipmentsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ShipmentsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val confirmShipmentOperation = (apiOperation[EmptyApiResponse]("confirmShipment")
    summary "Подтверждение отгрузки"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""), bodyParam[ConfirmShipmentRequest]("confirmShipmentRequest").description("").optional)
  )

  post("/campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm", operation(confirmShipmentOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
    //println("confirmShipmentRequest: " + confirmShipmentRequest)
  }

  

  val downloadShipmentActOperation = (apiOperation[File]("downloadShipmentAct")
    summary "Получение акта приема-передачи"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/act", operation(downloadShipmentActOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
  }

  

  val downloadShipmentDiscrepancyActOperation = (apiOperation[File]("downloadShipmentDiscrepancyAct")
    summary "Получение акта расхождений"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act", operation(downloadShipmentDiscrepancyActOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
  }

  

  val downloadShipmentInboundActOperation = (apiOperation[File]("downloadShipmentInboundAct")
    summary "Получение фактического акта приема-передачи"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act", operation(downloadShipmentInboundActOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
  }

  

  val downloadShipmentPalletLabelsOperation = (apiOperation[File]("downloadShipmentPalletLabels")
    summary "Ярлыки для доверительной приемки (FBS)"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""), queryParam[ShipmentPalletLabelPageFormatType]("format").description("").optional)
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels", operation(downloadShipmentPalletLabelsOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
            val format = params.getAs[ShipmentPalletLabelPageFormatType]("format")

    //println("format: " + format)
  }

  

  val downloadShipmentReceptionTransferActOperation = (apiOperation[File]("downloadShipmentReceptionTransferAct")
    summary "Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее"
    parameters(pathParam[Long]("campaignId").description(""), queryParam[Int]("warehouseId").description("").optional)
  )

  get("/campaigns/:campaignId/shipments/reception-transfer-act", operation(downloadShipmentReceptionTransferActOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
            val warehouseId = params.getAs[Int]("warehouseId")

    //println("warehouseId: " + warehouseId)
  }

  

  val downloadShipmentTransportationWaybillOperation = (apiOperation[File]("downloadShipmentTransportationWaybill")
    summary "Получение транспортной накладной"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill", operation(downloadShipmentTransportationWaybillOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
  }

  

  val getShipmentOperation = (apiOperation[GetShipmentResponse]("getShipment")
    summary "Получение информации об одной отгрузке"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""), queryParam[Boolean]("cancelledOrders").description("").optional.defaultValue(true))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId", operation(getShipmentOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
            val cancelledOrders = params.getAs[Boolean]("cancelledOrders")

    //println("cancelledOrders: " + cancelledOrders)
  }

  

  val getShipmentOrdersInfoOperation = (apiOperation[GetShipmentOrdersInfoResponse]("getShipmentOrdersInfo")
    summary "Получение информации о возможности печати ярлыков (FBS)"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""))
  )

  get("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info", operation(getShipmentOrdersInfoOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
  }

  

  val searchShipmentsOperation = (apiOperation[SearchShipmentsResponse]("searchShipments")
    summary "Получение информации о нескольких отгрузках"
    parameters(pathParam[Long]("campaignId").description(""), bodyParam[SearchShipmentsRequest]("searchShipmentsRequest").description(""), queryParam[String]("pageToken").description("").optional, queryParam[Int]("limit").description("").optional)
  )

  put("/campaigns/:campaignId/first-mile/shipments", operation(searchShipmentsOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    //println("searchShipmentsRequest: " + searchShipmentsRequest)
            val pageToken = params.getAs[String]("pageToken")

    //println("pageToken: " + pageToken)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
  }

  

  val setShipmentPalletsCountOperation = (apiOperation[EmptyApiResponse]("setShipmentPalletsCount")
    summary "Передача количества упаковок в отгрузке"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""), bodyParam[SetShipmentPalletsCountRequest]("setShipmentPalletsCountRequest").description(""))
  )

  put("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets", operation(setShipmentPalletsCountOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
    //println("setShipmentPalletsCountRequest: " + setShipmentPalletsCountRequest)
  }

  

  val transferOrdersFromShipmentOperation = (apiOperation[EmptyApiResponse]("transferOrdersFromShipment")
    summary "Перенос заказов в следующую отгрузку"
    parameters(pathParam[Long]("campaignId").description(""), pathParam[Long]("shipmentId").description(""), bodyParam[TransferOrdersFromShipmentRequest]("transferOrdersFromShipmentRequest").description(""))
  )

  post("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer", operation(transferOrdersFromShipmentOperation)) {
    val campaignId = params.getOrElse("campaignId", halt(400))
    //println("campaignId: " + campaignId)
    val shipmentId = params.getOrElse("shipmentId", halt(400))
    //println("shipmentId: " + shipmentId)
    //println("transferOrdersFromShipmentRequest: " + transferOrdersFromShipmentRequest)
  }

}

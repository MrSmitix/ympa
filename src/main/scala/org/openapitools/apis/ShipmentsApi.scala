package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.ConfirmShipmentRequest
import org.openapitools.models.EmptyApiResponse
import java.io.File
import org.openapitools.models.GetShipmentOrdersInfoResponse
import org.openapitools.models.GetShipmentResponse
import org.openapitools.models.SearchShipmentsRequest
import org.openapitools.models.SearchShipmentsResponse
import org.openapitools.models.SetShipmentPalletsCountRequest
import org.openapitools.models.ShipmentPalletLabelPageFormatType
import org.openapitools.models.TransferOrdersFromShipmentRequest
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object ShipmentsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        confirmShipment(da) :+:
        downloadShipmentAct(da) :+:
        downloadShipmentDiscrepancyAct(da) :+:
        downloadShipmentInboundAct(da) :+:
        downloadShipmentPalletLabels(da) :+:
        downloadShipmentReceptionTransferAct(da) :+:
        downloadShipmentTransportationWaybill(da) :+:
        getShipment(da) :+:
        getShipmentOrdersInfo(da) :+:
        searchShipments(da) :+:
        setShipmentPalletsCount(da) :+:
        transferOrdersFromShipment(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def confirmShipment(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "confirm" :: jsonBody[ConfirmShipmentRequest]) { (campaignId: Long, shipmentId: Long, confirmShipmentRequest: ConfirmShipmentRequest) =>
          da.Shipments_confirmShipment(campaignId, shipmentId, confirmShipmentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentAct(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "act") { (campaignId: Long, shipmentId: Long) =>
          da.Shipments_downloadShipmentAct(campaignId, shipmentId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentDiscrepancyAct(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "discrepancy-act") { (campaignId: Long, shipmentId: Long) =>
          da.Shipments_downloadShipmentDiscrepancyAct(campaignId, shipmentId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentInboundAct(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "inbound-act") { (campaignId: Long, shipmentId: Long) =>
          da.Shipments_downloadShipmentInboundAct(campaignId, shipmentId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentPalletLabels(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "pallet" :: "labels" :: paramOption("format").map(_.map(_.toShipmentPalletLabelPageFormatType))) { (campaignId: Long, shipmentId: Long, format: Option[ShipmentPalletLabelPageFormatType]) =>
          da.Shipments_downloadShipmentPalletLabels(campaignId, shipmentId, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentReceptionTransferAct(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "shipments" :: "reception-transfer-act" :: paramOption("warehouse_id").map(_.map(_.toInt))) { (campaignId: Long, warehouseId: Option[Int]) =>
          da.Shipments_downloadShipmentReceptionTransferAct(campaignId, warehouseId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def downloadShipmentTransportationWaybill(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "transportation-waybill") { (campaignId: Long, shipmentId: Long) =>
          da.Shipments_downloadShipmentTransportationWaybill(campaignId, shipmentId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetShipmentResponse
        */
        private def getShipment(da: DataAccessor): Endpoint[GetShipmentResponse] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: paramOption("cancelledOrders").map(_.map(_.toBoolean))) { (campaignId: Long, shipmentId: Long, cancelledOrders: Option[Boolean]) =>
          da.Shipments_getShipment(campaignId, shipmentId, cancelledOrders) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetShipmentOrdersInfoResponse
        */
        private def getShipmentOrdersInfo(da: DataAccessor): Endpoint[GetShipmentOrdersInfoResponse] =
        get("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "orders" :: "info") { (campaignId: Long, shipmentId: Long) =>
          da.Shipments_getShipmentOrdersInfo(campaignId, shipmentId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SearchShipmentsResponse
        */
        private def searchShipments(da: DataAccessor): Endpoint[SearchShipmentsResponse] =
        put("campaigns" :: long :: "first-mile" :: "shipments" :: jsonBody[SearchShipmentsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Shipments_searchShipments(campaignId, searchShipmentsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def setShipmentPalletsCount(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "pallets" :: jsonBody[SetShipmentPalletsCountRequest]) { (campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest) =>
          da.Shipments_setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def transferOrdersFromShipment(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "first-mile" :: "shipments" :: long :: "orders" :: "transfer" :: jsonBody[TransferOrdersFromShipmentRequest]) { (campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest) =>
          da.Shipments_transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpShipmentsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

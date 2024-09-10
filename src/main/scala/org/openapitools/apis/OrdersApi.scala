package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.AcceptOrderCancellationRequest
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.GetOrderResponse
import org.openapitools.models.GetOrdersResponse
import java.time.LocalDateTime
import org.openapitools.models.OrderBuyerType
import org.openapitools.models.OrderDeliveryDispatchType
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubstatusType
import org.openapitools.models.ProvideOrderDigitalCodesRequest
import org.openapitools.models.ProvideOrderItemIdentifiersRequest
import org.openapitools.models.ProvideOrderItemIdentifiersResponse
import scala.collection.immutable.Seq
import org.openapitools.models.SetOrderBoxLayoutRequest
import org.openapitools.models.SetOrderBoxLayoutResponse
import org.openapitools.models.SetOrderShipmentBoxesRequest
import org.openapitools.models.SetOrderShipmentBoxesResponse
import org.openapitools.models.UpdateOrderItemRequest
import org.openapitools.models.UpdateOrderStatusRequest
import org.openapitools.models.UpdateOrderStatusResponse
import org.openapitools.models.UpdateOrderStatusesRequest
import org.openapitools.models.UpdateOrderStatusesResponse
import java.time.ZonedDateTime
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

object OrdersApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        acceptOrderCancellation(da) :+:
        getOrder(da) :+:
        getOrders(da) :+:
        provideOrderDigitalCodes(da) :+:
        provideOrderItemIdentifiers(da) :+:
        setOrderBoxLayout(da) :+:
        setOrderShipmentBoxes(da) :+:
        updateOrderItems(da) :+:
        updateOrderStatus(da) :+:
        updateOrderStatuses(da)


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
        private def acceptOrderCancellation(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "orders" :: long :: "cancellation" :: "accept" :: jsonBody[AcceptOrderCancellationRequest]) { (campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest) =>
          da.Orders_acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrderResponse
        */
        private def getOrder(da: DataAccessor): Endpoint[GetOrderResponse] =
        get("campaigns" :: long :: "orders" :: long) { (campaignId: Long, orderId: Long) =>
          da.Orders_getOrder(campaignId, orderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrdersResponse
        */
        private def getOrders(da: DataAccessor): Endpoint[GetOrdersResponse] =
        get("campaigns" :: long :: "orders" :: params("orderIds") :: params("status") :: params("substatus") :: paramOption("fromDate").map(_.map(_.toLocalDateTime)) :: paramOption("toDate").map(_.map(_.toLocalDateTime)) :: paramOption("supplierShipmentDateFrom").map(_.map(_.toLocalDateTime)) :: paramOption("supplierShipmentDateTo").map(_.map(_.toLocalDateTime)) :: paramOption("updatedAtFrom").map(_.map(_.toZonedDateTime)) :: paramOption("updatedAtTo").map(_.map(_.toZonedDateTime)) :: paramOption("dispatchType").map(_.map(_.toOrderDeliveryDispatchType)) :: paramOption("fake").map(_.map(_.toBoolean)) :: paramOption("hasCis").map(_.map(_.toBoolean)) :: paramOption("onlyWaitingForCancellationApprove").map(_.map(_.toBoolean)) :: paramOption("onlyEstimatedDelivery").map(_.map(_.toBoolean)) :: paramOption("buyerType").map(_.map(_.toOrderBuyerType)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt)) :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]) =>
          da.Orders_getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit) match {
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
        private def provideOrderDigitalCodes(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "orders" :: long :: "deliverDigitalGoods" :: jsonBody[ProvideOrderDigitalCodesRequest]) { (campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest) =>
          da.Orders_provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProvideOrderItemIdentifiersResponse
        */
        private def provideOrderItemIdentifiers(da: DataAccessor): Endpoint[ProvideOrderItemIdentifiersResponse] =
        put("campaigns" :: long :: "orders" :: long :: "identifiers" :: jsonBody[ProvideOrderItemIdentifiersRequest]) { (campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest) =>
          da.Orders_provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SetOrderBoxLayoutResponse
        */
        private def setOrderBoxLayout(da: DataAccessor): Endpoint[SetOrderBoxLayoutResponse] =
        put("campaigns" :: long :: "orders" :: long :: "boxes" :: jsonBody[SetOrderBoxLayoutRequest]) { (campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest) =>
          da.Orders_setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SetOrderShipmentBoxesResponse
        */
        private def setOrderShipmentBoxes(da: DataAccessor): Endpoint[SetOrderShipmentBoxesResponse] =
        put("campaigns" :: long :: "orders" :: long :: "delivery" :: "shipments" :: long :: "boxes" :: jsonBody[SetOrderShipmentBoxesRequest]) { (campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest) =>
          da.Orders_setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def updateOrderItems(da: DataAccessor): Endpoint[Unit] =
        put("campaigns" :: long :: "orders" :: long :: "items" :: jsonBody[UpdateOrderItemRequest]) { (campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest) =>
          da.Orders_updateOrderItems(campaignId, orderId, updateOrderItemRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOrderStatusResponse
        */
        private def updateOrderStatus(da: DataAccessor): Endpoint[UpdateOrderStatusResponse] =
        put("campaigns" :: long :: "orders" :: long :: "status" :: jsonBody[UpdateOrderStatusRequest]) { (campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest) =>
          da.Orders_updateOrderStatus(campaignId, orderId, updateOrderStatusRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOrderStatusesResponse
        */
        private def updateOrderStatuses(da: DataAccessor): Endpoint[UpdateOrderStatusesResponse] =
        post("campaigns" :: long :: "orders" :: "status-update" :: jsonBody[UpdateOrderStatusesRequest]) { (campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest) =>
          da.Orders_updateOrderStatuses(campaignId, updateOrderStatusesRequest) match {
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
      val file = Files.createTempFile("tmpOrdersApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

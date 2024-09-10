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
import org.openapitools.models.GenerateBoostConsolidatedRequest
import org.openapitools.models.GenerateCompetitorsPositionReportRequest
import org.openapitools.models.GenerateGoodsFeedbackRequest
import org.openapitools.models.GenerateGoodsMovementReportRequest
import org.openapitools.models.GenerateGoodsRealizationReportRequest
import org.openapitools.models.GenerateGoodsTurnoverRequest
import org.openapitools.models.GenerateMassOrderLabelsRequest
import org.openapitools.models.GeneratePricesReportRequest
import org.openapitools.models.GenerateReportResponse
import org.openapitools.models.GenerateShelfsStatisticsRequest
import org.openapitools.models.GenerateShipmentListDocumentReportRequest
import org.openapitools.models.GenerateShowsSalesReportRequest
import org.openapitools.models.GenerateStocksOnWarehousesReportRequest
import org.openapitools.models.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.models.GenerateUnitedNettingReportRequest
import org.openapitools.models.GenerateUnitedOrdersRequest
import org.openapitools.models.GetReportInfoResponse
import org.openapitools.models.PageFormatType
import org.openapitools.models.ReportFormatType
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

object ReportsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        generateBoostConsolidatedReport(da) :+:
        generateCompetitorsPositionReport(da) :+:
        generateGoodsFeedbackReport(da) :+:
        generateGoodsMovementReport(da) :+:
        generateGoodsRealizationReport(da) :+:
        generateGoodsTurnoverReport(da) :+:
        generateMassOrderLabelsReport(da) :+:
        generatePricesReport(da) :+:
        generateShelfsStatisticsReport(da) :+:
        generateShipmentListDocumentReport(da) :+:
        generateShowsSalesReport(da) :+:
        generateStocksOnWarehousesReport(da) :+:
        generateUnitedMarketplaceServicesReport(da) :+:
        generateUnitedNettingReport(da) :+:
        generateUnitedOrdersReport(da) :+:
        getReportInfo(da)


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
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateBoostConsolidatedReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "boost-consolidated" :: "generate" :: jsonBody[GenerateBoostConsolidatedRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateCompetitorsPositionReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "competitors-position" :: "generate" :: jsonBody[GenerateCompetitorsPositionReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsFeedbackReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-feedback" :: "generate" :: jsonBody[GenerateGoodsFeedbackRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsMovementReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-movement" :: "generate" :: jsonBody[GenerateGoodsMovementReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateGoodsMovementReport(generateGoodsMovementReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsRealizationReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-realization" :: "generate" :: jsonBody[GenerateGoodsRealizationReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsTurnoverReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-turnover" :: "generate" :: jsonBody[GenerateGoodsTurnoverRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateMassOrderLabelsReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "documents" :: "labels" :: "generate" :: jsonBody[GenerateMassOrderLabelsRequest] :: paramOption("format").map(_.map(_.toPageFormatType))) { (generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]) =>
          da.Reports_generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generatePricesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "prices" :: "generate" :: jsonBody[GeneratePricesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generatePricesReport(generatePricesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateShelfsStatisticsReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "shelf-statistics" :: "generate" :: jsonBody[GenerateShelfsStatisticsRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateShipmentListDocumentReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "documents" :: "shipment-list" :: "generate" :: jsonBody[GenerateShipmentListDocumentReportRequest]) { (generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest) =>
          da.Reports_generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateShowsSalesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "shows-sales" :: "generate" :: jsonBody[GenerateShowsSalesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateShowsSalesReport(generateShowsSalesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateStocksOnWarehousesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "stocks-on-warehouses" :: "generate" :: jsonBody[GenerateStocksOnWarehousesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedMarketplaceServicesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-marketplace-services" :: "generate" :: jsonBody[GenerateUnitedMarketplaceServicesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedNettingReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-netting" :: "generate" :: jsonBody[GenerateUnitedNettingReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateUnitedNettingReport(generateUnitedNettingReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedOrdersReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-orders" :: "generate" :: jsonBody[GenerateUnitedOrdersRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]) =>
          da.Reports_generateUnitedOrdersReport(generateUnitedOrdersRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetReportInfoResponse
        */
        private def getReportInfo(da: DataAccessor): Endpoint[GetReportInfoResponse] =
        get("reports" :: "info" :: string) { (reportId: String) =>
          da.Reports_getReportInfo(reportId) match {
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
      val file = Files.createTempFile("tmpReportsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

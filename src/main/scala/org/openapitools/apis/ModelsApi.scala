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
import org.openapitools.models.CurrencyType
import org.openapitools.models.GetModelsOffersResponse
import org.openapitools.models.GetModelsRequest
import org.openapitools.models.GetModelsResponse
import org.openapitools.models.SearchModelsResponse
import org.openapitools.models.SortOrderType
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

object ModelsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getModel(da) :+:
        getModelOffers(da) :+:
        getModels(da) :+:
        getModelsOffers(da) :+:
        searchModels(da)


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
        * @return An endpoint representing a GetModelsResponse
        */
        private def getModel(da: DataAccessor): Endpoint[GetModelsResponse] =
        get("models" :: long :: param("regionId").map(_.toLong) :: paramOption("currency").map(_.map(_.toCurrencyType))) { (modelId: Long, regionId: Long, currency: Option[CurrencyType]) =>
          da.Models_getModel(modelId, regionId, currency) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetModelsOffersResponse
        */
        private def getModelOffers(da: DataAccessor): Endpoint[GetModelsOffersResponse] =
        get("models" :: long :: "offers" :: param("regionId").map(_.toLong) :: paramOption("currency").map(_.map(_.toCurrencyType)) :: paramOption("orderByPrice").map(_.map(_.toSortOrderType)) :: paramOption("count").map(_.map(_.toInt)) :: paramOption("page").map(_.map(_.toInt))) { (modelId: Long, regionId: Long, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType], count: Option[Int], page: Option[Int]) =>
          da.Models_getModelOffers(modelId, regionId, currency, orderByPrice, count, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetModelsResponse
        */
        private def getModels(da: DataAccessor): Endpoint[GetModelsResponse] =
        post("models" :: param("regionId").map(_.toLong) :: jsonBody[GetModelsRequest] :: paramOption("currency").map(_.map(_.toCurrencyType))) { (regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType]) =>
          da.Models_getModels(regionId, getModelsRequest, currency) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetModelsOffersResponse
        */
        private def getModelsOffers(da: DataAccessor): Endpoint[GetModelsOffersResponse] =
        post("models" :: "offers" :: param("regionId").map(_.toLong) :: jsonBody[GetModelsRequest] :: paramOption("currency").map(_.map(_.toCurrencyType)) :: paramOption("orderByPrice").map(_.map(_.toSortOrderType))) { (regionId: Long, getModelsRequest: GetModelsRequest, currency: Option[CurrencyType], orderByPrice: Option[SortOrderType]) =>
          da.Models_getModelsOffers(regionId, getModelsRequest, currency, orderByPrice) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SearchModelsResponse
        */
        private def searchModels(da: DataAccessor): Endpoint[SearchModelsResponse] =
        get("models" :: param("query") :: param("regionId").map(_.toLong) :: paramOption("currency").map(_.map(_.toCurrencyType)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (query: String, regionId: Long, currency: Option[CurrencyType], page: Option[Int], pageSize: Option[Int]) =>
          da.Models_searchModels(query, regionId, currency, page, pageSize) match {
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
      val file = Files.createTempFile("tmpModelsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

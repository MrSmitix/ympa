package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiLockedErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.GetCategoryContentParametersResponse
import org.openapitools.models.GetOfferCardsContentStatusRequest
import org.openapitools.models.GetOfferCardsContentStatusResponse
import org.openapitools.models.UpdateOfferContentRequest
import org.openapitools.models.UpdateOfferContentResponse
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

object ContentApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getCategoryContentParameters(da) :+:
        getOfferCardsContentStatus(da) :+:
        updateOfferContent(da)


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
        * @return An endpoint representing a GetCategoryContentParametersResponse
        */
        private def getCategoryContentParameters(da: DataAccessor): Endpoint[GetCategoryContentParametersResponse] =
        post("category" :: long :: "parameters") { (categoryId: Long) =>
          da.Content_getCategoryContentParameters(categoryId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferCardsContentStatusResponse
        */
        private def getOfferCardsContentStatus(da: DataAccessor): Endpoint[GetOfferCardsContentStatusResponse] =
        post("businesses" :: long :: "offer-cards" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetOfferCardsContentStatusRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest) =>
          da.Content_getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOfferContentResponse
        */
        private def updateOfferContent(da: DataAccessor): Endpoint[UpdateOfferContentResponse] =
        post("businesses" :: long :: "offer-cards" :: "update" :: jsonBody[UpdateOfferContentRequest]) { (businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest) =>
          da.Content_updateOfferContent(businessId, updateOfferContentRequest) match {
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
      val file = Files.createTempFile("tmpContentApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

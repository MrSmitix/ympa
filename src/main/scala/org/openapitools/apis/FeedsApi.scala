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
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.FeedIndexLogsStatusType
import org.openapitools.models.GetFeedIndexLogsResponse
import org.openapitools.models.GetFeedResponse
import org.openapitools.models.GetFeedsResponse
import org.openapitools.models.SetFeedParamsRequest
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

object FeedsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getFeed(da) :+:
        getFeedIndexLogs(da) :+:
        getFeeds(da) :+:
        refreshFeed(da) :+:
        setFeedParams(da)


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
        * @return An endpoint representing a GetFeedResponse
        */
        private def getFeed(da: DataAccessor): Endpoint[GetFeedResponse] =
        get("campaigns" :: long :: "feeds" :: long) { (campaignId: Long, feedId: Long) =>
          da.Feeds_getFeed(campaignId, feedId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedIndexLogsResponse
        */
        private def getFeedIndexLogs(da: DataAccessor): Endpoint[GetFeedIndexLogsResponse] =
        get("campaigns" :: long :: "feeds" :: long :: "index-logs" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("published_time_from").map(_.map(_.toZonedDateTime)) :: paramOption("published_time_to").map(_.map(_.toZonedDateTime)) :: paramOption("status").map(_.map(_.toFeedIndexLogsStatusType))) { (campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]) =>
          da.Feeds_getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedsResponse
        */
        private def getFeeds(da: DataAccessor): Endpoint[GetFeedsResponse] =
        get("campaigns" :: long :: "feeds") { (campaignId: Long) =>
          da.Feeds_getFeeds(campaignId) match {
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
        private def refreshFeed(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "feeds" :: long :: "refresh") { (campaignId: Long, feedId: Long) =>
          da.Feeds_refreshFeed(campaignId, feedId) match {
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
        private def setFeedParams(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "feeds" :: long :: "params" :: jsonBody[SetFeedParamsRequest]) { (campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest) =>
          da.Feeds_setFeedParams(campaignId, feedId, setFeedParamsRequest) match {
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
      val file = Files.createTempFile("tmpFeedsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

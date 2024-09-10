package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

import org.openapitools.model.AddOffersToArchiveRequest;
import org.openapitools.model.AddOffersToArchiveResponse;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.DeleteOffersFromArchiveRequest;
import org.openapitools.model.DeleteOffersFromArchiveResponse;
import org.openapitools.model.DeleteOffersRequest;
import org.openapitools.model.DeleteOffersResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetBidsInfoRequest;
import org.openapitools.model.GetBidsInfoResponse;
import org.openapitools.model.GetBidsRecommendationsRequest;
import org.openapitools.model.GetBidsRecommendationsResponse;
import org.openapitools.model.GetBusinessSettingsResponse;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.GetOfferCardsContentStatusRequest;
import org.openapitools.model.GetOfferCardsContentStatusResponse;
import org.openapitools.model.GetOfferMappingsRequest;
import org.openapitools.model.GetOfferMappingsResponse;
import org.openapitools.model.GetOfferRecommendationsRequest;
import org.openapitools.model.GetOfferRecommendationsResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.GetQualityRatingRequest;
import org.openapitools.model.GetQualityRatingResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;
import org.openapitools.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.model.GetWarehousesResponse;
import org.openapitools.model.PutSkuBidsRequest;
import org.openapitools.model.SendMessageToChatRequest;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.UpdateBusinessPricesRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.model.UpdateOfferContentRequest;
import org.openapitools.model.UpdateOfferContentResponse;
import org.openapitools.model.UpdateOfferMappingsRequest;
import org.openapitools.model.UpdateOfferMappingsResponse;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessesController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext addOffersToArchive(RequestContext request , Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addOffersToArchive(RequestContext request , Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addOffersToArchive(RequestContext request , Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addOffersToArchive(RequestContext request , Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addOffersToArchive(RequestContext request , Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmBusinessPrices(RequestContext request , Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmBusinessPrices(RequestContext request , Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmBusinessPrices(RequestContext request , Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmBusinessPrices(RequestContext request , Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmBusinessPrices(RequestContext request , Long businessId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createChat(RequestContext request , Long businessId, CreateChatRequest createChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createChat(RequestContext request , Long businessId, CreateChatRequest createChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createChat(RequestContext request , Long businessId, CreateChatRequest createChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createChat(RequestContext request , Long businessId, CreateChatRequest createChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createChat(RequestContext request , Long businessId, CreateChatRequest createChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteGoodsFeedbackComment(RequestContext request , Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteGoodsFeedbackComment(RequestContext request , Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteGoodsFeedbackComment(RequestContext request , Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteGoodsFeedbackComment(RequestContext request , Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteGoodsFeedbackComment(RequestContext request , Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffers(RequestContext request , Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffers(RequestContext request , Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffers(RequestContext request , Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffers(RequestContext request , Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffers(RequestContext request , Long businessId, DeleteOffersRequest deleteOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffersFromArchive(RequestContext request , Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffersFromArchive(RequestContext request , Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffersFromArchive(RequestContext request , Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffersFromArchive(RequestContext request , Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOffersFromArchive(RequestContext request , Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePromoOffers(RequestContext request , Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePromoOffers(RequestContext request , Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePromoOffers(RequestContext request , Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePromoOffers(RequestContext request , Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePromoOffers(RequestContext request , Long businessId, DeletePromoOffersRequest deletePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsInfoForBusiness(RequestContext request , Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsInfoForBusiness(RequestContext request , Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsInfoForBusiness(RequestContext request , Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsInfoForBusiness(RequestContext request , Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsInfoForBusiness(RequestContext request , Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsRecommendations(RequestContext request , Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsRecommendations(RequestContext request , Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsRecommendations(RequestContext request , Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsRecommendations(RequestContext request , Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBidsRecommendations(RequestContext request , Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessQuarantineOffers(RequestContext request , Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessQuarantineOffers(RequestContext request , Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessQuarantineOffers(RequestContext request , Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessQuarantineOffers(RequestContext request , Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessQuarantineOffers(RequestContext request , Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessSettings(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessSettings(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessSettings(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessSettings(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessSettings(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChatHistory(RequestContext request , Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChatHistory(RequestContext request , Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChatHistory(RequestContext request , Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChatHistory(RequestContext request , Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChatHistory(RequestContext request , Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChats(RequestContext request , Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChats(RequestContext request , Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChats(RequestContext request , Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChats(RequestContext request , Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getChats(RequestContext request , Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbackComments(RequestContext request , Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbackComments(RequestContext request , Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbackComments(RequestContext request , Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbackComments(RequestContext request , Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbackComments(RequestContext request , Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbacks(RequestContext request , Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbacks(RequestContext request , Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbacks(RequestContext request , Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbacks(RequestContext request , Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsFeedbacks(RequestContext request , Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferCardsContentStatus(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferCardsContentStatus(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferCardsContentStatus(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferCardsContentStatus(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferCardsContentStatus(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappings(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappings(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappings(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappings(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappings(RequestContext request , Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferRecommendations(RequestContext request , Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferRecommendations(RequestContext request , Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferRecommendations(RequestContext request , Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferRecommendations(RequestContext request , Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferRecommendations(RequestContext request , Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromoOffers(RequestContext request , Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromoOffers(RequestContext request , Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromoOffers(RequestContext request , Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromoOffers(RequestContext request , Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromoOffers(RequestContext request , Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromos(RequestContext request , Long businessId, GetPromosRequest getPromosRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromos(RequestContext request , Long businessId, GetPromosRequest getPromosRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromos(RequestContext request , Long businessId, GetPromosRequest getPromosRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromos(RequestContext request , Long businessId, GetPromosRequest getPromosRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPromos(RequestContext request , Long businessId, GetPromosRequest getPromosRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatings(RequestContext request , Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatings(RequestContext request , Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatings(RequestContext request , Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatings(RequestContext request , Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatings(RequestContext request , Long businessId, GetQualityRatingRequest getQualityRatingRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappings(RequestContext request , Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappings(RequestContext request , Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappings(RequestContext request , Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappings(RequestContext request , Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappings(RequestContext request , Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getWarehouses(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getWarehouses(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getWarehouses(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getWarehouses(RequestContext request , Long businessId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForBusiness(RequestContext request , Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForBusiness(RequestContext request , Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForBusiness(RequestContext request , Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForBusiness(RequestContext request , Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForBusiness(RequestContext request , Long businessId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendFileToChat(RequestContext request , Long businessId, Long chatId, FormDataContentDisposition fileDetail) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendFileToChat(RequestContext request , Long businessId, Long chatId, FormDataContentDisposition fileDetail) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendFileToChat(RequestContext request , Long businessId, Long chatId, FormDataContentDisposition fileDetail) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendFileToChat(RequestContext request , Long businessId, Long chatId, FormDataContentDisposition fileDetail) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendFileToChat(RequestContext request , Long businessId, Long chatId, FormDataContentDisposition fileDetail) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessageToChat(RequestContext request , Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessageToChat(RequestContext request , Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessageToChat(RequestContext request , Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessageToChat(RequestContext request , Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sendMessageToChat(RequestContext request , Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext skipGoodsFeedbacksReaction(RequestContext request , Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext skipGoodsFeedbacksReaction(RequestContext request , Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext skipGoodsFeedbacksReaction(RequestContext request , Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext skipGoodsFeedbacksReaction(RequestContext request , Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext skipGoodsFeedbacksReaction(RequestContext request , Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessPrices(RequestContext request , Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessPrices(RequestContext request , Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessPrices(RequestContext request , Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessPrices(RequestContext request , Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessPrices(RequestContext request , Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateGoodsFeedbackComment(RequestContext request , Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateGoodsFeedbackComment(RequestContext request , Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateGoodsFeedbackComment(RequestContext request , Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateGoodsFeedbackComment(RequestContext request , Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateGoodsFeedbackComment(RequestContext request , Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferContent(RequestContext request , Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferContent(RequestContext request , Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferContent(RequestContext request , Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferContent(RequestContext request , Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferContent(RequestContext request , Long businessId, UpdateOfferContentRequest updateOfferContentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappings(RequestContext request , Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappings(RequestContext request , Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappings(RequestContext request , Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappings(RequestContext request , Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappings(RequestContext request , Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePromoOffers(RequestContext request , Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePromoOffers(RequestContext request , Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePromoOffers(RequestContext request , Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePromoOffers(RequestContext request , Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePromoOffers(RequestContext request , Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-09-09T22:23:41.796583369Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public interface BusinessesApiService {
      public Response addOffersToArchive(Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest, SecurityContext securityContext);
      public Response confirmBusinessPrices(Long businessId, ConfirmPricesRequest confirmPricesRequest, SecurityContext securityContext);
      public Response createChat(Long businessId, CreateChatRequest createChatRequest, SecurityContext securityContext);
      public Response deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest, SecurityContext securityContext);
      public Response deleteOffers(Long businessId, DeleteOffersRequest deleteOffersRequest, SecurityContext securityContext);
      public Response deleteOffersFromArchive(Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest, SecurityContext securityContext);
      public Response deletePromoOffers(Long businessId, DeletePromoOffersRequest deletePromoOffersRequest, SecurityContext securityContext);
      public Response getBidsInfoForBusiness(Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest, SecurityContext securityContext);
      public Response getBidsRecommendations(Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest, SecurityContext securityContext);
      public Response getBusinessQuarantineOffers(Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getBusinessSettings(Long businessId, SecurityContext securityContext);
      public Response getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest, SecurityContext securityContext);
      public Response getOfferCardsContentStatus(Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest, SecurityContext securityContext);
      public Response getOfferMappings(Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest, SecurityContext securityContext);
      public Response getOfferRecommendations(Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getPromoOffers(Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit, SecurityContext securityContext);
      public Response getPromos(Long businessId, GetPromosRequest getPromosRequest, SecurityContext securityContext);
      public Response getQualityRatings(Long businessId, GetQualityRatingRequest getQualityRatingRequest, SecurityContext securityContext);
      public Response getSuggestedOfferMappings(Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest, SecurityContext securityContext);
      public Response getWarehouses(Long businessId, SecurityContext securityContext);
      public Response putBidsForBusiness(Long businessId, PutSkuBidsRequest putSkuBidsRequest, SecurityContext securityContext);
      public Response sendFileToChat(Long businessId, Long chatId, InputStream _fileInputStream, Attachment _fileDetail, SecurityContext securityContext);
      public Response sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest, SecurityContext securityContext);
      public Response skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest, SecurityContext securityContext);
      public Response updateBusinessPrices(Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest, SecurityContext securityContext);
      public Response updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest, SecurityContext securityContext);
      public Response updateOfferContent(Long businessId, UpdateOfferContentRequest updateOfferContentRequest, SecurityContext securityContext);
      public Response updateOfferMappings(Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest, SecurityContext securityContext);
      public Response updatePromoOffers(Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest, SecurityContext securityContext);
}

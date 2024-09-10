package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public interface BusinessesApiService {
      Response addOffersToArchive(Long businessId,AddOffersToArchiveRequest addOffersToArchiveRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response confirmBusinessPrices(Long businessId,ConfirmPricesRequest confirmPricesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createChat(Long businessId,CreateChatRequest createChatRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteGoodsFeedbackComment(Long businessId,DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOffers(Long businessId,DeleteOffersRequest deleteOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOffersFromArchive(Long businessId,DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePromoOffers(Long businessId,DeletePromoOffersRequest deletePromoOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getBidsInfoForBusiness(Long businessId,String pageToken,Integer limit,GetBidsInfoRequest getBidsInfoRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getBidsRecommendations(Long businessId,GetBidsRecommendationsRequest getBidsRecommendationsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessQuarantineOffers(Long businessId,GetQuarantineOffersRequest getQuarantineOffersRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessSettings(Long businessId,SecurityContext securityContext)
      throws NotFoundException;
      Response getChatHistory(Long businessId,Long chatId,GetChatHistoryRequest getChatHistoryRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getChats(Long businessId,GetChatsRequest getChatsRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getGoodsFeedbackComments(Long businessId,GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getGoodsFeedbacks(Long businessId,String pageToken,Integer limit,GetGoodsFeedbackRequest getGoodsFeedbackRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferCardsContentStatus(Long businessId,String pageToken,Integer limit,GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferMappings(Long businessId,String pageToken,Integer limit,GetOfferMappingsRequest getOfferMappingsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferRecommendations(Long businessId,GetOfferRecommendationsRequest getOfferRecommendationsRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getPromoOffers(Long businessId,GetPromoOffersRequest getPromoOffersRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getPromos(Long businessId,GetPromosRequest getPromosRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getQualityRatings(Long businessId,GetQualityRatingRequest getQualityRatingRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getSuggestedOfferMappings(Long businessId,GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getWarehouses(Long businessId,SecurityContext securityContext)
      throws NotFoundException;
      Response putBidsForBusiness(Long businessId,PutSkuBidsRequest putSkuBidsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response sendFileToChat(MultipartFormDataInput input,Long businessId,Long chatId,SecurityContext securityContext)
      throws NotFoundException;
      Response sendMessageToChat(Long businessId,Long chatId,SendMessageToChatRequest sendMessageToChatRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response skipGoodsFeedbacksReaction(Long businessId,SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBusinessPrices(Long businessId,UpdateBusinessPricesRequest updateBusinessPricesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateGoodsFeedbackComment(Long businessId,UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferContent(Long businessId,UpdateOfferContentRequest updateOfferContentRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferMappings(Long businessId,UpdateOfferMappingsRequest updateOfferMappingsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePromoOffers(Long businessId,UpdatePromoOffersRequest updatePromoOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
}

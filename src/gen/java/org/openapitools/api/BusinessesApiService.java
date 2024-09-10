package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class BusinessesApiService {
    public abstract Response addOffersToArchive(Long businessId
 ,AddOffersToArchiveRequest addOffersToArchiveRequest
 ) throws NotFoundException;
    public abstract Response confirmBusinessPrices(Long businessId
 ,ConfirmPricesRequest confirmPricesRequest
 ) throws NotFoundException;
    public abstract Response createChat(Long businessId
 ,CreateChatRequest createChatRequest
 ) throws NotFoundException;
    public abstract Response deleteGoodsFeedbackComment(Long businessId
 ,DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest
 ) throws NotFoundException;
    public abstract Response deleteOffers(Long businessId
 ,DeleteOffersRequest deleteOffersRequest
 ) throws NotFoundException;
    public abstract Response deleteOffersFromArchive(Long businessId
 ,DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest
 ) throws NotFoundException;
    public abstract Response deletePromoOffers(Long businessId
 ,DeletePromoOffersRequest deletePromoOffersRequest
 ) throws NotFoundException;
    public abstract Response getBidsInfoForBusiness(Long businessId
 ,String pageToken
 ,Integer limit
 ,GetBidsInfoRequest getBidsInfoRequest
 ) throws NotFoundException;
    public abstract Response getBidsRecommendations(Long businessId
 ,GetBidsRecommendationsRequest getBidsRecommendationsRequest
 ) throws NotFoundException;
    public abstract Response getBusinessQuarantineOffers(Long businessId
 ,GetQuarantineOffersRequest getQuarantineOffersRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getBusinessSettings(Long businessId
 ) throws NotFoundException;
    public abstract Response getChatHistory(Long businessId
 ,Long chatId
 ,GetChatHistoryRequest getChatHistoryRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getChats(Long businessId
 ,GetChatsRequest getChatsRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getGoodsFeedbackComments(Long businessId
 ,GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getGoodsFeedbacks(Long businessId
 ,String pageToken
 ,Integer limit
 ,GetGoodsFeedbackRequest getGoodsFeedbackRequest
 ) throws NotFoundException;
    public abstract Response getOfferCardsContentStatus(Long businessId
 ,String pageToken
 ,Integer limit
 ,GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest
 ) throws NotFoundException;
    public abstract Response getOfferMappings(Long businessId
 ,String pageToken
 ,Integer limit
 ,GetOfferMappingsRequest getOfferMappingsRequest
 ) throws NotFoundException;
    public abstract Response getOfferRecommendations(Long businessId
 ,GetOfferRecommendationsRequest getOfferRecommendationsRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getPromoOffers(Long businessId
 ,GetPromoOffersRequest getPromoOffersRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getPromos(Long businessId
 ,GetPromosRequest getPromosRequest
 ) throws NotFoundException;
    public abstract Response getQualityRatings(Long businessId
 ,GetQualityRatingRequest getQualityRatingRequest
 ) throws NotFoundException;
    public abstract Response getSuggestedOfferMappings(Long businessId
 ,GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest
 ) throws NotFoundException;
    public abstract Response getWarehouses(Long businessId
 ) throws NotFoundException;
    public abstract Response putBidsForBusiness(Long businessId
 ,PutSkuBidsRequest putSkuBidsRequest
 ) throws NotFoundException;
    public abstract Response sendFileToChat(Long businessId
 ,Long chatId
 ,InputStream _fileInputStream, FileInfo _fileDetail
 ) throws NotFoundException;
    public abstract Response sendMessageToChat(Long businessId
 ,Long chatId
 ,SendMessageToChatRequest sendMessageToChatRequest
 ) throws NotFoundException;
    public abstract Response skipGoodsFeedbacksReaction(Long businessId
 ,SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest
 ) throws NotFoundException;
    public abstract Response updateBusinessPrices(Long businessId
 ,UpdateBusinessPricesRequest updateBusinessPricesRequest
 ) throws NotFoundException;
    public abstract Response updateGoodsFeedbackComment(Long businessId
 ,UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest
 ) throws NotFoundException;
    public abstract Response updateOfferContent(Long businessId
 ,UpdateOfferContentRequest updateOfferContentRequest
 ) throws NotFoundException;
    public abstract Response updateOfferMappings(Long businessId
 ,UpdateOfferMappingsRequest updateOfferMappingsRequest
 ) throws NotFoundException;
    public abstract Response updatePromoOffers(Long businessId
 ,UpdatePromoOffersRequest updatePromoOffersRequest
 ) throws NotFoundException;
}

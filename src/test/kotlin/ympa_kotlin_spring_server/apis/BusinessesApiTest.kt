package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.AddOffersToArchiveRequest
import ympa_kotlin_spring_server.models.AddOffersToArchiveResponse
import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiLockedErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.ConfirmPricesRequest
import ympa_kotlin_spring_server.models.CreateChatRequest
import ympa_kotlin_spring_server.models.CreateChatResponse
import ympa_kotlin_spring_server.models.DeleteGoodsFeedbackCommentRequest
import ympa_kotlin_spring_server.models.DeleteOffersFromArchiveRequest
import ympa_kotlin_spring_server.models.DeleteOffersFromArchiveResponse
import ympa_kotlin_spring_server.models.DeleteOffersRequest
import ympa_kotlin_spring_server.models.DeleteOffersResponse
import ympa_kotlin_spring_server.models.DeletePromoOffersRequest
import ympa_kotlin_spring_server.models.DeletePromoOffersResponse
import ympa_kotlin_spring_server.models.EmptyApiResponse
import ympa_kotlin_spring_server.models.GetBidsInfoRequest
import ympa_kotlin_spring_server.models.GetBidsInfoResponse
import ympa_kotlin_spring_server.models.GetBidsRecommendationsRequest
import ympa_kotlin_spring_server.models.GetBidsRecommendationsResponse
import ympa_kotlin_spring_server.models.GetBusinessSettingsResponse
import ympa_kotlin_spring_server.models.GetChatHistoryRequest
import ympa_kotlin_spring_server.models.GetChatHistoryResponse
import ympa_kotlin_spring_server.models.GetChatsRequest
import ympa_kotlin_spring_server.models.GetChatsResponse
import ympa_kotlin_spring_server.models.GetGoodsFeedbackCommentsRequest
import ympa_kotlin_spring_server.models.GetGoodsFeedbackCommentsResponse
import ympa_kotlin_spring_server.models.GetGoodsFeedbackRequest
import ympa_kotlin_spring_server.models.GetGoodsFeedbackResponse
import ympa_kotlin_spring_server.models.GetOfferCardsContentStatusRequest
import ympa_kotlin_spring_server.models.GetOfferCardsContentStatusResponse
import ympa_kotlin_spring_server.models.GetOfferMappingsRequest
import ympa_kotlin_spring_server.models.GetOfferMappingsResponse
import ympa_kotlin_spring_server.models.GetOfferRecommendationsRequest
import ympa_kotlin_spring_server.models.GetOfferRecommendationsResponse
import ympa_kotlin_spring_server.models.GetPromoOffersRequest
import ympa_kotlin_spring_server.models.GetPromoOffersResponse
import ympa_kotlin_spring_server.models.GetPromosRequest
import ympa_kotlin_spring_server.models.GetPromosResponse
import ympa_kotlin_spring_server.models.GetQualityRatingRequest
import ympa_kotlin_spring_server.models.GetQualityRatingResponse
import ympa_kotlin_spring_server.models.GetQuarantineOffersRequest
import ympa_kotlin_spring_server.models.GetQuarantineOffersResponse
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_spring_server.models.GetWarehousesResponse
import ympa_kotlin_spring_server.models.PutSkuBidsRequest
import ympa_kotlin_spring_server.models.SendMessageToChatRequest
import ympa_kotlin_spring_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_spring_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_spring_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_spring_server.models.UpdateGoodsFeedbackCommentResponse
import ympa_kotlin_spring_server.models.UpdateOfferContentRequest
import ympa_kotlin_spring_server.models.UpdateOfferContentResponse
import ympa_kotlin_spring_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_spring_server.models.UpdateOfferMappingsResponse
import ympa_kotlin_spring_server.models.UpdatePromoOffersRequest
import ympa_kotlin_spring_server.models.UpdatePromoOffersResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BusinessesApiTest {

    private val api: BusinessesApiController = BusinessesApiController()

    /**
     * To test BusinessesApiController.addOffersToArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addOffersToArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val addOffersToArchiveRequest: AddOffersToArchiveRequest = TODO()
        val response: ResponseEntity<AddOffersToArchiveResponse> = api.addOffersToArchive(businessId, addOffersToArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.addOffersToArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addOffersToArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val addOffersToArchiveRequest: AddOffersToArchiveRequest = TODO()
        val response: ResponseEntity<AddOffersToArchiveResponse> = api.addOffersToArchive(businessId, addOffersToArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.addOffersToArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addOffersToArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val addOffersToArchiveRequest: AddOffersToArchiveRequest = TODO()
        val response: ResponseEntity<AddOffersToArchiveResponse> = api.addOffersToArchive(businessId, addOffersToArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.addOffersToArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addOffersToArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val addOffersToArchiveRequest: AddOffersToArchiveRequest = TODO()
        val response: ResponseEntity<AddOffersToArchiveResponse> = api.addOffersToArchive(businessId, addOffersToArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.addOffersToArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addOffersToArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val addOffersToArchiveRequest: AddOffersToArchiveRequest = TODO()
        val response: ResponseEntity<AddOffersToArchiveResponse> = api.addOffersToArchive(businessId, addOffersToArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.confirmBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmBusinessPrices(businessId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.confirmBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmBusinessPrices(businessId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.confirmBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmBusinessPrices(businessId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.confirmBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmBusinessPrices(businessId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.confirmBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmBusinessPrices(businessId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatTest() {
        val businessId: kotlin.Long = TODO()
        val createChatRequest: CreateChatRequest = TODO()
        val response: ResponseEntity<CreateChatResponse> = api.createChat(businessId, createChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatTest() {
        val businessId: kotlin.Long = TODO()
        val createChatRequest: CreateChatRequest = TODO()
        val response: ResponseEntity<CreateChatResponse> = api.createChat(businessId, createChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatTest() {
        val businessId: kotlin.Long = TODO()
        val createChatRequest: CreateChatRequest = TODO()
        val response: ResponseEntity<CreateChatResponse> = api.createChat(businessId, createChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatTest() {
        val businessId: kotlin.Long = TODO()
        val createChatRequest: CreateChatRequest = TODO()
        val response: ResponseEntity<CreateChatResponse> = api.createChat(businessId, createChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatTest() {
        val businessId: kotlin.Long = TODO()
        val createChatRequest: CreateChatRequest = TODO()
        val response: ResponseEntity<CreateChatResponse> = api.createChat(businessId, createChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersRequest: DeleteOffersRequest = TODO()
        val response: ResponseEntity<DeleteOffersResponse> = api.deleteOffers(businessId, deleteOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersRequest: DeleteOffersRequest = TODO()
        val response: ResponseEntity<DeleteOffersResponse> = api.deleteOffers(businessId, deleteOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersRequest: DeleteOffersRequest = TODO()
        val response: ResponseEntity<DeleteOffersResponse> = api.deleteOffers(businessId, deleteOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersRequest: DeleteOffersRequest = TODO()
        val response: ResponseEntity<DeleteOffersResponse> = api.deleteOffers(businessId, deleteOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersRequest: DeleteOffersRequest = TODO()
        val response: ResponseEntity<DeleteOffersResponse> = api.deleteOffers(businessId, deleteOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffersFromArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersFromArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest = TODO()
        val response: ResponseEntity<DeleteOffersFromArchiveResponse> = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffersFromArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersFromArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest = TODO()
        val response: ResponseEntity<DeleteOffersFromArchiveResponse> = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffersFromArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersFromArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest = TODO()
        val response: ResponseEntity<DeleteOffersFromArchiveResponse> = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffersFromArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersFromArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest = TODO()
        val response: ResponseEntity<DeleteOffersFromArchiveResponse> = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteOffersFromArchive
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOffersFromArchiveTest() {
        val businessId: kotlin.Long = TODO()
        val deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest = TODO()
        val response: ResponseEntity<DeleteOffersFromArchiveResponse> = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deletePromoOffersRequest: DeletePromoOffersRequest = TODO()
        val response: ResponseEntity<DeletePromoOffersResponse> = api.deletePromoOffers(businessId, deletePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deletePromoOffersRequest: DeletePromoOffersRequest = TODO()
        val response: ResponseEntity<DeletePromoOffersResponse> = api.deletePromoOffers(businessId, deletePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deletePromoOffersRequest: DeletePromoOffersRequest = TODO()
        val response: ResponseEntity<DeletePromoOffersResponse> = api.deletePromoOffers(businessId, deletePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deletePromoOffersRequest: DeletePromoOffersRequest = TODO()
        val response: ResponseEntity<DeletePromoOffersResponse> = api.deletePromoOffers(businessId, deletePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val deletePromoOffersRequest: DeletePromoOffersRequest = TODO()
        val response: ResponseEntity<DeletePromoOffersResponse> = api.deletePromoOffers(businessId, deletePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsInfoForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsInfoForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getBidsInfoRequest: GetBidsInfoRequest? = TODO()
        val response: ResponseEntity<GetBidsInfoResponse> = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsInfoForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsInfoForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getBidsInfoRequest: GetBidsInfoRequest? = TODO()
        val response: ResponseEntity<GetBidsInfoResponse> = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsInfoForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsInfoForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getBidsInfoRequest: GetBidsInfoRequest? = TODO()
        val response: ResponseEntity<GetBidsInfoResponse> = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsInfoForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsInfoForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getBidsInfoRequest: GetBidsInfoRequest? = TODO()
        val response: ResponseEntity<GetBidsInfoResponse> = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsInfoForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsInfoForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getBidsInfoRequest: GetBidsInfoRequest? = TODO()
        val response: ResponseEntity<GetBidsInfoResponse> = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getBidsRecommendationsRequest: GetBidsRecommendationsRequest = TODO()
        val response: ResponseEntity<GetBidsRecommendationsResponse> = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getBidsRecommendationsRequest: GetBidsRecommendationsRequest = TODO()
        val response: ResponseEntity<GetBidsRecommendationsResponse> = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getBidsRecommendationsRequest: GetBidsRecommendationsRequest = TODO()
        val response: ResponseEntity<GetBidsRecommendationsResponse> = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getBidsRecommendationsRequest: GetBidsRecommendationsRequest = TODO()
        val response: ResponseEntity<GetBidsRecommendationsResponse> = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBidsRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBidsRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getBidsRecommendationsRequest: GetBidsRecommendationsRequest = TODO()
        val response: ResponseEntity<GetBidsRecommendationsResponse> = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessQuarantineOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessQuarantineOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessQuarantineOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessQuarantineOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessQuarantineOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessSettingsTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessSettingsResponse> = api.getBusinessSettings(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessSettingsTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessSettingsResponse> = api.getBusinessSettings(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessSettingsTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessSettingsResponse> = api.getBusinessSettings(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessSettingsTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessSettingsResponse> = api.getBusinessSettings(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessSettingsTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessSettingsResponse> = api.getBusinessSettings(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChatHistory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatHistoryTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val getChatHistoryRequest: GetChatHistoryRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatHistoryResponse> = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChatHistory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatHistoryTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val getChatHistoryRequest: GetChatHistoryRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatHistoryResponse> = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChatHistory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatHistoryTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val getChatHistoryRequest: GetChatHistoryRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatHistoryResponse> = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChatHistory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatHistoryTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val getChatHistoryRequest: GetChatHistoryRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatHistoryResponse> = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChatHistory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatHistoryTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val getChatHistoryRequest: GetChatHistoryRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatHistoryResponse> = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatsTest() {
        val businessId: kotlin.Long = TODO()
        val getChatsRequest: GetChatsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatsResponse> = api.getChats(businessId, getChatsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatsTest() {
        val businessId: kotlin.Long = TODO()
        val getChatsRequest: GetChatsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatsResponse> = api.getChats(businessId, getChatsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatsTest() {
        val businessId: kotlin.Long = TODO()
        val getChatsRequest: GetChatsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatsResponse> = api.getChats(businessId, getChatsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatsTest() {
        val businessId: kotlin.Long = TODO()
        val getChatsRequest: GetChatsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatsResponse> = api.getChats(businessId, getChatsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getChats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getChatsTest() {
        val businessId: kotlin.Long = TODO()
        val getChatsRequest: GetChatsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetChatsResponse> = api.getChats(businessId, getChatsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbackComments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbackCommentsTest() {
        val businessId: kotlin.Long = TODO()
        val getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackCommentsResponse> = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbackComments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbackCommentsTest() {
        val businessId: kotlin.Long = TODO()
        val getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackCommentsResponse> = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbackComments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbackCommentsTest() {
        val businessId: kotlin.Long = TODO()
        val getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackCommentsResponse> = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbackComments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbackCommentsTest() {
        val businessId: kotlin.Long = TODO()
        val getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackCommentsResponse> = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbackComments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbackCommentsTest() {
        val businessId: kotlin.Long = TODO()
        val getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackCommentsResponse> = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbacks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbacksTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getGoodsFeedbackRequest: GetGoodsFeedbackRequest? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackResponse> = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbacks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbacksTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getGoodsFeedbackRequest: GetGoodsFeedbackRequest? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackResponse> = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbacks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbacksTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getGoodsFeedbackRequest: GetGoodsFeedbackRequest? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackResponse> = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbacks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbacksTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getGoodsFeedbackRequest: GetGoodsFeedbackRequest? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackResponse> = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getGoodsFeedbacks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsFeedbacksTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getGoodsFeedbackRequest: GetGoodsFeedbackRequest? = TODO()
        val response: ResponseEntity<GetGoodsFeedbackResponse> = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferCardsContentStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferCardsContentStatusTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = TODO()
        val response: ResponseEntity<GetOfferCardsContentStatusResponse> = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferCardsContentStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferCardsContentStatusTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = TODO()
        val response: ResponseEntity<GetOfferCardsContentStatusResponse> = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferCardsContentStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferCardsContentStatusTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = TODO()
        val response: ResponseEntity<GetOfferCardsContentStatusResponse> = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferCardsContentStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferCardsContentStatusTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = TODO()
        val response: ResponseEntity<GetOfferCardsContentStatusResponse> = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferCardsContentStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferCardsContentStatusTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest? = TODO()
        val response: ResponseEntity<GetOfferCardsContentStatusResponse> = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferMappingsRequest: GetOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetOfferMappingsResponse> = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferMappingsRequest: GetOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetOfferMappingsResponse> = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferMappingsRequest: GetOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetOfferMappingsResponse> = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferMappingsRequest: GetOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetOfferMappingsResponse> = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOfferMappingsRequest: GetOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetOfferMappingsResponse> = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getOfferRecommendationsRequest: GetOfferRecommendationsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferRecommendationsResponse> = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getOfferRecommendationsRequest: GetOfferRecommendationsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferRecommendationsResponse> = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getOfferRecommendationsRequest: GetOfferRecommendationsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferRecommendationsResponse> = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getOfferRecommendationsRequest: GetOfferRecommendationsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferRecommendationsResponse> = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getOfferRecommendations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferRecommendationsTest() {
        val businessId: kotlin.Long = TODO()
        val getOfferRecommendationsRequest: GetOfferRecommendationsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferRecommendationsResponse> = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getPromoOffersRequest: GetPromoOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetPromoOffersResponse> = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getPromoOffersRequest: GetPromoOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetPromoOffersResponse> = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getPromoOffersRequest: GetPromoOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetPromoOffersResponse> = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getPromoOffersRequest: GetPromoOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetPromoOffersResponse> = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val getPromoOffersRequest: GetPromoOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetPromoOffersResponse> = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromosTest() {
        val businessId: kotlin.Long = TODO()
        val getPromosRequest: GetPromosRequest? = TODO()
        val response: ResponseEntity<GetPromosResponse> = api.getPromos(businessId, getPromosRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromosTest() {
        val businessId: kotlin.Long = TODO()
        val getPromosRequest: GetPromosRequest? = TODO()
        val response: ResponseEntity<GetPromosResponse> = api.getPromos(businessId, getPromosRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromosTest() {
        val businessId: kotlin.Long = TODO()
        val getPromosRequest: GetPromosRequest? = TODO()
        val response: ResponseEntity<GetPromosResponse> = api.getPromos(businessId, getPromosRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromosTest() {
        val businessId: kotlin.Long = TODO()
        val getPromosRequest: GetPromosRequest? = TODO()
        val response: ResponseEntity<GetPromosResponse> = api.getPromos(businessId, getPromosRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getPromos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPromosTest() {
        val businessId: kotlin.Long = TODO()
        val getPromosRequest: GetPromosRequest? = TODO()
        val response: ResponseEntity<GetPromosResponse> = api.getPromos(businessId, getPromosRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getQualityRatings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingsTest() {
        val businessId: kotlin.Long = TODO()
        val getQualityRatingRequest: GetQualityRatingRequest = TODO()
        val response: ResponseEntity<GetQualityRatingResponse> = api.getQualityRatings(businessId, getQualityRatingRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getQualityRatings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingsTest() {
        val businessId: kotlin.Long = TODO()
        val getQualityRatingRequest: GetQualityRatingRequest = TODO()
        val response: ResponseEntity<GetQualityRatingResponse> = api.getQualityRatings(businessId, getQualityRatingRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getQualityRatings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingsTest() {
        val businessId: kotlin.Long = TODO()
        val getQualityRatingRequest: GetQualityRatingRequest = TODO()
        val response: ResponseEntity<GetQualityRatingResponse> = api.getQualityRatings(businessId, getQualityRatingRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getQualityRatings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingsTest() {
        val businessId: kotlin.Long = TODO()
        val getQualityRatingRequest: GetQualityRatingRequest = TODO()
        val response: ResponseEntity<GetQualityRatingResponse> = api.getQualityRatings(businessId, getQualityRatingRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getQualityRatings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingsTest() {
        val businessId: kotlin.Long = TODO()
        val getQualityRatingRequest: GetQualityRatingRequest = TODO()
        val response: ResponseEntity<GetQualityRatingResponse> = api.getQualityRatings(businessId, getQualityRatingRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getSuggestedOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingsResponse> = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getSuggestedOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingsResponse> = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getSuggestedOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingsResponse> = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getSuggestedOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingsResponse> = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getSuggestedOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest? = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingsResponse> = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getWarehousesTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetWarehousesResponse> = api.getWarehouses(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getWarehousesTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetWarehousesResponse> = api.getWarehouses(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getWarehousesTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetWarehousesResponse> = api.getWarehouses(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getWarehouses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getWarehousesTest() {
        val businessId: kotlin.Long = TODO()
        val response: ResponseEntity<GetWarehousesResponse> = api.getWarehouses(businessId)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.putBidsForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForBusiness(businessId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.putBidsForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForBusiness(businessId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.putBidsForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForBusiness(businessId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.putBidsForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForBusiness(businessId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.putBidsForBusiness
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForBusinessTest() {
        val businessId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForBusiness(businessId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendFileToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendFileToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val file: org.springframework.core.io.Resource = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendFileToChat(businessId, chatId, file)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendFileToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendFileToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val file: org.springframework.core.io.Resource = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendFileToChat(businessId, chatId, file)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendFileToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendFileToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val file: org.springframework.core.io.Resource = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendFileToChat(businessId, chatId, file)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendFileToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendFileToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val file: org.springframework.core.io.Resource = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendFileToChat(businessId, chatId, file)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendFileToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendFileToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val file: org.springframework.core.io.Resource = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendFileToChat(businessId, chatId, file)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendMessageToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendMessageToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val sendMessageToChatRequest: SendMessageToChatRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendMessageToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendMessageToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val sendMessageToChatRequest: SendMessageToChatRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendMessageToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendMessageToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val sendMessageToChatRequest: SendMessageToChatRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendMessageToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendMessageToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val sendMessageToChatRequest: SendMessageToChatRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sendMessageToChat
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sendMessageToChatTest() {
        val businessId: kotlin.Long = TODO()
        val chatId: kotlin.Long = TODO()
        val sendMessageToChatRequest: SendMessageToChatRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.skipGoodsFeedbacksReaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun skipGoodsFeedbacksReactionTest() {
        val businessId: kotlin.Long = TODO()
        val skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.skipGoodsFeedbacksReaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun skipGoodsFeedbacksReactionTest() {
        val businessId: kotlin.Long = TODO()
        val skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.skipGoodsFeedbacksReaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun skipGoodsFeedbacksReactionTest() {
        val businessId: kotlin.Long = TODO()
        val skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.skipGoodsFeedbacksReaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun skipGoodsFeedbacksReactionTest() {
        val businessId: kotlin.Long = TODO()
        val skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.skipGoodsFeedbacksReaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun skipGoodsFeedbacksReactionTest() {
        val businessId: kotlin.Long = TODO()
        val skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val updateBusinessPricesRequest: UpdateBusinessPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateBusinessPrices(businessId, updateBusinessPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val updateBusinessPricesRequest: UpdateBusinessPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateBusinessPrices(businessId, updateBusinessPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val updateBusinessPricesRequest: UpdateBusinessPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateBusinessPrices(businessId, updateBusinessPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val updateBusinessPricesRequest: UpdateBusinessPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateBusinessPrices(businessId, updateBusinessPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessPricesTest() {
        val businessId: kotlin.Long = TODO()
        val updateBusinessPricesRequest: UpdateBusinessPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateBusinessPrices(businessId, updateBusinessPricesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<UpdateGoodsFeedbackCommentResponse> = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<UpdateGoodsFeedbackCommentResponse> = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<UpdateGoodsFeedbackCommentResponse> = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<UpdateGoodsFeedbackCommentResponse> = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateGoodsFeedbackComment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateGoodsFeedbackCommentTest() {
        val businessId: kotlin.Long = TODO()
        val updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest = TODO()
        val response: ResponseEntity<UpdateGoodsFeedbackCommentResponse> = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferContent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferContentTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferContentRequest: UpdateOfferContentRequest = TODO()
        val response: ResponseEntity<UpdateOfferContentResponse> = api.updateOfferContent(businessId, updateOfferContentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferContent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferContentTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferContentRequest: UpdateOfferContentRequest = TODO()
        val response: ResponseEntity<UpdateOfferContentResponse> = api.updateOfferContent(businessId, updateOfferContentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferContent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferContentTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferContentRequest: UpdateOfferContentRequest = TODO()
        val response: ResponseEntity<UpdateOfferContentResponse> = api.updateOfferContent(businessId, updateOfferContentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferContent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferContentTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferContentRequest: UpdateOfferContentRequest = TODO()
        val response: ResponseEntity<UpdateOfferContentResponse> = api.updateOfferContent(businessId, updateOfferContentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferContent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferContentTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferContentRequest: UpdateOfferContentRequest = TODO()
        val response: ResponseEntity<UpdateOfferContentResponse> = api.updateOfferContent(businessId, updateOfferContentRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferMappingsRequest: UpdateOfferMappingsRequest = TODO()
        val response: ResponseEntity<UpdateOfferMappingsResponse> = api.updateOfferMappings(businessId, updateOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferMappingsRequest: UpdateOfferMappingsRequest = TODO()
        val response: ResponseEntity<UpdateOfferMappingsResponse> = api.updateOfferMappings(businessId, updateOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferMappingsRequest: UpdateOfferMappingsRequest = TODO()
        val response: ResponseEntity<UpdateOfferMappingsResponse> = api.updateOfferMappings(businessId, updateOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferMappingsRequest: UpdateOfferMappingsRequest = TODO()
        val response: ResponseEntity<UpdateOfferMappingsResponse> = api.updateOfferMappings(businessId, updateOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateOfferMappings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingsTest() {
        val businessId: kotlin.Long = TODO()
        val updateOfferMappingsRequest: UpdateOfferMappingsRequest = TODO()
        val response: ResponseEntity<UpdateOfferMappingsResponse> = api.updateOfferMappings(businessId, updateOfferMappingsRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val updatePromoOffersRequest: UpdatePromoOffersRequest = TODO()
        val response: ResponseEntity<UpdatePromoOffersResponse> = api.updatePromoOffers(businessId, updatePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val updatePromoOffersRequest: UpdatePromoOffersRequest = TODO()
        val response: ResponseEntity<UpdatePromoOffersResponse> = api.updatePromoOffers(businessId, updatePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val updatePromoOffersRequest: UpdatePromoOffersRequest = TODO()
        val response: ResponseEntity<UpdatePromoOffersResponse> = api.updatePromoOffers(businessId, updatePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val updatePromoOffersRequest: UpdatePromoOffersRequest = TODO()
        val response: ResponseEntity<UpdatePromoOffersResponse> = api.updatePromoOffers(businessId, updatePromoOffersRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePromoOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePromoOffersTest() {
        val businessId: kotlin.Long = TODO()
        val updatePromoOffersRequest: UpdatePromoOffersRequest = TODO()
        val response: ResponseEntity<UpdatePromoOffersResponse> = api.updatePromoOffers(businessId, updatePromoOffersRequest)

        // TODO: test validations
    }
}

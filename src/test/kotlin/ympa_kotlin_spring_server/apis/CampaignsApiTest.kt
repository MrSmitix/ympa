package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.AcceptOrderCancellationRequest
import ympa_kotlin_spring_server.models.AddHiddenOffersRequest
import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiLockedErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.ChangeOutletRequest
import ympa_kotlin_spring_server.models.ConfirmPricesRequest
import ympa_kotlin_spring_server.models.ConfirmShipmentRequest
import ympa_kotlin_spring_server.models.CreateOutletResponse
import ympa_kotlin_spring_server.models.CurrencyType
import ympa_kotlin_spring_server.models.DeleteCampaignOffersRequest
import ympa_kotlin_spring_server.models.DeleteCampaignOffersResponse
import ympa_kotlin_spring_server.models.DeleteHiddenOffersRequest
import ympa_kotlin_spring_server.models.EmptyApiResponse
import ympa_kotlin_spring_server.models.FeedIndexLogsStatusType
import ympa_kotlin_spring_server.models.GetAllOffersResponse
import ympa_kotlin_spring_server.models.GetBusinessBuyerInfoResponse
import ympa_kotlin_spring_server.models.GetBusinessDocumentsInfoResponse
import ympa_kotlin_spring_server.models.GetCampaignLoginsResponse
import ympa_kotlin_spring_server.models.GetCampaignOffersRequest
import ympa_kotlin_spring_server.models.GetCampaignOffersResponse
import ympa_kotlin_spring_server.models.GetCampaignRegionResponse
import ympa_kotlin_spring_server.models.GetCampaignResponse
import ympa_kotlin_spring_server.models.GetCampaignSettingsResponse
import ympa_kotlin_spring_server.models.GetCampaignsResponse
import ympa_kotlin_spring_server.models.GetFeedIndexLogsResponse
import ympa_kotlin_spring_server.models.GetFeedResponse
import ympa_kotlin_spring_server.models.GetFeedbackListResponse
import ympa_kotlin_spring_server.models.GetFeedsResponse
import ympa_kotlin_spring_server.models.GetGoodsStatsRequest
import ympa_kotlin_spring_server.models.GetGoodsStatsResponse
import ympa_kotlin_spring_server.models.GetHiddenOffersResponse
import ympa_kotlin_spring_server.models.GetOfferMappingEntriesResponse
import ympa_kotlin_spring_server.models.GetOffersResponse
import ympa_kotlin_spring_server.models.GetOrderBuyerInfoResponse
import ympa_kotlin_spring_server.models.GetOrderLabelsDataResponse
import ympa_kotlin_spring_server.models.GetOrderResponse
import ympa_kotlin_spring_server.models.GetOrdersResponse
import ympa_kotlin_spring_server.models.GetOrdersStatsRequest
import ympa_kotlin_spring_server.models.GetOrdersStatsResponse
import ympa_kotlin_spring_server.models.GetOutletLicensesResponse
import ympa_kotlin_spring_server.models.GetOutletResponse
import ympa_kotlin_spring_server.models.GetOutletsResponse
import ympa_kotlin_spring_server.models.GetPricesByOfferIdsRequest
import ympa_kotlin_spring_server.models.GetPricesByOfferIdsResponse
import ympa_kotlin_spring_server.models.GetPricesResponse
import ympa_kotlin_spring_server.models.GetQualityRatingDetailsResponse
import ympa_kotlin_spring_server.models.GetQuarantineOffersRequest
import ympa_kotlin_spring_server.models.GetQuarantineOffersResponse
import ympa_kotlin_spring_server.models.GetReturnResponse
import ympa_kotlin_spring_server.models.GetReturnsResponse
import ympa_kotlin_spring_server.models.GetShipmentOrdersInfoResponse
import ympa_kotlin_spring_server.models.GetShipmentResponse
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingEntriesRequest
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingEntriesResponse
import ympa_kotlin_spring_server.models.GetWarehouseStocksRequest
import ympa_kotlin_spring_server.models.GetWarehouseStocksResponse
import ympa_kotlin_spring_server.models.OfferAvailabilityStatusType
import ympa_kotlin_spring_server.models.OfferMappingKindType
import ympa_kotlin_spring_server.models.OfferProcessingStatusType
import ympa_kotlin_spring_server.models.OrderBuyerType
import ympa_kotlin_spring_server.models.OrderDeliveryDispatchType
import ympa_kotlin_spring_server.models.OrderStatusType
import ympa_kotlin_spring_server.models.OrderSubstatusType
import ympa_kotlin_spring_server.models.PageFormatType
import ympa_kotlin_spring_server.models.ProvideOrderDigitalCodesRequest
import ympa_kotlin_spring_server.models.ProvideOrderItemIdentifiersRequest
import ympa_kotlin_spring_server.models.ProvideOrderItemIdentifiersResponse
import ympa_kotlin_spring_server.models.PutSkuBidsRequest
import ympa_kotlin_spring_server.models.RefundStatusType
import ympa_kotlin_spring_server.models.ReturnType
import ympa_kotlin_spring_server.models.SearchShipmentsRequest
import ympa_kotlin_spring_server.models.SearchShipmentsResponse
import ympa_kotlin_spring_server.models.SetFeedParamsRequest
import ympa_kotlin_spring_server.models.SetOrderBoxLayoutRequest
import ympa_kotlin_spring_server.models.SetOrderBoxLayoutResponse
import ympa_kotlin_spring_server.models.SetOrderDeliveryDateRequest
import ympa_kotlin_spring_server.models.SetOrderDeliveryTrackCodeRequest
import ympa_kotlin_spring_server.models.SetOrderShipmentBoxesRequest
import ympa_kotlin_spring_server.models.SetOrderShipmentBoxesResponse
import ympa_kotlin_spring_server.models.SetReturnDecisionRequest
import ympa_kotlin_spring_server.models.SetShipmentPalletsCountRequest
import ympa_kotlin_spring_server.models.ShipmentPalletLabelPageFormatType
import ympa_kotlin_spring_server.models.SuggestPricesRequest
import ympa_kotlin_spring_server.models.SuggestPricesResponse
import ympa_kotlin_spring_server.models.TransferOrdersFromShipmentRequest
import ympa_kotlin_spring_server.models.UpdateCampaignOffersRequest
import ympa_kotlin_spring_server.models.UpdateOfferMappingEntryRequest
import ympa_kotlin_spring_server.models.UpdateOrderItemRequest
import ympa_kotlin_spring_server.models.UpdateOrderStatusRequest
import ympa_kotlin_spring_server.models.UpdateOrderStatusResponse
import ympa_kotlin_spring_server.models.UpdateOrderStatusesRequest
import ympa_kotlin_spring_server.models.UpdateOrderStatusesResponse
import ympa_kotlin_spring_server.models.UpdateOrderStorageLimitRequest
import ympa_kotlin_spring_server.models.UpdateOutletLicenseRequest
import ympa_kotlin_spring_server.models.UpdatePricesRequest
import ympa_kotlin_spring_server.models.UpdateStocksRequest
import ympa_kotlin_spring_server.models.VerifyOrderEacRequest
import ympa_kotlin_spring_server.models.VerifyOrderEacResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CampaignsApiTest {

    private val api: CampaignsApiController = CampaignsApiController()

    /**
     * To test CampaignsApiController.acceptOrderCancellation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun acceptOrderCancellationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val acceptOrderCancellationRequest: AcceptOrderCancellationRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.acceptOrderCancellation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun acceptOrderCancellationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val acceptOrderCancellationRequest: AcceptOrderCancellationRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.addHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val addHiddenOffersRequest: AddHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.addHiddenOffers(campaignId, addHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.addHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val addHiddenOffersRequest: AddHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.addHiddenOffers(campaignId, addHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.addHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val addHiddenOffersRequest: AddHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.addHiddenOffers(campaignId, addHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.addHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val addHiddenOffersRequest: AddHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.addHiddenOffers(campaignId, addHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.addHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val addHiddenOffersRequest: AddHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.addHiddenOffers(campaignId, addHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmCampaignPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmCampaignPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmCampaignPrices(campaignId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmCampaignPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmCampaignPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmCampaignPrices(campaignId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmCampaignPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmCampaignPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmCampaignPrices(campaignId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmCampaignPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmCampaignPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmCampaignPrices(campaignId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmCampaignPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmCampaignPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val confirmPricesRequest: ConfirmPricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmCampaignPrices(campaignId, confirmPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val confirmShipmentRequest: ConfirmShipmentRequest? = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.confirmShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun confirmShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val confirmShipmentRequest: ConfirmShipmentRequest? = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.createOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val changeOutletRequest: ChangeOutletRequest = TODO()
        val response: ResponseEntity<CreateOutletResponse> = api.createOutlet(campaignId, changeOutletRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.createOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val changeOutletRequest: ChangeOutletRequest = TODO()
        val response: ResponseEntity<CreateOutletResponse> = api.createOutlet(campaignId, changeOutletRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteCampaignOffersRequest: DeleteCampaignOffersRequest = TODO()
        val response: ResponseEntity<DeleteCampaignOffersResponse> = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteCampaignOffersRequest: DeleteCampaignOffersRequest = TODO()
        val response: ResponseEntity<DeleteCampaignOffersResponse> = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteCampaignOffersRequest: DeleteCampaignOffersRequest = TODO()
        val response: ResponseEntity<DeleteCampaignOffersResponse> = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteCampaignOffersRequest: DeleteCampaignOffersRequest = TODO()
        val response: ResponseEntity<DeleteCampaignOffersResponse> = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteCampaignOffersRequest: DeleteCampaignOffersRequest = TODO()
        val response: ResponseEntity<DeleteCampaignOffersResponse> = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteHiddenOffersRequest: DeleteHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteHiddenOffersRequest: DeleteHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteHiddenOffersRequest: DeleteHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteHiddenOffersRequest: DeleteHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val deleteHiddenOffersRequest: DeleteHiddenOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteOutlet(campaignId, outletId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteOutlet(campaignId, outletId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val ids: kotlin.collections.Set<kotlin.Long>? = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteOutletLicenses(campaignId, ids)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.deleteOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val ids: kotlin.collections.Set<kotlin.Long>? = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.deleteOutletLicenses(campaignId, ids)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentDiscrepancyAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentDiscrepancyActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentDiscrepancyAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentDiscrepancyAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentDiscrepancyActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentDiscrepancyAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentInboundAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentInboundActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentInboundAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentInboundAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentInboundActTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentInboundAct(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentPalletLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentPalletLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val format: ShipmentPalletLabelPageFormatType = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentPalletLabels(campaignId, shipmentId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentPalletLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentPalletLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val format: ShipmentPalletLabelPageFormatType = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentPalletLabels(campaignId, shipmentId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentReceptionTransferAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentReceptionTransferActTest() {
        val campaignId: kotlin.Long = TODO()
        val warehouseId: kotlin.Int? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentReceptionTransferAct(campaignId, warehouseId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentReceptionTransferAct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentReceptionTransferActTest() {
        val campaignId: kotlin.Long = TODO()
        val warehouseId: kotlin.Int? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentReceptionTransferAct(campaignId, warehouseId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentTransportationWaybill
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentTransportationWaybillTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentTransportationWaybill(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.downloadShipmentTransportationWaybill
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadShipmentTransportationWaybillTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.downloadShipmentTransportationWaybill(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val boxId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val boxId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val boxId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val boxId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabels(campaignId, orderId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabels(campaignId, orderId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabels(campaignId, orderId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.generateOrderLabels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generateOrderLabelsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val format: PageFormatType? = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.generateOrderLabels(campaignId, orderId, format)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getAllOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAllOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long? = TODO()
        val chunk: kotlin.Int? = TODO()
        val response: ResponseEntity<GetAllOffersResponse> = api.getAllOffers(campaignId, feedId, chunk)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getAllOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAllOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long? = TODO()
        val chunk: kotlin.Int? = TODO()
        val response: ResponseEntity<GetAllOffersResponse> = api.getAllOffers(campaignId, feedId, chunk)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getAllOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAllOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long? = TODO()
        val chunk: kotlin.Int? = TODO()
        val response: ResponseEntity<GetAllOffersResponse> = api.getAllOffers(campaignId, feedId, chunk)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getAllOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAllOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long? = TODO()
        val chunk: kotlin.Int? = TODO()
        val response: ResponseEntity<GetAllOffersResponse> = api.getAllOffers(campaignId, feedId, chunk)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getAllOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAllOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long? = TODO()
        val chunk: kotlin.Int? = TODO()
        val response: ResponseEntity<GetAllOffersResponse> = api.getAllOffers(campaignId, feedId, chunk)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignResponse> = api.getCampaign(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignResponse> = api.getCampaign(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignResponse> = api.getCampaign(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignResponse> = api.getCampaign(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignResponse> = api.getCampaign(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignLogins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignLoginsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignLoginsResponse> = api.getCampaignLogins(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignLogins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignLoginsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignLoginsResponse> = api.getCampaignLogins(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignLogins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignLoginsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignLoginsResponse> = api.getCampaignLogins(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignLogins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignLoginsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignLoginsResponse> = api.getCampaignLogins(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignLogins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignLoginsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignLoginsResponse> = api.getCampaignLogins(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getCampaignOffersRequest: GetCampaignOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignOffersResponse> = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getCampaignOffersRequest: GetCampaignOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignOffersResponse> = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getCampaignOffersRequest: GetCampaignOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignOffersResponse> = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getCampaignOffersRequest: GetCampaignOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignOffersResponse> = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getCampaignOffersRequest: GetCampaignOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignOffersResponse> = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignQuarantineOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignQuarantineOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignQuarantineOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignQuarantineOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignQuarantineOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignQuarantineOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val getQuarantineOffersRequest: GetQuarantineOffersRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetQuarantineOffersResponse> = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignRegion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignRegionTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignRegionResponse> = api.getCampaignRegion(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignRegion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignRegionTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignRegionResponse> = api.getCampaignRegion(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignRegion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignRegionTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignRegionResponse> = api.getCampaignRegion(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignRegion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignRegionTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignRegionResponse> = api.getCampaignRegion(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignRegion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignRegionTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignRegionResponse> = api.getCampaignRegion(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignSettingsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignSettingsResponse> = api.getCampaignSettings(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignSettingsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignSettingsResponse> = api.getCampaignSettings(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignSettingsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignSettingsResponse> = api.getCampaignSettings(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignSettingsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignSettingsResponse> = api.getCampaignSettings(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignSettingsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetCampaignSettingsResponse> = api.getCampaignSettings(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsTest() {
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaigns(page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsTest() {
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaigns(page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsTest() {
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaigns(page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsTest() {
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaigns(page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaigns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsTest() {
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaigns(page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignsByLogin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsByLoginTest() {
        val login: kotlin.String = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaignsByLogin(login, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignsByLogin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsByLoginTest() {
        val login: kotlin.String = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaignsByLogin(login, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignsByLogin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsByLoginTest() {
        val login: kotlin.String = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaignsByLogin(login, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignsByLogin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsByLoginTest() {
        val login: kotlin.String = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaignsByLogin(login, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getCampaignsByLogin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getCampaignsByLoginTest() {
        val login: kotlin.String = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetCampaignsResponse> = api.getCampaignsByLogin(login, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedResponse> = api.getFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedResponse> = api.getFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedResponse> = api.getFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedResponse> = api.getFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedResponse> = api.getFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedIndexLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedIndexLogsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val limit: kotlin.Int? = TODO()
        val publishedTimeFrom: java.time.OffsetDateTime? = TODO()
        val publishedTimeTo: java.time.OffsetDateTime? = TODO()
        val status: FeedIndexLogsStatusType? = TODO()
        val response: ResponseEntity<GetFeedIndexLogsResponse> = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedIndexLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedIndexLogsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val limit: kotlin.Int? = TODO()
        val publishedTimeFrom: java.time.OffsetDateTime? = TODO()
        val publishedTimeTo: java.time.OffsetDateTime? = TODO()
        val status: FeedIndexLogsStatusType? = TODO()
        val response: ResponseEntity<GetFeedIndexLogsResponse> = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedIndexLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedIndexLogsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val limit: kotlin.Int? = TODO()
        val publishedTimeFrom: java.time.OffsetDateTime? = TODO()
        val publishedTimeTo: java.time.OffsetDateTime? = TODO()
        val status: FeedIndexLogsStatusType? = TODO()
        val response: ResponseEntity<GetFeedIndexLogsResponse> = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedIndexLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedIndexLogsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val limit: kotlin.Int? = TODO()
        val publishedTimeFrom: java.time.OffsetDateTime? = TODO()
        val publishedTimeTo: java.time.OffsetDateTime? = TODO()
        val status: FeedIndexLogsStatusType? = TODO()
        val response: ResponseEntity<GetFeedIndexLogsResponse> = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedIndexLogs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedIndexLogsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val limit: kotlin.Int? = TODO()
        val publishedTimeFrom: java.time.OffsetDateTime? = TODO()
        val publishedTimeTo: java.time.OffsetDateTime? = TODO()
        val status: FeedIndexLogsStatusType? = TODO()
        val response: ResponseEntity<GetFeedIndexLogsResponse> = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedbackAndCommentUpdates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedbackAndCommentUpdatesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetFeedbackListResponse> = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedbackAndCommentUpdates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedbackAndCommentUpdatesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetFeedbackListResponse> = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedbackAndCommentUpdates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedbackAndCommentUpdatesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetFeedbackListResponse> = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedbackAndCommentUpdates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedbackAndCommentUpdatesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetFeedbackListResponse> = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeedbackAndCommentUpdates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedbackAndCommentUpdatesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetFeedbackListResponse> = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeeds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedsResponse> = api.getFeeds(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeeds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedsResponse> = api.getFeeds(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeeds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedsResponse> = api.getFeeds(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeeds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedsResponse> = api.getFeeds(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getFeeds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFeedsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetFeedsResponse> = api.getFeeds(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getGoodsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val getGoodsStatsRequest: GetGoodsStatsRequest = TODO()
        val response: ResponseEntity<GetGoodsStatsResponse> = api.getGoodsStats(campaignId, getGoodsStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getGoodsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val getGoodsStatsRequest: GetGoodsStatsRequest = TODO()
        val response: ResponseEntity<GetGoodsStatsResponse> = api.getGoodsStats(campaignId, getGoodsStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getGoodsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val getGoodsStatsRequest: GetGoodsStatsRequest = TODO()
        val response: ResponseEntity<GetGoodsStatsResponse> = api.getGoodsStats(campaignId, getGoodsStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getGoodsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val getGoodsStatsRequest: GetGoodsStatsRequest = TODO()
        val response: ResponseEntity<GetGoodsStatsResponse> = api.getGoodsStats(campaignId, getGoodsStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getGoodsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getGoodsStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val getGoodsStatsRequest: GetGoodsStatsRequest = TODO()
        val response: ResponseEntity<GetGoodsStatsResponse> = api.getGoodsStats(campaignId, getGoodsStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetHiddenOffersResponse> = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetHiddenOffersResponse> = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetHiddenOffersResponse> = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetHiddenOffersResponse> = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getHiddenOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getHiddenOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetHiddenOffersResponse> = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val shopSku: kotlin.collections.List<kotlin.String>? = TODO()
        val mappingKind: OfferMappingKindType? = TODO()
        val status: kotlin.collections.List<OfferProcessingStatusType>? = TODO()
        val availability: kotlin.collections.List<OfferAvailabilityStatusType>? = TODO()
        val categoryId: kotlin.collections.List<kotlin.Int>? = TODO()
        val vendor: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferMappingEntriesResponse> = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val shopSku: kotlin.collections.List<kotlin.String>? = TODO()
        val mappingKind: OfferMappingKindType? = TODO()
        val status: kotlin.collections.List<OfferProcessingStatusType>? = TODO()
        val availability: kotlin.collections.List<OfferAvailabilityStatusType>? = TODO()
        val categoryId: kotlin.collections.List<kotlin.Int>? = TODO()
        val vendor: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferMappingEntriesResponse> = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val shopSku: kotlin.collections.List<kotlin.String>? = TODO()
        val mappingKind: OfferMappingKindType? = TODO()
        val status: kotlin.collections.List<OfferProcessingStatusType>? = TODO()
        val availability: kotlin.collections.List<OfferAvailabilityStatusType>? = TODO()
        val categoryId: kotlin.collections.List<kotlin.Int>? = TODO()
        val vendor: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferMappingEntriesResponse> = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val shopSku: kotlin.collections.List<kotlin.String>? = TODO()
        val mappingKind: OfferMappingKindType? = TODO()
        val status: kotlin.collections.List<OfferProcessingStatusType>? = TODO()
        val availability: kotlin.collections.List<OfferAvailabilityStatusType>? = TODO()
        val categoryId: kotlin.collections.List<kotlin.Int>? = TODO()
        val vendor: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferMappingEntriesResponse> = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val offerId: kotlin.collections.List<kotlin.String>? = TODO()
        val shopSku: kotlin.collections.List<kotlin.String>? = TODO()
        val mappingKind: OfferMappingKindType? = TODO()
        val status: kotlin.collections.List<OfferProcessingStatusType>? = TODO()
        val availability: kotlin.collections.List<OfferAvailabilityStatusType>? = TODO()
        val categoryId: kotlin.collections.List<kotlin.Int>? = TODO()
        val vendor: kotlin.collections.List<kotlin.String>? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOfferMappingEntriesResponse> = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val query: kotlin.String? = TODO()
        val feedId: kotlin.Long? = TODO()
        val shopCategoryId: kotlin.String? = TODO()
        val currency: CurrencyType? = TODO()
        val matched: kotlin.Boolean? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOffersResponse> = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val query: kotlin.String? = TODO()
        val feedId: kotlin.Long? = TODO()
        val shopCategoryId: kotlin.String? = TODO()
        val currency: CurrencyType? = TODO()
        val matched: kotlin.Boolean? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOffersResponse> = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val query: kotlin.String? = TODO()
        val feedId: kotlin.Long? = TODO()
        val shopCategoryId: kotlin.String? = TODO()
        val currency: CurrencyType? = TODO()
        val matched: kotlin.Boolean? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOffersResponse> = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val query: kotlin.String? = TODO()
        val feedId: kotlin.Long? = TODO()
        val shopCategoryId: kotlin.String? = TODO()
        val currency: CurrencyType? = TODO()
        val matched: kotlin.Boolean? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOffersResponse> = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val query: kotlin.String? = TODO()
        val feedId: kotlin.Long? = TODO()
        val shopCategoryId: kotlin.String? = TODO()
        val currency: CurrencyType? = TODO()
        val matched: kotlin.Boolean? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOffersResponse> = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderResponse> = api.getOrder(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderResponse> = api.getOrder(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderResponse> = api.getOrder(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderResponse> = api.getOrder(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderResponse> = api.getOrder(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessBuyerInfoResponse> = api.getOrderBusinessBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessBuyerInfoResponse> = api.getOrderBusinessBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessBuyerInfoResponse> = api.getOrderBusinessBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessBuyerInfoResponse> = api.getOrderBusinessBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessBuyerInfoResponse> = api.getOrderBusinessBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessDocumentsInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessDocumentsInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessDocumentsInfoResponse> = api.getOrderBusinessDocumentsInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessDocumentsInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessDocumentsInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessDocumentsInfoResponse> = api.getOrderBusinessDocumentsInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessDocumentsInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessDocumentsInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessDocumentsInfoResponse> = api.getOrderBusinessDocumentsInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessDocumentsInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessDocumentsInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessDocumentsInfoResponse> = api.getOrderBusinessDocumentsInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBusinessDocumentsInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBusinessDocumentsInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetBusinessDocumentsInfoResponse> = api.getOrderBusinessDocumentsInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderBuyerInfoResponse> = api.getOrderBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderBuyerInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderBuyerInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderBuyerInfoResponse> = api.getOrderBuyerInfo(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderLabelsData
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderLabelsDataTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderLabelsDataResponse> = api.getOrderLabelsData(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderLabelsData
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderLabelsDataTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderLabelsDataResponse> = api.getOrderLabelsData(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderLabelsData
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderLabelsDataTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderLabelsDataResponse> = api.getOrderLabelsData(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrderLabelsData
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrderLabelsDataTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOrderLabelsDataResponse> = api.getOrderLabelsData(campaignId, orderId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val status: kotlin.collections.Set<OrderStatusType>? = TODO()
        val substatus: kotlin.collections.Set<OrderSubstatusType>? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val supplierShipmentDateFrom: java.time.LocalDate? = TODO()
        val supplierShipmentDateTo: java.time.LocalDate? = TODO()
        val updatedAtFrom: java.time.OffsetDateTime? = TODO()
        val updatedAtTo: java.time.OffsetDateTime? = TODO()
        val dispatchType: OrderDeliveryDispatchType? = TODO()
        val fake: kotlin.Boolean = TODO()
        val hasCis: kotlin.Boolean = TODO()
        val onlyWaitingForCancellationApprove: kotlin.Boolean = TODO()
        val onlyEstimatedDelivery: kotlin.Boolean = TODO()
        val buyerType: OrderBuyerType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOrdersResponse> = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val status: kotlin.collections.Set<OrderStatusType>? = TODO()
        val substatus: kotlin.collections.Set<OrderSubstatusType>? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val supplierShipmentDateFrom: java.time.LocalDate? = TODO()
        val supplierShipmentDateTo: java.time.LocalDate? = TODO()
        val updatedAtFrom: java.time.OffsetDateTime? = TODO()
        val updatedAtTo: java.time.OffsetDateTime? = TODO()
        val dispatchType: OrderDeliveryDispatchType? = TODO()
        val fake: kotlin.Boolean = TODO()
        val hasCis: kotlin.Boolean = TODO()
        val onlyWaitingForCancellationApprove: kotlin.Boolean = TODO()
        val onlyEstimatedDelivery: kotlin.Boolean = TODO()
        val buyerType: OrderBuyerType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOrdersResponse> = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val status: kotlin.collections.Set<OrderStatusType>? = TODO()
        val substatus: kotlin.collections.Set<OrderSubstatusType>? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val supplierShipmentDateFrom: java.time.LocalDate? = TODO()
        val supplierShipmentDateTo: java.time.LocalDate? = TODO()
        val updatedAtFrom: java.time.OffsetDateTime? = TODO()
        val updatedAtTo: java.time.OffsetDateTime? = TODO()
        val dispatchType: OrderDeliveryDispatchType? = TODO()
        val fake: kotlin.Boolean = TODO()
        val hasCis: kotlin.Boolean = TODO()
        val onlyWaitingForCancellationApprove: kotlin.Boolean = TODO()
        val onlyEstimatedDelivery: kotlin.Boolean = TODO()
        val buyerType: OrderBuyerType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOrdersResponse> = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val status: kotlin.collections.Set<OrderStatusType>? = TODO()
        val substatus: kotlin.collections.Set<OrderSubstatusType>? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val supplierShipmentDateFrom: java.time.LocalDate? = TODO()
        val supplierShipmentDateTo: java.time.LocalDate? = TODO()
        val updatedAtFrom: java.time.OffsetDateTime? = TODO()
        val updatedAtTo: java.time.OffsetDateTime? = TODO()
        val dispatchType: OrderDeliveryDispatchType? = TODO()
        val fake: kotlin.Boolean = TODO()
        val hasCis: kotlin.Boolean = TODO()
        val onlyWaitingForCancellationApprove: kotlin.Boolean = TODO()
        val onlyEstimatedDelivery: kotlin.Boolean = TODO()
        val buyerType: OrderBuyerType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOrdersResponse> = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val status: kotlin.collections.Set<OrderStatusType>? = TODO()
        val substatus: kotlin.collections.Set<OrderSubstatusType>? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val supplierShipmentDateFrom: java.time.LocalDate? = TODO()
        val supplierShipmentDateTo: java.time.LocalDate? = TODO()
        val updatedAtFrom: java.time.OffsetDateTime? = TODO()
        val updatedAtTo: java.time.OffsetDateTime? = TODO()
        val dispatchType: OrderDeliveryDispatchType? = TODO()
        val fake: kotlin.Boolean = TODO()
        val hasCis: kotlin.Boolean = TODO()
        val onlyWaitingForCancellationApprove: kotlin.Boolean = TODO()
        val onlyEstimatedDelivery: kotlin.Boolean = TODO()
        val buyerType: OrderBuyerType? = TODO()
        val page: kotlin.Int = TODO()
        val pageSize: kotlin.Int? = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<GetOrdersResponse> = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrdersStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOrdersStatsRequest: GetOrdersStatsRequest? = TODO()
        val response: ResponseEntity<GetOrdersStatsResponse> = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrdersStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOrdersStatsRequest: GetOrdersStatsRequest? = TODO()
        val response: ResponseEntity<GetOrdersStatsResponse> = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrdersStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOrdersStatsRequest: GetOrdersStatsRequest? = TODO()
        val response: ResponseEntity<GetOrdersStatsResponse> = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrdersStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOrdersStatsRequest: GetOrdersStatsRequest? = TODO()
        val response: ResponseEntity<GetOrdersStatsResponse> = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOrdersStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOrdersStatsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getOrdersStatsRequest: GetOrdersStatsRequest? = TODO()
        val response: ResponseEntity<GetOrdersStatsResponse> = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOutletResponse> = api.getOutlet(campaignId, outletId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val response: ResponseEntity<GetOutletResponse> = api.getOutlet(campaignId, outletId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val outletIds: kotlin.collections.Set<kotlin.Long>? = TODO()
        val ids: kotlin.collections.Set<kotlin.Long>? = TODO()
        val response: ResponseEntity<GetOutletLicensesResponse> = api.getOutletLicenses(campaignId, outletIds, ids)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val outletIds: kotlin.collections.Set<kotlin.Long>? = TODO()
        val ids: kotlin.collections.Set<kotlin.Long>? = TODO()
        val response: ResponseEntity<GetOutletLicensesResponse> = api.getOutletLicenses(campaignId, outletIds, ids)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutlets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val regionId: kotlin.Long? = TODO()
        val shopOutletCode: kotlin.String? = TODO()
        val regionId2: kotlin.Long? = TODO()
        val response: ResponseEntity<GetOutletsResponse> = api.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getOutlets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getOutletsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val regionId: kotlin.Long? = TODO()
        val shopOutletCode: kotlin.String? = TODO()
        val regionId2: kotlin.Long? = TODO()
        val response: ResponseEntity<GetOutletsResponse> = api.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val archived: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetPricesResponse> = api.getPrices(campaignId, pageToken, limit, archived)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val archived: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetPricesResponse> = api.getPrices(campaignId, pageToken, limit, archived)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val archived: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetPricesResponse> = api.getPrices(campaignId, pageToken, limit, archived)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val archived: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetPricesResponse> = api.getPrices(campaignId, pageToken, limit, archived)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val archived: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetPricesResponse> = api.getPrices(campaignId, pageToken, limit, archived)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPricesByOfferIds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesByOfferIdsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest? = TODO()
        val response: ResponseEntity<GetPricesByOfferIdsResponse> = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPricesByOfferIds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesByOfferIdsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest? = TODO()
        val response: ResponseEntity<GetPricesByOfferIdsResponse> = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPricesByOfferIds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesByOfferIdsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest? = TODO()
        val response: ResponseEntity<GetPricesByOfferIdsResponse> = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPricesByOfferIds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesByOfferIdsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest? = TODO()
        val response: ResponseEntity<GetPricesByOfferIdsResponse> = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getPricesByOfferIds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPricesByOfferIdsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest? = TODO()
        val response: ResponseEntity<GetPricesByOfferIdsResponse> = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getQualityRatingDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingDetailsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetQualityRatingDetailsResponse> = api.getQualityRatingDetails(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getQualityRatingDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingDetailsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetQualityRatingDetailsResponse> = api.getQualityRatingDetails(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getQualityRatingDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingDetailsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetQualityRatingDetailsResponse> = api.getQualityRatingDetails(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getQualityRatingDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getQualityRatingDetailsTest() {
        val campaignId: kotlin.Long = TODO()
        val response: ResponseEntity<GetQualityRatingDetailsResponse> = api.getQualityRatingDetails(campaignId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<GetReturnResponse> = api.getReturn(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<GetReturnResponse> = api.getReturn(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<GetReturnResponse> = api.getReturn(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<GetReturnResponse> = api.getReturn(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturn
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<GetReturnResponse> = api.getReturn(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnApplication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnApplicationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnApplication(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnApplication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnApplicationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnApplication(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnApplication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnApplicationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnApplication(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnApplication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnApplicationTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnApplication(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnPhoto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnPhotoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val itemId: kotlin.Long = TODO()
        val imageHash: kotlin.String = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnPhoto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnPhotoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val itemId: kotlin.Long = TODO()
        val imageHash: kotlin.String = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnPhoto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnPhotoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val itemId: kotlin.Long = TODO()
        val imageHash: kotlin.String = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnPhoto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnPhotoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val itemId: kotlin.Long = TODO()
        val imageHash: kotlin.String = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturnPhoto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnPhotoTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val itemId: kotlin.Long = TODO()
        val imageHash: kotlin.String = TODO()
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val statuses: kotlin.collections.List<RefundStatusType>? = TODO()
        val type: ReturnType? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val fromDate2: java.time.LocalDate? = TODO()
        val toDate2: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetReturnsResponse> = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val statuses: kotlin.collections.List<RefundStatusType>? = TODO()
        val type: ReturnType? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val fromDate2: java.time.LocalDate? = TODO()
        val toDate2: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetReturnsResponse> = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val statuses: kotlin.collections.List<RefundStatusType>? = TODO()
        val type: ReturnType? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val fromDate2: java.time.LocalDate? = TODO()
        val toDate2: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetReturnsResponse> = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val statuses: kotlin.collections.List<RefundStatusType>? = TODO()
        val type: ReturnType? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val fromDate2: java.time.LocalDate? = TODO()
        val toDate2: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetReturnsResponse> = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getReturns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getReturnsTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val orderIds: kotlin.collections.List<kotlin.Long>? = TODO()
        val statuses: kotlin.collections.List<RefundStatusType>? = TODO()
        val type: ReturnType? = TODO()
        val fromDate: java.time.LocalDate? = TODO()
        val toDate: java.time.LocalDate? = TODO()
        val fromDate2: java.time.LocalDate? = TODO()
        val toDate2: java.time.LocalDate? = TODO()
        val response: ResponseEntity<GetReturnsResponse> = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val cancelledOrders: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetShipmentResponse> = api.getShipment(campaignId, shipmentId, cancelledOrders)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val cancelledOrders: kotlin.Boolean = TODO()
        val response: ResponseEntity<GetShipmentResponse> = api.getShipment(campaignId, shipmentId, cancelledOrders)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getShipmentOrdersInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getShipmentOrdersInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<GetShipmentOrdersInfoResponse> = api.getShipmentOrdersInfo(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getShipmentOrdersInfo
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getShipmentOrdersInfoTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val response: ResponseEntity<GetShipmentOrdersInfoResponse> = api.getShipmentOrdersInfo(campaignId, shipmentId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getWarehouseStocksRequest: GetWarehouseStocksRequest? = TODO()
        val response: ResponseEntity<GetWarehouseStocksResponse> = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getWarehouseStocksRequest: GetWarehouseStocksRequest? = TODO()
        val response: ResponseEntity<GetWarehouseStocksResponse> = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getWarehouseStocksRequest: GetWarehouseStocksRequest? = TODO()
        val response: ResponseEntity<GetWarehouseStocksResponse> = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getWarehouseStocksRequest: GetWarehouseStocksRequest? = TODO()
        val response: ResponseEntity<GetWarehouseStocksResponse> = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val getWarehouseStocksRequest: GetWarehouseStocksRequest? = TODO()
        val response: ResponseEntity<GetWarehouseStocksResponse> = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingEntriesResponse> = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingEntriesResponse> = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingEntriesResponse> = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingEntriesResponse> = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest = TODO()
        val response: ResponseEntity<GetSuggestedOfferMappingEntriesResponse> = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val suggestPricesRequest: SuggestPricesRequest = TODO()
        val response: ResponseEntity<SuggestPricesResponse> = api.getSuggestedPrices(campaignId, suggestPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val suggestPricesRequest: SuggestPricesRequest = TODO()
        val response: ResponseEntity<SuggestPricesResponse> = api.getSuggestedPrices(campaignId, suggestPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val suggestPricesRequest: SuggestPricesRequest = TODO()
        val response: ResponseEntity<SuggestPricesResponse> = api.getSuggestedPrices(campaignId, suggestPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val suggestPricesRequest: SuggestPricesRequest = TODO()
        val response: ResponseEntity<SuggestPricesResponse> = api.getSuggestedPrices(campaignId, suggestPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.getSuggestedPrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getSuggestedPricesTest() {
        val campaignId: kotlin.Long = TODO()
        val suggestPricesRequest: SuggestPricesRequest = TODO()
        val response: ResponseEntity<SuggestPricesResponse> = api.getSuggestedPrices(campaignId, suggestPricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderDigitalCodes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderDigitalCodesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderDigitalCodes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderDigitalCodesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderItemIdentifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderItemIdentifiersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest = TODO()
        val response: ResponseEntity<ProvideOrderItemIdentifiersResponse> = api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderItemIdentifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderItemIdentifiersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest = TODO()
        val response: ResponseEntity<ProvideOrderItemIdentifiersResponse> = api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderItemIdentifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderItemIdentifiersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest = TODO()
        val response: ResponseEntity<ProvideOrderItemIdentifiersResponse> = api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.provideOrderItemIdentifiers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun provideOrderItemIdentifiersTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest = TODO()
        val response: ResponseEntity<ProvideOrderItemIdentifiersResponse> = api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.putBidsForCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForCampaign(campaignId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.putBidsForCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForCampaign(campaignId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.putBidsForCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForCampaign(campaignId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.putBidsForCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForCampaign(campaignId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.putBidsForCampaign
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun putBidsForCampaignTest() {
        val campaignId: kotlin.Long = TODO()
        val putSkuBidsRequest: PutSkuBidsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.putBidsForCampaign(campaignId, putSkuBidsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.refreshFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun refreshFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.refreshFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.refreshFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun refreshFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.refreshFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.refreshFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun refreshFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.refreshFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.refreshFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun refreshFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.refreshFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.refreshFeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun refreshFeedTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.refreshFeed(campaignId, feedId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.searchShipments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchShipmentsTest() {
        val campaignId: kotlin.Long = TODO()
        val searchShipmentsRequest: SearchShipmentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<SearchShipmentsResponse> = api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.searchShipments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchShipmentsTest() {
        val campaignId: kotlin.Long = TODO()
        val searchShipmentsRequest: SearchShipmentsRequest = TODO()
        val pageToken: kotlin.String? = TODO()
        val limit: kotlin.Int? = TODO()
        val response: ResponseEntity<SearchShipmentsResponse> = api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setFeedParams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setFeedParamsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val setFeedParamsRequest: SetFeedParamsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setFeedParams(campaignId, feedId, setFeedParamsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setFeedParams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setFeedParamsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val setFeedParamsRequest: SetFeedParamsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setFeedParams(campaignId, feedId, setFeedParamsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setFeedParams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setFeedParamsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val setFeedParamsRequest: SetFeedParamsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setFeedParams(campaignId, feedId, setFeedParamsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setFeedParams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setFeedParamsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val setFeedParamsRequest: SetFeedParamsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setFeedParams(campaignId, feedId, setFeedParamsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setFeedParams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setFeedParamsTest() {
        val campaignId: kotlin.Long = TODO()
        val feedId: kotlin.Long = TODO()
        val setFeedParamsRequest: SetFeedParamsRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setFeedParams(campaignId, feedId, setFeedParamsRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderBoxLayout
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderBoxLayoutTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest = TODO()
        val response: ResponseEntity<SetOrderBoxLayoutResponse> = api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderBoxLayout
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderBoxLayoutTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest = TODO()
        val response: ResponseEntity<SetOrderBoxLayoutResponse> = api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderBoxLayout
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderBoxLayoutTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest = TODO()
        val response: ResponseEntity<SetOrderBoxLayoutResponse> = api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderBoxLayout
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderBoxLayoutTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest = TODO()
        val response: ResponseEntity<SetOrderBoxLayoutResponse> = api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderDeliveryDate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderDeliveryDateTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderDeliveryDate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderDeliveryDateTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderDeliveryTrackCode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderDeliveryTrackCodeTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderDeliveryTrackCode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderDeliveryTrackCodeTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderShipmentBoxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderShipmentBoxesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest = TODO()
        val response: ResponseEntity<SetOrderShipmentBoxesResponse> = api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderShipmentBoxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderShipmentBoxesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest = TODO()
        val response: ResponseEntity<SetOrderShipmentBoxesResponse> = api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderShipmentBoxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderShipmentBoxesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest = TODO()
        val response: ResponseEntity<SetOrderShipmentBoxesResponse> = api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setOrderShipmentBoxes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setOrderShipmentBoxesTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest = TODO()
        val response: ResponseEntity<SetOrderShipmentBoxesResponse> = api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setReturnDecision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setReturnDecisionTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val setReturnDecisionRequest: SetReturnDecisionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setReturnDecision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setReturnDecisionTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val setReturnDecisionRequest: SetReturnDecisionRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setShipmentPalletsCount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setShipmentPalletsCountTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.setShipmentPalletsCount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun setShipmentPalletsCountTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.submitReturnDecision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun submitReturnDecisionTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.submitReturnDecision(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.submitReturnDecision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun submitReturnDecisionTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val returnId: kotlin.Long = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.submitReturnDecision(campaignId, orderId, returnId)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.transferOrdersFromShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun transferOrdersFromShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.transferOrdersFromShipment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun transferOrdersFromShipmentTest() {
        val campaignId: kotlin.Long = TODO()
        val shipmentId: kotlin.Long = TODO()
        val transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val updateCampaignOffersRequest: UpdateCampaignOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val updateCampaignOffersRequest: UpdateCampaignOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val updateCampaignOffersRequest: UpdateCampaignOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val updateCampaignOffersRequest: UpdateCampaignOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateCampaignOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateCampaignOffersTest() {
        val campaignId: kotlin.Long = TODO()
        val updateCampaignOffersRequest: UpdateCampaignOffersRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOfferMappingEntries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOfferMappingEntriesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderItems
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderItemsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderItemRequest: UpdateOrderItemRequest = TODO()
        val response: ResponseEntity<Unit> = api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderItems
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderItemsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderItemRequest: UpdateOrderItemRequest = TODO()
        val response: ResponseEntity<Unit> = api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderItems
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderItemsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderItemRequest: UpdateOrderItemRequest = TODO()
        val response: ResponseEntity<Unit> = api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderItems
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderItemsTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderItemRequest: UpdateOrderItemRequest = TODO()
        val response: ResponseEntity<Unit> = api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStatusRequest: UpdateOrderStatusRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusResponse> = api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStatusRequest: UpdateOrderStatusRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusResponse> = api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStatusRequest: UpdateOrderStatusRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusResponse> = api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStatusRequest: UpdateOrderStatusRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusResponse> = api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOrderStatusesRequest: UpdateOrderStatusesRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusesResponse> = api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOrderStatusesRequest: UpdateOrderStatusesRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusesResponse> = api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOrderStatusesRequest: UpdateOrderStatusesRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusesResponse> = api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStatuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStatusesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOrderStatusesRequest: UpdateOrderStatusesRequest = TODO()
        val response: ResponseEntity<UpdateOrderStatusesResponse> = api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStorageLimit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStorageLimitTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOrderStorageLimit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOrderStorageLimitTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val changeOutletRequest: ChangeOutletRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOutlet(campaignId, outletId, changeOutletRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOutlet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOutletTest() {
        val campaignId: kotlin.Long = TODO()
        val outletId: kotlin.Long = TODO()
        val changeOutletRequest: ChangeOutletRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOutlet(campaignId, outletId, changeOutletRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOutletLicenseRequest: UpdateOutletLicenseRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOutletLicenses(campaignId, updateOutletLicenseRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateOutletLicenses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateOutletLicensesTest() {
        val campaignId: kotlin.Long = TODO()
        val updateOutletLicenseRequest: UpdateOutletLicenseRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateOutletLicenses(campaignId, updateOutletLicenseRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updatePrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePricesTest() {
        val campaignId: kotlin.Long = TODO()
        val updatePricesRequest: UpdatePricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updatePrices(campaignId, updatePricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updatePrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePricesTest() {
        val campaignId: kotlin.Long = TODO()
        val updatePricesRequest: UpdatePricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updatePrices(campaignId, updatePricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updatePrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePricesTest() {
        val campaignId: kotlin.Long = TODO()
        val updatePricesRequest: UpdatePricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updatePrices(campaignId, updatePricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updatePrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePricesTest() {
        val campaignId: kotlin.Long = TODO()
        val updatePricesRequest: UpdatePricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updatePrices(campaignId, updatePricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updatePrices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePricesTest() {
        val campaignId: kotlin.Long = TODO()
        val updatePricesRequest: UpdatePricesRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updatePrices(campaignId, updatePricesRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val updateStocksRequest: UpdateStocksRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateStocks(campaignId, updateStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val updateStocksRequest: UpdateStocksRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateStocks(campaignId, updateStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val updateStocksRequest: UpdateStocksRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateStocks(campaignId, updateStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.updateStocks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateStocksTest() {
        val campaignId: kotlin.Long = TODO()
        val updateStocksRequest: UpdateStocksRequest = TODO()
        val response: ResponseEntity<EmptyApiResponse> = api.updateStocks(campaignId, updateStocksRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.verifyOrderEac
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun verifyOrderEacTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val verifyOrderEacRequest: VerifyOrderEacRequest = TODO()
        val response: ResponseEntity<VerifyOrderEacResponse> = api.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest)

        // TODO: test validations
    }

    /**
     * To test CampaignsApiController.verifyOrderEac
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun verifyOrderEacTest() {
        val campaignId: kotlin.Long = TODO()
        val orderId: kotlin.Long = TODO()
        val verifyOrderEacRequest: VerifyOrderEacRequest = TODO()
        val response: ResponseEntity<VerifyOrderEacResponse> = api.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest)

        // TODO: test validations
    }
}

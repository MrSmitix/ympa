package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AcceptOrderCancellationRequest;
import org.openapitools.model.AddHiddenOffersRequest;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ChangeOutletRequest;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.ConfirmShipmentRequest;
import org.openapitools.model.CreateOutletResponse;
import org.openapitools.model.CurrencyType;
import java.util.Date;
import org.openapitools.model.DeleteCampaignOffersRequest;
import org.openapitools.model.DeleteCampaignOffersResponse;
import org.openapitools.model.DeleteHiddenOffersRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.FeedIndexLogsStatusType;
import java.io.File;
import org.openapitools.model.GetAllOffersResponse;
import org.openapitools.model.GetBusinessBuyerInfoResponse;
import org.openapitools.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.model.GetCampaignLoginsResponse;
import org.openapitools.model.GetCampaignOffersRequest;
import org.openapitools.model.GetCampaignOffersResponse;
import org.openapitools.model.GetCampaignRegionResponse;
import org.openapitools.model.GetCampaignResponse;
import org.openapitools.model.GetCampaignSettingsResponse;
import org.openapitools.model.GetCampaignsResponse;
import org.openapitools.model.GetFeedIndexLogsResponse;
import org.openapitools.model.GetFeedResponse;
import org.openapitools.model.GetFeedbackListResponse;
import org.openapitools.model.GetFeedsResponse;
import org.openapitools.model.GetGoodsStatsRequest;
import org.openapitools.model.GetGoodsStatsResponse;
import org.openapitools.model.GetHiddenOffersResponse;
import org.openapitools.model.GetOfferMappingEntriesResponse;
import org.openapitools.model.GetOffersResponse;
import org.openapitools.model.GetOrderBuyerInfoResponse;
import org.openapitools.model.GetOrderLabelsDataResponse;
import org.openapitools.model.GetOrderResponse;
import org.openapitools.model.GetOrdersResponse;
import org.openapitools.model.GetOrdersStatsRequest;
import org.openapitools.model.GetOrdersStatsResponse;
import org.openapitools.model.GetOutletLicensesResponse;
import org.openapitools.model.GetOutletResponse;
import org.openapitools.model.GetOutletsResponse;
import org.openapitools.model.GetPricesByOfferIdsRequest;
import org.openapitools.model.GetPricesByOfferIdsResponse;
import org.openapitools.model.GetPricesResponse;
import org.openapitools.model.GetQualityRatingDetailsResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;
import org.openapitools.model.GetReturnResponse;
import org.openapitools.model.GetReturnsResponse;
import org.openapitools.model.GetShipmentOrdersInfoResponse;
import org.openapitools.model.GetShipmentResponse;
import org.openapitools.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.model.GetWarehouseStocksRequest;
import org.openapitools.model.GetWarehouseStocksResponse;
import java.util.List;
import org.openapitools.model.OfferAvailabilityStatusType;
import org.openapitools.model.OfferMappingKindType;
import org.openapitools.model.OfferProcessingStatusType;
import org.openapitools.model.OrderBuyerType;
import org.openapitools.model.OrderDeliveryDispatchType;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.PageFormatType;
import org.openapitools.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.model.ProvideOrderItemIdentifiersResponse;
import org.openapitools.model.PutSkuBidsRequest;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SearchShipmentsRequest;
import org.openapitools.model.SearchShipmentsResponse;
import java.util.Set;
import org.openapitools.model.SetFeedParamsRequest;
import org.openapitools.model.SetOrderBoxLayoutRequest;
import org.openapitools.model.SetOrderBoxLayoutResponse;
import org.openapitools.model.SetOrderDeliveryDateRequest;
import org.openapitools.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.model.SetOrderShipmentBoxesRequest;
import org.openapitools.model.SetOrderShipmentBoxesResponse;
import org.openapitools.model.SetReturnDecisionRequest;
import org.openapitools.model.SetShipmentPalletsCountRequest;
import org.openapitools.model.ShipmentPalletLabelPageFormatType;
import org.openapitools.model.SuggestPricesRequest;
import org.openapitools.model.SuggestPricesResponse;
import org.openapitools.model.TransferOrdersFromShipmentRequest;
import org.openapitools.model.UpdateCampaignOffersRequest;
import org.openapitools.model.UpdateOfferMappingEntryRequest;
import org.openapitools.model.UpdateOrderItemRequest;
import org.openapitools.model.UpdateOrderStatusRequest;
import org.openapitools.model.UpdateOrderStatusResponse;
import org.openapitools.model.UpdateOrderStatusesRequest;
import org.openapitools.model.UpdateOrderStatusesResponse;
import org.openapitools.model.UpdateOrderStorageLimitRequest;
import org.openapitools.model.UpdateOutletLicenseRequest;
import org.openapitools.model.UpdatePricesRequest;
import org.openapitools.model.UpdateStocksRequest;
import org.openapitools.model.VerifyOrderEacRequest;
import org.openapitools.model.VerifyOrderEacResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class CampaignsApiService {
    public abstract Response acceptOrderCancellation(Long campaignId
 ,Long orderId
 ,AcceptOrderCancellationRequest acceptOrderCancellationRequest
 ) throws NotFoundException;
    public abstract Response addHiddenOffers(Long campaignId
 ,AddHiddenOffersRequest addHiddenOffersRequest
 ) throws NotFoundException;
    public abstract Response confirmCampaignPrices(Long campaignId
 ,ConfirmPricesRequest confirmPricesRequest
 ) throws NotFoundException;
    public abstract Response confirmShipment(Long campaignId
 ,Long shipmentId
 ,ConfirmShipmentRequest confirmShipmentRequest
 ) throws NotFoundException;
    public abstract Response createOutlet(Long campaignId
 ,ChangeOutletRequest changeOutletRequest
 ) throws NotFoundException;
    public abstract Response deleteCampaignOffers(Long campaignId
 ,DeleteCampaignOffersRequest deleteCampaignOffersRequest
 ) throws NotFoundException;
    public abstract Response deleteHiddenOffers(Long campaignId
 ,DeleteHiddenOffersRequest deleteHiddenOffersRequest
 ) throws NotFoundException;
    public abstract Response deleteOutlet(Long campaignId
 ,Long outletId
 ) throws NotFoundException;
    public abstract Response deleteOutletLicenses(Long campaignId
 ,Set<Long> ids
 ) throws NotFoundException;
    public abstract Response downloadShipmentAct(Long campaignId
 ,Long shipmentId
 ) throws NotFoundException;
    public abstract Response downloadShipmentDiscrepancyAct(Long campaignId
 ,Long shipmentId
 ) throws NotFoundException;
    public abstract Response downloadShipmentInboundAct(Long campaignId
 ,Long shipmentId
 ) throws NotFoundException;
    public abstract Response downloadShipmentPalletLabels(Long campaignId
 ,Long shipmentId
 ,ShipmentPalletLabelPageFormatType format
 ) throws NotFoundException;
    public abstract Response downloadShipmentReceptionTransferAct(Long campaignId
 ,Integer warehouseId
 ) throws NotFoundException;
    public abstract Response downloadShipmentTransportationWaybill(Long campaignId
 ,Long shipmentId
 ) throws NotFoundException;
    public abstract Response generateOrderLabel(Long campaignId
 ,Long orderId
 ,Long shipmentId
 ,Long boxId
 ,PageFormatType format
 ) throws NotFoundException;
    public abstract Response generateOrderLabels(Long campaignId
 ,Long orderId
 ,PageFormatType format
 ) throws NotFoundException;
    public abstract Response getAllOffers(Long campaignId
 ,Long feedId
 ,Integer chunk
 ) throws NotFoundException;
    public abstract Response getCampaign(Long campaignId
 ) throws NotFoundException;
    public abstract Response getCampaignLogins(Long campaignId
 ) throws NotFoundException;
    public abstract Response getCampaignOffers(Long campaignId
 ,GetCampaignOffersRequest getCampaignOffersRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getCampaignQuarantineOffers(Long campaignId
 ,GetQuarantineOffersRequest getQuarantineOffersRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getCampaignRegion(Long campaignId
 ) throws NotFoundException;
    public abstract Response getCampaignSettings(Long campaignId
 ) throws NotFoundException;
    public abstract Response getCampaigns(Integer page
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response getCampaignsByLogin(String login
 ,Integer page
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response getFeed(Long campaignId
 ,Long feedId
 ) throws NotFoundException;
    public abstract Response getFeedIndexLogs(Long campaignId
 ,Long feedId
 ,Integer limit
 ,Date publishedTimeFrom
 ,Date publishedTimeTo
 ,FeedIndexLogsStatusType status
 ) throws NotFoundException;
    public abstract Response getFeedbackAndCommentUpdates(Long campaignId
 ,String pageToken
 ,Integer limit
 ,Date fromDate
 ) throws NotFoundException;
    public abstract Response getFeeds(Long campaignId
 ) throws NotFoundException;
    public abstract Response getGoodsStats(Long campaignId
 ,GetGoodsStatsRequest getGoodsStatsRequest
 ) throws NotFoundException;
    public abstract Response getHiddenOffers(Long campaignId
 ,List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId
 ,String pageToken
 ,Integer limit
 ,Integer offset
 ,Integer page
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response getOfferMappingEntries(Long campaignId
 ,List<String> offerId
 ,List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku
 ,OfferMappingKindType mappingKind
 ,List<OfferProcessingStatusType> status
 ,List<OfferAvailabilityStatusType> availability
 ,List<Integer> categoryId
 ,List<String> vendor
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getOffers(Long campaignId
 ,String query
 ,Long feedId
 ,String shopCategoryId
 ,CurrencyType currency
 ,Boolean matched
 ,Integer page
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response getOrder(Long campaignId
 ,Long orderId
 ) throws NotFoundException;
    public abstract Response getOrderBusinessBuyerInfo(Long campaignId
 ,Long orderId
 ) throws NotFoundException;
    public abstract Response getOrderBusinessDocumentsInfo(Long campaignId
 ,Long orderId
 ) throws NotFoundException;
    public abstract Response getOrderBuyerInfo(Long campaignId
 ,Long orderId
 ) throws NotFoundException;
    public abstract Response getOrderLabelsData(Long campaignId
 ,Long orderId
 ) throws NotFoundException;
    public abstract Response getOrders(Long campaignId
 ,List<Long> orderIds
 ,Set<OrderStatusType> status
 ,Set<OrderSubstatusType> substatus
 ,Date fromDate
 ,Date toDate
 ,Date supplierShipmentDateFrom
 ,Date supplierShipmentDateTo
 ,Date updatedAtFrom
 ,Date updatedAtTo
 ,OrderDeliveryDispatchType dispatchType
 ,Boolean fake
 ,Boolean hasCis
 ,Boolean onlyWaitingForCancellationApprove
 ,Boolean onlyEstimatedDelivery
 ,OrderBuyerType buyerType
 ,Integer page
 ,Integer pageSize
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getOrdersStats(Long campaignId
 ,String pageToken
 ,Integer limit
 ,GetOrdersStatsRequest getOrdersStatsRequest
 ) throws NotFoundException;
    public abstract Response getOutlet(Long campaignId
 ,Long outletId
 ) throws NotFoundException;
    public abstract Response getOutletLicenses(Long campaignId
 ,Set<Long> outletIds
 ,Set<Long> ids
 ) throws NotFoundException;
    public abstract Response getOutlets(Long campaignId
 ,String pageToken
 ,Long regionId
 ,String shopOutletCode
 ,Long regionId2
 ) throws NotFoundException;
    public abstract Response getPrices(Long campaignId
 ,String pageToken
 ,Integer limit
 ,Boolean archived
 ) throws NotFoundException;
    public abstract Response getPricesByOfferIds(Long campaignId
 ,String pageToken
 ,Integer limit
 ,GetPricesByOfferIdsRequest getPricesByOfferIdsRequest
 ) throws NotFoundException;
    public abstract Response getQualityRatingDetails(Long campaignId
 ) throws NotFoundException;
    public abstract Response getReturn(Long campaignId
 ,Long orderId
 ,Long returnId
 ) throws NotFoundException;
    public abstract Response getReturnApplication(Long campaignId
 ,Long orderId
 ,Long returnId
 ) throws NotFoundException;
    public abstract Response getReturnPhoto(Long campaignId
 ,Long orderId
 ,Long returnId
 ,Long itemId
 ,String imageHash
 ) throws NotFoundException;
    public abstract Response getReturns(Long campaignId
 ,String pageToken
 ,Integer limit
 ,List<Long> orderIds
 ,List<RefundStatusType> statuses
 ,ReturnType type
 ,Date fromDate
 ,Date toDate
 ,Date fromDate2
 ,Date toDate2
 ) throws NotFoundException;
    public abstract Response getShipment(Long campaignId
 ,Long shipmentId
 ,Boolean cancelledOrders
 ) throws NotFoundException;
    public abstract Response getShipmentOrdersInfo(Long campaignId
 ,Long shipmentId
 ) throws NotFoundException;
    public abstract Response getStocks(Long campaignId
 ,String pageToken
 ,Integer limit
 ,GetWarehouseStocksRequest getWarehouseStocksRequest
 ) throws NotFoundException;
    public abstract Response getSuggestedOfferMappingEntries(Long campaignId
 ,GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest
 ) throws NotFoundException;
    public abstract Response getSuggestedPrices(Long campaignId
 ,SuggestPricesRequest suggestPricesRequest
 ) throws NotFoundException;
    public abstract Response provideOrderDigitalCodes(Long campaignId
 ,Long orderId
 ,ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest
 ) throws NotFoundException;
    public abstract Response provideOrderItemIdentifiers(Long campaignId
 ,Long orderId
 ,ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest
 ) throws NotFoundException;
    public abstract Response putBidsForCampaign(Long campaignId
 ,PutSkuBidsRequest putSkuBidsRequest
 ) throws NotFoundException;
    public abstract Response refreshFeed(Long campaignId
 ,Long feedId
 ) throws NotFoundException;
    public abstract Response searchShipments(Long campaignId
 ,SearchShipmentsRequest searchShipmentsRequest
 ,String pageToken
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response setFeedParams(Long campaignId
 ,Long feedId
 ,SetFeedParamsRequest setFeedParamsRequest
 ) throws NotFoundException;
    public abstract Response setOrderBoxLayout(Long campaignId
 ,Long orderId
 ,SetOrderBoxLayoutRequest setOrderBoxLayoutRequest
 ) throws NotFoundException;
    public abstract Response setOrderDeliveryDate(Long campaignId
 ,Long orderId
 ,SetOrderDeliveryDateRequest setOrderDeliveryDateRequest
 ) throws NotFoundException;
    public abstract Response setOrderDeliveryTrackCode(Long campaignId
 ,Long orderId
 ,SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest
 ) throws NotFoundException;
    public abstract Response setOrderShipmentBoxes(Long campaignId
 ,Long orderId
 ,Long shipmentId
 ,SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest
 ) throws NotFoundException;
    public abstract Response setReturnDecision(Long campaignId
 ,Long orderId
 ,Long returnId
 ,SetReturnDecisionRequest setReturnDecisionRequest
 ) throws NotFoundException;
    public abstract Response setShipmentPalletsCount(Long campaignId
 ,Long shipmentId
 ,SetShipmentPalletsCountRequest setShipmentPalletsCountRequest
 ) throws NotFoundException;
    public abstract Response submitReturnDecision(Long campaignId
 ,Long orderId
 ,Long returnId
 ) throws NotFoundException;
    public abstract Response transferOrdersFromShipment(Long campaignId
 ,Long shipmentId
 ,TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest
 ) throws NotFoundException;
    public abstract Response updateCampaignOffers(Long campaignId
 ,UpdateCampaignOffersRequest updateCampaignOffersRequest
 ) throws NotFoundException;
    public abstract Response updateOfferMappingEntries(Long campaignId
 ,UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest
 ) throws NotFoundException;
    public abstract Response updateOrderItems(Long campaignId
 ,Long orderId
 ,UpdateOrderItemRequest updateOrderItemRequest
 ) throws NotFoundException;
    public abstract Response updateOrderStatus(Long campaignId
 ,Long orderId
 ,UpdateOrderStatusRequest updateOrderStatusRequest
 ) throws NotFoundException;
    public abstract Response updateOrderStatuses(Long campaignId
 ,UpdateOrderStatusesRequest updateOrderStatusesRequest
 ) throws NotFoundException;
    public abstract Response updateOrderStorageLimit(Long campaignId
 ,Long orderId
 ,UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest
 ) throws NotFoundException;
    public abstract Response updateOutlet(Long campaignId
 ,Long outletId
 ,ChangeOutletRequest changeOutletRequest
 ) throws NotFoundException;
    public abstract Response updateOutletLicenses(Long campaignId
 ,UpdateOutletLicenseRequest updateOutletLicenseRequest
 ) throws NotFoundException;
    public abstract Response updatePrices(Long campaignId
 ,UpdatePricesRequest updatePricesRequest
 ) throws NotFoundException;
    public abstract Response updateStocks(Long campaignId
 ,UpdateStocksRequest updateStocksRequest
 ) throws NotFoundException;
    public abstract Response verifyOrderEac(Long campaignId
 ,Long orderId
 ,VerifyOrderEacRequest verifyOrderEacRequest
 ) throws NotFoundException;
}

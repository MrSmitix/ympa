package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public interface CampaignsApiService {
      Response acceptOrderCancellation(Long campaignId,Long orderId,AcceptOrderCancellationRequest acceptOrderCancellationRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response addHiddenOffers(Long campaignId,AddHiddenOffersRequest addHiddenOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response confirmCampaignPrices(Long campaignId,ConfirmPricesRequest confirmPricesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response confirmShipment(Long campaignId,Long shipmentId,ConfirmShipmentRequest confirmShipmentRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createOutlet(Long campaignId,ChangeOutletRequest changeOutletRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCampaignOffers(Long campaignId,DeleteCampaignOffersRequest deleteCampaignOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteHiddenOffers(Long campaignId,DeleteHiddenOffersRequest deleteHiddenOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOutlet(Long campaignId,Long outletId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOutletLicenses(Long campaignId,Set<Long> ids,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentAct(Long campaignId,Long shipmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentDiscrepancyAct(Long campaignId,Long shipmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentInboundAct(Long campaignId,Long shipmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentPalletLabels(Long campaignId,Long shipmentId,ShipmentPalletLabelPageFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentReceptionTransferAct(Long campaignId,Integer warehouseId,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadShipmentTransportationWaybill(Long campaignId,Long shipmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response generateOrderLabel(Long campaignId,Long orderId,Long shipmentId,Long boxId,PageFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateOrderLabels(Long campaignId,Long orderId,PageFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response getAllOffers(Long campaignId,Long feedId,Integer chunk,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaign(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignLogins(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignOffers(Long campaignId,GetCampaignOffersRequest getCampaignOffersRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignQuarantineOffers(Long campaignId,GetQuarantineOffersRequest getQuarantineOffersRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignRegion(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignSettings(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaigns(Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignsByLogin(String login,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getFeed(Long campaignId,Long feedId,SecurityContext securityContext)
      throws NotFoundException;
      Response getFeedIndexLogs(Long campaignId,Long feedId,Integer limit,Date publishedTimeFrom,Date publishedTimeTo,FeedIndexLogsStatusType status,SecurityContext securityContext)
      throws NotFoundException;
      Response getFeedbackAndCommentUpdates(Long campaignId,String pageToken,Integer limit,Date fromDate,SecurityContext securityContext)
      throws NotFoundException;
      Response getFeeds(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getGoodsStats(Long campaignId,GetGoodsStatsRequest getGoodsStatsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getHiddenOffers(Long campaignId,List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId,String pageToken,Integer limit,Integer offset,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferMappingEntries(Long campaignId,List<String> offerId,List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku,OfferMappingKindType mappingKind,List<OfferProcessingStatusType> status,List<OfferAvailabilityStatusType> availability,List<Integer> categoryId,List<String> vendor,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getOffers(Long campaignId,String query,Long feedId,String shopCategoryId,CurrencyType currency,Boolean matched,Integer page,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrder(Long campaignId,Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderBusinessBuyerInfo(Long campaignId,Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderBusinessDocumentsInfo(Long campaignId,Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderBuyerInfo(Long campaignId,Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderLabelsData(Long campaignId,Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrders(Long campaignId,List<Long> orderIds,Set<OrderStatusType> status,Set<OrderSubstatusType> substatus,Date fromDate,Date toDate,Date supplierShipmentDateFrom,Date supplierShipmentDateTo,Date updatedAtFrom,Date updatedAtTo,OrderDeliveryDispatchType dispatchType,Boolean fake,Boolean hasCis,Boolean onlyWaitingForCancellationApprove,Boolean onlyEstimatedDelivery,OrderBuyerType buyerType,Integer page,Integer pageSize,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrdersStats(Long campaignId,String pageToken,Integer limit,GetOrdersStatsRequest getOrdersStatsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getOutlet(Long campaignId,Long outletId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOutletLicenses(Long campaignId,Set<Long> outletIds,Set<Long> ids,SecurityContext securityContext)
      throws NotFoundException;
      Response getOutlets(Long campaignId,String pageToken,Long regionId,String shopOutletCode,Long regionId2,SecurityContext securityContext)
      throws NotFoundException;
      Response getPrices(Long campaignId,String pageToken,Integer limit,Boolean archived,SecurityContext securityContext)
      throws NotFoundException;
      Response getPricesByOfferIds(Long campaignId,String pageToken,Integer limit,GetPricesByOfferIdsRequest getPricesByOfferIdsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getQualityRatingDetails(Long campaignId,SecurityContext securityContext)
      throws NotFoundException;
      Response getReturn(Long campaignId,Long orderId,Long returnId,SecurityContext securityContext)
      throws NotFoundException;
      Response getReturnApplication(Long campaignId,Long orderId,Long returnId,SecurityContext securityContext)
      throws NotFoundException;
      Response getReturnPhoto(Long campaignId,Long orderId,Long returnId,Long itemId,String imageHash,SecurityContext securityContext)
      throws NotFoundException;
      Response getReturns(Long campaignId,String pageToken,Integer limit,List<Long> orderIds,List<RefundStatusType> statuses,ReturnType type,Date fromDate,Date toDate,Date fromDate2,Date toDate2,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipment(Long campaignId,Long shipmentId,Boolean cancelledOrders,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentOrdersInfo(Long campaignId,Long shipmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response getStocks(Long campaignId,String pageToken,Integer limit,GetWarehouseStocksRequest getWarehouseStocksRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getSuggestedOfferMappingEntries(Long campaignId,GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response getSuggestedPrices(Long campaignId,SuggestPricesRequest suggestPricesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response provideOrderDigitalCodes(Long campaignId,Long orderId,ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response provideOrderItemIdentifiers(Long campaignId,Long orderId,ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response putBidsForCampaign(Long campaignId,PutSkuBidsRequest putSkuBidsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response refreshFeed(Long campaignId,Long feedId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchShipments(Long campaignId,SearchShipmentsRequest searchShipmentsRequest,String pageToken,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response setFeedParams(Long campaignId,Long feedId,SetFeedParamsRequest setFeedParamsRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setOrderBoxLayout(Long campaignId,Long orderId,SetOrderBoxLayoutRequest setOrderBoxLayoutRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setOrderDeliveryDate(Long campaignId,Long orderId,SetOrderDeliveryDateRequest setOrderDeliveryDateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setOrderDeliveryTrackCode(Long campaignId,Long orderId,SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setOrderShipmentBoxes(Long campaignId,Long orderId,Long shipmentId,SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setReturnDecision(Long campaignId,Long orderId,Long returnId,SetReturnDecisionRequest setReturnDecisionRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response setShipmentPalletsCount(Long campaignId,Long shipmentId,SetShipmentPalletsCountRequest setShipmentPalletsCountRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response submitReturnDecision(Long campaignId,Long orderId,Long returnId,SecurityContext securityContext)
      throws NotFoundException;
      Response transferOrdersFromShipment(Long campaignId,Long shipmentId,TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCampaignOffers(Long campaignId,UpdateCampaignOffersRequest updateCampaignOffersRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferMappingEntries(Long campaignId,UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrderItems(Long campaignId,Long orderId,UpdateOrderItemRequest updateOrderItemRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrderStatus(Long campaignId,Long orderId,UpdateOrderStatusRequest updateOrderStatusRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrderStatuses(Long campaignId,UpdateOrderStatusesRequest updateOrderStatusesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrderStorageLimit(Long campaignId,Long orderId,UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOutlet(Long campaignId,Long outletId,ChangeOutletRequest changeOutletRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOutletLicenses(Long campaignId,UpdateOutletLicenseRequest updateOutletLicenseRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePrices(Long campaignId,UpdatePricesRequest updatePricesRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateStocks(Long campaignId,UpdateStocksRequest updateStocksRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response verifyOrderEac(Long campaignId,Long orderId,VerifyOrderEacRequest verifyOrderEacRequest,SecurityContext securityContext)
      throws NotFoundException;
}
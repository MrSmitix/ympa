package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignsController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext acceptOrderCancellation(RequestContext request , Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext acceptOrderCancellation(RequestContext request , Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addHiddenOffers(RequestContext request , Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addHiddenOffers(RequestContext request , Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addHiddenOffers(RequestContext request , Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addHiddenOffers(RequestContext request , Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext addHiddenOffers(RequestContext request , Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmCampaignPrices(RequestContext request , Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmCampaignPrices(RequestContext request , Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmCampaignPrices(RequestContext request , Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmCampaignPrices(RequestContext request , Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmCampaignPrices(RequestContext request , Long campaignId, ConfirmPricesRequest confirmPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmShipment(RequestContext request , Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext confirmShipment(RequestContext request , Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createOutlet(RequestContext request , Long campaignId, ChangeOutletRequest changeOutletRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createOutlet(RequestContext request , Long campaignId, ChangeOutletRequest changeOutletRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteCampaignOffers(RequestContext request , Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteCampaignOffers(RequestContext request , Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteCampaignOffers(RequestContext request , Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteCampaignOffers(RequestContext request , Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteCampaignOffers(RequestContext request , Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteHiddenOffers(RequestContext request , Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteHiddenOffers(RequestContext request , Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteHiddenOffers(RequestContext request , Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteHiddenOffers(RequestContext request , Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteHiddenOffers(RequestContext request , Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOutlet(RequestContext request , Long campaignId, Long outletId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOutlet(RequestContext request , Long campaignId, Long outletId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOutletLicenses(RequestContext request , Long campaignId, Set<Long> ids) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteOutletLicenses(RequestContext request , Long campaignId, Set<Long> ids) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentDiscrepancyAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentDiscrepancyAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentInboundAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentInboundAct(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentPalletLabels(RequestContext request , Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentPalletLabels(RequestContext request , Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentReceptionTransferAct(RequestContext request , Long campaignId, Integer warehouseId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentReceptionTransferAct(RequestContext request , Long campaignId, Integer warehouseId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentTransportationWaybill(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext downloadShipmentTransportationWaybill(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabel(RequestContext request , Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabel(RequestContext request , Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabel(RequestContext request , Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabel(RequestContext request , Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabels(RequestContext request , Long campaignId, Long orderId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabels(RequestContext request , Long campaignId, Long orderId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabels(RequestContext request , Long campaignId, Long orderId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateOrderLabels(RequestContext request , Long campaignId, Long orderId, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllOffers(RequestContext request , Long campaignId, Long feedId, Integer chunk) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllOffers(RequestContext request , Long campaignId, Long feedId, Integer chunk) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllOffers(RequestContext request , Long campaignId, Long feedId, Integer chunk) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllOffers(RequestContext request , Long campaignId, Long feedId, Integer chunk) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getAllOffers(RequestContext request , Long campaignId, Long feedId, Integer chunk) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaign(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaign(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaign(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaign(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaign(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignLogins(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignLogins(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignLogins(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignLogins(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignLogins(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignOffers(RequestContext request , Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignOffers(RequestContext request , Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignOffers(RequestContext request , Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignOffers(RequestContext request , Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignOffers(RequestContext request , Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignQuarantineOffers(RequestContext request , Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignQuarantineOffers(RequestContext request , Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignQuarantineOffers(RequestContext request , Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignQuarantineOffers(RequestContext request , Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignQuarantineOffers(RequestContext request , Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignRegion(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignRegion(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignRegion(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignRegion(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignRegion(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignSettings(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignSettings(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignSettings(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignSettings(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignSettings(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaigns(RequestContext request , Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaigns(RequestContext request , Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaigns(RequestContext request , Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaigns(RequestContext request , Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaigns(RequestContext request , Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignsByLogin(RequestContext request , String login, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignsByLogin(RequestContext request , String login, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignsByLogin(RequestContext request , String login, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignsByLogin(RequestContext request , String login, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getCampaignsByLogin(RequestContext request , String login, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedIndexLogs(RequestContext request , Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedIndexLogs(RequestContext request , Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedIndexLogs(RequestContext request , Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedIndexLogs(RequestContext request , Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedIndexLogs(RequestContext request , Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedbackAndCommentUpdates(RequestContext request , Long campaignId, String pageToken, Integer limit, Date fromDate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedbackAndCommentUpdates(RequestContext request , Long campaignId, String pageToken, Integer limit, Date fromDate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedbackAndCommentUpdates(RequestContext request , Long campaignId, String pageToken, Integer limit, Date fromDate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedbackAndCommentUpdates(RequestContext request , Long campaignId, String pageToken, Integer limit, Date fromDate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeedbackAndCommentUpdates(RequestContext request , Long campaignId, String pageToken, Integer limit, Date fromDate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeeds(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeeds(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeeds(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeeds(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getFeeds(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsStats(RequestContext request , Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsStats(RequestContext request , Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsStats(RequestContext request , Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsStats(RequestContext request , Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getGoodsStats(RequestContext request , Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getHiddenOffers(RequestContext request , Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getHiddenOffers(RequestContext request , Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getHiddenOffers(RequestContext request , Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getHiddenOffers(RequestContext request , Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getHiddenOffers(RequestContext request , Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappingEntries(RequestContext request , Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappingEntries(RequestContext request , Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappingEntries(RequestContext request , Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappingEntries(RequestContext request , Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOfferMappingEntries(RequestContext request , Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOffers(RequestContext request , Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOffers(RequestContext request , Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOffers(RequestContext request , Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOffers(RequestContext request , Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOffers(RequestContext request , Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrder(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrder(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrder(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrder(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrder(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessDocumentsInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessDocumentsInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessDocumentsInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessDocumentsInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBusinessDocumentsInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderBuyerInfo(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderLabelsData(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderLabelsData(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderLabelsData(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrderLabelsData(RequestContext request , Long campaignId, Long orderId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrders(RequestContext request , Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrders(RequestContext request , Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrders(RequestContext request , Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrders(RequestContext request , Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrders(RequestContext request , Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrdersStats(RequestContext request , Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrdersStats(RequestContext request , Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrdersStats(RequestContext request , Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrdersStats(RequestContext request , Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOrdersStats(RequestContext request , Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutlet(RequestContext request , Long campaignId, Long outletId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutlet(RequestContext request , Long campaignId, Long outletId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutletLicenses(RequestContext request , Long campaignId, Set<Long> outletIds, Set<Long> ids) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutletLicenses(RequestContext request , Long campaignId, Set<Long> outletIds, Set<Long> ids) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutlets(RequestContext request , Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getOutlets(RequestContext request , Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPrices(RequestContext request , Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPrices(RequestContext request , Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPrices(RequestContext request , Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPrices(RequestContext request , Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPrices(RequestContext request , Long campaignId, String pageToken, Integer limit, Boolean archived) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPricesByOfferIds(RequestContext request , Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPricesByOfferIds(RequestContext request , Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPricesByOfferIds(RequestContext request , Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPricesByOfferIds(RequestContext request , Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getPricesByOfferIds(RequestContext request , Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatingDetails(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatingDetails(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatingDetails(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getQualityRatingDetails(RequestContext request , Long campaignId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturn(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturn(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturn(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturn(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturn(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnApplication(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnApplication(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnApplication(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnApplication(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnPhoto(RequestContext request , Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnPhoto(RequestContext request , Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnPhoto(RequestContext request , Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnPhoto(RequestContext request , Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturnPhoto(RequestContext request , Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturns(RequestContext request , Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturns(RequestContext request , Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturns(RequestContext request , Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturns(RequestContext request , Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReturns(RequestContext request , Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getShipment(RequestContext request , Long campaignId, Long shipmentId, Boolean cancelledOrders) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getShipment(RequestContext request , Long campaignId, Long shipmentId, Boolean cancelledOrders) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getShipmentOrdersInfo(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getShipmentOrdersInfo(RequestContext request , Long campaignId, Long shipmentId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getStocks(RequestContext request , Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getStocks(RequestContext request , Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getStocks(RequestContext request , Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getStocks(RequestContext request , Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getStocks(RequestContext request , Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappingEntries(RequestContext request , Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappingEntries(RequestContext request , Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappingEntries(RequestContext request , Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappingEntries(RequestContext request , Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedOfferMappingEntries(RequestContext request , Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedPrices(RequestContext request , Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedPrices(RequestContext request , Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedPrices(RequestContext request , Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedPrices(RequestContext request , Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getSuggestedPrices(RequestContext request , Long campaignId, SuggestPricesRequest suggestPricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderDigitalCodes(RequestContext request , Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderDigitalCodes(RequestContext request , Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderItemIdentifiers(RequestContext request , Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderItemIdentifiers(RequestContext request , Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderItemIdentifiers(RequestContext request , Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext provideOrderItemIdentifiers(RequestContext request , Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForCampaign(RequestContext request , Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForCampaign(RequestContext request , Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForCampaign(RequestContext request , Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForCampaign(RequestContext request , Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext putBidsForCampaign(RequestContext request , Long campaignId, PutSkuBidsRequest putSkuBidsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext refreshFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext refreshFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext refreshFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext refreshFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext refreshFeed(RequestContext request , Long campaignId, Long feedId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext searchShipments(RequestContext request , Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext searchShipments(RequestContext request , Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setFeedParams(RequestContext request , Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setFeedParams(RequestContext request , Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setFeedParams(RequestContext request , Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setFeedParams(RequestContext request , Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setFeedParams(RequestContext request , Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderBoxLayout(RequestContext request , Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderBoxLayout(RequestContext request , Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderBoxLayout(RequestContext request , Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderBoxLayout(RequestContext request , Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderDeliveryDate(RequestContext request , Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderDeliveryDate(RequestContext request , Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderDeliveryTrackCode(RequestContext request , Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderDeliveryTrackCode(RequestContext request , Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderShipmentBoxes(RequestContext request , Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderShipmentBoxes(RequestContext request , Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderShipmentBoxes(RequestContext request , Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setOrderShipmentBoxes(RequestContext request , Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setReturnDecision(RequestContext request , Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setReturnDecision(RequestContext request , Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setShipmentPalletsCount(RequestContext request , Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext setShipmentPalletsCount(RequestContext request , Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext submitReturnDecision(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext submitReturnDecision(RequestContext request , Long campaignId, Long orderId, Long returnId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext transferOrdersFromShipment(RequestContext request , Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext transferOrdersFromShipment(RequestContext request , Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateCampaignOffers(RequestContext request , Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateCampaignOffers(RequestContext request , Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateCampaignOffers(RequestContext request , Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateCampaignOffers(RequestContext request , Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateCampaignOffers(RequestContext request , Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappingEntries(RequestContext request , Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappingEntries(RequestContext request , Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappingEntries(RequestContext request , Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappingEntries(RequestContext request , Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOfferMappingEntries(RequestContext request , Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderItems(RequestContext request , Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderItems(RequestContext request , Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderItems(RequestContext request , Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderItems(RequestContext request , Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatus(RequestContext request , Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatus(RequestContext request , Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatus(RequestContext request , Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatus(RequestContext request , Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatuses(RequestContext request , Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatuses(RequestContext request , Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatuses(RequestContext request , Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStatuses(RequestContext request , Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStorageLimit(RequestContext request , Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOrderStorageLimit(RequestContext request , Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOutlet(RequestContext request , Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOutlet(RequestContext request , Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOutletLicenses(RequestContext request , Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateOutletLicenses(RequestContext request , Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePrices(RequestContext request , Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePrices(RequestContext request , Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePrices(RequestContext request , Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePrices(RequestContext request , Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePrices(RequestContext request , Long campaignId, UpdatePricesRequest updatePricesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateStocks(RequestContext request , Long campaignId, UpdateStocksRequest updateStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateStocks(RequestContext request , Long campaignId, UpdateStocksRequest updateStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateStocks(RequestContext request , Long campaignId, UpdateStocksRequest updateStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateStocks(RequestContext request , Long campaignId, UpdateStocksRequest updateStocksRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext verifyOrderEac(RequestContext request , Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext verifyOrderEac(RequestContext request , Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

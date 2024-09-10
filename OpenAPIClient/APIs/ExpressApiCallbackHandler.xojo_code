#tag Interface
Protected Interface ExpressApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AddHiddenOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub AddOffersToArchiveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AddOffersToArchiveResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CalculateTariffsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CalculateTariffsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ConfirmBusinessPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ConfirmCampaignPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub CreateChatCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.CreateChatResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteCampaignOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteCampaignOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteGoodsFeedbackCommentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteHiddenOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteOffersFromArchiveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeleteOffersFromArchiveResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeletePromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeletePromoOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateBoostConsolidatedReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateCompetitorsPositionReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateGoodsFeedbackReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateGoodsRealizationReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateMassOrderLabelsReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateOrderLabelCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateOrderLabelDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GenerateOrderLabelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateOrderLabelsDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GeneratePricesReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateShelfsStatisticsReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateShowsSalesReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateStocksOnWarehousesReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateUnitedMarketplaceServicesReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateUnitedNettingReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateUnitedOrdersReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAllOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetAllOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBidsInfoForBusinessCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBidsInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBidsRecommendationsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBidsRecommendationsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBusinessQuarantineOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetQuarantineOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBusinessSettingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessSettingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignLoginsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignLoginsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignQuarantineOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetQuarantineOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignRegionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignRegionResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignSettingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignSettingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignsByLoginCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCategoriesMaxSaleQuantumCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCategoriesMaxSaleQuantumResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCategoriesTreeCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCategoriesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCategoryContentParametersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCategoryContentParametersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetChatHistoryCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetChatHistoryResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetChatsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetChatsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetDeliveryServicesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetDeliveryServicesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedIndexLogsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedIndexLogsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedbackAndCommentUpdatesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedbackListResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetGoodsFeedbackCommentsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetGoodsFeedbackCommentsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetGoodsFeedbacksCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetGoodsFeedbackResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetGoodsStatsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetGoodsStatsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetHiddenOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetHiddenOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOfferCardsContentStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferCardsContentStatusResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOfferMappingEntriesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferMappingEntriesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferMappingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOfferRecommendationsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferRecommendationsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrderCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrderResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrderBusinessBuyerInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessBuyerInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrderBusinessDocumentsInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBusinessDocumentsInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrderLabelsDataCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrderLabelsDataResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrdersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrdersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrdersStatsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrdersStatsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPricesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPricesByOfferIdsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPricesByOfferIdsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPromoOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPromosCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPromosResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetQualityRatingDetailsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetQualityRatingDetailsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetQualityRatingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetQualityRatingResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReportInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReportInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReturnResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnApplicationCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnApplicationDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetReturnPhotoCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnPhotoDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetReturnsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReturnsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetStocksCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetWarehouseStocksResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetSuggestedOfferMappingEntriesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetSuggestedOfferMappingEntriesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetSuggestedOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetSuggestedOfferMappingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetSuggestedPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SuggestPricesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetWarehousesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetWarehousesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProvideOrderItemIdentifiersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProvideOrderItemIdentifiersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PutBidsForBusinessCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PutBidsForCampaignCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RefreshFeedCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SearchRegionChildrenCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetRegionWithChildrenResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SearchRegionsByIdCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetRegionsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SearchRegionsByNameCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetRegionsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SendFileToChatCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SendMessageToChatCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetFeedParamsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetOrderBoxLayoutCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SetOrderBoxLayoutResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetOrderShipmentBoxesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SetOrderShipmentBoxesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SkipGoodsFeedbacksReactionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateBusinessPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateCampaignOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateGoodsFeedbackCommentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateGoodsFeedbackCommentResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOfferContentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOfferContentResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOfferMappingEntriesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOfferMappingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOrderItemsCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOrderStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOrderStatusResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOrderStatusesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOrderStatusesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdatePricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdatePromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdatePromoOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateStocksCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub VerifyOrderEacCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VerifyOrderEacResponse)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface

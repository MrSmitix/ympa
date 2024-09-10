#tag Interface
Protected Interface ReportsApiCallbackHandler
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
		Sub GenerateGoodsMovementReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateGoodsRealizationReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateGoodsTurnoverReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateMassOrderLabelsReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
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
		Sub GenerateShipmentListDocumentReportCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GenerateReportResponse)
		  
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
		Sub GetReportInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReportInfoResponse)
		  
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

#tag Interface
Protected Interface ShipmentsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub ConfirmShipmentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentActCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentActDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub DownloadShipmentDiscrepancyActCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentDiscrepancyActDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub DownloadShipmentInboundActCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentInboundActDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub DownloadShipmentPalletLabelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentPalletLabelsDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub DownloadShipmentReceptionTransferActCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentReceptionTransferActDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub DownloadShipmentTransportationWaybillCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DownloadShipmentTransportationWaybillDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetShipmentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetShipmentResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetShipmentOrdersInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetShipmentOrdersInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SearchShipmentsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SearchShipmentsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetShipmentPalletsCountCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub TransferOrdersFromShipmentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
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

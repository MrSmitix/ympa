#tag Interface
Protected Interface OrdersApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AcceptOrderCancellationCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrderCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrderResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOrdersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrdersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProvideOrderDigitalCodesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub ProvideOrderItemIdentifiersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.ProvideOrderItemIdentifiersResponse)
		  
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

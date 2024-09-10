#tag Interface
Protected Interface PricesApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPricesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPricesByOfferIdsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPricesByOfferIdsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetSuggestedPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SuggestPricesResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateBusinessPricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdatePricesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
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

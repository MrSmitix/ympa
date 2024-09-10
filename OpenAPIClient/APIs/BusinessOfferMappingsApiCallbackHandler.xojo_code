#tag Interface
Protected Interface BusinessOfferMappingsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub AddOffersToArchiveCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.AddOffersToArchiveResponse)
		  
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
		Sub GetOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferMappingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetSuggestedOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetSuggestedOfferMappingsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOfferMappingsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOfferMappingsResponse)
		  
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

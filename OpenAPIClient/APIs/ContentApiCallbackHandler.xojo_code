#tag Interface
Protected Interface ContentApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetCategoryContentParametersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCategoryContentParametersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetOfferCardsContentStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOfferCardsContentStatusResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdateOfferContentCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdateOfferContentResponse)
		  
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

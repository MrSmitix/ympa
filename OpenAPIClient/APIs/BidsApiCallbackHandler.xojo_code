#tag Interface
Protected Interface BidsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetBidsInfoForBusinessCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBidsInfoResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetBidsRecommendationsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetBidsRecommendationsResponse)
		  
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

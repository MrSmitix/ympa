#tag Interface
Protected Interface FeedsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetFeedCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedIndexLogsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedIndexLogsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetFeedsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetFeedsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub RefreshFeedCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetFeedParamsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
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

#tag Interface
Protected Interface CampaignsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetCampaignCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetCampaignLoginsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetCampaignLoginsResponse)
		  
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

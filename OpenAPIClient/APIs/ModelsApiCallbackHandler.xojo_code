#tag Interface
Protected Interface ModelsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetModelCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetModelsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetModelOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetModelsOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetModelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetModelsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetModelsOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetModelsOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SearchModelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.SearchModelsResponse)
		  
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

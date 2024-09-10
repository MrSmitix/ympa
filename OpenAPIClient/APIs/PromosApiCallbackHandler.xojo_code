#tag Interface
Protected Interface PromosApiCallbackHandler
	#tag Method, Flags = &h0
		Sub DeletePromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.DeletePromoOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPromoOffersResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPromosCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetPromosResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub UpdatePromoOffersCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.UpdatePromoOffersResponse)
		  
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

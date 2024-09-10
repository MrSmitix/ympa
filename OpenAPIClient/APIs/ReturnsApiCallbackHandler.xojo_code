#tag Interface
Protected Interface ReturnsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetReturnCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReturnResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnApplicationCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnApplicationDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetReturnPhotoCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetReturnPhotoDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetReturnsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetReturnsResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SetReturnDecisionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub SubmitReturnDecisionCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.EmptyApiResponse)
		  
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

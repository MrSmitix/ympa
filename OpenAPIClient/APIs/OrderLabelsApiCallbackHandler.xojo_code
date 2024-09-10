#tag Interface
Protected Interface OrderLabelsApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GenerateOrderLabelCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateOrderLabelDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GenerateOrderLabelsCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GenerateOrderLabelsDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetOrderLabelsDataCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.GetOrderLabelsDataResponse)
		  
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

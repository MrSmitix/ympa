#tag Class
Protected Class FeedPublicationDTO

	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		full As OpenAPIClient.Models.FeedPublicationFullDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		priceAndStockUpdate As OpenAPIClient.Models.FeedPublicationPriceAndStockUpdateDTO
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="full"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedPublicationFullDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="priceAndStockUpdate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedPublicationPriceAndStockUpdateDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



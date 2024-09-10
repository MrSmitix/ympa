#tag Class
Protected Class OfferMappingInfoDTO

	#tag Property, Flags = &h0
		mapping As OpenAPIClient.Models.OfferMappingDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		awaitingModerationMapping As OpenAPIClient.Models.OfferMappingDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		rejectedMapping As OpenAPIClient.Models.OfferMappingDTO
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
			Name="mapping"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferMappingDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="awaitingModerationMapping"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferMappingDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="rejectedMapping"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferMappingDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



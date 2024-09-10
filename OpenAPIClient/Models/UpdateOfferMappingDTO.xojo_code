#tag Class
Protected Class UpdateOfferMappingDTO

	#tag Property, Flags = &h0
		offer As OpenAPIClient.Models.UpdateOfferDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		mapping As OpenAPIClient.Models.UpdateMappingDTO
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
			Name="offer"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateOfferDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="mapping"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateMappingDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



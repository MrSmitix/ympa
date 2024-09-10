#tag Class
Protected Class OfferMappingEntriesDTO

	#tag Property, Flags = &h0
		paging As OpenAPIClient.Models.ScrollingPagerDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о товарах в каталоге.
		#tag EndNote
		offerMappingEntries() As OpenAPIClient.Models.OfferMappingEntryDTO
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
			Name="paging"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ScrollingPagerDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offerMappingEntries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferMappingEntryDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



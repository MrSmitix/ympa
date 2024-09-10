#tag Class
Protected Class AddOffersToArchiveDTO

	#tag Property, Flags = &h0
		#tag Note
			Список товаров, которые не удалось поместить в архив.
		#tag EndNote
		notArchivedOffers() As OpenAPIClient.Models.AddOffersToArchiveErrorDTO
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
			Name="notArchivedOffers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AddOffersToArchiveErrorDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



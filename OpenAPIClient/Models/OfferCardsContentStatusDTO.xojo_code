#tag Class
Protected Class OfferCardsContentStatusDTO

	#tag Property, Flags = &h0
		#tag Note
			Страница списка товаров с информацией о состоянии карточек.
		#tag EndNote
		offerCards() As OpenAPIClient.Models.OfferCardDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		paging As OpenAPIClient.Models.ForwardScrollingPagerDTO
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
			Name="offerCards"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paging"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ForwardScrollingPagerDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class DeletePromoOffersResultDTO

	#tag Property, Flags = &h0
		#tag Note
			Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
		#tag EndNote
		rejectedOffers() As OpenAPIClient.Models.RejectedPromoOfferDeleteDTO
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
			Name="rejectedOffers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RejectedPromoOfferDeleteDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



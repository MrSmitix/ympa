#tag Class
Protected Class UpdatePromoOffersResultDTO

	#tag Property, Flags = &h0
		#tag Note
			Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
		#tag EndNote
		rejectedOffers() As OpenAPIClient.Models.RejectedPromoOfferUpdateDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
		#tag EndNote
		warningOffers() As OpenAPIClient.Models.WarningPromoOfferUpdateDTO
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
			Type="RejectedPromoOfferUpdateDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warningOffers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="WarningPromoOfferUpdateDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class UpdatePromoOffersRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор акции.
		#tag EndNote
		promoId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
		#tag EndNote
		offers() As OpenAPIClient.Models.UpdatePromoOfferDTO
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
			Name="promoId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdatePromoOfferDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



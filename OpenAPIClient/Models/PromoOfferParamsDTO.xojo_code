#tag Class
Protected Class PromoOfferParamsDTO

	#tag Property, Flags = &h0
		discountParams As OpenAPIClient.Models.PromoOfferDiscountParamsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		promocodeParams As OpenAPIClient.Models.PromoOfferPromocodeParamsDTO
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
			Name="discountParams"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoOfferDiscountParamsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promocodeParams"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoOfferPromocodeParamsDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



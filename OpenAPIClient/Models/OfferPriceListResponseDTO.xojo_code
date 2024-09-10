#tag Class
Protected Class OfferPriceListResponseDTO

	#tag Property, Flags = &h0
		#tag Note
			Страница списка.
		#tag EndNote
		offers() As OpenAPIClient.Models.OfferPriceResponseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		paging As OpenAPIClient.Models.ScrollingPagerDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество всех цен магазина, измененных через API.
		#tag EndNote
		total As Xoson.O.OptionalInteger
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
			Name="offers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferPriceResponseDTO"
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
			Name="total"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class UpdateOfferMappingsRequest

	#tag Property, Flags = &h0
		#tag Note
			Перечень товаров, которые нужно добавить или обновить.
		#tag EndNote
		offerMappings() As OpenAPIClient.Models.UpdateOfferMappingDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
		#tag EndNote
		onlyPartnerMediaContent As Xoson.O.OptionalBoolean
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
			Name="offerMappings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateOfferMappingDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="onlyPartnerMediaContent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



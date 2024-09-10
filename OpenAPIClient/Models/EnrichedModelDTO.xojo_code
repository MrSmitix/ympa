#tag Class
Protected Class EnrichedModelDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор модели товара.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название модели товара.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		prices As OpenAPIClient.Models.ModelPriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
		#tag EndNote
		offers() As OpenAPIClient.Models.ModelOfferDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
		#tag EndNote
		offlineOffers As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
		#tag EndNote
		onlineOffers As Xoson.O.OptionalInteger
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModelPriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModelOfferDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offlineOffers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="onlineOffers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



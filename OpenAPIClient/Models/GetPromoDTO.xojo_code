#tag Class
Protected Class GetPromoDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор акции.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название акции.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		period As OpenAPIClient.Models.PromoPeriodDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
		#tag EndNote
		participating As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		assortmentInfo As OpenAPIClient.Models.GetPromoAssortmentInfoDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		mechanicsInfo As OpenAPIClient.Models.GetPromoMechanicsInfoDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		bestsellerInfo As OpenAPIClient.Models.GetPromoBestsellerInfoDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список каналов продвижения товаров.
		#tag EndNote
		channels() As OpenAPIClient.Models.ChannelType
	#tag EndProperty


	#tag Property, Flags = &h0
		constraints As OpenAPIClient.Models.GetPromoConstraintsDTO
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
			Type="String"
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
			Name="period"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoPeriodDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="participating"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assortmentInfo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPromoAssortmentInfoDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="mechanicsInfo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPromoMechanicsInfoDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bestsellerInfo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPromoBestsellerInfoDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="channels"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChannelType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="constraints"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPromoConstraintsDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



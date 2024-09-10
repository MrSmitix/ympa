#tag Class
Protected Class SkuBidRecommendationItemDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		sku As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Значение ставки.
		#tag EndNote
		bid As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
		#tag EndNote
		bidRecommendations() As OpenAPIClient.Models.BidRecommendationItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Рекомендованные цены.
		#tag EndNote
		priceRecommendations() As OpenAPIClient.Models.PriceRecommendationItemDTO
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
			Name="sku"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bid"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bidRecommendations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BidRecommendationItemDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="priceRecommendations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PriceRecommendationItemDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



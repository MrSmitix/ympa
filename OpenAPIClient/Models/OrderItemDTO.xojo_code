#tag Class
Protected Class OrderItemDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название товара.
		#tag EndNote
		offerName As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
		#tag EndNote
		price As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
		#tag EndNote
		buyerPrice As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
		#tag EndNote
		buyerPriceBeforeDiscount As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
		#tag EndNote
		Attributes( Deprecated ) priceBeforeDiscount As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара.
		#tag EndNote
		count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		vat As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		shopSku As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
		#tag EndNote
		Attributes( Deprecated ) subsidy As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
		#tag EndNote
		Attributes( Deprecated ) partnerWarehouseId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
		#tag EndNote
		promos() As OpenAPIClient.Models.OrderItemPromoDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
		#tag EndNote
		instances() As OpenAPIClient.Models.OrderItemInstanceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация об удалении товара из заказа. 
		#tag EndNote
		details() As OpenAPIClient.Models.OrderItemDetailDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список субсидий по типам.
		#tag EndNote
		subsidies() As OpenAPIClient.Models.OrderItemSubsidyDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список необходимых маркировок товара.
		#tag EndNote
		requiredInstanceTypes() As OrderItemInstanceType
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
			Name="offerId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offerName"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerPriceBeforeDiscount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="priceBeforeDiscount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="vat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderVatType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shopSku"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subsidy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partnerWarehouseId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promos"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemPromoDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instances"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemInstanceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemDetailDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subsidies"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemSubsidyDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="requiredInstanceTypes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemInstanceType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



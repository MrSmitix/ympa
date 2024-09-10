#tag Class
Protected Class OrderDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор заказа.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		substatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		creationDate As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		updatedAt As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		currency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Платеж покупателя. 
		#tag EndNote
		itemsTotal As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Стоимость доставки. 
		#tag EndNote
		deliveryTotal As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
		#tag EndNote
		Attributes( Deprecated ) buyerItemsTotal As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
		#tag EndNote
		Attributes( Deprecated ) buyerTotal As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
		#tag EndNote
		buyerItemsTotalBeforeDiscount As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
		#tag EndNote
		Attributes( Deprecated ) buyerTotalBeforeDiscount As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		paymentType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		paymentMethod As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
		#tag EndNote
		fake As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список товаров в заказе.
		#tag EndNote
		items() As OpenAPIClient.Models.OrderItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список субсидий по типам.
		#tag EndNote
		subsidies() As OpenAPIClient.Models.OrderSubsidyDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		delivery As OpenAPIClient.Models.OrderDeliveryDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		buyer As OpenAPIClient.Models.OrderBuyerDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Комментарий к заказу.
		#tag EndNote
		notes As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		taxSystem As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			**Только для модели DBS**  Запрошена ли отмена. 
		#tag EndNote
		cancelRequested As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		expiryDate As Xoson.O.OptionalString
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="substatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderSubstatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="creationDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updatedAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CurrencyType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="itemsTotal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryTotal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerItemsTotal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerTotal"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerItemsTotalBeforeDiscount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyerTotalBeforeDiscount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paymentType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderPaymentType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paymentMethod"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderPaymentMethodType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fake"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subsidies"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderSubsidyDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="delivery"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="buyer"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderBuyerDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="notes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="taxSystem"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderTaxSystemType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cancelRequested"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expiryDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



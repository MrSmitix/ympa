#tag Class
Protected Class OrderBoxLayoutItemDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор товара в заказе.  {% cut "Где его взять" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
		#tag EndNote
		id As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
		#tag EndNote
		fullCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		partialCount As OpenAPIClient.Models.OrderBoxLayoutPartialCountDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Переданные вами коды маркировки.
		#tag EndNote
		instances() As OpenAPIClient.Models.BriefOrderItemInstanceDTO
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
			Name="fullCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partialCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderBoxLayoutPartialCountDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instances"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BriefOrderItemInstanceDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



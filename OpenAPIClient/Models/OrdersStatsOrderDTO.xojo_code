#tag Class
Protected Class OrdersStatsOrderDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор заказа.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
		#tag EndNote
		creationDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
		#tag EndNote
		statusUpdateDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор заказа в информационной системе магазина.
		#tag EndNote
		partnerOrderId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		paymentType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
		#tag EndNote
		fake As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		deliveryRegion As OpenAPIClient.Models.OrdersStatsDeliveryRegionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список товаров в заказе после возможных изменений.
		#tag EndNote
		items() As OpenAPIClient.Models.OrdersStatsItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список товаров в заказе до изменений.
		#tag EndNote
		initialItems() As OpenAPIClient.Models.OrdersStatsItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о денежных переводах по заказу.
		#tag EndNote
		payments() As OpenAPIClient.Models.OrdersStatsPaymentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о комиссиях за заказ.
		#tag EndNote
		commissions() As OpenAPIClient.Models.OrdersStatsCommissionDTO
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
			Name="creationDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="statusUpdateDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderStatsStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partnerOrderId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paymentType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsOrderPaymentType"
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
			Name="deliveryRegion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsDeliveryRegionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsItemDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="initialItems"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsItemDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="payments"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsPaymentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="commissions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsCommissionDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



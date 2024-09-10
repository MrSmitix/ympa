#tag Class
Protected Class ParcelBoxLabelDTO

	#tag Property, Flags = &h0
		#tag Note
			Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
		#tag EndNote
		url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Юридическое название магазина.
		#tag EndNote
		supplierName As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Юридическое название службы доставки.
		#tag EndNote
		deliveryServiceName As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор заказа в системе Маркета.
		#tag EndNote
		orderId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
		#tag EndNote
		orderNum As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фамилия и инициалы получателя заказа.
		#tag EndNote
		recipientName As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор коробки.
		#tag EndNote
		boxId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
		#tag EndNote
		fulfilmentId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
		#tag EndNote
		place As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
		#tag EndNote
		weight As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
		#tag EndNote
		deliveryServiceId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Адрес получателя.
		#tag EndNote
		deliveryAddress As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата отгрузки в формате `dd.MM.yyyy`.
		#tag EndNote
		shipmentDate As Xoson.O.OptionalString
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
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="supplierName"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryServiceName"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="orderId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="orderNum"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recipientName"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="boxId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fulfilmentId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="place"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weight"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryServiceId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryAddress"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipmentDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



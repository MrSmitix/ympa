#tag Class
Protected Class ShipmentInfoDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор отгрузки.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Начало планового интервала отгрузки.
		#tag EndNote
		planIntervalFrom As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конец планового интервала отгрузки.
		#tag EndNote
		planIntervalTo As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		shipmentType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		warehouse As OpenAPIClient.Models.PartnerShipmentWarehouseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		warehouseTo As OpenAPIClient.Models.PartnerShipmentWarehouseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
		#tag EndNote
		externalId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		deliveryService As OpenAPIClient.Models.DeliveryServiceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		palletsCount As OpenAPIClient.Models.PalletsCountDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификаторы заказов в отгрузке.
		#tag EndNote
		orderIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество заказов, которое Маркет запланировал к отгрузке.
		#tag EndNote
		draftCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество заказов, которое Маркет подтвердил к отгрузке.
		#tag EndNote
		plannedCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество заказов, принятых в сортировочном центре или пункте приема.
		#tag EndNote
		factCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Описание статуса отгрузки.
		#tag EndNote
		statusDescription As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Время последнего изменения статуса отгрузки.
		#tag EndNote
		statusUpdateTime As Date
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
			Name="planIntervalFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="planIntervalTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipmentType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ShipmentType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouse"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PartnerShipmentWarehouseDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouseTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PartnerShipmentWarehouseDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="externalId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryService"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DeliveryServiceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="palletsCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PalletsCountDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="orderIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="draftCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="plannedCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="factCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ShipmentStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="statusDescription"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="statusUpdateTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



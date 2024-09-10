#tag Class
Protected Class FullOutletDTO

	#tag Property, Flags = &h0
		#tag Note
			Название точки продаж. 
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
		#tag EndNote
		coords As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
		#tag EndNote
		isMain As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор точки продаж, присвоенный магазином.
		#tag EndNote
		shopOutletCode As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		visibility As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		address As OpenAPIClient.Models.OutletAddressDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
		#tag EndNote
		phones() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		workingSchedule As OpenAPIClient.Models.OutletWorkingScheduleDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
		#tag EndNote
		deliveryRules() As OpenAPIClient.Models.OutletDeliveryRuleDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
		#tag EndNote
		storagePeriod As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор точки продаж, присвоенный Маркетом.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		region As OpenAPIClient.Models.RegionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор точки продаж, заданный магазином.
		#tag EndNote
		shopOutletId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Рабочее время.
		#tag EndNote
		workingTime As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Статус модерации.
		#tag EndNote
		moderationReason As Xoson.O.OptionalString
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="coords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="isMain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shopOutletCode"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="visibility"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletVisibilityType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="address"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletAddressDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="phones"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="workingSchedule"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletWorkingScheduleDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="deliveryRules"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletDeliveryRuleDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="storagePeriod"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
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
			Type="OutletStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="region"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shopOutletId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="workingTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="moderationReason"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



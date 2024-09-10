#tag Class
Protected Class OrderDeliveryDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Наименование службы доставки.
		#tag EndNote
		serviceName As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
		#tag EndNote
		Attributes( Deprecated ) price As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		deliveryPartnerType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		courier As OpenAPIClient.Models.OrderCourierDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		dates As OpenAPIClient.Models.OrderDeliveryDatesDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		region As OpenAPIClient.Models.RegionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		address As OpenAPIClient.Models.OrderDeliveryAddressDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		vat As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор службы доставки.
		#tag EndNote
		deliveryServiceId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		liftType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Стоимость подъема на этаж.
		#tag EndNote
		liftPrice As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор пункта самовывоза, присвоенный магазином.
		#tag EndNote
		outletCode As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Формат даты: `ДД-ММ-ГГГГ`. 
		#tag EndNote
		outletStorageLimitDate As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		dispatchType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация для отслеживания перемещений посылки.
		#tag EndNote
		tracks() As OpenAPIClient.Models.OrderTrackDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о посылках.
		#tag EndNote
		shipments() As OpenAPIClient.Models.OrderShipmentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Приблизительная ли дата доставки.
		#tag EndNote
		estimated As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		eacType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
		#tag EndNote
		eacCode As Xoson.O.OptionalString
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
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="serviceName"
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
			Name="deliveryPartnerType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryPartnerType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="courier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderCourierDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dates"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryDatesDTO"
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
			Name="address"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryAddressDTO"
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
			Name="deliveryServiceId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="liftType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderLiftType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="liftPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="outletCode"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="outletStorageLimitDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dispatchType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryDispatchType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracks"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderTrackDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipments"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderShipmentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="estimated"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eacType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDeliveryEacType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="eacCode"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



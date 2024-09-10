#tag Class
Protected Class OrderShipmentDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор посылки, присвоенный Маркетом.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Формат даты: `ДД-ММ-ГГГГ`. 
		#tag EndNote
		shipmentDate As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
		#tag EndNote
		shipmentTime As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			**Только для модели DBS**  Информация для отслеживания перемещений посылки. 
		#tag EndNote
		tracks() As OpenAPIClient.Models.OrderTrackDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список грузовых мест.
		#tag EndNote
		boxes() As OpenAPIClient.Models.OrderParcelBoxDTO
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
			Name="shipmentDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipmentTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="boxes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderParcelBoxDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



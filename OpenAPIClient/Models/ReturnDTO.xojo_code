#tag Class
Protected Class ReturnDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор возврата.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Номер заказа.
		#tag EndNote
		orderId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата создания возврата клиентом.
		#tag EndNote
		creationDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата обновления возврата.
		#tag EndNote
		updateDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		refundStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		logisticPickupPoint As OpenAPIClient.Models.LogisticPickupPointDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		shipmentRecipientType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		shipmentStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Сумма возврата.
		#tag EndNote
		refundAmount As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список товаров в возврате.
		#tag EndNote
		items() As OpenAPIClient.Models.ReturnItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		returnType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Используется ли опция **Быстрый возврат денег за дешевый брак**. 
		#tag EndNote
		fastReturn As Xoson.O.OptionalBoolean
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
			Name="orderId"
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
			Name="updateDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="refundStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RefundStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logisticPickupPoint"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LogisticPickupPointDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipmentRecipientType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RecipientType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shipmentStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnShipmentStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="refundAmount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnItemDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="returnType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fastReturn"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



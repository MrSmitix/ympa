#tag Class
Protected Class UpdateOrderStatusDTO

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
		updateStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
		#tag EndNote
		errorDetails As Xoson.O.OptionalString
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
			Name="updateStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderUpdateStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="errorDetails"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



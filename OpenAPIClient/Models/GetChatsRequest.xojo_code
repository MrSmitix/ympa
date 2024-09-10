#tag Class
Protected Class GetChatsRequest

	#tag Property, Flags = &h0
		#tag Note
			Фильтр по идентификаторам заказов на Маркете.
		#tag EndNote
		orderIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по типам чатов.
		#tag EndNote
		types() As ChatType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по статусам чатов.
		#tag EndNote
		statuses() As ChatStatusType
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
			Name="orderIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatStatusType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



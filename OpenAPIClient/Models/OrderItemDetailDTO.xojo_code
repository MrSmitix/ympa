#tag Class
Protected Class OrderItemDetailDTO

	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара.
		#tag EndNote
		itemCount As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		itemStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Формат даты: `ДД-ММ-ГГГГ`. 
		#tag EndNote
		updateDate As Xoson.O.OptionalString
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
			Name="itemCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="itemStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderItemStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updateDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



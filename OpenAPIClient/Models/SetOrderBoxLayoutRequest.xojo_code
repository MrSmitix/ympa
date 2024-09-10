#tag Class
Protected Class SetOrderBoxLayoutRequest

	#tag Property, Flags = &h0
		#tag Note
			Список коробок.
		#tag EndNote
		boxes() As OpenAPIClient.Models.OrderBoxLayoutDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
		#tag EndNote
		allowRemove As Xoson.O.OptionalBoolean
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
			Name="boxes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderBoxLayoutDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="allowRemove"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



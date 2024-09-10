#tag Class
Protected Class EnrichedOrderBoxLayoutDTO

	#tag Property, Flags = &h0
		#tag Note
			Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
		#tag EndNote
		items() As OpenAPIClient.Models.OrderBoxLayoutItemDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор коробки.
		#tag EndNote
		boxId As Xoson.O.OptionalInt64
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
			Name="items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderBoxLayoutItemDTO"
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
	#tag EndViewBehavior
End Class
#tag EndClass



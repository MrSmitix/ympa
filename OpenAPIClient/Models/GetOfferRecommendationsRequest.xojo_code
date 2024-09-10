#tag Class
Protected Class GetOfferRecommendationsRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
		#tag EndNote
		offerIds() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		cofinancePriceFilter As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		recommendedCofinancePriceFilter As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		competitivenessFilter As Xoson.O.OptionalString
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
			Name="offerIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cofinancePriceFilter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FieldStateType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recommendedCofinancePriceFilter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FieldStateType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="competitivenessFilter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PriceCompetitivenessType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



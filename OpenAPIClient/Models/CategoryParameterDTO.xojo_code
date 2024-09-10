#tag Class
Protected Class CategoryParameterDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор характеристики.
		#tag EndNote
		id As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название характеристики.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		unit As OpenAPIClient.Models.CategoryParameterUnitDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Описание характеристики.
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
		#tag EndNote
		recommendationTypes() As OfferCardRecommendationType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Обязательность характеристики.
		#tag EndNote
		required As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Используется ли характеристика в фильтре.
		#tag EndNote
		filtering As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Является ли характеристика особенностью варианта.
		#tag EndNote
		distinctive As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Можно ли передать сразу несколько значений.
		#tag EndNote
		multivalue As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
		#tag EndNote
		allowCustomValues As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список допустимых значений параметра. Только для характеристик типа `ENUM`.
		#tag EndNote
		values() As OpenAPIClient.Models.ParameterValueOptionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		constraints As OpenAPIClient.Models.ParameterValueConstraintsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
		#tag EndNote
		valueRestrictions() As OpenAPIClient.Models.ValueRestrictionDTO
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
			Type="ParameterType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="unit"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CategoryParameterUnitDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recommendationTypes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardRecommendationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="required"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="filtering"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="distinctive"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="multivalue"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="allowCustomValues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ParameterValueOptionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="constraints"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ParameterValueConstraintsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="valueRestrictions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ValueRestrictionDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



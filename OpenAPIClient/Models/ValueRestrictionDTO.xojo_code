#tag Class
Protected Class ValueRestrictionDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор ограничивающей характеристики.
		#tag EndNote
		limitingParameterId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
		#tag EndNote
		limitedValues() As OpenAPIClient.Models.OptionValuesLimitedDTO
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
			Name="limitingParameterId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="limitedValues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OptionValuesLimitedDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class CategoryParameterUnitDTO

	#tag Property, Flags = &h0
		#tag Note
			Единица измерения по умолчанию.
		#tag EndNote
		defaultUnitId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Допустимые единицы измерения.
		#tag EndNote
		units() As OpenAPIClient.Models.UnitDTO
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
			Name="defaultUnitId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="units"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UnitDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



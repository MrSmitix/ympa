#tag Class
Protected Class QualityRatingDTO

	#tag Property, Flags = &h0
		#tag Note
			Значение индекса качества.
		#tag EndNote
		rating As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
		#tag EndNote
		calculationDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Составляющие индекса качества.
		#tag EndNote
		components() As OpenAPIClient.Models.QualityRatingComponentDTO
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
			Name="rating"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="calculationDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="components"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QualityRatingComponentDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



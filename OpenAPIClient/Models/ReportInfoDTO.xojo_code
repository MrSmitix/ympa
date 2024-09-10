#tag Class
Protected Class ReportInfoDTO

	#tag Property, Flags = &h0
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		subStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время запроса на генерацию.
		#tag EndNote
		generationRequestedAt As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время завершения генерации.
		#tag EndNote
		generationFinishedAt As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ссылка на готовый отчет.
		#tag EndNote
		Escapedfile As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ожидаемая продолжительность генерации в миллисекундах.
		#tag EndNote
		estimatedGenerationTime As Xoson.O.OptionalInt64
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReportSubStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generationRequestedAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generationFinishedAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedfile"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="estimatedGenerationTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



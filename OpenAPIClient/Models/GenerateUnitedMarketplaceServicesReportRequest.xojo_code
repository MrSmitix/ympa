#tag Class
Protected Class GenerateUnitedMarketplaceServicesReportRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор бизнеса.
		#tag EndNote
		businessId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
		#tag EndNote
		dateTimeFrom As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
		#tag EndNote
		dateTimeTo As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Начало периода, включительно.
		#tag EndNote
		dateFrom As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конец периода, включительно. Максимальный период — 1 год.
		#tag EndNote
		dateTo As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Начальный год формирования акта.
		#tag EndNote
		yearFrom As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Начальный номер месяца формирования акта.
		#tag EndNote
		monthFrom As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конечный год формирования акта.
		#tag EndNote
		yearTo As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конечный номер месяца формирования акта.
		#tag EndNote
		monthTo As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список моделей, которые нужны в отчете. 
		#tag EndNote
		placementPrograms() As PlacementType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список ИНН, которые нужны в отчете.
		#tag EndNote
		inns() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список магазинов, которые нужны в отчете.
		#tag EndNote
		campaignIds() As Int64
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
			Name="businessId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateTimeFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateTimeTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="yearFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="monthFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="yearTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="monthTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placementPrograms"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PlacementType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="inns"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaignIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



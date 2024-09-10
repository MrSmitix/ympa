#tag Class
Protected Class CampaignSettingsScheduleDTO

	#tag Property, Flags = &h0
		#tag Note
			Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
		#tag EndNote
		availableOnHolidays As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
		#tag EndNote
		customHolidays() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
		#tag EndNote
		customWorkingDays() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		period As OpenAPIClient.Models.CampaignSettingsTimePeriodDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
		#tag EndNote
		totalHolidays() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список выходных дней недели и государственных праздников.
		#tag EndNote
		weeklyHolidays() As Integer
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
			Name="availableOnHolidays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customHolidays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="customWorkingDays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="period"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CampaignSettingsTimePeriodDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="totalHolidays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weeklyHolidays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



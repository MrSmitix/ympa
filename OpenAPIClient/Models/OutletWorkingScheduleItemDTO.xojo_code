#tag Class
Protected Class OutletWorkingScheduleItemDTO

	#tag Property, Flags = &h0
		startDay As String
	#tag EndProperty


	#tag Property, Flags = &h0
		endDay As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
		#tag EndNote
		startTime As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
		#tag EndNote
		endTime As String
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
			Name="startDay"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DayOfWeekType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="endDay"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DayOfWeekType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="startTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="endTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



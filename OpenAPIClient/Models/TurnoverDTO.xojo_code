#tag Class
Protected Class TurnoverDTO

	#tag Property, Flags = &h0
		turnover As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
		#tag EndNote
		turnoverDays As Xoson.O.OptionalDouble
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
			Name="turnover"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TurnoverType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="turnoverDays"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



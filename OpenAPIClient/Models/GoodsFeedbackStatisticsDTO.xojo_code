#tag Class
Protected Class GoodsFeedbackStatisticsDTO

	#tag Property, Flags = &h0
		#tag Note
			Оценка товара.
		#tag EndNote
		rating As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
		#tag EndNote
		commentsCount As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Рекомендуют ли этот товар.
		#tag EndNote
		recommended As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество баллов Плюса, которое автор получил за отзыв.
		#tag EndNote
		paidAmount As Xoson.O.OptionalInt64
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
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="commentsCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recommended"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paidAmount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



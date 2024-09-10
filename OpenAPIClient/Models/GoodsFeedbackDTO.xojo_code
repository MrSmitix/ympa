#tag Class
Protected Class GoodsFeedbackDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор отзыва. 
		#tag EndNote
		feedbackId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время создания отзыва.
		#tag EndNote
		createdAt As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Нужен ли ответ на отзыв.
		#tag EndNote
		needReaction As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		identifiers As OpenAPIClient.Models.GoodsFeedbackIdentifiersDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Имя автора отзыва.
		#tag EndNote
		author As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		description As OpenAPIClient.Models.GoodsFeedbackDescriptionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		media As OpenAPIClient.Models.GoodsFeedbackMediaDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		statistics As OpenAPIClient.Models.GoodsFeedbackStatisticsDTO
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
			Name="feedbackId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="createdAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="needReaction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="identifiers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackIdentifiersDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="author"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackDescriptionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="media"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackMediaDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="statistics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackStatisticsDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



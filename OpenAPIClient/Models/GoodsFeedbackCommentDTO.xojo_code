#tag Class
Protected Class GoodsFeedbackCommentDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор комментария к отзыву. 
		#tag EndNote
		id As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Текст комментария.
		#tag EndNote
		text As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Может ли продавец изменять комментарий или удалять его.
		#tag EndNote
		canModify As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор комментария к отзыву. 
		#tag EndNote
		parentId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		author As OpenAPIClient.Models.GoodsFeedbackCommentAuthorDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		status As String
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="canModify"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parentId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="author"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackCommentAuthorDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsFeedbackCommentStatusType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



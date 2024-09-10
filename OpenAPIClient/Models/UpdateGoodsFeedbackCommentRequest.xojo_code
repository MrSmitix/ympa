#tag Class
Protected Class UpdateGoodsFeedbackCommentRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор отзыва. 
		#tag EndNote
		feedbackId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		comment As OpenAPIClient.Models.UpdateGoodsFeedbackCommentDTO
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
			Name="comment"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="UpdateGoodsFeedbackCommentDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class FeedbackDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор отзыва.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
		#tag EndNote
		createdAt As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Комментарий автора отзыва.
		#tag EndNote
		text As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		state As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		author As OpenAPIClient.Models.FeedbackAuthorDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Достоинства магазина, описанные в отзыве.
		#tag EndNote
		pro As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Недостатки магазина, описанные в отзыве.
		#tag EndNote
		contra As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Переписка автора отзыва с магазином.
		#tag EndNote
		comments() As OpenAPIClient.Models.FeedbackCommentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		shop As OpenAPIClient.Models.FeedbackShopDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
		#tag EndNote
		resolved As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
		#tag EndNote
		verified As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
		#tag EndNote
		recommend As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		grades As OpenAPIClient.Models.FeedbackGradesDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		order As OpenAPIClient.Models.FeedbackOrderDTO
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
			Name="createdAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
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
			Name="state"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackStateType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="author"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackAuthorDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pro"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="contra"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="comments"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackCommentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shop"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackShopDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="resolved"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="verified"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recommend"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="grades"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackGradesDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackOrderDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class ChatMessageDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор сообщения.
		#tag EndNote
		messageId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
		#tag EndNote
		createdAt As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		sender As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
		#tag EndNote
		message As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
		#tag EndNote
		payload() As OpenAPIClient.Models.ChatMessagePayloadDTO
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
			Name="messageId"
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
			Name="sender"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatMessageSenderType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="message"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="payload"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatMessagePayloadDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



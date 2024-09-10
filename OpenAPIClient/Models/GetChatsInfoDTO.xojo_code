#tag Class
Protected Class GetChatsInfoDTO

	#tag Property, Flags = &h0
		#tag Note
			Информация о чатах.
		#tag EndNote
		chats() As OpenAPIClient.Models.GetChatInfoDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		paging As OpenAPIClient.Models.ForwardScrollingPagerDTO
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
			Name="chats"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetChatInfoDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paging"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ForwardScrollingPagerDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



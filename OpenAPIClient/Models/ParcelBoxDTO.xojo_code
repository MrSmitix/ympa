#tag Class
Protected Class ParcelBoxDTO

	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			{% note warning "" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
		#tag EndNote
		fulfilmentId As Xoson.O.OptionalString
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
			Name="fulfilmentId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



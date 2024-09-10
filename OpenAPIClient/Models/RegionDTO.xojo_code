#tag Class
Protected Class RegionDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор региона.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название региона.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		parent As OpenAPIClient.Models.RegionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дочерние регионы.
		#tag EndNote
		children() As OpenAPIClient.Models.RegionDTO
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="children"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



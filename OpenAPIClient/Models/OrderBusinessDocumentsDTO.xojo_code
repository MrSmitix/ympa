#tag Class
Protected Class OrderBusinessDocumentsDTO

	#tag Property, Flags = &h0
		upd As OpenAPIClient.Models.DocumentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		ukd As OpenAPIClient.Models.DocumentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		torgTwelve As OpenAPIClient.Models.DocumentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		sf As OpenAPIClient.Models.DocumentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		ksf As OpenAPIClient.Models.DocumentDTO
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
			Name="upd"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DocumentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ukd"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DocumentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="torgTwelve"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DocumentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sf"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DocumentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ksf"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="DocumentDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



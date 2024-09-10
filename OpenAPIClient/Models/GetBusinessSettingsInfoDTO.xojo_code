#tag Class
Protected Class GetBusinessSettingsInfoDTO

	#tag Property, Flags = &h0
		info As OpenAPIClient.Models.BusinessDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		settings As OpenAPIClient.Models.BusinessSettingsDTO
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
			Name="info"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="settings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BusinessSettingsDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



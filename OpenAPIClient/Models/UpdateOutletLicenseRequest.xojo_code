#tag Class
Protected Class UpdateOutletLicenseRequest

	#tag Property, Flags = &h0
		#tag Note
			Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
		#tag EndNote
		licenses() As OpenAPIClient.Models.OutletLicenseDTO
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
			Name="licenses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OutletLicenseDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class GetRegionWithChildrenResponse

	#tag Property, Flags = &h0
		pager As OpenAPIClient.Models.FlippingPagerDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		regions As OpenAPIClient.Models.RegionDTO
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
			Name="pager"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FlippingPagerDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="regions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class PriceCompetitivenessThresholdsDTO

	#tag Property, Flags = &h0
		optimalPrice As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		averagePrice As OpenAPIClient.Models.BasePriceDTO
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
			Name="optimalPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="averagePrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



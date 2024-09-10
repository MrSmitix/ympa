#tag Class
Protected Class CampaignQualityRatingDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор магазина.
		#tag EndNote
		campaignId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список значений индекса качества.
		#tag EndNote
		ratings() As OpenAPIClient.Models.QualityRatingDTO
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
			Name="campaignId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ratings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QualityRatingDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



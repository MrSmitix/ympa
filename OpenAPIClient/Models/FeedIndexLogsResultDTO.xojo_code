#tag Class
Protected Class FeedIndexLogsResultDTO

	#tag Property, Flags = &h0
		feed As OpenAPIClient.Models.FeedIndexLogsFeedDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список отчетов по индексации прайс-листа.
		#tag EndNote
		indexLogRecords() As OpenAPIClient.Models.FeedIndexLogsRecordDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество отчетов на всех страницах выходных данных.
		#tag EndNote
		total As Xoson.O.OptionalInt64
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
			Name="feed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedIndexLogsFeedDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="indexLogRecords"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedIndexLogsRecordDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



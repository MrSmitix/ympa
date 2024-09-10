#tag Class
Protected Class ExtensionShipmentDTO

	#tag Property, Flags = &h0
		currentStatus As OpenAPIClient.Models.ShipmentStatusChangeDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Доступные действия над отгрузкой.
		#tag EndNote
		availableActions() As ShipmentActionType
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
			Name="currentStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ShipmentStatusChangeDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="availableActions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ShipmentActionType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



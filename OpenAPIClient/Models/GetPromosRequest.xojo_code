#tag Class
Protected Class GetPromosRequest

	#tag Property, Flags = &h0
		participation As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		mechanics As Xoson.O.OptionalString
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
			Name="participation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoParticipationType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="mechanics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MechanicsType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



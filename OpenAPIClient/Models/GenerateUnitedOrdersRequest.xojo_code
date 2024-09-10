#tag Class
Protected Class GenerateUnitedOrdersRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор бизнеса.
		#tag EndNote
		businessId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Начало периода, включительно.
		#tag EndNote
		dateFrom As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конец периода, включительно. Максимальный период — 1 год.
		#tag EndNote
		dateTo As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список магазинов, которые нужны в отчете.
		#tag EndNote
		campaignIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор акции, товары из которой нужны в отчете.
		#tag EndNote
		promoId As Xoson.O.OptionalString
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
			Name="businessId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaignIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="promoId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



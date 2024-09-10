#tag Class
Protected Class ReturnDecisionDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор товара в возврате.
		#tag EndNote
		returnItemId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара.
		#tag EndNote
		count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Комментарий.
		#tag EndNote
		comment As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		reasonType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		subreasonType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		decisionType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Сумма возврата.
		#tag EndNote
		refundAmount As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Компенсация за обратную доставку.
		#tag EndNote
		partnerCompensation As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список хеш-кодов фотографий товара от покупателя.
		#tag EndNote
		images() As String
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
			Name="returnItemId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="comment"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reasonType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnDecisionReasonType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="subreasonType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnDecisionSubreasonType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decisionType"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnDecisionType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="refundAmount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partnerCompensation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="images"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



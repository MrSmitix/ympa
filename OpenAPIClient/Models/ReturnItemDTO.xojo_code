#tag Class
Protected Class ReturnItemDTO

	#tag Property, Flags = &h0
		#tag Note
			SKU на Маркете.
		#tag EndNote
		marketSku As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		shopSku As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара.
		#tag EndNote
		count As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список решений по возврату.
		#tag EndNote
		decisions() As OpenAPIClient.Models.ReturnDecisionDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список логистических позиций возврата.
		#tag EndNote
		instances() As OpenAPIClient.Models.ReturnInstanceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список трек-кодов для почтовых отправлений.
		#tag EndNote
		tracks() As OpenAPIClient.Models.TrackDTO
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
			Name="marketSku"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shopSku"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decisions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnDecisionDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instances"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ReturnInstanceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tracks"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TrackDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



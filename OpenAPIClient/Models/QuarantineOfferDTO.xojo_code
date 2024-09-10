#tag Class
Protected Class QuarantineOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		currentPrice As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		lastValidPrice As OpenAPIClient.Models.BasePriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Причины попадания товара в карантин.
		#tag EndNote
		verdicts() As OpenAPIClient.Models.PriceQuarantineVerdictDTO
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
			Name="offerId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="currentPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lastValidPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BasePriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="verdicts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PriceQuarantineVerdictDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



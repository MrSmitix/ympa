#tag Class
Protected Class GetPromoOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		params As OpenAPIClient.Models.PromoOfferParamsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		autoParticipatingDetails As OpenAPIClient.Models.PromoOfferAutoParticipatingDetailsDTO
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoOfferParticipationStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="params"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoOfferParamsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="autoParticipatingDetails"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PromoOfferAutoParticipatingDetailsDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



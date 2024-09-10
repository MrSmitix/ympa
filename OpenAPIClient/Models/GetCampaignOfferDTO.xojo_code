#tag Class
Protected Class GetCampaignOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		quantum As OpenAPIClient.Models.QuantumDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Есть ли товар в продаже. 
		#tag EndNote
		available As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		basicPrice As OpenAPIClient.Models.GetPriceWithDiscountDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		campaignPrice As OpenAPIClient.Models.GetPriceWithVatDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		status As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ошибки, препятствующие размещению товара на витрине. 
		#tag EndNote
		errors() As OpenAPIClient.Models.OfferErrorDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Предупреждения, не препятствующие размещению товара на витрине. 
		#tag EndNote
		warnings() As OpenAPIClient.Models.OfferErrorDTO
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
			Name="quantum"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="QuantumDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="available"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="basicPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPriceWithDiscountDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="campaignPrice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetPriceWithVatDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCampaignStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferErrorDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warnings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferErrorDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



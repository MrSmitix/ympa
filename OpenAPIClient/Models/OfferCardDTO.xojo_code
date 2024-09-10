#tag Class
Protected Class OfferCardDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		mapping As OpenAPIClient.Models.GetMappingDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список характеристик с их значениями. 
		#tag EndNote
		parameterValues() As OpenAPIClient.Models.ParameterValueDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		cardStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Процент заполненности карточки.
		#tag EndNote
		contentRating As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
		#tag EndNote
		recommendations() As OpenAPIClient.Models.OfferCardRecommendationDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ошибки в контенте, препятствующие размещению товара на витрине.
		#tag EndNote
		errors() As OpenAPIClient.Models.OfferErrorDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
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
			Name="mapping"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GetMappingDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parameterValues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ParameterValueDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cardStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="contentRating"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="recommendations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardRecommendationDTO"
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



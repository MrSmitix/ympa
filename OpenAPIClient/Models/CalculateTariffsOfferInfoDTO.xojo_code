#tag Class
Protected Class CalculateTariffsOfferInfoDTO

	#tag Property, Flags = &h0
		offer As OpenAPIClient.Models.CalculateTariffsOfferDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
		#tag EndNote
		tariffs() As OpenAPIClient.Models.CalculatedTariffDTO
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
			Name="offer"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CalculateTariffsOfferDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tariffs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CalculatedTariffDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



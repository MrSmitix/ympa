#tag Class
Protected Class GoodsStatsGoodsDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		shopSku As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			SKU на Маркете.
		#tag EndNote
		marketSku As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название товара.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
		#tag EndNote
		price As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Идентификатор категории товара на Маркете.
		#tag EndNote
		categoryId As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Название категории товара на Маркете.
		#tag EndNote
		categoryName As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		weightDimensions As OpenAPIClient.Models.GoodsStatsWeightDimensionsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
		#tag EndNote
		warehouses() As OpenAPIClient.Models.GoodsStatsWarehouseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
		#tag EndNote
		tariffs() As OpenAPIClient.Models.TariffDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ссылки (URL) изображений товара в хорошем качестве.
		#tag EndNote
		pictures() As String
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
			Name="shopSku"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="price"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categoryId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categoryName"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weightDimensions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsStatsWeightDimensionsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GoodsStatsWarehouseDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tariffs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TariffDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pictures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



#tag Class
Protected Class OrdersStatsItemDTO

	#tag Property, Flags = &h0
		#tag Note
			Название товара.
		#tag EndNote
		offerName As Xoson.O.OptionalString
	#tag EndProperty


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
		shopSku As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
		#tag EndNote
		count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Цена или скидки на товар.
		#tag EndNote
		prices() As OpenAPIClient.Models.OrdersStatsPriceDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		warehouse As OpenAPIClient.Models.OrdersStatsWarehouseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация об удалении товара из заказа.
		#tag EndNote
		details() As OpenAPIClient.Models.OrdersStatsDetailsDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
		#tag EndNote
		cisList() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Первоначальное количество единиц товара.
		#tag EndNote
		initialCount As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
		#tag EndNote
		bidFee As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
		#tag EndNote
		cofinanceThreshold As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
		#tag EndNote
		cofinanceValue As Xoson.O.OptionalDouble
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
			Name="offerName"
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
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsPriceDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouse"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsWarehouseDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrdersStatsDetailsDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cisList"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="initialCount"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="bidFee"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cofinanceThreshold"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cofinanceValue"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



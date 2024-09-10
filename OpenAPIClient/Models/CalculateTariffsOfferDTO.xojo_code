#tag Class
Protected Class CalculateTariffsOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
		#tag EndNote
		categoryId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Цена на товар в рублях.
		#tag EndNote
		price As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Длина товара в сантиметрах.
		#tag EndNote
		length As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Ширина товара в сантиметрах.
		#tag EndNote
		width As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Высота товара в сантиметрах.
		#tag EndNote
		height As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Вес товара в килограммах.
		#tag EndNote
		weight As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Квант продажи — количество единиц товара в одном товарном предложении.
		#tag EndNote
		quantity As Xoson.O.OptionalInteger
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
			Name="categoryId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
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
			Name="length"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="width"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="height"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weight"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="quantity"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



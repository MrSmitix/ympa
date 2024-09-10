#tag Class
Protected Class GetOfferMappingsRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификаторы товаров, информация о которых нужна.  {% note warning "Такой список возвращается только целиком" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
		#tag EndNote
		offerIds() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
		#tag EndNote
		cardStatuses() As OfferCardStatusType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по категориям на Маркете.
		#tag EndNote
		categoryIds() As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по брендам.
		#tag EndNote
		vendorNames() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по тегам.
		#tag EndNote
		tags() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
		#tag EndNote
		archived As Xoson.O.OptionalBoolean
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
			Name="offerIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cardStatuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categoryIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="vendorNames"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="archived"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



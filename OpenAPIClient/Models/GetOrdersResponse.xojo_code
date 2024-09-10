#tag Class
Protected Class GetOrdersResponse

	#tag Property, Flags = &h0
		pager As OpenAPIClient.Models.FlippingPagerDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Модель заказа. 
		#tag EndNote
		orders() As OpenAPIClient.Models.OrderDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		paging As OpenAPIClient.Models.ForwardScrollingPagerDTO
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
			Name="pager"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FlippingPagerDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="orders"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OrderDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paging"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ForwardScrollingPagerDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



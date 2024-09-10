#tag Class
Protected Class FeedDTO

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор прайс-листа.
		#tag EndNote
		id As Xoson.O.OptionalInt64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
		#tag EndNote
		login As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
		#tag EndNote
		password As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
		#tag EndNote
		uploadDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
		#tag EndNote
		url As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		content As OpenAPIClient.Models.FeedContentDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		download As OpenAPIClient.Models.FeedDownloadDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		placement As OpenAPIClient.Models.FeedPlacementDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		publication As OpenAPIClient.Models.FeedPublicationDTO
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="login"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="password"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="uploadDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="content"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedContentDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="download"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedDownloadDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="placement"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedPlacementDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="publication"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedPublicationDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass



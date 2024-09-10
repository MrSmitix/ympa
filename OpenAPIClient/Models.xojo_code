#tag Module
Protected Module Models
	#tag Method, Flags = &h21
		Protected Function AddOffersToArchiveErrorTypeToString(value As AddOffersToArchiveErrorType) As String
		  Select Case value
		    Case AddOffersToArchiveErrorType.OfferHasStocks
		      Return "OFFER_HAS_STOCKS"
		    Case AddOffersToArchiveErrorType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AffectedOrderQualityRatingComponentTypeToString(value As AffectedOrderQualityRatingComponentType) As String
		  Select Case value
		    Case AffectedOrderQualityRatingComponentType.DbsCancellationRate
		      Return "DBS_CANCELLATION_RATE"
		    Case AffectedOrderQualityRatingComponentType.DbsLateDeliveryRate
		      Return "DBS_LATE_DELIVERY_RATE"
		    Case AffectedOrderQualityRatingComponentType.FbsCancellationRate
		      Return "FBS_CANCELLATION_RATE"
		    Case AffectedOrderQualityRatingComponentType.FbsLateShipRate
		      Return "FBS_LATE_SHIP_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function AgeUnitTypeToString(value As AgeUnitType) As String
		  Select Case value
		    Case AgeUnitType.Year
		      Return "YEAR"
		    Case AgeUnitType.Month
		      Return "MONTH"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ApiResponseStatusTypeToString(value As ApiResponseStatusType) As String
		  Select Case value
		    Case ApiResponseStatusType.Ok
		      Return "OK"
		    Case ApiResponseStatusType.Error
		      Return "ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CalculatedTariffTypeToString(value As CalculatedTariffType) As String
		  Select Case value
		    Case CalculatedTariffType.AgencyCommission
		      Return "AGENCY_COMMISSION"
		    Case CalculatedTariffType.PaymentTransfer
		      Return "PAYMENT_TRANSFER"
		    Case CalculatedTariffType.Fee
		      Return "FEE"
		    Case CalculatedTariffType.DeliveryToCustomer
		      Return "DELIVERY_TO_CUSTOMER"
		    Case CalculatedTariffType.CrossregionalDelivery
		      Return "CROSSREGIONAL_DELIVERY"
		    Case CalculatedTariffType.ExpressDelivery
		      Return "EXPRESS_DELIVERY"
		    Case CalculatedTariffType.Sorting
		      Return "SORTING"
		    Case CalculatedTariffType.MiddleMile
		      Return "MIDDLE_MILE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CampaignSettingsScheduleSourceTypeToString(value As CampaignSettingsScheduleSourceType) As String
		  Select Case value
		    Case CampaignSettingsScheduleSourceType.Web
		      Return "WEB"
		    Case CampaignSettingsScheduleSourceType.Yml
		      Return "YML"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CategoryErrorTypeToString(value As CategoryErrorType) As String
		  Select Case value
		    Case CategoryErrorType.UnknownCategory
		      Return "UNKNOWN_CATEGORY"
		    Case CategoryErrorType.CategoryIsNotLeaf
		      Return "CATEGORY_IS_NOT_LEAF"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChatMessageSenderTypeToString(value As ChatMessageSenderType) As String
		  Select Case value
		    Case ChatMessageSenderType.Partner
		      Return "PARTNER"
		    Case ChatMessageSenderType.Customer
		      Return "CUSTOMER"
		    Case ChatMessageSenderType.Market
		      Return "MARKET"
		    Case ChatMessageSenderType.Support
		      Return "SUPPORT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChatStatusTypeToString(value As ChatStatusType) As String
		  Select Case value
		    Case ChatStatusType.Escapednew
		      Return "NEW"
		    Case ChatStatusType.WaitingForCustomer
		      Return "WAITING_FOR_CUSTOMER"
		    Case ChatStatusType.WaitingForPartner
		      Return "WAITING_FOR_PARTNER"
		    Case ChatStatusType.WaitingForArbiter
		      Return "WAITING_FOR_ARBITER"
		    Case ChatStatusType.WaitingForMarket
		      Return "WAITING_FOR_MARKET"
		    Case ChatStatusType.Finished
		      Return "FINISHED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ChatTypeToString(value As ChatType) As String
		  Select Case value
		    Case ChatType.Chat
		      Return "CHAT"
		    Case ChatType.Arbitrage
		      Return "ARBITRAGE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function CurrencyTypeToString(value As CurrencyType) As String
		  Select Case value
		    Case CurrencyType.Rur
		      Return "RUR"
		    Case CurrencyType.Usd
		      Return "USD"
		    Case CurrencyType.Eur
		      Return "EUR"
		    Case CurrencyType.Uah
		      Return "UAH"
		    Case CurrencyType.Aud
		      Return "AUD"
		    Case CurrencyType.Gbp
		      Return "GBP"
		    Case CurrencyType.Byr
		      Return "BYR"
		    Case CurrencyType.Byn
		      Return "BYN"
		    Case CurrencyType.Dkk
		      Return "DKK"
		    Case CurrencyType.Isk
		      Return "ISK"
		    Case CurrencyType.Kzt
		      Return "KZT"
		    Case CurrencyType.Cad
		      Return "CAD"
		    Case CurrencyType.Cny
		      Return "CNY"
		    Case CurrencyType.Nok
		      Return "NOK"
		    Case CurrencyType.Xdr
		      Return "XDR"
		    Case CurrencyType.Sgd
		      Return "SGD"
		    Case CurrencyType.Escapedtry
		      Return "TRY"
		    Case CurrencyType.Sek
		      Return "SEK"
		    Case CurrencyType.Chf
		      Return "CHF"
		    Case CurrencyType.Jpy
		      Return "JPY"
		    Case CurrencyType.Azn
		      Return "AZN"
		    Case CurrencyType.All
		      Return "ALL"
		    Case CurrencyType.Dzd
		      Return "DZD"
		    Case CurrencyType.Aoa
		      Return "AOA"
		    Case CurrencyType.Ars
		      Return "ARS"
		    Case CurrencyType.Amd
		      Return "AMD"
		    Case CurrencyType.Afn
		      Return "AFN"
		    Case CurrencyType.Bhd
		      Return "BHD"
		    Case CurrencyType.Bgn
		      Return "BGN"
		    Case CurrencyType.Bob
		      Return "BOB"
		    Case CurrencyType.Bwp
		      Return "BWP"
		    Case CurrencyType.Bnd
		      Return "BND"
		    Case CurrencyType.Brl
		      Return "BRL"
		    Case CurrencyType.Bif
		      Return "BIF"
		    Case CurrencyType.Huf
		      Return "HUF"
		    Case CurrencyType.Vef
		      Return "VEF"
		    Case CurrencyType.Kpw
		      Return "KPW"
		    Case CurrencyType.Vnd
		      Return "VND"
		    Case CurrencyType.Gmd
		      Return "GMD"
		    Case CurrencyType.Ghs
		      Return "GHS"
		    Case CurrencyType.Gnf
		      Return "GNF"
		    Case CurrencyType.Hkd
		      Return "HKD"
		    Case CurrencyType.Gel
		      Return "GEL"
		    Case CurrencyType.Aed
		      Return "AED"
		    Case CurrencyType.Egp
		      Return "EGP"
		    Case CurrencyType.Zmk
		      Return "ZMK"
		    Case CurrencyType.Ils
		      Return "ILS"
		    Case CurrencyType.Inr
		      Return "INR"
		    Case CurrencyType.Idr
		      Return "IDR"
		    Case CurrencyType.Jod
		      Return "JOD"
		    Case CurrencyType.Iqd
		      Return "IQD"
		    Case CurrencyType.Irr
		      Return "IRR"
		    Case CurrencyType.Yer
		      Return "YER"
		    Case CurrencyType.Qar
		      Return "QAR"
		    Case CurrencyType.Kes
		      Return "KES"
		    Case CurrencyType.Kgs
		      Return "KGS"
		    Case CurrencyType.Cop
		      Return "COP"
		    Case CurrencyType.Cdf
		      Return "CDF"
		    Case CurrencyType.Crc
		      Return "CRC"
		    Case CurrencyType.Kwd
		      Return "KWD"
		    Case CurrencyType.Cup
		      Return "CUP"
		    Case CurrencyType.Lak
		      Return "LAK"
		    Case CurrencyType.Lvl
		      Return "LVL"
		    Case CurrencyType.Sll
		      Return "SLL"
		    Case CurrencyType.Lbp
		      Return "LBP"
		    Case CurrencyType.Lyd
		      Return "LYD"
		    Case CurrencyType.Szl
		      Return "SZL"
		    Case CurrencyType.Ltl
		      Return "LTL"
		    Case CurrencyType.Mur
		      Return "MUR"
		    Case CurrencyType.Mro
		      Return "MRO"
		    Case CurrencyType.Mkd
		      Return "MKD"
		    Case CurrencyType.Mwk
		      Return "MWK"
		    Case CurrencyType.Mga
		      Return "MGA"
		    Case CurrencyType.Myr
		      Return "MYR"
		    Case CurrencyType.Mad
		      Return "MAD"
		    Case CurrencyType.Mxn
		      Return "MXN"
		    Case CurrencyType.Mzn
		      Return "MZN"
		    Case CurrencyType.Mdl
		      Return "MDL"
		    Case CurrencyType.Mnt
		      Return "MNT"
		    Case CurrencyType.Npr
		      Return "NPR"
		    Case CurrencyType.Ngn
		      Return "NGN"
		    Case CurrencyType.Nio
		      Return "NIO"
		    Case CurrencyType.Nzd
		      Return "NZD"
		    Case CurrencyType.Omr
		      Return "OMR"
		    Case CurrencyType.Pkr
		      Return "PKR"
		    Case CurrencyType.Pyg
		      Return "PYG"
		    Case CurrencyType.Pen
		      Return "PEN"
		    Case CurrencyType.Pln
		      Return "PLN"
		    Case CurrencyType.Khr
		      Return "KHR"
		    Case CurrencyType.Sar
		      Return "SAR"
		    Case CurrencyType.Ron
		      Return "RON"
		    Case CurrencyType.Scr
		      Return "SCR"
		    Case CurrencyType.Syp
		      Return "SYP"
		    Case CurrencyType.Skk
		      Return "SKK"
		    Case CurrencyType.Sos
		      Return "SOS"
		    Case CurrencyType.Sdg
		      Return "SDG"
		    Case CurrencyType.Srd
		      Return "SRD"
		    Case CurrencyType.Tjs
		      Return "TJS"
		    Case CurrencyType.Thb
		      Return "THB"
		    Case CurrencyType.Twd
		      Return "TWD"
		    Case CurrencyType.Bdt
		      Return "BDT"
		    Case CurrencyType.Tzs
		      Return "TZS"
		    Case CurrencyType.Tnd
		      Return "TND"
		    Case CurrencyType.Tmm
		      Return "TMM"
		    Case CurrencyType.Ugx
		      Return "UGX"
		    Case CurrencyType.Uzs
		      Return "UZS"
		    Case CurrencyType.Uyu
		      Return "UYU"
		    Case CurrencyType.Php
		      Return "PHP"
		    Case CurrencyType.Djf
		      Return "DJF"
		    Case CurrencyType.Xaf
		      Return "XAF"
		    Case CurrencyType.Xof
		      Return "XOF"
		    Case CurrencyType.Hrk
		      Return "HRK"
		    Case CurrencyType.Czk
		      Return "CZK"
		    Case CurrencyType.Clp
		      Return "CLP"
		    Case CurrencyType.Lkr
		      Return "LKR"
		    Case CurrencyType.Eek
		      Return "EEK"
		    Case CurrencyType.Etb
		      Return "ETB"
		    Case CurrencyType.Rsd
		      Return "RSD"
		    Case CurrencyType.Zar
		      Return "ZAR"
		    Case CurrencyType.Krw
		      Return "KRW"
		    Case CurrencyType.Nad
		      Return "NAD"
		    Case CurrencyType.Tl
		      Return "TL"
		    Case CurrencyType.Ue
		      Return "UE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function DayOfWeekTypeToString(value As DayOfWeekType) As String
		  Select Case value
		    Case DayOfWeekType.Monday
		      Return "MONDAY"
		    Case DayOfWeekType.Tuesday
		      Return "TUESDAY"
		    Case DayOfWeekType.Wednesday
		      Return "WEDNESDAY"
		    Case DayOfWeekType.Thursday
		      Return "THURSDAY"
		    Case DayOfWeekType.Friday
		      Return "FRIDAY"
		    Case DayOfWeekType.Saturday
		      Return "SATURDAY"
		    Case DayOfWeekType.Sunday
		      Return "SUNDAY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function EacVerificationStatusTypeToString(value As EacVerificationStatusType) As String
		  Select Case value
		    Case EacVerificationStatusType.Accepted
		      Return "ACCEPTED"
		    Case EacVerificationStatusType.Rejected
		      Return "REJECTED"
		    Case EacVerificationStatusType.NeedUpdate
		      Return "NEED_UPDATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedContentErrorTypeToString(value As FeedContentErrorType) As String
		  Select Case value
		    Case FeedContentErrorType.ParseError
		      Return "PARSE_ERROR"
		    Case FeedContentErrorType.ParseXmlError
		      Return "PARSE_XML_ERROR"
		    Case FeedContentErrorType.TooManyRejectedOffers
		      Return "TOO_MANY_REJECTED_OFFERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedDownloadErrorTypeToString(value As FeedDownloadErrorType) As String
		  Select Case value
		    Case FeedDownloadErrorType.Error
		      Return "DOWNLOAD_ERROR"
		    Case FeedDownloadErrorType.HttpError
		      Return "DOWNLOAD_HTTP_ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedIndexLogsErrorTypeToString(value As FeedIndexLogsErrorType) As String
		  Select Case value
		    Case FeedIndexLogsErrorType.DownloadError
		      Return "DOWNLOAD_ERROR"
		    Case FeedIndexLogsErrorType.DownloadHttpError
		      Return "DOWNLOAD_HTTP_ERROR"
		    Case FeedIndexLogsErrorType.ParseError
		      Return "PARSE_ERROR"
		    Case FeedIndexLogsErrorType.ParseXmlError
		      Return "PARSE_XML_ERROR"
		    Case FeedIndexLogsErrorType.TooManyRejectedOffers
		      Return "TOO_MANY_REJECTED_OFFERS"
		    Case FeedIndexLogsErrorType.NotIndexed
		      Return "NOT_INDEXED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedIndexLogsIndexTypeToString(value As FeedIndexLogsIndexType) As String
		  Select Case value
		    Case FeedIndexLogsIndexType.Diff
		      Return "DIFF"
		    Case FeedIndexLogsIndexType.FastPrice
		      Return "FAST_PRICE"
		    Case FeedIndexLogsIndexType.Full
		      Return "FULL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedIndexLogsStatusTypeToString(value As FeedIndexLogsStatusType) As String
		  Select Case value
		    Case FeedIndexLogsStatusType.Error
		      Return "ERROR"
		    Case FeedIndexLogsStatusType.Ok
		      Return "OK"
		    Case FeedIndexLogsStatusType.Warning
		      Return "WARNING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedStatusTypeToString(value As FeedStatusType) As String
		  Select Case value
		    Case FeedStatusType.Error
		      Return "ERROR"
		    Case FeedStatusType.Na
		      Return "NA"
		    Case FeedStatusType.Ok
		      Return "OK"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedbackCommentAuthorTypeToString(value As FeedbackCommentAuthorType) As String
		  Select Case value
		    Case FeedbackCommentAuthorType.User
		      Return "USER"
		    Case FeedbackCommentAuthorType.Shop
		      Return "SHOP"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedbackDeliveryTypeToString(value As FeedbackDeliveryType) As String
		  Select Case value
		    Case FeedbackDeliveryType.Delivery
		      Return "DELIVERY"
		    Case FeedbackDeliveryType.Pickup
		      Return "PICKUP"
		    Case FeedbackDeliveryType.Instore
		      Return "INSTORE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedbackReactionStatusTypeToString(value As FeedbackReactionStatusType) As String
		  Select Case value
		    Case FeedbackReactionStatusType.All
		      Return "ALL"
		    Case FeedbackReactionStatusType.NeedReaction
		      Return "NEED_REACTION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FeedbackStateTypeToString(value As FeedbackStateType) As String
		  Select Case value
		    Case FeedbackStateType.Last
		      Return "LAST"
		    Case FeedbackStateType.Previous
		      Return "PREVIOUS"
		    Case FeedbackStateType.Deleted
		      Return "DELETED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function FieldStateTypeToString(value As FieldStateType) As String
		  Select Case value
		    Case FieldStateType.Specified
		      Return "SPECIFIED"
		    Case FieldStateType.Empty
		      Return "EMPTY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GoodsFeedbackCommentAuthorTypeToString(value As GoodsFeedbackCommentAuthorType) As String
		  Select Case value
		    Case GoodsFeedbackCommentAuthorType.User
		      Return "USER"
		    Case GoodsFeedbackCommentAuthorType.Business
		      Return "BUSINESS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function GoodsFeedbackCommentStatusTypeToString(value As GoodsFeedbackCommentStatusType) As String
		  Select Case value
		    Case GoodsFeedbackCommentStatusType.Published
		      Return "PUBLISHED"
		    Case GoodsFeedbackCommentStatusType.Unmoderated
		      Return "UNMODERATED"
		    Case GoodsFeedbackCommentStatusType.Banned
		      Return "BANNED"
		    Case GoodsFeedbackCommentStatusType.Deleted
		      Return "DELETED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LanguageTypeToString(value As LanguageType) As String
		  Select Case value
		    Case LanguageType.Ru
		      Return "RU"
		    Case LanguageType.En
		      Return "EN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LicenseCheckStatusTypeToString(value As LicenseCheckStatusType) As String
		  Select Case value
		    Case LicenseCheckStatusType.Escapednew
		      Return "NEW"
		    Case LicenseCheckStatusType.Success
		      Return "SUCCESS"
		    Case LicenseCheckStatusType.Fail
		      Return "FAIL"
		    Case LicenseCheckStatusType.Revoke
		      Return "REVOKE"
		    Case LicenseCheckStatusType.DontWant
		      Return "DONT_WANT"
		    Case LicenseCheckStatusType.FailManual
		      Return "FAIL_MANUAL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LicenseTypeToString(value As LicenseType) As String
		  Select Case value
		    Case LicenseType.Alcohol
		      Return "ALCOHOL"
		    Case LicenseType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function LogisticPointTypeToString(value As LogisticPointType) As String
		  Select Case value
		    Case LogisticPointType.Warehouse
		      Return "WAREHOUSE"
		    Case LogisticPointType.PickupPoint
		      Return "PICKUP_POINT"
		    Case LogisticPointType.PickupTerminal
		      Return "PICKUP_TERMINAL"
		    Case LogisticPointType.PickupPostOffice
		      Return "PICKUP_POST_OFFICE"
		    Case LogisticPointType.PickupMixed
		      Return "PICKUP_MIXED"
		    Case LogisticPointType.PickupRetail
		      Return "PICKUP_RETAIL"
		    Case LogisticPointType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function MechanicsTypeToString(value As MechanicsType) As String
		  Select Case value
		    Case MechanicsType.DirectDiscount
		      Return "DIRECT_DISCOUNT"
		    Case MechanicsType.BlueFlash
		      Return "BLUE_FLASH"
		    Case MechanicsType.MarketPromocode
		      Return "MARKET_PROMOCODE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferAvailabilityStatusTypeToString(value As OfferAvailabilityStatusType) As String
		  Select Case value
		    Case OfferAvailabilityStatusType.Active
		      Return "ACTIVE"
		    Case OfferAvailabilityStatusType.Inactive
		      Return "INACTIVE"
		    Case OfferAvailabilityStatusType.Delisted
		      Return "DELISTED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferCampaignStatusTypeToString(value As OfferCampaignStatusType) As String
		  Select Case value
		    Case OfferCampaignStatusType.Published
		      Return "PUBLISHED"
		    Case OfferCampaignStatusType.Checking
		      Return "CHECKING"
		    Case OfferCampaignStatusType.DisabledByPartner
		      Return "DISABLED_BY_PARTNER"
		    Case OfferCampaignStatusType.DisabledAutomatically
		      Return "DISABLED_AUTOMATICALLY"
		    Case OfferCampaignStatusType.RejectedByMarket
		      Return "REJECTED_BY_MARKET"
		    Case OfferCampaignStatusType.CreatingCard
		      Return "CREATING_CARD"
		    Case OfferCampaignStatusType.NoCard
		      Return "NO_CARD"
		    Case OfferCampaignStatusType.NoStocks
		      Return "NO_STOCKS"
		    Case OfferCampaignStatusType.Archived
		      Return "ARCHIVED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferCardRecommendationTypeToString(value As OfferCardRecommendationType) As String
		  Select Case value
		    Case OfferCardRecommendationType.HasVideo
		      Return "HAS_VIDEO"
		    Case OfferCardRecommendationType.RecognizedVendor
		      Return "RECOGNIZED_VENDOR"
		    Case OfferCardRecommendationType.Main
		      Return "MAIN"
		    Case OfferCardRecommendationType.Additional
		      Return "ADDITIONAL"
		    Case OfferCardRecommendationType.Distinctive
		      Return "DISTINCTIVE"
		    Case OfferCardRecommendationType.Filterable
		      Return "FILTERABLE"
		    Case OfferCardRecommendationType.PictureCount
		      Return "PICTURE_COUNT"
		    Case OfferCardRecommendationType.HasDescription
		      Return "HAS_DESCRIPTION"
		    Case OfferCardRecommendationType.HasBarcode
		      Return "HAS_BARCODE"
		    Case OfferCardRecommendationType.FirstPictureSize
		      Return "FIRST_PICTURE_SIZE"
		    Case OfferCardRecommendationType.TitleLength
		      Return "TITLE_LENGTH"
		    Case OfferCardRecommendationType.DescriptionLength
		      Return "DESCRIPTION_LENGTH"
		    Case OfferCardRecommendationType.AveragePictureSize
		      Return "AVERAGE_PICTURE_SIZE"
		    Case OfferCardRecommendationType.FirstVideoSize
		      Return "FIRST_VIDEO_SIZE"
		    Case OfferCardRecommendationType.FirstVideoLength
		      Return "FIRST_VIDEO_LENGTH"
		    Case OfferCardRecommendationType.AverageVideoSize
		      Return "AVERAGE_VIDEO_SIZE"
		    Case OfferCardRecommendationType.VideoCount
		      Return "VIDEO_COUNT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferCardStatusTypeToString(value As OfferCardStatusType) As String
		  Select Case value
		    Case OfferCardStatusType.HasCardCanNotUpdate
		      Return "HAS_CARD_CAN_NOT_UPDATE"
		    Case OfferCardStatusType.HasCardCanUpdate
		      Return "HAS_CARD_CAN_UPDATE"
		    Case OfferCardStatusType.HasCardCanUpdateErrors
		      Return "HAS_CARD_CAN_UPDATE_ERRORS"
		    Case OfferCardStatusType.HasCardCanUpdateProcessing
		      Return "HAS_CARD_CAN_UPDATE_PROCESSING"
		    Case OfferCardStatusType.NoCardNeedContent
		      Return "NO_CARD_NEED_CONTENT"
		    Case OfferCardStatusType.NoCardMarketWillCreate
		      Return "NO_CARD_MARKET_WILL_CREATE"
		    Case OfferCardStatusType.NoCardErrors
		      Return "NO_CARD_ERRORS"
		    Case OfferCardStatusType.NoCardProcessing
		      Return "NO_CARD_PROCESSING"
		    Case OfferCardStatusType.NoCardAddToCampaign
		      Return "NO_CARD_ADD_TO_CAMPAIGN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferConditionQualityTypeToString(value As OfferConditionQualityType) As String
		  Select Case value
		    Case OfferConditionQualityType.Perfect
		      Return "PERFECT"
		    Case OfferConditionQualityType.Excellent
		      Return "EXCELLENT"
		    Case OfferConditionQualityType.Good
		      Return "GOOD"
		    Case OfferConditionQualityType.NotSpecified
		      Return "NOT_SPECIFIED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferConditionTypeToString(value As OfferConditionType) As String
		  Select Case value
		    Case OfferConditionType.Preowned
		      Return "PREOWNED"
		    Case OfferConditionType.Showcasesample
		      Return "SHOWCASESAMPLE"
		    Case OfferConditionType.Refurbished
		      Return "REFURBISHED"
		    Case OfferConditionType.Reduction
		      Return "REDUCTION"
		    Case OfferConditionType.Renovated
		      Return "RENOVATED"
		    Case OfferConditionType.NotSpecified
		      Return "NOT_SPECIFIED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferContentErrorTypeToString(value As OfferContentErrorType) As String
		  Select Case value
		    Case OfferContentErrorType.OfferNotFound
		      Return "OFFER_NOT_FOUND"
		    Case OfferContentErrorType.UnknownCategory
		      Return "UNKNOWN_CATEGORY"
		    Case OfferContentErrorType.CategoryMismatch
		      Return "CATEGORY_MISMATCH"
		    Case OfferContentErrorType.UnknownParameter
		      Return "UNKNOWN_PARAMETER"
		    Case OfferContentErrorType.UnexpectedBooleanValue
		      Return "UNEXPECTED_BOOLEAN_VALUE"
		    Case OfferContentErrorType.NumberFormat
		      Return "NUMBER_FORMAT"
		    Case OfferContentErrorType.ValueBlank
		      Return "VALUE_BLANK"
		    Case OfferContentErrorType.InvalidUnitId
		      Return "INVALID_UNIT_ID"
		    Case OfferContentErrorType.InvalidGroupIdLength
		      Return "INVALID_GROUP_ID_LENGTH"
		    Case OfferContentErrorType.InvalidGroupIdCharacters
		      Return "INVALID_GROUP_ID_CHARACTERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferMappingErrorTypeToString(value As OfferMappingErrorType) As String
		  Select Case value
		    Case OfferMappingErrorType.UnknownCategory
		      Return "UNKNOWN_CATEGORY"
		    Case OfferMappingErrorType.CategoryMismatch
		      Return "CATEGORY_MISMATCH"
		    Case OfferMappingErrorType.EmptyMarketCategory
		      Return "EMPTY_MARKET_CATEGORY"
		    Case OfferMappingErrorType.UnknownParameter
		      Return "UNKNOWN_PARAMETER"
		    Case OfferMappingErrorType.UnexpectedBooleanValue
		      Return "UNEXPECTED_BOOLEAN_VALUE"
		    Case OfferMappingErrorType.NumberFormat
		      Return "NUMBER_FORMAT"
		    Case OfferMappingErrorType.ValueBlank
		      Return "VALUE_BLANK"
		    Case OfferMappingErrorType.InvalidUnitId
		      Return "INVALID_UNIT_ID"
		    Case OfferMappingErrorType.InvalidGroupIdLength
		      Return "INVALID_GROUP_ID_LENGTH"
		    Case OfferMappingErrorType.InvalidGroupIdCharacters
		      Return "INVALID_GROUP_ID_CHARACTERS"
		    Case OfferMappingErrorType.InvalidPickerUrl
		      Return "INVALID_PICKER_URL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferMappingKindTypeToString(value As OfferMappingKindType) As String
		  Select Case value
		    Case OfferMappingKindType.Active
		      Return "ACTIVE"
		    Case OfferMappingKindType.All
		      Return "ALL"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferProcessingNoteTypeToString(value As OfferProcessingNoteType) As String
		  Select Case value
		    Case OfferProcessingNoteType.Assortment
		      Return "ASSORTMENT"
		    Case OfferProcessingNoteType.Cancelled
		      Return "CANCELLED"
		    Case OfferProcessingNoteType.ConflictingInformation
		      Return "CONFLICTING_INFORMATION"
		    Case OfferProcessingNoteType.Other
		      Return "OTHER"
		    Case OfferProcessingNoteType.DepartmentFrozen
		      Return "DEPARTMENT_FROZEN"
		    Case OfferProcessingNoteType.IncorrectInformation
		      Return "INCORRECT_INFORMATION"
		    Case OfferProcessingNoteType.LegalConflict
		      Return "LEGAL_CONFLICT"
		    Case OfferProcessingNoteType.NeedClassificationInformation
		      Return "NEED_CLASSIFICATION_INFORMATION"
		    Case OfferProcessingNoteType.NeedInformation
		      Return "NEED_INFORMATION"
		    Case OfferProcessingNoteType.NeedPictures
		      Return "NEED_PICTURES"
		    Case OfferProcessingNoteType.NeedVendor
		      Return "NEED_VENDOR"
		    Case OfferProcessingNoteType.NoCategory
		      Return "NO_CATEGORY"
		    Case OfferProcessingNoteType.NoKnowledge
		      Return "NO_KNOWLEDGE"
		    Case OfferProcessingNoteType.NoParametersInShopTitle
		      Return "NO_PARAMETERS_IN_SHOP_TITLE"
		    Case OfferProcessingNoteType.NoSizeMeasure
		      Return "NO_SIZE_MEASURE"
		    Case OfferProcessingNoteType.SampleLine
		      Return "SAMPLE_LINE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferProcessingStatusTypeToString(value As OfferProcessingStatusType) As String
		  Select Case value
		    Case OfferProcessingStatusType.Unknown
		      Return "UNKNOWN"
		    Case OfferProcessingStatusType.Ready
		      Return "READY"
		    Case OfferProcessingStatusType.InWork
		      Return "IN_WORK"
		    Case OfferProcessingStatusType.NeedInfo
		      Return "NEED_INFO"
		    Case OfferProcessingStatusType.NeedMapping
		      Return "NEED_MAPPING"
		    Case OfferProcessingStatusType.NeedContent
		      Return "NEED_CONTENT"
		    Case OfferProcessingStatusType.ContentProcessing
		      Return "CONTENT_PROCESSING"
		    Case OfferProcessingStatusType.Suspended
		      Return "SUSPENDED"
		    Case OfferProcessingStatusType.Rejected
		      Return "REJECTED"
		    Case OfferProcessingStatusType.Review
		      Return "REVIEW"
		    Case OfferProcessingStatusType.CreateError
		      Return "CREATE_ERROR"
		    Case OfferProcessingStatusType.UpdateError
		      Return "UPDATE_ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferSellingProgramStatusTypeToString(value As OfferSellingProgramStatusType) As String
		  Select Case value
		    Case OfferSellingProgramStatusType.Fine
		      Return "FINE"
		    Case OfferSellingProgramStatusType.Reject
		      Return "REJECT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OfferTypeToString(value As OfferType) As String
		  Select Case value
		    Case OfferType.Default
		      Return "DEFAULT"
		    Case OfferType.Medicine
		      Return "MEDICINE"
		    Case OfferType.Book
		      Return "BOOK"
		    Case OfferType.Audiobook
		      Return "AUDIOBOOK"
		    Case OfferType.ArtistTitle
		      Return "ARTIST_TITLE"
		    Case OfferType.OnDemand
		      Return "ON_DEMAND"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderBuyerTypeToString(value As OrderBuyerType) As String
		  Select Case value
		    Case OrderBuyerType.Person
		      Return "PERSON"
		    Case OrderBuyerType.Business
		      Return "BUSINESS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderCancellationReasonTypeToString(value As OrderCancellationReasonType) As String
		  Select Case value
		    Case OrderCancellationReasonType.Delivered
		      Return "ORDER_DELIVERED"
		    Case OrderCancellationReasonType.InDelivery
		      Return "ORDER_IN_DELIVERY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDeliveryDateReasonTypeToString(value As OrderDeliveryDateReasonType) As String
		  Select Case value
		    Case OrderDeliveryDateReasonType.UserMovedDeliveryDates
		      Return "USER_MOVED_DELIVERY_DATES"
		    Case OrderDeliveryDateReasonType.PartnerMovedDeliveryDates
		      Return "PARTNER_MOVED_DELIVERY_DATES"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDeliveryDispatchTypeToString(value As OrderDeliveryDispatchType) As String
		  Select Case value
		    Case OrderDeliveryDispatchType.Unknown
		      Return "UNKNOWN"
		    Case OrderDeliveryDispatchType.Buyer
		      Return "BUYER"
		    Case OrderDeliveryDispatchType.MarketPartnerOutlet
		      Return "MARKET_PARTNER_OUTLET"
		    Case OrderDeliveryDispatchType.MarketBrandedOutlet
		      Return "MARKET_BRANDED_OUTLET"
		    Case OrderDeliveryDispatchType.ShopOutlet
		      Return "SHOP_OUTLET"
		    Case OrderDeliveryDispatchType.Dropoff
		      Return "DROPOFF"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDeliveryEacTypeToString(value As OrderDeliveryEacType) As String
		  Select Case value
		    Case OrderDeliveryEacType.MerchantToCourier
		      Return "MERCHANT_TO_COURIER"
		    Case OrderDeliveryEacType.CourierToMerchant
		      Return "COURIER_TO_MERCHANT"
		    Case OrderDeliveryEacType.CheckingByMerchant
		      Return "CHECKING_BY_MERCHANT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDeliveryPartnerTypeToString(value As OrderDeliveryPartnerType) As String
		  Select Case value
		    Case OrderDeliveryPartnerType.Shop
		      Return "SHOP"
		    Case OrderDeliveryPartnerType.YandexMarket
		      Return "YANDEX_MARKET"
		    Case OrderDeliveryPartnerType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDeliveryTypeToString(value As OrderDeliveryType) As String
		  Select Case value
		    Case OrderDeliveryType.Delivery
		      Return "DELIVERY"
		    Case OrderDeliveryType.Pickup
		      Return "PICKUP"
		    Case OrderDeliveryType.Post
		      Return "POST"
		    Case OrderDeliveryType.Digital
		      Return "DIGITAL"
		    Case OrderDeliveryType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderDocumentStatusTypeToString(value As OrderDocumentStatusType) As String
		  Select Case value
		    Case OrderDocumentStatusType.Ready
		      Return "READY"
		    Case OrderDocumentStatusType.NotReady
		      Return "NOT_READY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderItemInstanceTypeToString(value As OrderItemInstanceType) As String
		  Select Case value
		    Case OrderItemInstanceType.Cis
		      Return "CIS"
		    Case OrderItemInstanceType.Uin
		      Return "UIN"
		    Case OrderItemInstanceType.Rnpt
		      Return "RNPT"
		    Case OrderItemInstanceType.Gtd
		      Return "GTD"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderItemStatusTypeToString(value As OrderItemStatusType) As String
		  Select Case value
		    Case OrderItemStatusType.Rejected
		      Return "REJECTED"
		    Case OrderItemStatusType.Returned
		      Return "RETURNED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderItemSubsidyTypeToString(value As OrderItemSubsidyType) As String
		  Select Case value
		    Case OrderItemSubsidyType.YandexCashback
		      Return "YANDEX_CASHBACK"
		    Case OrderItemSubsidyType.Subsidy
		      Return "SUBSIDY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderItemsModificationRequestReasonTypeToString(value As OrderItemsModificationRequestReasonType) As String
		  Select Case value
		    Case OrderItemsModificationRequestReasonType.PartnerRequestedRemove
		      Return "PARTNER_REQUESTED_REMOVE"
		    Case OrderItemsModificationRequestReasonType.UserRequestedRemove
		      Return "USER_REQUESTED_REMOVE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderLiftTypeToString(value As OrderLiftType) As String
		  Select Case value
		    Case OrderLiftType.NotNeeded
		      Return "NOT_NEEDED"
		    Case OrderLiftType.Manual
		      Return "MANUAL"
		    Case OrderLiftType.Elevator
		      Return "ELEVATOR"
		    Case OrderLiftType.CargoElevator
		      Return "CARGO_ELEVATOR"
		    Case OrderLiftType.Free
		      Return "FREE"
		    Case OrderLiftType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderPaymentMethodTypeToString(value As OrderPaymentMethodType) As String
		  Select Case value
		    Case OrderPaymentMethodType.CashOnDelivery
		      Return "CASH_ON_DELIVERY"
		    Case OrderPaymentMethodType.CardOnDelivery
		      Return "CARD_ON_DELIVERY"
		    Case OrderPaymentMethodType.BoundCardOnDelivery
		      Return "BOUND_CARD_ON_DELIVERY"
		    Case OrderPaymentMethodType.Yandex
		      Return "YANDEX"
		    Case OrderPaymentMethodType.ApplePay
		      Return "APPLE_PAY"
		    Case OrderPaymentMethodType.ExternalCertificate
		      Return "EXTERNAL_CERTIFICATE"
		    Case OrderPaymentMethodType.Credit
		      Return "CREDIT"
		    Case OrderPaymentMethodType.GooglePay
		      Return "GOOGLE_PAY"
		    Case OrderPaymentMethodType.TinkoffCredit
		      Return "TINKOFF_CREDIT"
		    Case OrderPaymentMethodType.Sbp
		      Return "SBP"
		    Case OrderPaymentMethodType.TinkoffInstallments
		      Return "TINKOFF_INSTALLMENTS"
		    Case OrderPaymentMethodType.B2bAccountPrepayment
		      Return "B2B_ACCOUNT_PREPAYMENT"
		    Case OrderPaymentMethodType.B2bAccountPostpayment
		      Return "B2B_ACCOUNT_POSTPAYMENT"
		    Case OrderPaymentMethodType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderPaymentTypeToString(value As OrderPaymentType) As String
		  Select Case value
		    Case OrderPaymentType.Prepaid
		      Return "PREPAID"
		    Case OrderPaymentType.Postpaid
		      Return "POSTPAID"
		    Case OrderPaymentType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderPromoTypeToString(value As OrderPromoType) As String
		  Select Case value
		    Case OrderPromoType.DirectDiscount
		      Return "DIRECT_DISCOUNT"
		    Case OrderPromoType.BlueSet
		      Return "BLUE_SET"
		    Case OrderPromoType.BlueFlash
		      Return "BLUE_FLASH"
		    Case OrderPromoType.GenericBundle
		      Return "GENERIC_BUNDLE"
		    Case OrderPromoType.MarketCoupon
		      Return "MARKET_COUPON"
		    Case OrderPromoType.MarketPromocode
		      Return "MARKET_PROMOCODE"
		    Case OrderPromoType.MarketDeal
		      Return "MARKET_DEAL"
		    Case OrderPromoType.MarketBlue
		      Return "MARKET_BLUE"
		    Case OrderPromoType.MarketPrime
		      Return "MARKET_PRIME"
		    Case OrderPromoType.YandexPlus
		      Return "YANDEX_PLUS"
		    Case OrderPromoType.BeruPlus
		      Return "BERU_PLUS"
		    Case OrderPromoType.MarketCoin
		      Return "MARKET_COIN"
		    Case OrderPromoType.YandexEmployee
		      Return "YANDEX_EMPLOYEE"
		    Case OrderPromoType.LimitedFreeDeliveryPromo
		      Return "LIMITED_FREE_DELIVERY_PROMO"
		    Case OrderPromoType.FreeDeliveryThreshold
		      Return "FREE_DELIVERY_THRESHOLD"
		    Case OrderPromoType.MulticartDiscount
		      Return "MULTICART_DISCOUNT"
		    Case OrderPromoType.PriceDropAsYouShop
		      Return "PRICE_DROP_AS_YOU_SHOP"
		    Case OrderPromoType.FreeDeliveryForLdi
		      Return "FREE_DELIVERY_FOR_LDI"
		    Case OrderPromoType.FreeDeliveryForLsc
		      Return "FREE_DELIVERY_FOR_LSC"
		    Case OrderPromoType.SecretSale
		      Return "SECRET_SALE"
		    Case OrderPromoType.FreePickup
		      Return "FREE_PICKUP"
		    Case OrderPromoType.CheapestAsGift
		      Return "CHEAPEST_AS_GIFT"
		    Case OrderPromoType.Cashback
		      Return "CASHBACK"
		    Case OrderPromoType.SupplierMulticartDiscount
		      Return "SUPPLIER_MULTICART_DISCOUNT"
		    Case OrderPromoType.SpreadDiscountCount
		      Return "SPREAD_DISCOUNT_COUNT"
		    Case OrderPromoType.SpreadDiscountReceipt
		      Return "SPREAD_DISCOUNT_RECEIPT"
		    Case OrderPromoType.AnnouncementPromo
		      Return "ANNOUNCEMENT_PROMO"
		    Case OrderPromoType.DiscountByPaymentType
		      Return "DISCOUNT_BY_PAYMENT_TYPE"
		    Case OrderPromoType.PercentDiscount
		      Return "PERCENT_DISCOUNT"
		    Case OrderPromoType.DcoExtraDiscount
		      Return "DCO_EXTRA_DISCOUNT"
		    Case OrderPromoType.EmptyPromo
		      Return "EMPTY_PROMO"
		    Case OrderPromoType.BlockingPromo
		      Return "BLOCKING_PROMO"
		    Case OrderPromoType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderStatsStatusTypeToString(value As OrderStatsStatusType) As String
		  Select Case value
		    Case OrderStatsStatusType.CancelledBeforeProcessing
		      Return "CANCELLED_BEFORE_PROCESSING"
		    Case OrderStatsStatusType.CancelledInDelivery
		      Return "CANCELLED_IN_DELIVERY"
		    Case OrderStatsStatusType.CancelledInProcessing
		      Return "CANCELLED_IN_PROCESSING"
		    Case OrderStatsStatusType.Delivery
		      Return "DELIVERY"
		    Case OrderStatsStatusType.Delivered
		      Return "DELIVERED"
		    Case OrderStatsStatusType.PartiallyDelivered
		      Return "PARTIALLY_DELIVERED"
		    Case OrderStatsStatusType.PartiallyReturned
		      Return "PARTIALLY_RETURNED"
		    Case OrderStatsStatusType.Pending
		      Return "PENDING"
		    Case OrderStatsStatusType.Pickup
		      Return "PICKUP"
		    Case OrderStatsStatusType.Processing
		      Return "PROCESSING"
		    Case OrderStatsStatusType.Reserved
		      Return "RESERVED"
		    Case OrderStatsStatusType.Returned
		      Return "RETURNED"
		    Case OrderStatsStatusType.Unknown
		      Return "UNKNOWN"
		    Case OrderStatsStatusType.Unpaid
		      Return "UNPAID"
		    Case OrderStatsStatusType.Lost
		      Return "LOST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderStatusTypeToString(value As OrderStatusType) As String
		  Select Case value
		    Case OrderStatusType.Placing
		      Return "PLACING"
		    Case OrderStatusType.Reserved
		      Return "RESERVED"
		    Case OrderStatusType.Unpaid
		      Return "UNPAID"
		    Case OrderStatusType.Processing
		      Return "PROCESSING"
		    Case OrderStatusType.Delivery
		      Return "DELIVERY"
		    Case OrderStatusType.Pickup
		      Return "PICKUP"
		    Case OrderStatusType.Delivered
		      Return "DELIVERED"
		    Case OrderStatusType.Cancelled
		      Return "CANCELLED"
		    Case OrderStatusType.Pending
		      Return "PENDING"
		    Case OrderStatusType.PartiallyReturned
		      Return "PARTIALLY_RETURNED"
		    Case OrderStatusType.Returned
		      Return "RETURNED"
		    Case OrderStatusType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderSubsidyTypeToString(value As OrderSubsidyType) As String
		  Select Case value
		    Case OrderSubsidyType.YandexCashback
		      Return "YANDEX_CASHBACK"
		    Case OrderSubsidyType.Subsidy
		      Return "SUBSIDY"
		    Case OrderSubsidyType.Delivery
		      Return "DELIVERY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderSubstatusTypeToString(value As OrderSubstatusType) As String
		  Select Case value
		    Case OrderSubstatusType.ReservationExpired
		      Return "RESERVATION_EXPIRED"
		    Case OrderSubstatusType.UserNotPaid
		      Return "USER_NOT_PAID"
		    Case OrderSubstatusType.UserUnreachable
		      Return "USER_UNREACHABLE"
		    Case OrderSubstatusType.UserChangedMind
		      Return "USER_CHANGED_MIND"
		    Case OrderSubstatusType.UserRefusedDelivery
		      Return "USER_REFUSED_DELIVERY"
		    Case OrderSubstatusType.UserRefusedProduct
		      Return "USER_REFUSED_PRODUCT"
		    Case OrderSubstatusType.ShopFailed
		      Return "SHOP_FAILED"
		    Case OrderSubstatusType.UserRefusedQuality
		      Return "USER_REFUSED_QUALITY"
		    Case OrderSubstatusType.ReplacingOrder
		      Return "REPLACING_ORDER"
		    Case OrderSubstatusType.ProcessingExpired
		      Return "PROCESSING_EXPIRED"
		    Case OrderSubstatusType.PendingExpired
		      Return "PENDING_EXPIRED"
		    Case OrderSubstatusType.ShopPendingCancelled
		      Return "SHOP_PENDING_CANCELLED"
		    Case OrderSubstatusType.PendingCancelled
		      Return "PENDING_CANCELLED"
		    Case OrderSubstatusType.UserFraud
		      Return "USER_FRAUD"
		    Case OrderSubstatusType.ReservationFailed
		      Return "RESERVATION_FAILED"
		    Case OrderSubstatusType.UserPlacedOtherOrder
		      Return "USER_PLACED_OTHER_ORDER"
		    Case OrderSubstatusType.UserBoughtCheaper
		      Return "USER_BOUGHT_CHEAPER"
		    Case OrderSubstatusType.MissingItem
		      Return "MISSING_ITEM"
		    Case OrderSubstatusType.BrokenItem
		      Return "BROKEN_ITEM"
		    Case OrderSubstatusType.WrongItem
		      Return "WRONG_ITEM"
		    Case OrderSubstatusType.PickupExpired
		      Return "PICKUP_EXPIRED"
		    Case OrderSubstatusType.DeliveryProblems
		      Return "DELIVERY_PROBLEMS"
		    Case OrderSubstatusType.LateContact
		      Return "LATE_CONTACT"
		    Case OrderSubstatusType.Custom
		      Return "CUSTOM"
		    Case OrderSubstatusType.DeliveryServiceFailed
		      Return "DELIVERY_SERVICE_FAILED"
		    Case OrderSubstatusType.WarehouseFailedToShip
		      Return "WAREHOUSE_FAILED_TO_SHIP"
		    Case OrderSubstatusType.DeliverySerivceUndelivered
		      Return "DELIVERY_SERIVCE_UNDELIVERED"
		    Case OrderSubstatusType.DeliveryServiceUndelivered
		      Return "DELIVERY_SERVICE_UNDELIVERED"
		    Case OrderSubstatusType.Preorder
		      Return "PREORDER"
		    Case OrderSubstatusType.AwaitConfirmation
		      Return "AWAIT_CONFIRMATION"
		    Case OrderSubstatusType.Started
		      Return "STARTED"
		    Case OrderSubstatusType.Packaging
		      Return "PACKAGING"
		    Case OrderSubstatusType.ReadyToShip
		      Return "READY_TO_SHIP"
		    Case OrderSubstatusType.Shipped
		      Return "SHIPPED"
		    Case OrderSubstatusType.AsyncProcessing
		      Return "ASYNC_PROCESSING"
		    Case OrderSubstatusType.UserRefusedToProvidePersonalData
		      Return "USER_REFUSED_TO_PROVIDE_PERSONAL_DATA"
		    Case OrderSubstatusType.WaitingUserInput
		      Return "WAITING_USER_INPUT"
		    Case OrderSubstatusType.WaitingBankDecision
		      Return "WAITING_BANK_DECISION"
		    Case OrderSubstatusType.BankRejectCreditOffer
		      Return "BANK_REJECT_CREDIT_OFFER"
		    Case OrderSubstatusType.CustomerRejectCreditOffer
		      Return "CUSTOMER_REJECT_CREDIT_OFFER"
		    Case OrderSubstatusType.CreditOfferFailed
		      Return "CREDIT_OFFER_FAILED"
		    Case OrderSubstatusType.AwaitDeliveryDatesConfirmation
		      Return "AWAIT_DELIVERY_DATES_CONFIRMATION"
		    Case OrderSubstatusType.ServiceFault
		      Return "SERVICE_FAULT"
		    Case OrderSubstatusType.DeliveryServiceReceived
		      Return "DELIVERY_SERVICE_RECEIVED"
		    Case OrderSubstatusType.UserReceived
		      Return "USER_RECEIVED"
		    Case OrderSubstatusType.WaitingForStocks
		      Return "WAITING_FOR_STOCKS"
		    Case OrderSubstatusType.AsPartOfMultiOrder
		      Return "AS_PART_OF_MULTI_ORDER"
		    Case OrderSubstatusType.ReadyForLastMile
		      Return "READY_FOR_LAST_MILE"
		    Case OrderSubstatusType.LastMileStarted
		      Return "LAST_MILE_STARTED"
		    Case OrderSubstatusType.Antifraud
		      Return "ANTIFRAUD"
		    Case OrderSubstatusType.DeliveryUserNotReceived
		      Return "DELIVERY_USER_NOT_RECEIVED"
		    Case OrderSubstatusType.DeliveryServiceDelivered
		      Return "DELIVERY_SERVICE_DELIVERED"
		    Case OrderSubstatusType.DeliveredUserNotReceived
		      Return "DELIVERED_USER_NOT_RECEIVED"
		    Case OrderSubstatusType.UserWantedAnotherPaymentMethod
		      Return "USER_WANTED_ANOTHER_PAYMENT_METHOD"
		    Case OrderSubstatusType.UserReceivedTechnicalError
		      Return "USER_RECEIVED_TECHNICAL_ERROR"
		    Case OrderSubstatusType.UserForgotToUseBonus
		      Return "USER_FORGOT_TO_USE_BONUS"
		    Case OrderSubstatusType.ReceivedOnDistributionCenter
		      Return "RECEIVED_ON_DISTRIBUTION_CENTER"
		    Case OrderSubstatusType.DeliveryServiceNotReceived
		      Return "DELIVERY_SERVICE_NOT_RECEIVED"
		    Case OrderSubstatusType.DeliveryServiceLost
		      Return "DELIVERY_SERVICE_LOST"
		    Case OrderSubstatusType.ShippedToWrongDeliveryService
		      Return "SHIPPED_TO_WRONG_DELIVERY_SERVICE"
		    Case OrderSubstatusType.DeliveredUserReceived
		      Return "DELIVERED_USER_RECEIVED"
		    Case OrderSubstatusType.WaitingTinkoffDecision
		      Return "WAITING_TINKOFF_DECISION"
		    Case OrderSubstatusType.CourierSearch
		      Return "COURIER_SEARCH"
		    Case OrderSubstatusType.CourierFound
		      Return "COURIER_FOUND"
		    Case OrderSubstatusType.CourierInTransitToSender
		      Return "COURIER_IN_TRANSIT_TO_SENDER"
		    Case OrderSubstatusType.CourierArrivedToSender
		      Return "COURIER_ARRIVED_TO_SENDER"
		    Case OrderSubstatusType.CourierReceived
		      Return "COURIER_RECEIVED"
		    Case OrderSubstatusType.CourierNotFound
		      Return "COURIER_NOT_FOUND"
		    Case OrderSubstatusType.CourierNotDeliverOrder
		      Return "COURIER_NOT_DELIVER_ORDER"
		    Case OrderSubstatusType.CourierReturnsOrder
		      Return "COURIER_RETURNS_ORDER"
		    Case OrderSubstatusType.CourierReturnedOrder
		      Return "COURIER_RETURNED_ORDER"
		    Case OrderSubstatusType.WaitingUserDeliveryInput
		      Return "WAITING_USER_DELIVERY_INPUT"
		    Case OrderSubstatusType.PickupServiceReceived
		      Return "PICKUP_SERVICE_RECEIVED"
		    Case OrderSubstatusType.PickupUserReceived
		      Return "PICKUP_USER_RECEIVED"
		    Case OrderSubstatusType.CancelledCourierNotFound
		      Return "CANCELLED_COURIER_NOT_FOUND"
		    Case OrderSubstatusType.CourierNotComeForOrder
		      Return "COURIER_NOT_COME_FOR_ORDER"
		    Case OrderSubstatusType.DeliveryNotManagedRegion
		      Return "DELIVERY_NOT_MANAGED_REGION"
		    Case OrderSubstatusType.IncompleteContactInformation
		      Return "INCOMPLETE_CONTACT_INFORMATION"
		    Case OrderSubstatusType.IncompleteMultiOrder
		      Return "INCOMPLETE_MULTI_ORDER"
		    Case OrderSubstatusType.InappropriateWeightSize
		      Return "INAPPROPRIATE_WEIGHT_SIZE"
		    Case OrderSubstatusType.TechnicalError
		      Return "TECHNICAL_ERROR"
		    Case OrderSubstatusType.SortingCenterLost
		      Return "SORTING_CENTER_LOST"
		    Case OrderSubstatusType.CourierSearchNotStarted
		      Return "COURIER_SEARCH_NOT_STARTED"
		    Case OrderSubstatusType.Lost
		      Return "LOST"
		    Case OrderSubstatusType.AwaitPayment
		      Return "AWAIT_PAYMENT"
		    Case OrderSubstatusType.AwaitLavkaReservation
		      Return "AWAIT_LAVKA_RESERVATION"
		    Case OrderSubstatusType.UserWantsToChangeAddress
		      Return "USER_WANTS_TO_CHANGE_ADDRESS"
		    Case OrderSubstatusType.FullNotRansom
		      Return "FULL_NOT_RANSOM"
		    Case OrderSubstatusType.PrescriptionMismatch
		      Return "PRESCRIPTION_MISMATCH"
		    Case OrderSubstatusType.DropoffLost
		      Return "DROPOFF_LOST"
		    Case OrderSubstatusType.DropoffClosed
		      Return "DROPOFF_CLOSED"
		    Case OrderSubstatusType.DeliveryToStoreStarted
		      Return "DELIVERY_TO_STORE_STARTED"
		    Case OrderSubstatusType.UserWantsToChangeDeliveryDate
		      Return "USER_WANTS_TO_CHANGE_DELIVERY_DATE"
		    Case OrderSubstatusType.WrongItemDelivered
		      Return "WRONG_ITEM_DELIVERED"
		    Case OrderSubstatusType.DamagedBox
		      Return "DAMAGED_BOX"
		    Case OrderSubstatusType.AwaitDeliveryDates
		      Return "AWAIT_DELIVERY_DATES"
		    Case OrderSubstatusType.LastMileCourierSearch
		      Return "LAST_MILE_COURIER_SEARCH"
		    Case OrderSubstatusType.PickupPointClosed
		      Return "PICKUP_POINT_CLOSED"
		    Case OrderSubstatusType.LegalInfoChanged
		      Return "LEGAL_INFO_CHANGED"
		    Case OrderSubstatusType.UserHasNoTimeToPickupOrder
		      Return "USER_HAS_NO_TIME_TO_PICKUP_ORDER"
		    Case OrderSubstatusType.DeliveryCustomsArrived
		      Return "DELIVERY_CUSTOMS_ARRIVED"
		    Case OrderSubstatusType.DeliveryCustomsCleared
		      Return "DELIVERY_CUSTOMS_CLEARED"
		    Case OrderSubstatusType.FirstMileDeliveryServiceReceived
		      Return "FIRST_MILE_DELIVERY_SERVICE_RECEIVED"
		    Case OrderSubstatusType.AwaitAutoDeliveryDates
		      Return "AWAIT_AUTO_DELIVERY_DATES"
		    Case OrderSubstatusType.AwaitUserPersonalData
		      Return "AWAIT_USER_PERSONAL_DATA"
		    Case OrderSubstatusType.NoPersonalDataExpired
		      Return "NO_PERSONAL_DATA_EXPIRED"
		    Case OrderSubstatusType.CustomsProblems
		      Return "CUSTOMS_PROBLEMS"
		    Case OrderSubstatusType.AwaitCashier
		      Return "AWAIT_CASHIER"
		    Case OrderSubstatusType.WaitingPostpaidBudgetReservation
		      Return "WAITING_POSTPAID_BUDGET_RESERVATION"
		    Case OrderSubstatusType.AwaitServiceableConfirmation
		      Return "AWAIT_SERVICEABLE_CONFIRMATION"
		    Case OrderSubstatusType.PostpaidBudgetReservationFailed
		      Return "POSTPAID_BUDGET_RESERVATION_FAILED"
		    Case OrderSubstatusType.AwaitCustomPriceConfirmation
		      Return "AWAIT_CUSTOM_PRICE_CONFIRMATION"
		    Case OrderSubstatusType.ReadyForPickup
		      Return "READY_FOR_PICKUP"
		    Case OrderSubstatusType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderTaxSystemTypeToString(value As OrderTaxSystemType) As String
		  Select Case value
		    Case OrderTaxSystemType.Osn
		      Return "OSN"
		    Case OrderTaxSystemType.Usn
		      Return "USN"
		    Case OrderTaxSystemType.UsnMinusCost
		      Return "USN_MINUS_COST"
		    Case OrderTaxSystemType.Envd
		      Return "ENVD"
		    Case OrderTaxSystemType.Echn
		      Return "ECHN"
		    Case OrderTaxSystemType.Psn
		      Return "PSN"
		    Case OrderTaxSystemType.Npd
		      Return "NPD"
		    Case OrderTaxSystemType.UnknownValue
		      Return "UNKNOWN_VALUE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderUpdateStatusTypeToString(value As OrderUpdateStatusType) As String
		  Select Case value
		    Case OrderUpdateStatusType.Ok
		      Return "OK"
		    Case OrderUpdateStatusType.Error
		      Return "ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrderVatTypeToString(value As OrderVatType) As String
		  Select Case value
		    Case OrderVatType.NoVat
		      Return "NO_VAT"
		    Case OrderVatType.Vat0
		      Return "VAT_0"
		    Case OrderVatType.Vat10
		      Return "VAT_10"
		    Case OrderVatType.Vat10110
		      Return "VAT_10_110"
		    Case OrderVatType.Vat20
		      Return "VAT_20"
		    Case OrderVatType.Vat20120
		      Return "VAT_20_120"
		    Case OrderVatType.Vat18
		      Return "VAT_18"
		    Case OrderVatType.Vat18118
		      Return "VAT_18_118"
		    Case OrderVatType.UnknownValue
		      Return "UNKNOWN_VALUE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsCommissionTypeToString(value As OrdersStatsCommissionType) As String
		  Select Case value
		    Case OrdersStatsCommissionType.Fee
		      Return "FEE"
		    Case OrdersStatsCommissionType.Fulfillment
		      Return "FULFILLMENT"
		    Case OrdersStatsCommissionType.LoyaltyParticipationFee
		      Return "LOYALTY_PARTICIPATION_FEE"
		    Case OrdersStatsCommissionType.AuctionPromotion
		      Return "AUCTION_PROMOTION"
		    Case OrdersStatsCommissionType.Installment
		      Return "INSTALLMENT"
		    Case OrdersStatsCommissionType.DeliveryToCustomer
		      Return "DELIVERY_TO_CUSTOMER"
		    Case OrdersStatsCommissionType.ExpressDeliveryToCustomer
		      Return "EXPRESS_DELIVERY_TO_CUSTOMER"
		    Case OrdersStatsCommissionType.Agency
		      Return "AGENCY"
		    Case OrdersStatsCommissionType.PaymentTransfer
		      Return "PAYMENT_TRANSFER"
		    Case OrdersStatsCommissionType.ReturnedOrdersStorage
		      Return "RETURNED_ORDERS_STORAGE"
		    Case OrdersStatsCommissionType.Sorting
		      Return "SORTING"
		    Case OrdersStatsCommissionType.IntakeSorting
		      Return "INTAKE_SORTING"
		    Case OrdersStatsCommissionType.ReturnProcessing
		      Return "RETURN_PROCESSING"
		    Case OrdersStatsCommissionType.IlliquidGoodsSale
		      Return "ILLIQUID_GOODS_SALE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsItemStatusTypeToString(value As OrdersStatsItemStatusType) As String
		  Select Case value
		    Case OrdersStatsItemStatusType.Rejected
		      Return "REJECTED"
		    Case OrdersStatsItemStatusType.Returned
		      Return "RETURNED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsOrderPaymentTypeToString(value As OrdersStatsOrderPaymentType) As String
		  Select Case value
		    Case OrdersStatsOrderPaymentType.Credit
		      Return "CREDIT"
		    Case OrdersStatsOrderPaymentType.Postpaid
		      Return "POSTPAID"
		    Case OrdersStatsOrderPaymentType.Prepaid
		      Return "PREPAID"
		    Case OrdersStatsOrderPaymentType.TinkoffCredit
		      Return "TINKOFF_CREDIT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsPaymentSourceTypeToString(value As OrdersStatsPaymentSourceType) As String
		  Select Case value
		    Case OrdersStatsPaymentSourceType.Buyer
		      Return "BUYER"
		    Case OrdersStatsPaymentSourceType.Cashback
		      Return "CASHBACK"
		    Case OrdersStatsPaymentSourceType.Marketplace
		      Return "MARKETPLACE"
		    Case OrdersStatsPaymentSourceType.Split
		      Return "SPLIT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsPaymentTypeToString(value As OrdersStatsPaymentType) As String
		  Select Case value
		    Case OrdersStatsPaymentType.Payment
		      Return "PAYMENT"
		    Case OrdersStatsPaymentType.Refund
		      Return "REFUND"
		    Case OrdersStatsPaymentType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsPriceTypeToString(value As OrdersStatsPriceType) As String
		  Select Case value
		    Case OrdersStatsPriceType.Buyer
		      Return "BUYER"
		    Case OrdersStatsPriceType.Cashback
		      Return "CASHBACK"
		    Case OrdersStatsPriceType.Marketplace
		      Return "MARKETPLACE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OrdersStatsStockTypeToString(value As OrdersStatsStockType) As String
		  Select Case value
		    Case OrdersStatsStockType.Fit
		      Return "FIT"
		    Case OrdersStatsStockType.Freeze
		      Return "FREEZE"
		    Case OrdersStatsStockType.Available
		      Return "AVAILABLE"
		    Case OrdersStatsStockType.Quarantine
		      Return "QUARANTINE"
		    Case OrdersStatsStockType.Utilization
		      Return "UTILIZATION"
		    Case OrdersStatsStockType.Defect
		      Return "DEFECT"
		    Case OrdersStatsStockType.Expired
		      Return "EXPIRED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OutletStatusTypeToString(value As OutletStatusType) As String
		  Select Case value
		    Case OutletStatusType.AtModeration
		      Return "AT_MODERATION"
		    Case OutletStatusType.Failed
		      Return "FAILED"
		    Case OutletStatusType.Moderated
		      Return "MODERATED"
		    Case OutletStatusType.Nonmoderated
		      Return "NONMODERATED"
		    Case OutletStatusType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OutletTypeToString(value As OutletType) As String
		  Select Case value
		    Case OutletType.Depot
		      Return "DEPOT"
		    Case OutletType.Mixed
		      Return "MIXED"
		    Case OutletType.Retail
		      Return "RETAIL"
		    Case OutletType.NotDefined
		      Return "NOT_DEFINED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function OutletVisibilityTypeToString(value As OutletVisibilityType) As String
		  Select Case value
		    Case OutletVisibilityType.Hidden
		      Return "HIDDEN"
		    Case OutletVisibilityType.Visible
		      Return "VISIBLE"
		    Case OutletVisibilityType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PageFormatTypeToString(value As PageFormatType) As String
		  Select Case value
		    Case PageFormatType.A7
		      Return "A7"
		    Case PageFormatType.A4
		      Return "A4"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ParameterTypeToString(value As ParameterType) As String
		  Select Case value
		    Case ParameterType.Text
		      Return "TEXT"
		    Case ParameterType.Escapedenum
		      Return "ENUM"
		    Case ParameterType.Boolean
		      Return "BOOLEAN"
		    Case ParameterType.Numeric
		      Return "NUMERIC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PaymentFrequencyTypeToString(value As PaymentFrequencyType) As String
		  Select Case value
		    Case PaymentFrequencyType.Daily
		      Return "DAILY"
		    Case PaymentFrequencyType.Weekly
		      Return "WEEKLY"
		    Case PaymentFrequencyType.Biweekly
		      Return "BIWEEKLY"
		    Case PaymentFrequencyType.Monthly
		      Return "MONTHLY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PlacementTypeToString(value As PlacementType) As String
		  Select Case value
		    Case PlacementType.Fbs
		      Return "FBS"
		    Case PlacementType.Fby
		      Return "FBY"
		    Case PlacementType.Dbs
		      Return "DBS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PriceCompetitivenessTypeToString(value As PriceCompetitivenessType) As String
		  Select Case value
		    Case PriceCompetitivenessType.Optimal
		      Return "OPTIMAL"
		    Case PriceCompetitivenessType.Average
		      Return "AVERAGE"
		    Case PriceCompetitivenessType.Low
		      Return "LOW"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PriceQuarantineVerdictParamNameTypeToString(value As PriceQuarantineVerdictParamNameType) As String
		  Select Case value
		    Case PriceQuarantineVerdictParamNameType.CurrentPrice
		      Return "CURRENT_PRICE"
		    Case PriceQuarantineVerdictParamNameType.LastValidPrice
		      Return "LAST_VALID_PRICE"
		    Case PriceQuarantineVerdictParamNameType.MinPrice
		      Return "MIN_PRICE"
		    Case PriceQuarantineVerdictParamNameType.Currency
		      Return "CURRENCY"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PriceQuarantineVerdictTypeToString(value As PriceQuarantineVerdictType) As String
		  Select Case value
		    Case PriceQuarantineVerdictType.PriceChange
		      Return "PRICE_CHANGE"
		    Case PriceQuarantineVerdictType.LowPrice
		      Return "LOW_PRICE"
		    Case PriceQuarantineVerdictType.LowPricePromo
		      Return "LOW_PRICE_PROMO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PriceSuggestTypeToString(value As PriceSuggestType) As String
		  Select Case value
		    Case PriceSuggestType.Buybox
		      Return "BUYBOX"
		    Case PriceSuggestType.DefaultOffer
		      Return "DEFAULT_OFFER"
		    Case PriceSuggestType.MinPriceMarket
		      Return "MIN_PRICE_MARKET"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromoOfferParticipationStatusFilterTypeToString(value As PromoOfferParticipationStatusFilterType) As String
		  Select Case value
		    Case PromoOfferParticipationStatusFilterType.ManuallyAdded
		      Return "MANUALLY_ADDED"
		    Case PromoOfferParticipationStatusFilterType.NotManuallyAdded
		      Return "NOT_MANUALLY_ADDED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromoOfferParticipationStatusTypeToString(value As PromoOfferParticipationStatusType) As String
		  Select Case value
		    Case PromoOfferParticipationStatusType.Auto
		      Return "AUTO"
		    Case PromoOfferParticipationStatusType.PartiallyAuto
		      Return "PARTIALLY_AUTO"
		    Case PromoOfferParticipationStatusType.Manual
		      Return "MANUAL"
		    Case PromoOfferParticipationStatusType.NotParticipating
		      Return "NOT_PARTICIPATING"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromoOfferUpdateWarningCodeTypeToString(value As PromoOfferUpdateWarningCodeType) As String
		  Select Case value
		    Case PromoOfferUpdateWarningCodeType.DeepDiscountOffer
		      Return "DEEP_DISCOUNT_OFFER"
		    Case PromoOfferUpdateWarningCodeType.CatalogPriceIsLowerThanPromo
		      Return "CATALOG_PRICE_IS_LOWER_THAN_PROMO"
		    Case PromoOfferUpdateWarningCodeType.ShopPricesAreLowerThanPromo
		      Return "SHOP_PRICES_ARE_LOWER_THAN_PROMO"
		    Case PromoOfferUpdateWarningCodeType.PromocodePriceMoreThanMaxFairPrice
		      Return "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"
		    Case PromoOfferUpdateWarningCodeType.ShopOfferNotEligibleForPromo
		      Return "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function PromoParticipationTypeToString(value As PromoParticipationType) As String
		  Select Case value
		    Case PromoParticipationType.ParticipatingNow
		      Return "PARTICIPATING_NOW"
		    Case PromoParticipationType.Participated
		      Return "PARTICIPATED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function QualityRatingComponentTypeToString(value As QualityRatingComponentType) As String
		  Select Case value
		    Case QualityRatingComponentType.DbsCancellationRate
		      Return "DBS_CANCELLATION_RATE"
		    Case QualityRatingComponentType.DbsLateDeliveryRate
		      Return "DBS_LATE_DELIVERY_RATE"
		    Case QualityRatingComponentType.FbsCancellationRate
		      Return "FBS_CANCELLATION_RATE"
		    Case QualityRatingComponentType.FbsLateShipRate
		      Return "FBS_LATE_SHIP_RATE"
		    Case QualityRatingComponentType.FbyLateDeliveryRate
		      Return "FBY_LATE_DELIVERY_RATE"
		    Case QualityRatingComponentType.FbyCancellationRate
		      Return "FBY_CANCELLATION_RATE"
		    Case QualityRatingComponentType.FbyDeliveryDiffRate
		      Return "FBY_DELIVERY_DIFF_RATE"
		    Case QualityRatingComponentType.FbyLateEditingRate
		      Return "FBY_LATE_EDITING_RATE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RecipientTypeToString(value As RecipientType) As String
		  Select Case value
		    Case RecipientType.Shop
		      Return "SHOP"
		    Case RecipientType.DeliveryService
		      Return "DELIVERY_SERVICE"
		    Case RecipientType.Post
		      Return "POST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RefundStatusTypeToString(value As RefundStatusType) As String
		  Select Case value
		    Case RefundStatusType.StartedByUser
		      Return "STARTED_BY_USER"
		    Case RefundStatusType.RefundInProgress
		      Return "REFUND_IN_PROGRESS"
		    Case RefundStatusType.Refunded
		      Return "REFUNDED"
		    Case RefundStatusType.Failed
		      Return "FAILED"
		    Case RefundStatusType.WaitingForDecision
		      Return "WAITING_FOR_DECISION"
		    Case RefundStatusType.DecisionMade
		      Return "DECISION_MADE"
		    Case RefundStatusType.RefundedWithBonuses
		      Return "REFUNDED_WITH_BONUSES"
		    Case RefundStatusType.RefundedByShop
		      Return "REFUNDED_BY_SHOP"
		    Case RefundStatusType.Cancelled
		      Return "CANCELLED"
		    Case RefundStatusType.CompleteWithoutRefund
		      Return "COMPLETE_WITHOUT_REFUND"
		    Case RefundStatusType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RegionTypeToString(value As RegionType) As String
		  Select Case value
		    Case RegionType.Other
		      Return "OTHER"
		    Case RegionType.Continent
		      Return "CONTINENT"
		    Case RegionType.Region
		      Return "REGION"
		    Case RegionType.Country
		      Return "COUNTRY"
		    Case RegionType.CountryDistrict
		      Return "COUNTRY_DISTRICT"
		    Case RegionType.Republic
		      Return "REPUBLIC"
		    Case RegionType.City
		      Return "CITY"
		    Case RegionType.Village
		      Return "VILLAGE"
		    Case RegionType.CityDistrict
		      Return "CITY_DISTRICT"
		    Case RegionType.SubwayStation
		      Return "SUBWAY_STATION"
		    Case RegionType.RepublicArea
		      Return "REPUBLIC_AREA"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RejectedPromoOfferDeleteReasonTypeToString(value As RejectedPromoOfferDeleteReasonType) As String
		  Select Case value
		    Case RejectedPromoOfferDeleteReasonType.OfferDoesNotExist
		      Return "OFFER_DOES_NOT_EXIST"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function RejectedPromoOfferUpdateReasonTypeToString(value As RejectedPromoOfferUpdateReasonType) As String
		  Select Case value
		    Case RejectedPromoOfferUpdateReasonType.OfferDoesNotExist
		      Return "OFFER_DOES_NOT_EXIST"
		    Case RejectedPromoOfferUpdateReasonType.OfferDuplication
		      Return "OFFER_DUPLICATION"
		    Case RejectedPromoOfferUpdateReasonType.OfferNotEligibleForPromo
		      Return "OFFER_NOT_ELIGIBLE_FOR_PROMO"
		    Case RejectedPromoOfferUpdateReasonType.OfferPromosMaxByteSizeExceeded
		      Return "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED"
		    Case RejectedPromoOfferUpdateReasonType.DeadlineForFocusPromosExceeded
		      Return "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED"
		    Case RejectedPromoOfferUpdateReasonType.EmptyOldPrice
		      Return "EMPTY_OLD_PRICE"
		    Case RejectedPromoOfferUpdateReasonType.EmptyPromoPrice
		      Return "EMPTY_PROMO_PRICE"
		    Case RejectedPromoOfferUpdateReasonType.MaxPromoPriceExceeded
		      Return "MAX_PROMO_PRICE_EXCEEDED"
		    Case RejectedPromoOfferUpdateReasonType.PromoPriceBiggerThanMax
		      Return "PROMO_PRICE_BIGGER_THAN_MAX"
		    Case RejectedPromoOfferUpdateReasonType.PromoPriceSmallerThanMin
		      Return "PROMO_PRICE_SMALLER_THAN_MIN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportFormatTypeToString(value As ReportFormatType) As String
		  Select Case value
		    Case ReportFormatType.Escapedfile
		      Return "FILE"
		    Case ReportFormatType.Csv
		      Return "CSV"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportStatusTypeToString(value As ReportStatusType) As String
		  Select Case value
		    Case ReportStatusType.Pending
		      Return "PENDING"
		    Case ReportStatusType.Processing
		      Return "PROCESSING"
		    Case ReportStatusType.Failed
		      Return "FAILED"
		    Case ReportStatusType.Done
		      Return "DONE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReportSubStatusTypeToString(value As ReportSubStatusType) As String
		  Select Case value
		    Case ReportSubStatusType.NoData
		      Return "NO_DATA"
		    Case ReportSubStatusType.TooLarge
		      Return "TOO_LARGE"
		    Case ReportSubStatusType.ResourceNotFound
		      Return "RESOURCE_NOT_FOUND"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnDecisionReasonTypeToString(value As ReturnDecisionReasonType) As String
		  Select Case value
		    Case ReturnDecisionReasonType.BadQuality
		      Return "BAD_QUALITY"
		    Case ReturnDecisionReasonType.DoesNotFit
		      Return "DOES_NOT_FIT"
		    Case ReturnDecisionReasonType.WrongItem
		      Return "WRONG_ITEM"
		    Case ReturnDecisionReasonType.DamageDelivery
		      Return "DAMAGE_DELIVERY"
		    Case ReturnDecisionReasonType.LoyaltyFail
		      Return "LOYALTY_FAIL"
		    Case ReturnDecisionReasonType.ContentFail
		      Return "CONTENT_FAIL"
		    Case ReturnDecisionReasonType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnDecisionSubreasonTypeToString(value As ReturnDecisionSubreasonType) As String
		  Select Case value
		    Case ReturnDecisionSubreasonType.UserDidNotLike
		      Return "USER_DID_NOT_LIKE"
		    Case ReturnDecisionSubreasonType.UserChangedMind
		      Return "USER_CHANGED_MIND"
		    Case ReturnDecisionSubreasonType.DeliveredTooLong
		      Return "DELIVERED_TOO_LONG"
		    Case ReturnDecisionSubreasonType.BadPackage
		      Return "BAD_PACKAGE"
		    Case ReturnDecisionSubreasonType.Damaged
		      Return "DAMAGED"
		    Case ReturnDecisionSubreasonType.NotWorking
		      Return "NOT_WORKING"
		    Case ReturnDecisionSubreasonType.Incompleteness
		      Return "INCOMPLETENESS"
		    Case ReturnDecisionSubreasonType.WrongItem
		      Return "WRONG_ITEM"
		    Case ReturnDecisionSubreasonType.WrongColor
		      Return "WRONG_COLOR"
		    Case ReturnDecisionSubreasonType.DidNotMatchDescription
		      Return "DID_NOT_MATCH_DESCRIPTION"
		    Case ReturnDecisionSubreasonType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnDecisionTypeToString(value As ReturnDecisionType) As String
		  Select Case value
		    Case ReturnDecisionType.RefundMoney
		      Return "REFUND_MONEY"
		    Case ReturnDecisionType.RefundMoneyIncludingShipment
		      Return "REFUND_MONEY_INCLUDING_SHIPMENT"
		    Case ReturnDecisionType.Repair
		      Return "REPAIR"
		    Case ReturnDecisionType.Replace
		      Return "REPLACE"
		    Case ReturnDecisionType.SendToExamination
		      Return "SEND_TO_EXAMINATION"
		    Case ReturnDecisionType.DeclineRefund
		      Return "DECLINE_REFUND"
		    Case ReturnDecisionType.OtherDecision
		      Return "OTHER_DECISION"
		    Case ReturnDecisionType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnInstanceStatusTypeToString(value As ReturnInstanceStatusType) As String
		  Select Case value
		    Case ReturnInstanceStatusType.Created
		      Return "CREATED"
		    Case ReturnInstanceStatusType.Received
		      Return "RECEIVED"
		    Case ReturnInstanceStatusType.InTransit
		      Return "IN_TRANSIT"
		    Case ReturnInstanceStatusType.ReadyForPickup
		      Return "READY_FOR_PICKUP"
		    Case ReturnInstanceStatusType.Picked
		      Return "PICKED"
		    Case ReturnInstanceStatusType.ReceivedOnFulfillment
		      Return "RECEIVED_ON_FULFILLMENT"
		    Case ReturnInstanceStatusType.Cancelled
		      Return "CANCELLED"
		    Case ReturnInstanceStatusType.Lost
		      Return "LOST"
		    Case ReturnInstanceStatusType.Utilized
		      Return "UTILIZED"
		    Case ReturnInstanceStatusType.PreparedForUtilization
		      Return "PREPARED_FOR_UTILIZATION"
		    Case ReturnInstanceStatusType.Expropriated
		      Return "EXPROPRIATED"
		    Case ReturnInstanceStatusType.NotInDemand
		      Return "NOT_IN_DEMAND"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnInstanceStockTypeToString(value As ReturnInstanceStockType) As String
		  Select Case value
		    Case ReturnInstanceStockType.Fit
		      Return "FIT"
		    Case ReturnInstanceStockType.Defect
		      Return "DEFECT"
		    Case ReturnInstanceStockType.Anomaly
		      Return "ANOMALY"
		    Case ReturnInstanceStockType.Surplus
		      Return "SURPLUS"
		    Case ReturnInstanceStockType.Expired
		      Return "EXPIRED"
		    Case ReturnInstanceStockType.Misgrading
		      Return "MISGRADING"
		    Case ReturnInstanceStockType.Undefined
		      Return "UNDEFINED"
		    Case ReturnInstanceStockType.IncorrectImei
		      Return "INCORRECT_IMEI"
		    Case ReturnInstanceStockType.IncorrectSerialNumber
		      Return "INCORRECT_SERIAL_NUMBER"
		    Case ReturnInstanceStockType.IncorrectCis
		      Return "INCORRECT_CIS"
		    Case ReturnInstanceStockType.PartMissing
		      Return "PART_MISSING"
		    Case ReturnInstanceStockType.NonComplient
		      Return "NON_COMPLIENT"
		    Case ReturnInstanceStockType.NotAcceptable
		      Return "NOT_ACCEPTABLE"
		    Case ReturnInstanceStockType.Service
		      Return "SERVICE"
		    Case ReturnInstanceStockType.Markdown
		      Return "MARKDOWN"
		    Case ReturnInstanceStockType.Demo
		      Return "DEMO"
		    Case ReturnInstanceStockType.Repair
		      Return "REPAIR"
		    Case ReturnInstanceStockType.Firmware
		      Return "FIRMWARE"
		    Case ReturnInstanceStockType.Unknown
		      Return "UNKNOWN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnRequestDecisionTypeToString(value As ReturnRequestDecisionType) As String
		  Select Case value
		    Case ReturnRequestDecisionType.RefundMoney
		      Return "REFUND_MONEY"
		    Case ReturnRequestDecisionType.RefundMoneyIncludingShipment
		      Return "REFUND_MONEY_INCLUDING_SHIPMENT"
		    Case ReturnRequestDecisionType.Repair
		      Return "REPAIR"
		    Case ReturnRequestDecisionType.Replace
		      Return "REPLACE"
		    Case ReturnRequestDecisionType.SendToExamination
		      Return "SEND_TO_EXAMINATION"
		    Case ReturnRequestDecisionType.DeclineRefund
		      Return "DECLINE_REFUND"
		    Case ReturnRequestDecisionType.OtherDecision
		      Return "OTHER_DECISION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnShipmentStatusTypeToString(value As ReturnShipmentStatusType) As String
		  Select Case value
		    Case ReturnShipmentStatusType.Created
		      Return "CREATED"
		    Case ReturnShipmentStatusType.Received
		      Return "RECEIVED"
		    Case ReturnShipmentStatusType.InTransit
		      Return "IN_TRANSIT"
		    Case ReturnShipmentStatusType.ReadyForPickup
		      Return "READY_FOR_PICKUP"
		    Case ReturnShipmentStatusType.Picked
		      Return "PICKED"
		    Case ReturnShipmentStatusType.Lost
		      Return "LOST"
		    Case ReturnShipmentStatusType.Expired
		      Return "EXPIRED"
		    Case ReturnShipmentStatusType.Cancelled
		      Return "CANCELLED"
		    Case ReturnShipmentStatusType.FulfilmentReceived
		      Return "FULFILMENT_RECEIVED"
		    Case ReturnShipmentStatusType.PreparedForUtilization
		      Return "PREPARED_FOR_UTILIZATION"
		    Case ReturnShipmentStatusType.NotInDemand
		      Return "NOT_IN_DEMAND"
		    Case ReturnShipmentStatusType.Utilized
		      Return "UTILIZED"
		    Case ReturnShipmentStatusType.ReadyForExpropriation
		      Return "READY_FOR_EXPROPRIATION"
		    Case ReturnShipmentStatusType.ReceivedForExpropriation
		      Return "RECEIVED_FOR_EXPROPRIATION"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ReturnTypeToString(value As ReturnType) As String
		  Select Case value
		    Case ReturnType.Unredeemed
		      Return "UNREDEEMED"
		    Case ReturnType.Escapedreturn
		      Return "RETURN"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SellingProgramTypeToString(value As SellingProgramType) As String
		  Select Case value
		    Case SellingProgramType.Fby
		      Return "FBY"
		    Case SellingProgramType.Fbs
		      Return "FBS"
		    Case SellingProgramType.Dbs
		      Return "DBS"
		    Case SellingProgramType.Express
		      Return "EXPRESS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShelfsStatisticsAttributionTypeToString(value As ShelfsStatisticsAttributionType) As String
		  Select Case value
		    Case ShelfsStatisticsAttributionType.Clicks
		      Return "CLICKS"
		    Case ShelfsStatisticsAttributionType.Shows
		      Return "SHOWS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShipmentActionTypeToString(value As ShipmentActionType) As String
		  Select Case value
		    Case ShipmentActionType.Confirm
		      Return "CONFIRM"
		    Case ShipmentActionType.DownloadAct
		      Return "DOWNLOAD_ACT"
		    Case ShipmentActionType.DownloadInboundAct
		      Return "DOWNLOAD_INBOUND_ACT"
		    Case ShipmentActionType.DownloadDiscrepancyAct
		      Return "DOWNLOAD_DISCREPANCY_ACT"
		    Case ShipmentActionType.ChangePalletsCount
		      Return "CHANGE_PALLETS_COUNT"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShipmentPalletLabelPageFormatTypeToString(value As ShipmentPalletLabelPageFormatType) As String
		  Select Case value
		    Case ShipmentPalletLabelPageFormatType.A4
		      Return "A4"
		    Case ShipmentPalletLabelPageFormatType.A8
		      Return "A8"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShipmentStatusTypeToString(value As ShipmentStatusType) As String
		  Select Case value
		    Case ShipmentStatusType.OutboundCreated
		      Return "OUTBOUND_CREATED"
		    Case ShipmentStatusType.OutboundReadyForConfirmation
		      Return "OUTBOUND_READY_FOR_CONFIRMATION"
		    Case ShipmentStatusType.OutboundConfirmed
		      Return "OUTBOUND_CONFIRMED"
		    Case ShipmentStatusType.OutboundSigned
		      Return "OUTBOUND_SIGNED"
		    Case ShipmentStatusType.Finished
		      Return "FINISHED"
		    Case ShipmentStatusType.Accepted
		      Return "ACCEPTED"
		    Case ShipmentStatusType.AcceptedWithDiscrepancies
		      Return "ACCEPTED_WITH_DISCREPANCIES"
		    Case ShipmentStatusType.Error
		      Return "ERROR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShipmentTypeToString(value As ShipmentType) As String
		  Select Case value
		    Case ShipmentType.Import
		      Return "IMPORT"
		    Case ShipmentType.Withdraw
		      Return "WITHDRAW"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function ShowsSalesGroupingTypeToString(value As ShowsSalesGroupingType) As String
		  Select Case value
		    Case ShowsSalesGroupingType.Categories
		      Return "CATEGORIES"
		    Case ShowsSalesGroupingType.Offers
		      Return "OFFERS"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function SortOrderTypeToString(value As SortOrderType) As String
		  Select Case value
		    Case SortOrderType.Asc
		      Return "ASC"
		    Case SortOrderType.Desc
		      Return "DESC"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TariffTypeToString(value As TariffType) As String
		  Select Case value
		    Case TariffType.AgencyCommission
		      Return "AGENCY_COMMISSION"
		    Case TariffType.PaymentTransfer
		      Return "PAYMENT_TRANSFER"
		    Case TariffType.Storage
		      Return "STORAGE"
		    Case TariffType.Withdraw
		      Return "WITHDRAW"
		    Case TariffType.Surplus
		      Return "SURPLUS"
		    Case TariffType.Fee
		      Return "FEE"
		    Case TariffType.DeliveryToCustomer
		      Return "DELIVERY_TO_CUSTOMER"
		    Case TariffType.CrossregionalDelivery
		      Return "CROSSREGIONAL_DELIVERY"
		    Case TariffType.CrossregionalDeliveryReturn
		      Return "CROSSREGIONAL_DELIVERY_RETURN"
		    Case TariffType.Disposal
		      Return "DISPOSAL"
		    Case TariffType.SortingCenterStorage
		      Return "SORTING_CENTER_STORAGE"
		    Case TariffType.ExpressDelivery
		      Return "EXPRESS_DELIVERY"
		    Case TariffType.FfXdocSupplyBox
		      Return "FF_XDOC_SUPPLY_BOX"
		    Case TariffType.FfXdocSupplyPallet
		      Return "FF_XDOC_SUPPLY_PALLET"
		    Case TariffType.Sorting
		      Return "SORTING"
		    Case TariffType.MiddleMile
		      Return "MIDDLE_MILE"
		    Case TariffType.ReturnProcessing
		      Return "RETURN_PROCESSING"
		    Case TariffType.ExpressCancelledByPartner
		      Return "EXPRESS_CANCELLED_BY_PARTNER"
		    Case TariffType.DeliveryToCustomerReturn
		      Return "DELIVERY_TO_CUSTOMER_RETURN"
		    Case TariffType.CrossborderDelivery
		      Return "CROSSBORDER_DELIVERY"
		    Case TariffType.IntakeSortingBulkyCargo
		      Return "INTAKE_SORTING_BULKY_CARGO"
		    Case TariffType.IntakeSortingSmallGoods
		      Return "INTAKE_SORTING_SMALL_GOODS"
		    Case TariffType.IntakeSortingDaily
		      Return "INTAKE_SORTING_DAILY"
		    Case TariffType.FfStorageBilling
		      Return "FF_STORAGE_BILLING"
		    Case TariffType.CancelledOrderFeeQi
		      Return "CANCELLED_ORDER_FEE_QI"
		    Case TariffType.LateOrderExecutionFeeQi
		      Return "LATE_ORDER_EXECUTION_FEE_QI"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TimeUnitTypeToString(value As TimeUnitType) As String
		  Select Case value
		    Case TimeUnitType.Hour
		      Return "HOUR"
		    Case TimeUnitType.Day
		      Return "DAY"
		    Case TimeUnitType.Week
		      Return "WEEK"
		    Case TimeUnitType.Month
		      Return "MONTH"
		    Case TimeUnitType.Year
		      Return "YEAR"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function TurnoverTypeToString(value As TurnoverType) As String
		  Select Case value
		    Case TurnoverType.Low
		      Return "LOW"
		    Case TurnoverType.AlmostLow
		      Return "ALMOST_LOW"
		    Case TurnoverType.High
		      Return "HIGH"
		    Case TurnoverType.VeryHigh
		      Return "VERY_HIGH"
		    Case TurnoverType.NoSales
		      Return "NO_SALES"
		    Case TurnoverType.FreeStore
		      Return "FREE_STORE"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Protected Function WarehouseStockTypeToString(value As WarehouseStockType) As String
		  Select Case value
		    Case WarehouseStockType.Fit
		      Return "FIT"
		    Case WarehouseStockType.Freeze
		      Return "FREEZE"
		    Case WarehouseStockType.Available
		      Return "AVAILABLE"
		    Case WarehouseStockType.Quarantine
		      Return "QUARANTINE"
		    Case WarehouseStockType.Utilization
		      Return "UTILIZATION"
		    Case WarehouseStockType.Defect
		      Return "DEFECT"
		    Case WarehouseStockType.Expired
		      Return "EXPIRED"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag Enum, Name = AddOffersToArchiveErrorType, Type = Integer, Flags = &h1
		
		OfferHasStocks
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = AffectedOrderQualityRatingComponentType, Type = Integer, Flags = &h1
		
		DbsCancellationRate
		DbsLateDeliveryRate
		FbsCancellationRate
		FbsLateShipRate
		
	#tag EndEnum
	#tag Enum, Name = AgeUnitType, Type = Integer, Flags = &h1
		
		Year
		Month
		
	#tag EndEnum
	#tag Enum, Name = ApiResponseStatusType, Type = Integer, Flags = &h1
		
		Ok
		Error
		
	#tag EndEnum
	#tag Enum, Name = CalculatedTariffType, Type = Integer, Flags = &h1
		
		AgencyCommission
		PaymentTransfer
		Fee
		DeliveryToCustomer
		CrossregionalDelivery
		ExpressDelivery
		Sorting
		MiddleMile
		
	#tag EndEnum
	#tag Enum, Name = CampaignSettingsScheduleSourceType, Type = Integer, Flags = &h1
		
		Web
		Yml
		
	#tag EndEnum
	#tag Enum, Name = CategoryErrorType, Type = Integer, Flags = &h1
		
		UnknownCategory
		CategoryIsNotLeaf
		
	#tag EndEnum
	#tag Enum, Name = ChatMessageSenderType, Type = Integer, Flags = &h1
		
		Partner
		Customer
		Market
		Support
		
	#tag EndEnum
	#tag Enum, Name = ChatStatusType, Type = Integer, Flags = &h1
		
		Escapednew
		WaitingForCustomer
		WaitingForPartner
		WaitingForArbiter
		WaitingForMarket
		Finished
		
	#tag EndEnum
	#tag Enum, Name = ChatType, Type = Integer, Flags = &h1
		
		Chat
		Arbitrage
		
	#tag EndEnum
	#tag Enum, Name = CurrencyType, Type = Integer, Flags = &h1
		
		Rur
		Usd
		Eur
		Uah
		Aud
		Gbp
		Byr
		Byn
		Dkk
		Isk
		Kzt
		Cad
		Cny
		Nok
		Xdr
		Sgd
		Escapedtry
		Sek
		Chf
		Jpy
		Azn
		All
		Dzd
		Aoa
		Ars
		Amd
		Afn
		Bhd
		Bgn
		Bob
		Bwp
		Bnd
		Brl
		Bif
		Huf
		Vef
		Kpw
		Vnd
		Gmd
		Ghs
		Gnf
		Hkd
		Gel
		Aed
		Egp
		Zmk
		Ils
		Inr
		Idr
		Jod
		Iqd
		Irr
		Yer
		Qar
		Kes
		Kgs
		Cop
		Cdf
		Crc
		Kwd
		Cup
		Lak
		Lvl
		Sll
		Lbp
		Lyd
		Szl
		Ltl
		Mur
		Mro
		Mkd
		Mwk
		Mga
		Myr
		Mad
		Mxn
		Mzn
		Mdl
		Mnt
		Npr
		Ngn
		Nio
		Nzd
		Omr
		Pkr
		Pyg
		Pen
		Pln
		Khr
		Sar
		Ron
		Scr
		Syp
		Skk
		Sos
		Sdg
		Srd
		Tjs
		Thb
		Twd
		Bdt
		Tzs
		Tnd
		Tmm
		Ugx
		Uzs
		Uyu
		Php
		Djf
		Xaf
		Xof
		Hrk
		Czk
		Clp
		Lkr
		Eek
		Etb
		Rsd
		Zar
		Krw
		Nad
		Tl
		Ue
		
	#tag EndEnum
	#tag Enum, Name = DayOfWeekType, Type = Integer, Flags = &h1
		
		Monday
		Tuesday
		Wednesday
		Thursday
		Friday
		Saturday
		Sunday
		
	#tag EndEnum
	#tag Enum, Name = EacVerificationStatusType, Type = Integer, Flags = &h1
		
		Accepted
		Rejected
		NeedUpdate
		
	#tag EndEnum
	#tag Enum, Name = FeedContentErrorType, Type = Integer, Flags = &h1
		
		ParseError
		ParseXmlError
		TooManyRejectedOffers
		
	#tag EndEnum
	#tag Enum, Name = FeedDownloadErrorType, Type = Integer, Flags = &h1
		
		Error
		HttpError
		
	#tag EndEnum
	#tag Enum, Name = FeedIndexLogsErrorType, Type = Integer, Flags = &h1
		
		DownloadError
		DownloadHttpError
		ParseError
		ParseXmlError
		TooManyRejectedOffers
		NotIndexed
		
	#tag EndEnum
	#tag Enum, Name = FeedIndexLogsIndexType, Type = Integer, Flags = &h1
		
		Diff
		FastPrice
		Full
		
	#tag EndEnum
	#tag Enum, Name = FeedIndexLogsStatusType, Type = Integer, Flags = &h1
		
		Error
		Ok
		Warning
		
	#tag EndEnum
	#tag Enum, Name = FeedStatusType, Type = Integer, Flags = &h1
		
		Error
		Na
		Ok
		
	#tag EndEnum
	#tag Enum, Name = FeedbackCommentAuthorType, Type = Integer, Flags = &h1
		
		User
		Shop
		
	#tag EndEnum
	#tag Enum, Name = FeedbackDeliveryType, Type = Integer, Flags = &h1
		
		Delivery
		Pickup
		Instore
		
	#tag EndEnum
	#tag Enum, Name = FeedbackReactionStatusType, Type = Integer, Flags = &h1
		
		All
		NeedReaction
		
	#tag EndEnum
	#tag Enum, Name = FeedbackStateType, Type = Integer, Flags = &h1
		
		Last
		Previous
		Deleted
		
	#tag EndEnum
	#tag Enum, Name = FieldStateType, Type = Integer, Flags = &h1
		
		Specified
		Empty
		
	#tag EndEnum
	#tag Enum, Name = GoodsFeedbackCommentAuthorType, Type = Integer, Flags = &h1
		
		User
		Business
		
	#tag EndEnum
	#tag Enum, Name = GoodsFeedbackCommentStatusType, Type = Integer, Flags = &h1
		
		Published
		Unmoderated
		Banned
		Deleted
		
	#tag EndEnum
	#tag Enum, Name = LanguageType, Type = Integer, Flags = &h1
		
		Ru
		En
		
	#tag EndEnum
	#tag Enum, Name = LicenseCheckStatusType, Type = Integer, Flags = &h1
		
		Escapednew
		Success
		Fail
		Revoke
		DontWant
		FailManual
		
	#tag EndEnum
	#tag Enum, Name = LicenseType, Type = Integer, Flags = &h1
		
		Alcohol
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = LogisticPointType, Type = Integer, Flags = &h1
		
		Warehouse
		PickupPoint
		PickupTerminal
		PickupPostOffice
		PickupMixed
		PickupRetail
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = MechanicsType, Type = Integer, Flags = &h1
		
		DirectDiscount
		BlueFlash
		MarketPromocode
		
	#tag EndEnum
	#tag Enum, Name = OfferAvailabilityStatusType, Type = Integer, Flags = &h1
		
		Active
		Inactive
		Delisted
		
	#tag EndEnum
	#tag Enum, Name = OfferCampaignStatusType, Type = Integer, Flags = &h1
		
		Published
		Checking
		DisabledByPartner
		DisabledAutomatically
		RejectedByMarket
		CreatingCard
		NoCard
		NoStocks
		Archived
		
	#tag EndEnum
	#tag Enum, Name = OfferCardRecommendationType, Type = Integer, Flags = &h1
		
		HasVideo
		RecognizedVendor
		Main
		Additional
		Distinctive
		Filterable
		PictureCount
		HasDescription
		HasBarcode
		FirstPictureSize
		TitleLength
		DescriptionLength
		AveragePictureSize
		FirstVideoSize
		FirstVideoLength
		AverageVideoSize
		VideoCount
		
	#tag EndEnum
	#tag Enum, Name = OfferCardStatusType, Type = Integer, Flags = &h1
		
		HasCardCanNotUpdate
		HasCardCanUpdate
		HasCardCanUpdateErrors
		HasCardCanUpdateProcessing
		NoCardNeedContent
		NoCardMarketWillCreate
		NoCardErrors
		NoCardProcessing
		NoCardAddToCampaign
		
	#tag EndEnum
	#tag Enum, Name = OfferConditionQualityType, Type = Integer, Flags = &h1
		
		Perfect
		Excellent
		Good
		NotSpecified
		
	#tag EndEnum
	#tag Enum, Name = OfferConditionType, Type = Integer, Flags = &h1
		
		Preowned
		Showcasesample
		Refurbished
		Reduction
		Renovated
		NotSpecified
		
	#tag EndEnum
	#tag Enum, Name = OfferContentErrorType, Type = Integer, Flags = &h1
		
		OfferNotFound
		UnknownCategory
		CategoryMismatch
		UnknownParameter
		UnexpectedBooleanValue
		NumberFormat
		ValueBlank
		InvalidUnitId
		InvalidGroupIdLength
		InvalidGroupIdCharacters
		
	#tag EndEnum
	#tag Enum, Name = OfferMappingErrorType, Type = Integer, Flags = &h1
		
		UnknownCategory
		CategoryMismatch
		EmptyMarketCategory
		UnknownParameter
		UnexpectedBooleanValue
		NumberFormat
		ValueBlank
		InvalidUnitId
		InvalidGroupIdLength
		InvalidGroupIdCharacters
		InvalidPickerUrl
		
	#tag EndEnum
	#tag Enum, Name = OfferMappingKindType, Type = Integer, Flags = &h1
		
		Active
		All
		
	#tag EndEnum
	#tag Enum, Name = OfferProcessingNoteType, Type = Integer, Flags = &h1
		
		Assortment
		Cancelled
		ConflictingInformation
		Other
		DepartmentFrozen
		IncorrectInformation
		LegalConflict
		NeedClassificationInformation
		NeedInformation
		NeedPictures
		NeedVendor
		NoCategory
		NoKnowledge
		NoParametersInShopTitle
		NoSizeMeasure
		SampleLine
		
	#tag EndEnum
	#tag Enum, Name = OfferProcessingStatusType, Type = Integer, Flags = &h1
		
		Unknown
		Ready
		InWork
		NeedInfo
		NeedMapping
		NeedContent
		ContentProcessing
		Suspended
		Rejected
		Review
		CreateError
		UpdateError
		
	#tag EndEnum
	#tag Enum, Name = OfferSellingProgramStatusType, Type = Integer, Flags = &h1
		
		Fine
		Reject
		
	#tag EndEnum
	#tag Enum, Name = OfferType, Type = Integer, Flags = &h1
		
		Default
		Medicine
		Book
		Audiobook
		ArtistTitle
		OnDemand
		
	#tag EndEnum
	#tag Enum, Name = OrderBuyerType, Type = Integer, Flags = &h1
		
		Person
		Business
		
	#tag EndEnum
	#tag Enum, Name = OrderCancellationReasonType, Type = Integer, Flags = &h1
		
		Delivered
		InDelivery
		
	#tag EndEnum
	#tag Enum, Name = OrderDeliveryDateReasonType, Type = Integer, Flags = &h1
		
		UserMovedDeliveryDates
		PartnerMovedDeliveryDates
		
	#tag EndEnum
	#tag Enum, Name = OrderDeliveryDispatchType, Type = Integer, Flags = &h1
		
		Unknown
		Buyer
		MarketPartnerOutlet
		MarketBrandedOutlet
		ShopOutlet
		Dropoff
		
	#tag EndEnum
	#tag Enum, Name = OrderDeliveryEacType, Type = Integer, Flags = &h1
		
		MerchantToCourier
		CourierToMerchant
		CheckingByMerchant
		
	#tag EndEnum
	#tag Enum, Name = OrderDeliveryPartnerType, Type = Integer, Flags = &h1
		
		Shop
		YandexMarket
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderDeliveryType, Type = Integer, Flags = &h1
		
		Delivery
		Pickup
		Post
		Digital
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderDocumentStatusType, Type = Integer, Flags = &h1
		
		Ready
		NotReady
		
	#tag EndEnum
	#tag Enum, Name = OrderItemInstanceType, Type = Integer, Flags = &h1
		
		Cis
		Uin
		Rnpt
		Gtd
		
	#tag EndEnum
	#tag Enum, Name = OrderItemStatusType, Type = Integer, Flags = &h1
		
		Rejected
		Returned
		
	#tag EndEnum
	#tag Enum, Name = OrderItemSubsidyType, Type = Integer, Flags = &h1
		
		YandexCashback
		Subsidy
		
	#tag EndEnum
	#tag Enum, Name = OrderItemsModificationRequestReasonType, Type = Integer, Flags = &h1
		
		PartnerRequestedRemove
		UserRequestedRemove
		
	#tag EndEnum
	#tag Enum, Name = OrderLiftType, Type = Integer, Flags = &h1
		
		NotNeeded
		Manual
		Elevator
		CargoElevator
		Free
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderPaymentMethodType, Type = Integer, Flags = &h1
		
		CashOnDelivery
		CardOnDelivery
		BoundCardOnDelivery
		Yandex
		ApplePay
		ExternalCertificate
		Credit
		GooglePay
		TinkoffCredit
		Sbp
		TinkoffInstallments
		B2bAccountPrepayment
		B2bAccountPostpayment
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderPaymentType, Type = Integer, Flags = &h1
		
		Prepaid
		Postpaid
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderPromoType, Type = Integer, Flags = &h1
		
		DirectDiscount
		BlueSet
		BlueFlash
		GenericBundle
		MarketCoupon
		MarketPromocode
		MarketDeal
		MarketBlue
		MarketPrime
		YandexPlus
		BeruPlus
		MarketCoin
		YandexEmployee
		LimitedFreeDeliveryPromo
		FreeDeliveryThreshold
		MulticartDiscount
		PriceDropAsYouShop
		FreeDeliveryForLdi
		FreeDeliveryForLsc
		SecretSale
		FreePickup
		CheapestAsGift
		Cashback
		SupplierMulticartDiscount
		SpreadDiscountCount
		SpreadDiscountReceipt
		AnnouncementPromo
		DiscountByPaymentType
		PercentDiscount
		DcoExtraDiscount
		EmptyPromo
		BlockingPromo
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderStatsStatusType, Type = Integer, Flags = &h1
		
		CancelledBeforeProcessing
		CancelledInDelivery
		CancelledInProcessing
		Delivery
		Delivered
		PartiallyDelivered
		PartiallyReturned
		Pending
		Pickup
		Processing
		Reserved
		Returned
		Unknown
		Unpaid
		Lost
		
	#tag EndEnum
	#tag Enum, Name = OrderStatusType, Type = Integer, Flags = &h1
		
		Placing
		Reserved
		Unpaid
		Processing
		Delivery
		Pickup
		Delivered
		Cancelled
		Pending
		PartiallyReturned
		Returned
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderSubsidyType, Type = Integer, Flags = &h1
		
		YandexCashback
		Subsidy
		Delivery
		
	#tag EndEnum
	#tag Enum, Name = OrderSubstatusType, Type = Integer, Flags = &h1
		
		ReservationExpired
		UserNotPaid
		UserUnreachable
		UserChangedMind
		UserRefusedDelivery
		UserRefusedProduct
		ShopFailed
		UserRefusedQuality
		ReplacingOrder
		ProcessingExpired
		PendingExpired
		ShopPendingCancelled
		PendingCancelled
		UserFraud
		ReservationFailed
		UserPlacedOtherOrder
		UserBoughtCheaper
		MissingItem
		BrokenItem
		WrongItem
		PickupExpired
		DeliveryProblems
		LateContact
		Custom
		DeliveryServiceFailed
		WarehouseFailedToShip
		DeliverySerivceUndelivered
		DeliveryServiceUndelivered
		Preorder
		AwaitConfirmation
		Started
		Packaging
		ReadyToShip
		Shipped
		AsyncProcessing
		UserRefusedToProvidePersonalData
		WaitingUserInput
		WaitingBankDecision
		BankRejectCreditOffer
		CustomerRejectCreditOffer
		CreditOfferFailed
		AwaitDeliveryDatesConfirmation
		ServiceFault
		DeliveryServiceReceived
		UserReceived
		WaitingForStocks
		AsPartOfMultiOrder
		ReadyForLastMile
		LastMileStarted
		Antifraud
		DeliveryUserNotReceived
		DeliveryServiceDelivered
		DeliveredUserNotReceived
		UserWantedAnotherPaymentMethod
		UserReceivedTechnicalError
		UserForgotToUseBonus
		ReceivedOnDistributionCenter
		DeliveryServiceNotReceived
		DeliveryServiceLost
		ShippedToWrongDeliveryService
		DeliveredUserReceived
		WaitingTinkoffDecision
		CourierSearch
		CourierFound
		CourierInTransitToSender
		CourierArrivedToSender
		CourierReceived
		CourierNotFound
		CourierNotDeliverOrder
		CourierReturnsOrder
		CourierReturnedOrder
		WaitingUserDeliveryInput
		PickupServiceReceived
		PickupUserReceived
		CancelledCourierNotFound
		CourierNotComeForOrder
		DeliveryNotManagedRegion
		IncompleteContactInformation
		IncompleteMultiOrder
		InappropriateWeightSize
		TechnicalError
		SortingCenterLost
		CourierSearchNotStarted
		Lost
		AwaitPayment
		AwaitLavkaReservation
		UserWantsToChangeAddress
		FullNotRansom
		PrescriptionMismatch
		DropoffLost
		DropoffClosed
		DeliveryToStoreStarted
		UserWantsToChangeDeliveryDate
		WrongItemDelivered
		DamagedBox
		AwaitDeliveryDates
		LastMileCourierSearch
		PickupPointClosed
		LegalInfoChanged
		UserHasNoTimeToPickupOrder
		DeliveryCustomsArrived
		DeliveryCustomsCleared
		FirstMileDeliveryServiceReceived
		AwaitAutoDeliveryDates
		AwaitUserPersonalData
		NoPersonalDataExpired
		CustomsProblems
		AwaitCashier
		WaitingPostpaidBudgetReservation
		AwaitServiceableConfirmation
		PostpaidBudgetReservationFailed
		AwaitCustomPriceConfirmation
		ReadyForPickup
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrderTaxSystemType, Type = Integer, Flags = &h1
		
		Osn
		Usn
		UsnMinusCost
		Envd
		Echn
		Psn
		Npd
		UnknownValue
		
	#tag EndEnum
	#tag Enum, Name = OrderUpdateStatusType, Type = Integer, Flags = &h1
		
		Ok
		Error
		
	#tag EndEnum
	#tag Enum, Name = OrderVatType, Type = Integer, Flags = &h1
		
		NoVat
		Vat0
		Vat10
		Vat10110
		Vat20
		Vat20120
		Vat18
		Vat18118
		UnknownValue
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsCommissionType, Type = Integer, Flags = &h1
		
		Fee
		Fulfillment
		LoyaltyParticipationFee
		AuctionPromotion
		Installment
		DeliveryToCustomer
		ExpressDeliveryToCustomer
		Agency
		PaymentTransfer
		ReturnedOrdersStorage
		Sorting
		IntakeSorting
		ReturnProcessing
		IlliquidGoodsSale
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsItemStatusType, Type = Integer, Flags = &h1
		
		Rejected
		Returned
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsOrderPaymentType, Type = Integer, Flags = &h1
		
		Credit
		Postpaid
		Prepaid
		TinkoffCredit
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsPaymentSourceType, Type = Integer, Flags = &h1
		
		Buyer
		Cashback
		Marketplace
		Split
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsPaymentType, Type = Integer, Flags = &h1
		
		Payment
		Refund
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsPriceType, Type = Integer, Flags = &h1
		
		Buyer
		Cashback
		Marketplace
		
	#tag EndEnum
	#tag Enum, Name = OrdersStatsStockType, Type = Integer, Flags = &h1
		
		Fit
		Freeze
		Available
		Quarantine
		Utilization
		Defect
		Expired
		
	#tag EndEnum
	#tag Enum, Name = OutletStatusType, Type = Integer, Flags = &h1
		
		AtModeration
		Failed
		Moderated
		Nonmoderated
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = OutletType, Type = Integer, Flags = &h1
		
		Depot
		Mixed
		Retail
		NotDefined
		
	#tag EndEnum
	#tag Enum, Name = OutletVisibilityType, Type = Integer, Flags = &h1
		
		Hidden
		Visible
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = PageFormatType, Type = Integer, Flags = &h1
		
		A7
		A4
		
	#tag EndEnum
	#tag Enum, Name = ParameterType, Type = Integer, Flags = &h1
		
		Text
		Escapedenum
		Boolean
		Numeric
		
	#tag EndEnum
	#tag Enum, Name = PaymentFrequencyType, Type = Integer, Flags = &h1
		
		Daily
		Weekly
		Biweekly
		Monthly
		
	#tag EndEnum
	#tag Enum, Name = PlacementType, Type = Integer, Flags = &h1
		
		Fbs
		Fby
		Dbs
		
	#tag EndEnum
	#tag Enum, Name = PriceCompetitivenessType, Type = Integer, Flags = &h1
		
		Optimal
		Average
		Low
		
	#tag EndEnum
	#tag Enum, Name = PriceQuarantineVerdictParamNameType, Type = Integer, Flags = &h1
		
		CurrentPrice
		LastValidPrice
		MinPrice
		Currency
		
	#tag EndEnum
	#tag Enum, Name = PriceQuarantineVerdictType, Type = Integer, Flags = &h1
		
		PriceChange
		LowPrice
		LowPricePromo
		
	#tag EndEnum
	#tag Enum, Name = PriceSuggestType, Type = Integer, Flags = &h1
		
		Buybox
		DefaultOffer
		MinPriceMarket
		
	#tag EndEnum
	#tag Enum, Name = PromoOfferParticipationStatusFilterType, Type = Integer, Flags = &h1
		
		ManuallyAdded
		NotManuallyAdded
		
	#tag EndEnum
	#tag Enum, Name = PromoOfferParticipationStatusType, Type = Integer, Flags = &h1
		
		Auto
		PartiallyAuto
		Manual
		NotParticipating
		
	#tag EndEnum
	#tag Enum, Name = PromoOfferUpdateWarningCodeType, Type = Integer, Flags = &h1
		
		DeepDiscountOffer
		CatalogPriceIsLowerThanPromo
		ShopPricesAreLowerThanPromo
		PromocodePriceMoreThanMaxFairPrice
		ShopOfferNotEligibleForPromo
		
	#tag EndEnum
	#tag Enum, Name = PromoParticipationType, Type = Integer, Flags = &h1
		
		ParticipatingNow
		Participated
		
	#tag EndEnum
	#tag Enum, Name = QualityRatingComponentType, Type = Integer, Flags = &h1
		
		DbsCancellationRate
		DbsLateDeliveryRate
		FbsCancellationRate
		FbsLateShipRate
		FbyLateDeliveryRate
		FbyCancellationRate
		FbyDeliveryDiffRate
		FbyLateEditingRate
		
	#tag EndEnum
	#tag Enum, Name = RecipientType, Type = Integer, Flags = &h1
		
		Shop
		DeliveryService
		Post
		
	#tag EndEnum
	#tag Enum, Name = RefundStatusType, Type = Integer, Flags = &h1
		
		StartedByUser
		RefundInProgress
		Refunded
		Failed
		WaitingForDecision
		DecisionMade
		RefundedWithBonuses
		RefundedByShop
		Cancelled
		CompleteWithoutRefund
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = RegionType, Type = Integer, Flags = &h1
		
		Other
		Continent
		Region
		Country
		CountryDistrict
		Republic
		City
		Village
		CityDistrict
		SubwayStation
		RepublicArea
		
	#tag EndEnum
	#tag Enum, Name = RejectedPromoOfferDeleteReasonType, Type = Integer, Flags = &h1
		
		OfferDoesNotExist
		
	#tag EndEnum
	#tag Enum, Name = RejectedPromoOfferUpdateReasonType, Type = Integer, Flags = &h1
		
		OfferDoesNotExist
		OfferDuplication
		OfferNotEligibleForPromo
		OfferPromosMaxByteSizeExceeded
		DeadlineForFocusPromosExceeded
		EmptyOldPrice
		EmptyPromoPrice
		MaxPromoPriceExceeded
		PromoPriceBiggerThanMax
		PromoPriceSmallerThanMin
		
	#tag EndEnum
	#tag Enum, Name = ReportFormatType, Type = Integer, Flags = &h1
		
		Escapedfile
		Csv
		
	#tag EndEnum
	#tag Enum, Name = ReportStatusType, Type = Integer, Flags = &h1
		
		Pending
		Processing
		Failed
		Done
		
	#tag EndEnum
	#tag Enum, Name = ReportSubStatusType, Type = Integer, Flags = &h1
		
		NoData
		TooLarge
		ResourceNotFound
		
	#tag EndEnum
	#tag Enum, Name = ReturnDecisionReasonType, Type = Integer, Flags = &h1
		
		BadQuality
		DoesNotFit
		WrongItem
		DamageDelivery
		LoyaltyFail
		ContentFail
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = ReturnDecisionSubreasonType, Type = Integer, Flags = &h1
		
		UserDidNotLike
		UserChangedMind
		DeliveredTooLong
		BadPackage
		Damaged
		NotWorking
		Incompleteness
		WrongItem
		WrongColor
		DidNotMatchDescription
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = ReturnDecisionType, Type = Integer, Flags = &h1
		
		RefundMoney
		RefundMoneyIncludingShipment
		Repair
		Replace
		SendToExamination
		DeclineRefund
		OtherDecision
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = ReturnInstanceStatusType, Type = Integer, Flags = &h1
		
		Created
		Received
		InTransit
		ReadyForPickup
		Picked
		ReceivedOnFulfillment
		Cancelled
		Lost
		Utilized
		PreparedForUtilization
		Expropriated
		NotInDemand
		
	#tag EndEnum
	#tag Enum, Name = ReturnInstanceStockType, Type = Integer, Flags = &h1
		
		Fit
		Defect
		Anomaly
		Surplus
		Expired
		Misgrading
		Undefined
		IncorrectImei
		IncorrectSerialNumber
		IncorrectCis
		PartMissing
		NonComplient
		NotAcceptable
		Service
		Markdown
		Demo
		Repair
		Firmware
		Unknown
		
	#tag EndEnum
	#tag Enum, Name = ReturnRequestDecisionType, Type = Integer, Flags = &h1
		
		RefundMoney
		RefundMoneyIncludingShipment
		Repair
		Replace
		SendToExamination
		DeclineRefund
		OtherDecision
		
	#tag EndEnum
	#tag Enum, Name = ReturnShipmentStatusType, Type = Integer, Flags = &h1
		
		Created
		Received
		InTransit
		ReadyForPickup
		Picked
		Lost
		Expired
		Cancelled
		FulfilmentReceived
		PreparedForUtilization
		NotInDemand
		Utilized
		ReadyForExpropriation
		ReceivedForExpropriation
		
	#tag EndEnum
	#tag Enum, Name = ReturnType, Type = Integer, Flags = &h1
		
		Unredeemed
		Escapedreturn
		
	#tag EndEnum
	#tag Enum, Name = SellingProgramType, Type = Integer, Flags = &h1
		
		Fby
		Fbs
		Dbs
		Express
		
	#tag EndEnum
	#tag Enum, Name = ShelfsStatisticsAttributionType, Type = Integer, Flags = &h1
		
		Clicks
		Shows
		
	#tag EndEnum
	#tag Enum, Name = ShipmentActionType, Type = Integer, Flags = &h1
		
		Confirm
		DownloadAct
		DownloadInboundAct
		DownloadDiscrepancyAct
		ChangePalletsCount
		
	#tag EndEnum
	#tag Enum, Name = ShipmentPalletLabelPageFormatType, Type = Integer, Flags = &h1
		
		A4
		A8
		
	#tag EndEnum
	#tag Enum, Name = ShipmentStatusType, Type = Integer, Flags = &h1
		
		OutboundCreated
		OutboundReadyForConfirmation
		OutboundConfirmed
		OutboundSigned
		Finished
		Accepted
		AcceptedWithDiscrepancies
		Error
		
	#tag EndEnum
	#tag Enum, Name = ShipmentType, Type = Integer, Flags = &h1
		
		Import
		Withdraw
		
	#tag EndEnum
	#tag Enum, Name = ShowsSalesGroupingType, Type = Integer, Flags = &h1
		
		Categories
		Offers
		
	#tag EndEnum
	#tag Enum, Name = SortOrderType, Type = Integer, Flags = &h1
		
		Asc
		Desc
		
	#tag EndEnum
	#tag Enum, Name = TariffType, Type = Integer, Flags = &h1
		
		AgencyCommission
		PaymentTransfer
		Storage
		Withdraw
		Surplus
		Fee
		DeliveryToCustomer
		CrossregionalDelivery
		CrossregionalDeliveryReturn
		Disposal
		SortingCenterStorage
		ExpressDelivery
		FfXdocSupplyBox
		FfXdocSupplyPallet
		Sorting
		MiddleMile
		ReturnProcessing
		ExpressCancelledByPartner
		DeliveryToCustomerReturn
		CrossborderDelivery
		IntakeSortingBulkyCargo
		IntakeSortingSmallGoods
		IntakeSortingDaily
		FfStorageBilling
		CancelledOrderFeeQi
		LateOrderExecutionFeeQi
		
	#tag EndEnum
	#tag Enum, Name = TimeUnitType, Type = Integer, Flags = &h1
		
		Hour
		Day
		Week
		Month
		Year
		
	#tag EndEnum
	#tag Enum, Name = TurnoverType, Type = Integer, Flags = &h1
		
		Low
		AlmostLow
		High
		VeryHigh
		NoSales
		FreeStore
		
	#tag EndEnum
	#tag Enum, Name = WarehouseStockType, Type = Integer, Flags = &h1
		
		Fit
		Freeze
		Available
		Quarantine
		Utilization
		Defect
		Expired
		
	#tag EndEnum


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
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
	#tag EndViewBehavior
End Module
#tag EndModule

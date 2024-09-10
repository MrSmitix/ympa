//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QueryParam {
  const QueryParam(this.name, this.value);

  final String name;
  final String value;

  @override
  String toString() => '${Uri.encodeQueryComponent(name)}=${Uri.encodeQueryComponent(value)}';
}

// Ported from the Java version.
Iterable<QueryParam> _queryParams(String collectionFormat, String name, dynamic value,) {
  // Assertions to run in debug mode only.
  assert(name.isNotEmpty, 'Parameter cannot be an empty string.');

  final params = <QueryParam>[];

  if (value is List) {
    if (collectionFormat == 'multi') {
      return value.map((dynamic v) => QueryParam(name, parameterToString(v)),);
    }

    // Default collection format is 'csv'.
    if (collectionFormat.isEmpty) {
      collectionFormat = 'csv'; // ignore: parameter_assignments
    }

    final delimiter = _delimiters[collectionFormat] ?? ',';

    params.add(QueryParam(name, value.map<dynamic>(parameterToString).join(delimiter),));
  } else if (value != null) {
    params.add(QueryParam(name, parameterToString(value)));
  }

  return params;
}

/// Format the given parameter object into a [String].
String parameterToString(dynamic value) {
  if (value == null) {
    return '';
  }
  if (value is DateTime) {
    return value.toUtc().toIso8601String();
  }
  if (value is AddOffersToArchiveErrorType) {
    return AddOffersToArchiveErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is AffectedOrderQualityRatingComponentType) {
    return AffectedOrderQualityRatingComponentTypeTypeTransformer().encode(value).toString();
  }
  if (value is AgeUnitType) {
    return AgeUnitTypeTypeTransformer().encode(value).toString();
  }
  if (value is ApiResponseStatusType) {
    return ApiResponseStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is CalculatedTariffType) {
    return CalculatedTariffTypeTypeTransformer().encode(value).toString();
  }
  if (value is CampaignSettingsScheduleSourceType) {
    return CampaignSettingsScheduleSourceTypeTypeTransformer().encode(value).toString();
  }
  if (value is CategoryErrorType) {
    return CategoryErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is ChatMessageSenderType) {
    return ChatMessageSenderTypeTypeTransformer().encode(value).toString();
  }
  if (value is ChatStatusType) {
    return ChatStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ChatType) {
    return ChatTypeTypeTransformer().encode(value).toString();
  }
  if (value is CurrencyType) {
    return CurrencyTypeTypeTransformer().encode(value).toString();
  }
  if (value is DayOfWeekType) {
    return DayOfWeekTypeTypeTransformer().encode(value).toString();
  }
  if (value is EacVerificationStatusType) {
    return EacVerificationStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedContentErrorType) {
    return FeedContentErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedDownloadErrorType) {
    return FeedDownloadErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedIndexLogsErrorType) {
    return FeedIndexLogsErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedIndexLogsIndexType) {
    return FeedIndexLogsIndexTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedIndexLogsStatusType) {
    return FeedIndexLogsStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedStatusType) {
    return FeedStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedbackCommentAuthorType) {
    return FeedbackCommentAuthorTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedbackDeliveryType) {
    return FeedbackDeliveryTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedbackReactionStatusType) {
    return FeedbackReactionStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is FeedbackStateType) {
    return FeedbackStateTypeTypeTransformer().encode(value).toString();
  }
  if (value is FieldStateType) {
    return FieldStateTypeTypeTransformer().encode(value).toString();
  }
  if (value is GoodsFeedbackCommentAuthorType) {
    return GoodsFeedbackCommentAuthorTypeTypeTransformer().encode(value).toString();
  }
  if (value is GoodsFeedbackCommentStatusType) {
    return GoodsFeedbackCommentStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is LanguageType) {
    return LanguageTypeTypeTransformer().encode(value).toString();
  }
  if (value is LicenseCheckStatusType) {
    return LicenseCheckStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is LicenseType) {
    return LicenseTypeTypeTransformer().encode(value).toString();
  }
  if (value is LogisticPointType) {
    return LogisticPointTypeTypeTransformer().encode(value).toString();
  }
  if (value is MechanicsType) {
    return MechanicsTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferAvailabilityStatusType) {
    return OfferAvailabilityStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferCampaignStatusType) {
    return OfferCampaignStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferCardRecommendationType) {
    return OfferCardRecommendationTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferCardStatusType) {
    return OfferCardStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferConditionQualityType) {
    return OfferConditionQualityTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferConditionType) {
    return OfferConditionTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferContentErrorType) {
    return OfferContentErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferMappingErrorType) {
    return OfferMappingErrorTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferMappingKindType) {
    return OfferMappingKindTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferProcessingNoteType) {
    return OfferProcessingNoteTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferProcessingStatusType) {
    return OfferProcessingStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferSellingProgramStatusType) {
    return OfferSellingProgramStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OfferType) {
    return OfferTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderBuyerType) {
    return OrderBuyerTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderCancellationReasonType) {
    return OrderCancellationReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDeliveryDateReasonType) {
    return OrderDeliveryDateReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDeliveryDispatchType) {
    return OrderDeliveryDispatchTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDeliveryEacType) {
    return OrderDeliveryEacTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDeliveryPartnerType) {
    return OrderDeliveryPartnerTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDeliveryType) {
    return OrderDeliveryTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderDocumentStatusType) {
    return OrderDocumentStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderItemInstanceType) {
    return OrderItemInstanceTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderItemStatusType) {
    return OrderItemStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderItemSubsidyType) {
    return OrderItemSubsidyTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderItemsModificationRequestReasonType) {
    return OrderItemsModificationRequestReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderLiftType) {
    return OrderLiftTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderPaymentMethodType) {
    return OrderPaymentMethodTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderPaymentType) {
    return OrderPaymentTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderPromoType) {
    return OrderPromoTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderStatsStatusType) {
    return OrderStatsStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderStatusType) {
    return OrderStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderSubsidyType) {
    return OrderSubsidyTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderSubstatusType) {
    return OrderSubstatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderTaxSystemType) {
    return OrderTaxSystemTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderUpdateStatusType) {
    return OrderUpdateStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrderVatType) {
    return OrderVatTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsCommissionType) {
    return OrdersStatsCommissionTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsItemStatusType) {
    return OrdersStatsItemStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsOrderPaymentType) {
    return OrdersStatsOrderPaymentTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsPaymentSourceType) {
    return OrdersStatsPaymentSourceTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsPaymentType) {
    return OrdersStatsPaymentTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsPriceType) {
    return OrdersStatsPriceTypeTypeTransformer().encode(value).toString();
  }
  if (value is OrdersStatsStockType) {
    return OrdersStatsStockTypeTypeTransformer().encode(value).toString();
  }
  if (value is OutletStatusType) {
    return OutletStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is OutletType) {
    return OutletTypeTypeTransformer().encode(value).toString();
  }
  if (value is OutletVisibilityType) {
    return OutletVisibilityTypeTypeTransformer().encode(value).toString();
  }
  if (value is PageFormatType) {
    return PageFormatTypeTypeTransformer().encode(value).toString();
  }
  if (value is ParameterType) {
    return ParameterTypeTypeTransformer().encode(value).toString();
  }
  if (value is PaymentFrequencyType) {
    return PaymentFrequencyTypeTypeTransformer().encode(value).toString();
  }
  if (value is PlacementType) {
    return PlacementTypeTypeTransformer().encode(value).toString();
  }
  if (value is PriceCompetitivenessType) {
    return PriceCompetitivenessTypeTypeTransformer().encode(value).toString();
  }
  if (value is PriceQuarantineVerdictParamNameType) {
    return PriceQuarantineVerdictParamNameTypeTypeTransformer().encode(value).toString();
  }
  if (value is PriceQuarantineVerdictType) {
    return PriceQuarantineVerdictTypeTypeTransformer().encode(value).toString();
  }
  if (value is PriceSuggestType) {
    return PriceSuggestTypeTypeTransformer().encode(value).toString();
  }
  if (value is PromoOfferParticipationStatusFilterType) {
    return PromoOfferParticipationStatusFilterTypeTypeTransformer().encode(value).toString();
  }
  if (value is PromoOfferParticipationStatusType) {
    return PromoOfferParticipationStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is PromoOfferUpdateWarningCodeType) {
    return PromoOfferUpdateWarningCodeTypeTypeTransformer().encode(value).toString();
  }
  if (value is PromoParticipationType) {
    return PromoParticipationTypeTypeTransformer().encode(value).toString();
  }
  if (value is QualityRatingComponentType) {
    return QualityRatingComponentTypeTypeTransformer().encode(value).toString();
  }
  if (value is RecipientType) {
    return RecipientTypeTypeTransformer().encode(value).toString();
  }
  if (value is RefundStatusType) {
    return RefundStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is RegionType) {
    return RegionTypeTypeTransformer().encode(value).toString();
  }
  if (value is RejectedPromoOfferDeleteReasonType) {
    return RejectedPromoOfferDeleteReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is RejectedPromoOfferUpdateReasonType) {
    return RejectedPromoOfferUpdateReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReportFormatType) {
    return ReportFormatTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReportStatusType) {
    return ReportStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReportSubStatusType) {
    return ReportSubStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnDecisionReasonType) {
    return ReturnDecisionReasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnDecisionSubreasonType) {
    return ReturnDecisionSubreasonTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnDecisionType) {
    return ReturnDecisionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnInstanceStatusType) {
    return ReturnInstanceStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnInstanceStockType) {
    return ReturnInstanceStockTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnRequestDecisionType) {
    return ReturnRequestDecisionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnShipmentStatusType) {
    return ReturnShipmentStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ReturnType) {
    return ReturnTypeTypeTransformer().encode(value).toString();
  }
  if (value is SellingProgramType) {
    return SellingProgramTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShelfsStatisticsAttributionType) {
    return ShelfsStatisticsAttributionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShipmentActionType) {
    return ShipmentActionTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShipmentPalletLabelPageFormatType) {
    return ShipmentPalletLabelPageFormatTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShipmentStatusType) {
    return ShipmentStatusTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShipmentType) {
    return ShipmentTypeTypeTransformer().encode(value).toString();
  }
  if (value is ShowsSalesGroupingType) {
    return ShowsSalesGroupingTypeTypeTransformer().encode(value).toString();
  }
  if (value is SortOrderType) {
    return SortOrderTypeTypeTransformer().encode(value).toString();
  }
  if (value is TariffType) {
    return TariffTypeTypeTransformer().encode(value).toString();
  }
  if (value is TimeUnitType) {
    return TimeUnitTypeTypeTransformer().encode(value).toString();
  }
  if (value is TurnoverType) {
    return TurnoverTypeTypeTransformer().encode(value).toString();
  }
  if (value is WarehouseStockType) {
    return WarehouseStockTypeTypeTransformer().encode(value).toString();
  }
  return value.toString();
}

/// Returns the decoded body as UTF-8 if the given headers indicate an 'application/json'
/// content type. Otherwise, returns the decoded body as decoded by dart:http package.
Future<String> _decodeBodyBytes(Response response) async {
  final contentType = response.headers['content-type'];
  return contentType != null && contentType.toLowerCase().startsWith('application/json')
    ? response.bodyBytes.isEmpty ? '' : utf8.decode(response.bodyBytes)
    : response.body;
}

/// Returns a valid [T] value found at the specified Map [key], null otherwise.
T? mapValueOfType<T>(dynamic map, String key) {
  final dynamic value = map is Map ? map[key] : null;
  return value is T ? value : null;
}

/// Returns a valid Map<K, V> found at the specified Map [key], null otherwise.
Map<K, V>? mapCastOfType<K, V>(dynamic map, String key) {
  final dynamic value = map is Map ? map[key] : null;
  return value is Map ? value.cast<K, V>() : null;
}

/// Returns a valid [DateTime] found at the specified Map [key], null otherwise.
DateTime? mapDateTime(dynamic map, String key, [String? pattern]) {
  final dynamic value = map is Map ? map[key] : null;
  if (value != null) {
    int? millis;
    if (value is int) {
      millis = value;
    } else if (value is String) {
      if (_isEpochMarker(pattern)) {
        millis = int.tryParse(value);
      } else {
        return DateTime.tryParse(value);
      }
    }
    if (millis != null) {
      return DateTime.fromMillisecondsSinceEpoch(millis, isUtc: true);
    }
  }
  return null;
}

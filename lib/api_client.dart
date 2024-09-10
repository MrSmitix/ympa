//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiClient {
  ApiClient({this.basePath = 'https://api.partner.market.yandex.ru', this.authentication,});

  final String basePath;
  final Authentication? authentication;

  var _client = Client();
  final _defaultHeaderMap = <String, String>{};

  /// Returns the current HTTP [Client] instance to use in this class.
  ///
  /// The return value is guaranteed to never be null.
  Client get client => _client;

  /// Requests to use a new HTTP [Client] in this class.
  set client(Client newClient) {
    _client = newClient;
  }

  Map<String, String> get defaultHeaderMap => _defaultHeaderMap;

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi', a key might appear multiple times.
  Future<Response> invokeAPI(
    String path,
    String method,
    List<QueryParam> queryParams,
    Object? body,
    Map<String, String> headerParams,
    Map<String, String> formParams,
    String? contentType,
  ) async {
    await authentication?.applyToParams(queryParams, headerParams);

    headerParams.addAll(_defaultHeaderMap);
    if (contentType != null) {
      headerParams['Content-Type'] = contentType;
    }

    final urlEncodedQueryParams = queryParams.map((param) => '$param');
    final queryString = urlEncodedQueryParams.isNotEmpty ? '?${urlEncodedQueryParams.join('&')}' : '';
    final uri = Uri.parse('$basePath$path$queryString');

    try {
      // Special case for uploading a single file which isn't a 'multipart/form-data'.
      if (
        body is MultipartFile && (contentType == null ||
        !contentType.toLowerCase().startsWith('multipart/form-data'))
      ) {
        final request = StreamedRequest(method, uri);
        request.headers.addAll(headerParams);
        request.contentLength = body.length;
        body.finalize().listen(
          request.sink.add,
          onDone: request.sink.close,
          // ignore: avoid_types_on_closure_parameters
          onError: (Object error, StackTrace trace) => request.sink.close(),
          cancelOnError: true,
        );
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      if (body is MultipartRequest) {
        final request = MultipartRequest(method, uri);
        request.fields.addAll(body.fields);
        request.files.addAll(body.files);
        request.headers.addAll(body.headers);
        request.headers.addAll(headerParams);
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      final msgBody = contentType == 'application/x-www-form-urlencoded'
        ? formParams
        : await serializeAsync(body);
      final nullableHeaderParams = headerParams.isEmpty ? null : headerParams;

      switch(method) {
        case 'POST': return await _client.post(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PUT': return await _client.put(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'DELETE': return await _client.delete(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PATCH': return await _client.patch(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'HEAD': return await _client.head(uri, headers: nullableHeaderParams,);
        case 'GET': return await _client.get(uri, headers: nullableHeaderParams,);
      }
    } on SocketException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Socket operation failed: $method $path',
        error,
        trace,
      );
    } on TlsException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'TLS/SSL communication failed: $method $path',
        error,
        trace,
      );
    } on IOException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'I/O operation failed: $method $path',
        error,
        trace,
      );
    } on ClientException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'HTTP connection failed: $method $path',
        error,
        trace,
      );
    } on Exception catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Exception occurred: $method $path',
        error,
        trace,
      );
    }

    throw ApiException(
      HttpStatus.badRequest,
      'Invalid HTTP operation: $method $path',
    );
  }

  Future<dynamic> deserializeAsync(String value, String targetType, {bool growable = false,}) async =>
    // ignore: deprecated_member_use_from_same_package
    deserialize(value, targetType, growable: growable);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use deserializeAsync() instead.')
  dynamic deserialize(String value, String targetType, {bool growable = false,}) {
    // Remove all spaces. Necessary for regular expressions as well.
    targetType = targetType.replaceAll(' ', ''); // ignore: parameter_assignments

    // If the expected target type is String, nothing to do...
    return targetType == 'String'
      ? value
      : fromJson(json.decode(value), targetType, growable: growable);
  }

  // ignore: deprecated_member_use_from_same_package
  Future<String> serializeAsync(Object? value) async => serialize(value);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use serializeAsync() instead.')
  String serialize(Object? value) => value == null ? '' : json.encode(value);

  /// Returns a native instance of an OpenAPI class matching the [specified type][targetType].
  static dynamic fromJson(dynamic value, String targetType, {bool growable = false,}) {
    try {
      switch (targetType) {
        case 'String':
          return value is String ? value : value.toString();
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'bool':
          if (value is bool) {
            return value;
          }
          final valueString = '$value'.toLowerCase();
          return valueString == 'true' || valueString == '1';
        case 'DateTime':
          return value is DateTime ? value : DateTime.tryParse(value);
        case 'AcceptOrderCancellationRequest':
          return AcceptOrderCancellationRequest.fromJson(value);
        case 'AddHiddenOffersRequest':
          return AddHiddenOffersRequest.fromJson(value);
        case 'AddOffersToArchiveDTO':
          return AddOffersToArchiveDTO.fromJson(value);
        case 'AddOffersToArchiveErrorDTO':
          return AddOffersToArchiveErrorDTO.fromJson(value);
        case 'AddOffersToArchiveErrorType':
          return AddOffersToArchiveErrorTypeTypeTransformer().decode(value);
        case 'AddOffersToArchiveRequest':
          return AddOffersToArchiveRequest.fromJson(value);
        case 'AddOffersToArchiveResponse':
          return AddOffersToArchiveResponse.fromJson(value);
        case 'AffectedOrderQualityRatingComponentType':
          return AffectedOrderQualityRatingComponentTypeTypeTransformer().decode(value);
        case 'AgeDTO':
          return AgeDTO.fromJson(value);
        case 'AgeUnitType':
          return AgeUnitTypeTypeTransformer().decode(value);
        case 'ApiClientDataErrorResponse':
          return ApiClientDataErrorResponse.fromJson(value);
        case 'ApiErrorDTO':
          return ApiErrorDTO.fromJson(value);
        case 'ApiErrorResponse':
          return ApiErrorResponse.fromJson(value);
        case 'ApiForbiddenErrorResponse':
          return ApiForbiddenErrorResponse.fromJson(value);
        case 'ApiLimitErrorResponse':
          return ApiLimitErrorResponse.fromJson(value);
        case 'ApiLockedErrorResponse':
          return ApiLockedErrorResponse.fromJson(value);
        case 'ApiNotFoundErrorResponse':
          return ApiNotFoundErrorResponse.fromJson(value);
        case 'ApiResponse':
          return ApiResponse.fromJson(value);
        case 'ApiResponseStatusType':
          return ApiResponseStatusTypeTypeTransformer().decode(value);
        case 'ApiServerErrorResponse':
          return ApiServerErrorResponse.fromJson(value);
        case 'ApiUnauthorizedErrorResponse':
          return ApiUnauthorizedErrorResponse.fromJson(value);
        case 'BaseCampaignOfferDTO':
          return BaseCampaignOfferDTO.fromJson(value);
        case 'BaseOfferDTO':
          return BaseOfferDTO.fromJson(value);
        case 'BasePriceDTO':
          return BasePriceDTO.fromJson(value);
        case 'BaseShipmentDTO':
          return BaseShipmentDTO.fromJson(value);
        case 'BidRecommendationItemDTO':
          return BidRecommendationItemDTO.fromJson(value);
        case 'BriefOrderItemDTO':
          return BriefOrderItemDTO.fromJson(value);
        case 'BriefOrderItemInstanceDTO':
          return BriefOrderItemInstanceDTO.fromJson(value);
        case 'BusinessDTO':
          return BusinessDTO.fromJson(value);
        case 'BusinessSettingsDTO':
          return BusinessSettingsDTO.fromJson(value);
        case 'CalculateTariffsOfferDTO':
          return CalculateTariffsOfferDTO.fromJson(value);
        case 'CalculateTariffsOfferInfoDTO':
          return CalculateTariffsOfferInfoDTO.fromJson(value);
        case 'CalculateTariffsParametersDTO':
          return CalculateTariffsParametersDTO.fromJson(value);
        case 'CalculateTariffsRequest':
          return CalculateTariffsRequest.fromJson(value);
        case 'CalculateTariffsResponse':
          return CalculateTariffsResponse.fromJson(value);
        case 'CalculateTariffsResponseDTO':
          return CalculateTariffsResponseDTO.fromJson(value);
        case 'CalculatedTariffDTO':
          return CalculatedTariffDTO.fromJson(value);
        case 'CalculatedTariffType':
          return CalculatedTariffTypeTypeTransformer().decode(value);
        case 'CampaignDTO':
          return CampaignDTO.fromJson(value);
        case 'CampaignQualityRatingDTO':
          return CampaignQualityRatingDTO.fromJson(value);
        case 'CampaignSettingsDTO':
          return CampaignSettingsDTO.fromJson(value);
        case 'CampaignSettingsDeliveryDTO':
          return CampaignSettingsDeliveryDTO.fromJson(value);
        case 'CampaignSettingsLocalRegionDTO':
          return CampaignSettingsLocalRegionDTO.fromJson(value);
        case 'CampaignSettingsScheduleDTO':
          return CampaignSettingsScheduleDTO.fromJson(value);
        case 'CampaignSettingsScheduleSourceType':
          return CampaignSettingsScheduleSourceTypeTypeTransformer().decode(value);
        case 'CampaignSettingsTimePeriodDTO':
          return CampaignSettingsTimePeriodDTO.fromJson(value);
        case 'CampaignsQualityRatingDTO':
          return CampaignsQualityRatingDTO.fromJson(value);
        case 'CategoryContentParametersDTO':
          return CategoryContentParametersDTO.fromJson(value);
        case 'CategoryDTO':
          return CategoryDTO.fromJson(value);
        case 'CategoryErrorDTO':
          return CategoryErrorDTO.fromJson(value);
        case 'CategoryErrorType':
          return CategoryErrorTypeTypeTransformer().decode(value);
        case 'CategoryParameterDTO':
          return CategoryParameterDTO.fromJson(value);
        case 'CategoryParameterUnitDTO':
          return CategoryParameterUnitDTO.fromJson(value);
        case 'ChangeOutletRequest':
          return ChangeOutletRequest.fromJson(value);
        case 'ChannelType':
          return ChannelType.fromJson(value);
        case 'ChatMessageDTO':
          return ChatMessageDTO.fromJson(value);
        case 'ChatMessagePayloadDTO':
          return ChatMessagePayloadDTO.fromJson(value);
        case 'ChatMessageSenderType':
          return ChatMessageSenderTypeTypeTransformer().decode(value);
        case 'ChatMessagesResultDTO':
          return ChatMessagesResultDTO.fromJson(value);
        case 'ChatStatusType':
          return ChatStatusTypeTypeTransformer().decode(value);
        case 'ChatType':
          return ChatTypeTypeTransformer().decode(value);
        case 'ConfirmPricesRequest':
          return ConfirmPricesRequest.fromJson(value);
        case 'ConfirmShipmentRequest':
          return ConfirmShipmentRequest.fromJson(value);
        case 'CreateChatRequest':
          return CreateChatRequest.fromJson(value);
        case 'CreateChatResponse':
          return CreateChatResponse.fromJson(value);
        case 'CreateChatResultDTO':
          return CreateChatResultDTO.fromJson(value);
        case 'CreateOutletResponse':
          return CreateOutletResponse.fromJson(value);
        case 'CurrencyType':
          return CurrencyTypeTypeTransformer().decode(value);
        case 'DayOfWeekType':
          return DayOfWeekTypeTypeTransformer().decode(value);
        case 'DeleteCampaignOffersDTO':
          return DeleteCampaignOffersDTO.fromJson(value);
        case 'DeleteCampaignOffersRequest':
          return DeleteCampaignOffersRequest.fromJson(value);
        case 'DeleteCampaignOffersResponse':
          return DeleteCampaignOffersResponse.fromJson(value);
        case 'DeleteGoodsFeedbackCommentRequest':
          return DeleteGoodsFeedbackCommentRequest.fromJson(value);
        case 'DeleteHiddenOffersRequest':
          return DeleteHiddenOffersRequest.fromJson(value);
        case 'DeleteOffersDTO':
          return DeleteOffersDTO.fromJson(value);
        case 'DeleteOffersFromArchiveDTO':
          return DeleteOffersFromArchiveDTO.fromJson(value);
        case 'DeleteOffersFromArchiveRequest':
          return DeleteOffersFromArchiveRequest.fromJson(value);
        case 'DeleteOffersFromArchiveResponse':
          return DeleteOffersFromArchiveResponse.fromJson(value);
        case 'DeleteOffersRequest':
          return DeleteOffersRequest.fromJson(value);
        case 'DeleteOffersResponse':
          return DeleteOffersResponse.fromJson(value);
        case 'DeletePromoOffersRequest':
          return DeletePromoOffersRequest.fromJson(value);
        case 'DeletePromoOffersResponse':
          return DeletePromoOffersResponse.fromJson(value);
        case 'DeletePromoOffersResultDTO':
          return DeletePromoOffersResultDTO.fromJson(value);
        case 'DeliveryServiceDTO':
          return DeliveryServiceDTO.fromJson(value);
        case 'DeliveryServiceInfoDTO':
          return DeliveryServiceInfoDTO.fromJson(value);
        case 'DeliveryServicesDTO':
          return DeliveryServicesDTO.fromJson(value);
        case 'DocumentDTO':
          return DocumentDTO.fromJson(value);
        case 'EacVerificationResultDTO':
          return EacVerificationResultDTO.fromJson(value);
        case 'EacVerificationStatusType':
          return EacVerificationStatusTypeTypeTransformer().decode(value);
        case 'EmptyApiResponse':
          return EmptyApiResponse.fromJson(value);
        case 'EnrichedMappingsOfferDTO':
          return EnrichedMappingsOfferDTO.fromJson(value);
        case 'EnrichedModelDTO':
          return EnrichedModelDTO.fromJson(value);
        case 'EnrichedModelsDTO':
          return EnrichedModelsDTO.fromJson(value);
        case 'EnrichedOrderBoxLayoutDTO':
          return EnrichedOrderBoxLayoutDTO.fromJson(value);
        case 'ExtensionShipmentDTO':
          return ExtensionShipmentDTO.fromJson(value);
        case 'FeedContentDTO':
          return FeedContentDTO.fromJson(value);
        case 'FeedContentErrorDTO':
          return FeedContentErrorDTO.fromJson(value);
        case 'FeedContentErrorType':
          return FeedContentErrorTypeTypeTransformer().decode(value);
        case 'FeedDTO':
          return FeedDTO.fromJson(value);
        case 'FeedDownloadDTO':
          return FeedDownloadDTO.fromJson(value);
        case 'FeedDownloadErrorDTO':
          return FeedDownloadErrorDTO.fromJson(value);
        case 'FeedDownloadErrorType':
          return FeedDownloadErrorTypeTypeTransformer().decode(value);
        case 'FeedIndexLogsErrorDTO':
          return FeedIndexLogsErrorDTO.fromJson(value);
        case 'FeedIndexLogsErrorType':
          return FeedIndexLogsErrorTypeTypeTransformer().decode(value);
        case 'FeedIndexLogsFeedDTO':
          return FeedIndexLogsFeedDTO.fromJson(value);
        case 'FeedIndexLogsIndexType':
          return FeedIndexLogsIndexTypeTypeTransformer().decode(value);
        case 'FeedIndexLogsOffersDTO':
          return FeedIndexLogsOffersDTO.fromJson(value);
        case 'FeedIndexLogsRecordDTO':
          return FeedIndexLogsRecordDTO.fromJson(value);
        case 'FeedIndexLogsResultDTO':
          return FeedIndexLogsResultDTO.fromJson(value);
        case 'FeedIndexLogsStatusType':
          return FeedIndexLogsStatusTypeTypeTransformer().decode(value);
        case 'FeedParameterDTO':
          return FeedParameterDTO.fromJson(value);
        case 'FeedPlacementDTO':
          return FeedPlacementDTO.fromJson(value);
        case 'FeedPublicationDTO':
          return FeedPublicationDTO.fromJson(value);
        case 'FeedPublicationFullDTO':
          return FeedPublicationFullDTO.fromJson(value);
        case 'FeedPublicationPriceAndStockUpdateDTO':
          return FeedPublicationPriceAndStockUpdateDTO.fromJson(value);
        case 'FeedStatusType':
          return FeedStatusTypeTypeTransformer().decode(value);
        case 'FeedbackAuthorDTO':
          return FeedbackAuthorDTO.fromJson(value);
        case 'FeedbackCommentAuthorDTO':
          return FeedbackCommentAuthorDTO.fromJson(value);
        case 'FeedbackCommentAuthorType':
          return FeedbackCommentAuthorTypeTypeTransformer().decode(value);
        case 'FeedbackCommentDTO':
          return FeedbackCommentDTO.fromJson(value);
        case 'FeedbackDTO':
          return FeedbackDTO.fromJson(value);
        case 'FeedbackDeliveryType':
          return FeedbackDeliveryTypeTypeTransformer().decode(value);
        case 'FeedbackFactorDTO':
          return FeedbackFactorDTO.fromJson(value);
        case 'FeedbackGradesDTO':
          return FeedbackGradesDTO.fromJson(value);
        case 'FeedbackListDTO':
          return FeedbackListDTO.fromJson(value);
        case 'FeedbackOrderDTO':
          return FeedbackOrderDTO.fromJson(value);
        case 'FeedbackReactionStatusType':
          return FeedbackReactionStatusTypeTypeTransformer().decode(value);
        case 'FeedbackShopDTO':
          return FeedbackShopDTO.fromJson(value);
        case 'FeedbackStateType':
          return FeedbackStateTypeTypeTransformer().decode(value);
        case 'FieldStateType':
          return FieldStateTypeTypeTransformer().decode(value);
        case 'FlippingPagerDTO':
          return FlippingPagerDTO.fromJson(value);
        case 'ForwardScrollingPagerDTO':
          return ForwardScrollingPagerDTO.fromJson(value);
        case 'FulfillmentWarehouseDTO':
          return FulfillmentWarehouseDTO.fromJson(value);
        case 'FulfillmentWarehousesDTO':
          return FulfillmentWarehousesDTO.fromJson(value);
        case 'FullOutletDTO':
          return FullOutletDTO.fromJson(value);
        case 'FullOutletLicenseDTO':
          return FullOutletLicenseDTO.fromJson(value);
        case 'GenerateBoostConsolidatedRequest':
          return GenerateBoostConsolidatedRequest.fromJson(value);
        case 'GenerateCompetitorsPositionReportRequest':
          return GenerateCompetitorsPositionReportRequest.fromJson(value);
        case 'GenerateGoodsFeedbackRequest':
          return GenerateGoodsFeedbackRequest.fromJson(value);
        case 'GenerateGoodsMovementReportRequest':
          return GenerateGoodsMovementReportRequest.fromJson(value);
        case 'GenerateGoodsRealizationReportRequest':
          return GenerateGoodsRealizationReportRequest.fromJson(value);
        case 'GenerateGoodsTurnoverRequest':
          return GenerateGoodsTurnoverRequest.fromJson(value);
        case 'GenerateMassOrderLabelsRequest':
          return GenerateMassOrderLabelsRequest.fromJson(value);
        case 'GeneratePricesReportRequest':
          return GeneratePricesReportRequest.fromJson(value);
        case 'GenerateReportDTO':
          return GenerateReportDTO.fromJson(value);
        case 'GenerateReportResponse':
          return GenerateReportResponse.fromJson(value);
        case 'GenerateShelfsStatisticsRequest':
          return GenerateShelfsStatisticsRequest.fromJson(value);
        case 'GenerateShipmentListDocumentReportRequest':
          return GenerateShipmentListDocumentReportRequest.fromJson(value);
        case 'GenerateShowsSalesReportRequest':
          return GenerateShowsSalesReportRequest.fromJson(value);
        case 'GenerateStocksOnWarehousesReportRequest':
          return GenerateStocksOnWarehousesReportRequest.fromJson(value);
        case 'GenerateUnitedMarketplaceServicesReportRequest':
          return GenerateUnitedMarketplaceServicesReportRequest.fromJson(value);
        case 'GenerateUnitedNettingReportRequest':
          return GenerateUnitedNettingReportRequest.fromJson(value);
        case 'GenerateUnitedOrdersRequest':
          return GenerateUnitedOrdersRequest.fromJson(value);
        case 'GetAllOffersResponse':
          return GetAllOffersResponse.fromJson(value);
        case 'GetBidsInfoRequest':
          return GetBidsInfoRequest.fromJson(value);
        case 'GetBidsInfoResponse':
          return GetBidsInfoResponse.fromJson(value);
        case 'GetBidsInfoResponseDTO':
          return GetBidsInfoResponseDTO.fromJson(value);
        case 'GetBidsRecommendationsRequest':
          return GetBidsRecommendationsRequest.fromJson(value);
        case 'GetBidsRecommendationsResponse':
          return GetBidsRecommendationsResponse.fromJson(value);
        case 'GetBidsRecommendationsResponseDTO':
          return GetBidsRecommendationsResponseDTO.fromJson(value);
        case 'GetBusinessBuyerInfoResponse':
          return GetBusinessBuyerInfoResponse.fromJson(value);
        case 'GetBusinessDocumentsInfoResponse':
          return GetBusinessDocumentsInfoResponse.fromJson(value);
        case 'GetBusinessSettingsInfoDTO':
          return GetBusinessSettingsInfoDTO.fromJson(value);
        case 'GetBusinessSettingsResponse':
          return GetBusinessSettingsResponse.fromJson(value);
        case 'GetCampaignLoginsResponse':
          return GetCampaignLoginsResponse.fromJson(value);
        case 'GetCampaignOfferDTO':
          return GetCampaignOfferDTO.fromJson(value);
        case 'GetCampaignOffersRequest':
          return GetCampaignOffersRequest.fromJson(value);
        case 'GetCampaignOffersResponse':
          return GetCampaignOffersResponse.fromJson(value);
        case 'GetCampaignOffersResultDTO':
          return GetCampaignOffersResultDTO.fromJson(value);
        case 'GetCampaignRegionResponse':
          return GetCampaignRegionResponse.fromJson(value);
        case 'GetCampaignResponse':
          return GetCampaignResponse.fromJson(value);
        case 'GetCampaignSettingsResponse':
          return GetCampaignSettingsResponse.fromJson(value);
        case 'GetCampaignsResponse':
          return GetCampaignsResponse.fromJson(value);
        case 'GetCategoriesMaxSaleQuantumDTO':
          return GetCategoriesMaxSaleQuantumDTO.fromJson(value);
        case 'GetCategoriesMaxSaleQuantumRequest':
          return GetCategoriesMaxSaleQuantumRequest.fromJson(value);
        case 'GetCategoriesMaxSaleQuantumResponse':
          return GetCategoriesMaxSaleQuantumResponse.fromJson(value);
        case 'GetCategoriesRequest':
          return GetCategoriesRequest.fromJson(value);
        case 'GetCategoriesResponse':
          return GetCategoriesResponse.fromJson(value);
        case 'GetCategoryContentParametersResponse':
          return GetCategoryContentParametersResponse.fromJson(value);
        case 'GetChatHistoryRequest':
          return GetChatHistoryRequest.fromJson(value);
        case 'GetChatHistoryResponse':
          return GetChatHistoryResponse.fromJson(value);
        case 'GetChatInfoDTO':
          return GetChatInfoDTO.fromJson(value);
        case 'GetChatsInfoDTO':
          return GetChatsInfoDTO.fromJson(value);
        case 'GetChatsRequest':
          return GetChatsRequest.fromJson(value);
        case 'GetChatsResponse':
          return GetChatsResponse.fromJson(value);
        case 'GetDeliveryServicesResponse':
          return GetDeliveryServicesResponse.fromJson(value);
        case 'GetFeedIndexLogsResponse':
          return GetFeedIndexLogsResponse.fromJson(value);
        case 'GetFeedResponse':
          return GetFeedResponse.fromJson(value);
        case 'GetFeedbackListResponse':
          return GetFeedbackListResponse.fromJson(value);
        case 'GetFeedsResponse':
          return GetFeedsResponse.fromJson(value);
        case 'GetFulfillmentWarehousesResponse':
          return GetFulfillmentWarehousesResponse.fromJson(value);
        case 'GetGoodsFeedbackCommentsRequest':
          return GetGoodsFeedbackCommentsRequest.fromJson(value);
        case 'GetGoodsFeedbackCommentsResponse':
          return GetGoodsFeedbackCommentsResponse.fromJson(value);
        case 'GetGoodsFeedbackRequest':
          return GetGoodsFeedbackRequest.fromJson(value);
        case 'GetGoodsFeedbackResponse':
          return GetGoodsFeedbackResponse.fromJson(value);
        case 'GetGoodsStatsRequest':
          return GetGoodsStatsRequest.fromJson(value);
        case 'GetGoodsStatsResponse':
          return GetGoodsStatsResponse.fromJson(value);
        case 'GetHiddenOffersResponse':
          return GetHiddenOffersResponse.fromJson(value);
        case 'GetHiddenOffersResultDTO':
          return GetHiddenOffersResultDTO.fromJson(value);
        case 'GetMappingDTO':
          return GetMappingDTO.fromJson(value);
        case 'GetModelsOffersResponse':
          return GetModelsOffersResponse.fromJson(value);
        case 'GetModelsRequest':
          return GetModelsRequest.fromJson(value);
        case 'GetModelsResponse':
          return GetModelsResponse.fromJson(value);
        case 'GetOfferCardsContentStatusRequest':
          return GetOfferCardsContentStatusRequest.fromJson(value);
        case 'GetOfferCardsContentStatusResponse':
          return GetOfferCardsContentStatusResponse.fromJson(value);
        case 'GetOfferDTO':
          return GetOfferDTO.fromJson(value);
        case 'GetOfferMappingDTO':
          return GetOfferMappingDTO.fromJson(value);
        case 'GetOfferMappingEntriesResponse':
          return GetOfferMappingEntriesResponse.fromJson(value);
        case 'GetOfferMappingsRequest':
          return GetOfferMappingsRequest.fromJson(value);
        case 'GetOfferMappingsResponse':
          return GetOfferMappingsResponse.fromJson(value);
        case 'GetOfferMappingsResultDTO':
          return GetOfferMappingsResultDTO.fromJson(value);
        case 'GetOfferRecommendationsRequest':
          return GetOfferRecommendationsRequest.fromJson(value);
        case 'GetOfferRecommendationsResponse':
          return GetOfferRecommendationsResponse.fromJson(value);
        case 'GetOffersResponse':
          return GetOffersResponse.fromJson(value);
        case 'GetOrderBuyerInfoResponse':
          return GetOrderBuyerInfoResponse.fromJson(value);
        case 'GetOrderLabelsDataResponse':
          return GetOrderLabelsDataResponse.fromJson(value);
        case 'GetOrderResponse':
          return GetOrderResponse.fromJson(value);
        case 'GetOrdersResponse':
          return GetOrdersResponse.fromJson(value);
        case 'GetOrdersStatsRequest':
          return GetOrdersStatsRequest.fromJson(value);
        case 'GetOrdersStatsResponse':
          return GetOrdersStatsResponse.fromJson(value);
        case 'GetOutletLicensesResponse':
          return GetOutletLicensesResponse.fromJson(value);
        case 'GetOutletResponse':
          return GetOutletResponse.fromJson(value);
        case 'GetOutletsResponse':
          return GetOutletsResponse.fromJson(value);
        case 'GetPriceDTO':
          return GetPriceDTO.fromJson(value);
        case 'GetPriceWithDiscountDTO':
          return GetPriceWithDiscountDTO.fromJson(value);
        case 'GetPriceWithVatDTO':
          return GetPriceWithVatDTO.fromJson(value);
        case 'GetPricesByOfferIdsRequest':
          return GetPricesByOfferIdsRequest.fromJson(value);
        case 'GetPricesByOfferIdsResponse':
          return GetPricesByOfferIdsResponse.fromJson(value);
        case 'GetPricesResponse':
          return GetPricesResponse.fromJson(value);
        case 'GetPromoAssortmentInfoDTO':
          return GetPromoAssortmentInfoDTO.fromJson(value);
        case 'GetPromoBestsellerInfoDTO':
          return GetPromoBestsellerInfoDTO.fromJson(value);
        case 'GetPromoConstraintsDTO':
          return GetPromoConstraintsDTO.fromJson(value);
        case 'GetPromoDTO':
          return GetPromoDTO.fromJson(value);
        case 'GetPromoMechanicsInfoDTO':
          return GetPromoMechanicsInfoDTO.fromJson(value);
        case 'GetPromoOfferDTO':
          return GetPromoOfferDTO.fromJson(value);
        case 'GetPromoOffersRequest':
          return GetPromoOffersRequest.fromJson(value);
        case 'GetPromoOffersResponse':
          return GetPromoOffersResponse.fromJson(value);
        case 'GetPromoOffersResultDTO':
          return GetPromoOffersResultDTO.fromJson(value);
        case 'GetPromoPromocodeInfoDTO':
          return GetPromoPromocodeInfoDTO.fromJson(value);
        case 'GetPromosRequest':
          return GetPromosRequest.fromJson(value);
        case 'GetPromosResponse':
          return GetPromosResponse.fromJson(value);
        case 'GetPromosResultDTO':
          return GetPromosResultDTO.fromJson(value);
        case 'GetQualityRatingDetailsResponse':
          return GetQualityRatingDetailsResponse.fromJson(value);
        case 'GetQualityRatingRequest':
          return GetQualityRatingRequest.fromJson(value);
        case 'GetQualityRatingResponse':
          return GetQualityRatingResponse.fromJson(value);
        case 'GetQuarantineOffersRequest':
          return GetQuarantineOffersRequest.fromJson(value);
        case 'GetQuarantineOffersResponse':
          return GetQuarantineOffersResponse.fromJson(value);
        case 'GetQuarantineOffersResultDTO':
          return GetQuarantineOffersResultDTO.fromJson(value);
        case 'GetRegionWithChildrenResponse':
          return GetRegionWithChildrenResponse.fromJson(value);
        case 'GetRegionsResponse':
          return GetRegionsResponse.fromJson(value);
        case 'GetReportInfoResponse':
          return GetReportInfoResponse.fromJson(value);
        case 'GetReturnResponse':
          return GetReturnResponse.fromJson(value);
        case 'GetReturnsResponse':
          return GetReturnsResponse.fromJson(value);
        case 'GetShipmentOrdersInfoResponse':
          return GetShipmentOrdersInfoResponse.fromJson(value);
        case 'GetShipmentResponse':
          return GetShipmentResponse.fromJson(value);
        case 'GetSuggestedOfferMappingEntriesRequest':
          return GetSuggestedOfferMappingEntriesRequest.fromJson(value);
        case 'GetSuggestedOfferMappingEntriesResponse':
          return GetSuggestedOfferMappingEntriesResponse.fromJson(value);
        case 'GetSuggestedOfferMappingsRequest':
          return GetSuggestedOfferMappingsRequest.fromJson(value);
        case 'GetSuggestedOfferMappingsResponse':
          return GetSuggestedOfferMappingsResponse.fromJson(value);
        case 'GetSuggestedOfferMappingsResultDTO':
          return GetSuggestedOfferMappingsResultDTO.fromJson(value);
        case 'GetWarehouseStocksDTO':
          return GetWarehouseStocksDTO.fromJson(value);
        case 'GetWarehouseStocksRequest':
          return GetWarehouseStocksRequest.fromJson(value);
        case 'GetWarehouseStocksResponse':
          return GetWarehouseStocksResponse.fromJson(value);
        case 'GetWarehousesResponse':
          return GetWarehousesResponse.fromJson(value);
        case 'GoodsFeedbackCommentAuthorDTO':
          return GoodsFeedbackCommentAuthorDTO.fromJson(value);
        case 'GoodsFeedbackCommentAuthorType':
          return GoodsFeedbackCommentAuthorTypeTypeTransformer().decode(value);
        case 'GoodsFeedbackCommentDTO':
          return GoodsFeedbackCommentDTO.fromJson(value);
        case 'GoodsFeedbackCommentListDTO':
          return GoodsFeedbackCommentListDTO.fromJson(value);
        case 'GoodsFeedbackCommentStatusType':
          return GoodsFeedbackCommentStatusTypeTypeTransformer().decode(value);
        case 'GoodsFeedbackDTO':
          return GoodsFeedbackDTO.fromJson(value);
        case 'GoodsFeedbackDescriptionDTO':
          return GoodsFeedbackDescriptionDTO.fromJson(value);
        case 'GoodsFeedbackIdentifiersDTO':
          return GoodsFeedbackIdentifiersDTO.fromJson(value);
        case 'GoodsFeedbackListDTO':
          return GoodsFeedbackListDTO.fromJson(value);
        case 'GoodsFeedbackMediaDTO':
          return GoodsFeedbackMediaDTO.fromJson(value);
        case 'GoodsFeedbackStatisticsDTO':
          return GoodsFeedbackStatisticsDTO.fromJson(value);
        case 'GoodsStatsDTO':
          return GoodsStatsDTO.fromJson(value);
        case 'GoodsStatsGoodsDTO':
          return GoodsStatsGoodsDTO.fromJson(value);
        case 'GoodsStatsWarehouseDTO':
          return GoodsStatsWarehouseDTO.fromJson(value);
        case 'GoodsStatsWeightDimensionsDTO':
          return GoodsStatsWeightDimensionsDTO.fromJson(value);
        case 'GpsDTO':
          return GpsDTO.fromJson(value);
        case 'HiddenOfferDTO':
          return HiddenOfferDTO.fromJson(value);
        case 'LanguageType':
          return LanguageTypeTypeTransformer().decode(value);
        case 'LicenseCheckStatusType':
          return LicenseCheckStatusTypeTypeTransformer().decode(value);
        case 'LicenseType':
          return LicenseTypeTypeTransformer().decode(value);
        case 'LogisticPickupPointDTO':
          return LogisticPickupPointDTO.fromJson(value);
        case 'LogisticPointType':
          return LogisticPointTypeTypeTransformer().decode(value);
        case 'MappingsOfferDTO':
          return MappingsOfferDTO.fromJson(value);
        case 'MappingsOfferInfoDTO':
          return MappingsOfferInfoDTO.fromJson(value);
        case 'MaxSaleQuantumDTO':
          return MaxSaleQuantumDTO.fromJson(value);
        case 'MechanicsType':
          return MechanicsTypeTypeTransformer().decode(value);
        case 'ModelDTO':
          return ModelDTO.fromJson(value);
        case 'ModelOfferDTO':
          return ModelOfferDTO.fromJson(value);
        case 'ModelPriceDTO':
          return ModelPriceDTO.fromJson(value);
        case 'ModelsDTO':
          return ModelsDTO.fromJson(value);
        case 'OfferAvailabilityStatusType':
          return OfferAvailabilityStatusTypeTypeTransformer().decode(value);
        case 'OfferCampaignStatusDTO':
          return OfferCampaignStatusDTO.fromJson(value);
        case 'OfferCampaignStatusType':
          return OfferCampaignStatusTypeTypeTransformer().decode(value);
        case 'OfferCardDTO':
          return OfferCardDTO.fromJson(value);
        case 'OfferCardRecommendationDTO':
          return OfferCardRecommendationDTO.fromJson(value);
        case 'OfferCardRecommendationType':
          return OfferCardRecommendationTypeTypeTransformer().decode(value);
        case 'OfferCardStatusType':
          return OfferCardStatusTypeTypeTransformer().decode(value);
        case 'OfferCardsContentStatusDTO':
          return OfferCardsContentStatusDTO.fromJson(value);
        case 'OfferConditionDTO':
          return OfferConditionDTO.fromJson(value);
        case 'OfferConditionQualityType':
          return OfferConditionQualityTypeTypeTransformer().decode(value);
        case 'OfferConditionType':
          return OfferConditionTypeTypeTransformer().decode(value);
        case 'OfferContentDTO':
          return OfferContentDTO.fromJson(value);
        case 'OfferContentErrorDTO':
          return OfferContentErrorDTO.fromJson(value);
        case 'OfferContentErrorType':
          return OfferContentErrorTypeTypeTransformer().decode(value);
        case 'OfferDTO':
          return OfferDTO.fromJson(value);
        case 'OfferErrorDTO':
          return OfferErrorDTO.fromJson(value);
        case 'OfferForRecommendationDTO':
          return OfferForRecommendationDTO.fromJson(value);
        case 'OfferManualDTO':
          return OfferManualDTO.fromJson(value);
        case 'OfferMappingDTO':
          return OfferMappingDTO.fromJson(value);
        case 'OfferMappingEntriesDTO':
          return OfferMappingEntriesDTO.fromJson(value);
        case 'OfferMappingEntryDTO':
          return OfferMappingEntryDTO.fromJson(value);
        case 'OfferMappingErrorDTO':
          return OfferMappingErrorDTO.fromJson(value);
        case 'OfferMappingErrorType':
          return OfferMappingErrorTypeTypeTransformer().decode(value);
        case 'OfferMappingInfoDTO':
          return OfferMappingInfoDTO.fromJson(value);
        case 'OfferMappingKindType':
          return OfferMappingKindTypeTypeTransformer().decode(value);
        case 'OfferMappingSuggestionsListDTO':
          return OfferMappingSuggestionsListDTO.fromJson(value);
        case 'OfferParamDTO':
          return OfferParamDTO.fromJson(value);
        case 'OfferPriceByOfferIdsListResponseDTO':
          return OfferPriceByOfferIdsListResponseDTO.fromJson(value);
        case 'OfferPriceByOfferIdsResponseDTO':
          return OfferPriceByOfferIdsResponseDTO.fromJson(value);
        case 'OfferPriceDTO':
          return OfferPriceDTO.fromJson(value);
        case 'OfferPriceListResponseDTO':
          return OfferPriceListResponseDTO.fromJson(value);
        case 'OfferPriceResponseDTO':
          return OfferPriceResponseDTO.fromJson(value);
        case 'OfferProcessingNoteDTO':
          return OfferProcessingNoteDTO.fromJson(value);
        case 'OfferProcessingNoteType':
          return OfferProcessingNoteTypeTypeTransformer().decode(value);
        case 'OfferProcessingStateDTO':
          return OfferProcessingStateDTO.fromJson(value);
        case 'OfferProcessingStatusType':
          return OfferProcessingStatusTypeTypeTransformer().decode(value);
        case 'OfferRecommendationDTO':
          return OfferRecommendationDTO.fromJson(value);
        case 'OfferRecommendationInfoDTO':
          return OfferRecommendationInfoDTO.fromJson(value);
        case 'OfferRecommendationsResultDTO':
          return OfferRecommendationsResultDTO.fromJson(value);
        case 'OfferSellingProgramDTO':
          return OfferSellingProgramDTO.fromJson(value);
        case 'OfferSellingProgramStatusType':
          return OfferSellingProgramStatusTypeTypeTransformer().decode(value);
        case 'OfferType':
          return OfferTypeTypeTransformer().decode(value);
        case 'OfferWeightDimensionsDTO':
          return OfferWeightDimensionsDTO.fromJson(value);
        case 'OffersDTO':
          return OffersDTO.fromJson(value);
        case 'OptionValuesLimitedDTO':
          return OptionValuesLimitedDTO.fromJson(value);
        case 'OrderBoxLayoutDTO':
          return OrderBoxLayoutDTO.fromJson(value);
        case 'OrderBoxLayoutItemDTO':
          return OrderBoxLayoutItemDTO.fromJson(value);
        case 'OrderBoxLayoutPartialCountDTO':
          return OrderBoxLayoutPartialCountDTO.fromJson(value);
        case 'OrderBoxesLayoutDTO':
          return OrderBoxesLayoutDTO.fromJson(value);
        case 'OrderBusinessBuyerDTO':
          return OrderBusinessBuyerDTO.fromJson(value);
        case 'OrderBusinessDocumentsDTO':
          return OrderBusinessDocumentsDTO.fromJson(value);
        case 'OrderBuyerBasicInfoDTO':
          return OrderBuyerBasicInfoDTO.fromJson(value);
        case 'OrderBuyerDTO':
          return OrderBuyerDTO.fromJson(value);
        case 'OrderBuyerInfoDTO':
          return OrderBuyerInfoDTO.fromJson(value);
        case 'OrderBuyerType':
          return OrderBuyerTypeTypeTransformer().decode(value);
        case 'OrderCancellationReasonType':
          return OrderCancellationReasonTypeTypeTransformer().decode(value);
        case 'OrderCourierDTO':
          return OrderCourierDTO.fromJson(value);
        case 'OrderDTO':
          return OrderDTO.fromJson(value);
        case 'OrderDeliveryAddressDTO':
          return OrderDeliveryAddressDTO.fromJson(value);
        case 'OrderDeliveryDTO':
          return OrderDeliveryDTO.fromJson(value);
        case 'OrderDeliveryDateDTO':
          return OrderDeliveryDateDTO.fromJson(value);
        case 'OrderDeliveryDateReasonType':
          return OrderDeliveryDateReasonTypeTypeTransformer().decode(value);
        case 'OrderDeliveryDatesDTO':
          return OrderDeliveryDatesDTO.fromJson(value);
        case 'OrderDeliveryDispatchType':
          return OrderDeliveryDispatchTypeTypeTransformer().decode(value);
        case 'OrderDeliveryEacType':
          return OrderDeliveryEacTypeTypeTransformer().decode(value);
        case 'OrderDeliveryPartnerType':
          return OrderDeliveryPartnerTypeTypeTransformer().decode(value);
        case 'OrderDeliveryType':
          return OrderDeliveryTypeTypeTransformer().decode(value);
        case 'OrderDigitalItemDTO':
          return OrderDigitalItemDTO.fromJson(value);
        case 'OrderDocumentStatusType':
          return OrderDocumentStatusTypeTypeTransformer().decode(value);
        case 'OrderItemDTO':
          return OrderItemDTO.fromJson(value);
        case 'OrderItemDetailDTO':
          return OrderItemDetailDTO.fromJson(value);
        case 'OrderItemInstanceDTO':
          return OrderItemInstanceDTO.fromJson(value);
        case 'OrderItemInstanceModificationDTO':
          return OrderItemInstanceModificationDTO.fromJson(value);
        case 'OrderItemInstanceType':
          return OrderItemInstanceTypeTypeTransformer().decode(value);
        case 'OrderItemModificationDTO':
          return OrderItemModificationDTO.fromJson(value);
        case 'OrderItemPromoDTO':
          return OrderItemPromoDTO.fromJson(value);
        case 'OrderItemStatusType':
          return OrderItemStatusTypeTypeTransformer().decode(value);
        case 'OrderItemSubsidyDTO':
          return OrderItemSubsidyDTO.fromJson(value);
        case 'OrderItemSubsidyType':
          return OrderItemSubsidyTypeTypeTransformer().decode(value);
        case 'OrderItemsModificationRequestReasonType':
          return OrderItemsModificationRequestReasonTypeTypeTransformer().decode(value);
        case 'OrderItemsModificationResultDTO':
          return OrderItemsModificationResultDTO.fromJson(value);
        case 'OrderLabelDTO':
          return OrderLabelDTO.fromJson(value);
        case 'OrderLiftType':
          return OrderLiftTypeTypeTransformer().decode(value);
        case 'OrderParcelBoxDTO':
          return OrderParcelBoxDTO.fromJson(value);
        case 'OrderPaymentMethodType':
          return OrderPaymentMethodTypeTypeTransformer().decode(value);
        case 'OrderPaymentType':
          return OrderPaymentTypeTypeTransformer().decode(value);
        case 'OrderPromoType':
          return OrderPromoTypeTypeTransformer().decode(value);
        case 'OrderShipmentDTO':
          return OrderShipmentDTO.fromJson(value);
        case 'OrderStateDTO':
          return OrderStateDTO.fromJson(value);
        case 'OrderStatsStatusType':
          return OrderStatsStatusTypeTypeTransformer().decode(value);
        case 'OrderStatusChangeDTO':
          return OrderStatusChangeDTO.fromJson(value);
        case 'OrderStatusChangeDeliveryDTO':
          return OrderStatusChangeDeliveryDTO.fromJson(value);
        case 'OrderStatusChangeDeliveryDatesDTO':
          return OrderStatusChangeDeliveryDatesDTO.fromJson(value);
        case 'OrderStatusType':
          return OrderStatusTypeTypeTransformer().decode(value);
        case 'OrderSubsidyDTO':
          return OrderSubsidyDTO.fromJson(value);
        case 'OrderSubsidyType':
          return OrderSubsidyTypeTypeTransformer().decode(value);
        case 'OrderSubstatusType':
          return OrderSubstatusTypeTypeTransformer().decode(value);
        case 'OrderTaxSystemType':
          return OrderTaxSystemTypeTypeTransformer().decode(value);
        case 'OrderTrackDTO':
          return OrderTrackDTO.fromJson(value);
        case 'OrderUpdateStatusType':
          return OrderUpdateStatusTypeTypeTransformer().decode(value);
        case 'OrderVatType':
          return OrderVatTypeTypeTransformer().decode(value);
        case 'OrdersShipmentInfoDTO':
          return OrdersShipmentInfoDTO.fromJson(value);
        case 'OrdersStatsCommissionDTO':
          return OrdersStatsCommissionDTO.fromJson(value);
        case 'OrdersStatsCommissionType':
          return OrdersStatsCommissionTypeTypeTransformer().decode(value);
        case 'OrdersStatsDTO':
          return OrdersStatsDTO.fromJson(value);
        case 'OrdersStatsDeliveryRegionDTO':
          return OrdersStatsDeliveryRegionDTO.fromJson(value);
        case 'OrdersStatsDetailsDTO':
          return OrdersStatsDetailsDTO.fromJson(value);
        case 'OrdersStatsItemDTO':
          return OrdersStatsItemDTO.fromJson(value);
        case 'OrdersStatsItemStatusType':
          return OrdersStatsItemStatusTypeTypeTransformer().decode(value);
        case 'OrdersStatsOrderDTO':
          return OrdersStatsOrderDTO.fromJson(value);
        case 'OrdersStatsOrderPaymentType':
          return OrdersStatsOrderPaymentTypeTypeTransformer().decode(value);
        case 'OrdersStatsPaymentDTO':
          return OrdersStatsPaymentDTO.fromJson(value);
        case 'OrdersStatsPaymentOrderDTO':
          return OrdersStatsPaymentOrderDTO.fromJson(value);
        case 'OrdersStatsPaymentSourceType':
          return OrdersStatsPaymentSourceTypeTypeTransformer().decode(value);
        case 'OrdersStatsPaymentType':
          return OrdersStatsPaymentTypeTypeTransformer().decode(value);
        case 'OrdersStatsPriceDTO':
          return OrdersStatsPriceDTO.fromJson(value);
        case 'OrdersStatsPriceType':
          return OrdersStatsPriceTypeTypeTransformer().decode(value);
        case 'OrdersStatsStockType':
          return OrdersStatsStockTypeTypeTransformer().decode(value);
        case 'OrdersStatsWarehouseDTO':
          return OrdersStatsWarehouseDTO.fromJson(value);
        case 'OutletAddressDTO':
          return OutletAddressDTO.fromJson(value);
        case 'OutletDTO':
          return OutletDTO.fromJson(value);
        case 'OutletDeliveryRuleDTO':
          return OutletDeliveryRuleDTO.fromJson(value);
        case 'OutletLicenseDTO':
          return OutletLicenseDTO.fromJson(value);
        case 'OutletLicensesResponseDTO':
          return OutletLicensesResponseDTO.fromJson(value);
        case 'OutletResponseDTO':
          return OutletResponseDTO.fromJson(value);
        case 'OutletStatusType':
          return OutletStatusTypeTypeTransformer().decode(value);
        case 'OutletType':
          return OutletTypeTypeTransformer().decode(value);
        case 'OutletVisibilityType':
          return OutletVisibilityTypeTypeTransformer().decode(value);
        case 'OutletWorkingScheduleDTO':
          return OutletWorkingScheduleDTO.fromJson(value);
        case 'OutletWorkingScheduleItemDTO':
          return OutletWorkingScheduleItemDTO.fromJson(value);
        case 'PageFormatType':
          return PageFormatTypeTypeTransformer().decode(value);
        case 'PagedReturnsDTO':
          return PagedReturnsDTO.fromJson(value);
        case 'PalletsCountDTO':
          return PalletsCountDTO.fromJson(value);
        case 'ParameterType':
          return ParameterTypeTypeTransformer().decode(value);
        case 'ParameterValueConstraintsDTO':
          return ParameterValueConstraintsDTO.fromJson(value);
        case 'ParameterValueDTO':
          return ParameterValueDTO.fromJson(value);
        case 'ParameterValueOptionDTO':
          return ParameterValueOptionDTO.fromJson(value);
        case 'ParcelBoxDTO':
          return ParcelBoxDTO.fromJson(value);
        case 'ParcelBoxLabelDTO':
          return ParcelBoxLabelDTO.fromJson(value);
        case 'ParcelDTO':
          return ParcelDTO.fromJson(value);
        case 'PartnerShipmentWarehouseDTO':
          return PartnerShipmentWarehouseDTO.fromJson(value);
        case 'PaymentFrequencyType':
          return PaymentFrequencyTypeTypeTransformer().decode(value);
        case 'PickupAddressDTO':
          return PickupAddressDTO.fromJson(value);
        case 'PlacementType':
          return PlacementTypeTypeTransformer().decode(value);
        case 'PriceCompetitivenessThresholdsDTO':
          return PriceCompetitivenessThresholdsDTO.fromJson(value);
        case 'PriceCompetitivenessType':
          return PriceCompetitivenessTypeTypeTransformer().decode(value);
        case 'PriceDTO':
          return PriceDTO.fromJson(value);
        case 'PriceQuarantineVerdictDTO':
          return PriceQuarantineVerdictDTO.fromJson(value);
        case 'PriceQuarantineVerdictParamNameType':
          return PriceQuarantineVerdictParamNameTypeTypeTransformer().decode(value);
        case 'PriceQuarantineVerdictParameterDTO':
          return PriceQuarantineVerdictParameterDTO.fromJson(value);
        case 'PriceQuarantineVerdictType':
          return PriceQuarantineVerdictTypeTypeTransformer().decode(value);
        case 'PriceRecommendationItemDTO':
          return PriceRecommendationItemDTO.fromJson(value);
        case 'PriceSuggestDTO':
          return PriceSuggestDTO.fromJson(value);
        case 'PriceSuggestOfferDTO':
          return PriceSuggestOfferDTO.fromJson(value);
        case 'PriceSuggestType':
          return PriceSuggestTypeTypeTransformer().decode(value);
        case 'PromoOfferAutoParticipatingDetailsDTO':
          return PromoOfferAutoParticipatingDetailsDTO.fromJson(value);
        case 'PromoOfferDiscountParamsDTO':
          return PromoOfferDiscountParamsDTO.fromJson(value);
        case 'PromoOfferParamsDTO':
          return PromoOfferParamsDTO.fromJson(value);
        case 'PromoOfferParticipationStatusFilterType':
          return PromoOfferParticipationStatusFilterTypeTypeTransformer().decode(value);
        case 'PromoOfferParticipationStatusType':
          return PromoOfferParticipationStatusTypeTypeTransformer().decode(value);
        case 'PromoOfferPromocodeParamsDTO':
          return PromoOfferPromocodeParamsDTO.fromJson(value);
        case 'PromoOfferUpdateWarningCodeType':
          return PromoOfferUpdateWarningCodeTypeTypeTransformer().decode(value);
        case 'PromoOfferUpdateWarningDTO':
          return PromoOfferUpdateWarningDTO.fromJson(value);
        case 'PromoParticipationType':
          return PromoParticipationTypeTypeTransformer().decode(value);
        case 'PromoPeriodDTO':
          return PromoPeriodDTO.fromJson(value);
        case 'ProvideOrderDigitalCodesRequest':
          return ProvideOrderDigitalCodesRequest.fromJson(value);
        case 'ProvideOrderItemIdentifiersRequest':
          return ProvideOrderItemIdentifiersRequest.fromJson(value);
        case 'ProvideOrderItemIdentifiersResponse':
          return ProvideOrderItemIdentifiersResponse.fromJson(value);
        case 'PutSkuBidsRequest':
          return PutSkuBidsRequest.fromJson(value);
        case 'QualityRatingAffectedOrderDTO':
          return QualityRatingAffectedOrderDTO.fromJson(value);
        case 'QualityRatingComponentDTO':
          return QualityRatingComponentDTO.fromJson(value);
        case 'QualityRatingComponentType':
          return QualityRatingComponentTypeTypeTransformer().decode(value);
        case 'QualityRatingDTO':
          return QualityRatingDTO.fromJson(value);
        case 'QualityRatingDetailsDTO':
          return QualityRatingDetailsDTO.fromJson(value);
        case 'QuantumDTO':
          return QuantumDTO.fromJson(value);
        case 'QuarantineOfferDTO':
          return QuarantineOfferDTO.fromJson(value);
        case 'RecipientType':
          return RecipientTypeTypeTransformer().decode(value);
        case 'RefundStatusType':
          return RefundStatusTypeTypeTransformer().decode(value);
        case 'RegionDTO':
          return RegionDTO.fromJson(value);
        case 'RegionType':
          return RegionTypeTypeTransformer().decode(value);
        case 'RegionalModelInfoDTO':
          return RegionalModelInfoDTO.fromJson(value);
        case 'RejectedPromoOfferDeleteDTO':
          return RejectedPromoOfferDeleteDTO.fromJson(value);
        case 'RejectedPromoOfferDeleteReasonType':
          return RejectedPromoOfferDeleteReasonTypeTypeTransformer().decode(value);
        case 'RejectedPromoOfferUpdateDTO':
          return RejectedPromoOfferUpdateDTO.fromJson(value);
        case 'RejectedPromoOfferUpdateReasonType':
          return RejectedPromoOfferUpdateReasonTypeTypeTransformer().decode(value);
        case 'ReportFormatType':
          return ReportFormatTypeTypeTransformer().decode(value);
        case 'ReportInfoDTO':
          return ReportInfoDTO.fromJson(value);
        case 'ReportStatusType':
          return ReportStatusTypeTypeTransformer().decode(value);
        case 'ReportSubStatusType':
          return ReportSubStatusTypeTypeTransformer().decode(value);
        case 'ReturnDTO':
          return ReturnDTO.fromJson(value);
        case 'ReturnDecisionDTO':
          return ReturnDecisionDTO.fromJson(value);
        case 'ReturnDecisionReasonType':
          return ReturnDecisionReasonTypeTypeTransformer().decode(value);
        case 'ReturnDecisionSubreasonType':
          return ReturnDecisionSubreasonTypeTypeTransformer().decode(value);
        case 'ReturnDecisionType':
          return ReturnDecisionTypeTypeTransformer().decode(value);
        case 'ReturnInstanceDTO':
          return ReturnInstanceDTO.fromJson(value);
        case 'ReturnInstanceStatusType':
          return ReturnInstanceStatusTypeTypeTransformer().decode(value);
        case 'ReturnInstanceStockType':
          return ReturnInstanceStockTypeTypeTransformer().decode(value);
        case 'ReturnItemDTO':
          return ReturnItemDTO.fromJson(value);
        case 'ReturnRequestDecisionType':
          return ReturnRequestDecisionTypeTypeTransformer().decode(value);
        case 'ReturnShipmentStatusType':
          return ReturnShipmentStatusTypeTypeTransformer().decode(value);
        case 'ReturnType':
          return ReturnTypeTypeTransformer().decode(value);
        case 'ScrollingPagerDTO':
          return ScrollingPagerDTO.fromJson(value);
        case 'SearchModelsResponse':
          return SearchModelsResponse.fromJson(value);
        case 'SearchShipmentsRequest':
          return SearchShipmentsRequest.fromJson(value);
        case 'SearchShipmentsResponse':
          return SearchShipmentsResponse.fromJson(value);
        case 'SearchShipmentsResponseDTO':
          return SearchShipmentsResponseDTO.fromJson(value);
        case 'SellingProgramType':
          return SellingProgramTypeTypeTransformer().decode(value);
        case 'SendMessageToChatRequest':
          return SendMessageToChatRequest.fromJson(value);
        case 'SetFeedParamsRequest':
          return SetFeedParamsRequest.fromJson(value);
        case 'SetOrderBoxLayoutRequest':
          return SetOrderBoxLayoutRequest.fromJson(value);
        case 'SetOrderBoxLayoutResponse':
          return SetOrderBoxLayoutResponse.fromJson(value);
        case 'SetOrderDeliveryDateRequest':
          return SetOrderDeliveryDateRequest.fromJson(value);
        case 'SetOrderDeliveryTrackCodeRequest':
          return SetOrderDeliveryTrackCodeRequest.fromJson(value);
        case 'SetOrderShipmentBoxesRequest':
          return SetOrderShipmentBoxesRequest.fromJson(value);
        case 'SetOrderShipmentBoxesResponse':
          return SetOrderShipmentBoxesResponse.fromJson(value);
        case 'SetReturnDecisionRequest':
          return SetReturnDecisionRequest.fromJson(value);
        case 'SetShipmentPalletsCountRequest':
          return SetShipmentPalletsCountRequest.fromJson(value);
        case 'ShelfsStatisticsAttributionType':
          return ShelfsStatisticsAttributionTypeTypeTransformer().decode(value);
        case 'ShipmentActionType':
          return ShipmentActionTypeTypeTransformer().decode(value);
        case 'ShipmentBoxesDTO':
          return ShipmentBoxesDTO.fromJson(value);
        case 'ShipmentDTO':
          return ShipmentDTO.fromJson(value);
        case 'ShipmentInfoDTO':
          return ShipmentInfoDTO.fromJson(value);
        case 'ShipmentPalletLabelPageFormatType':
          return ShipmentPalletLabelPageFormatTypeTypeTransformer().decode(value);
        case 'ShipmentStatusChangeDTO':
          return ShipmentStatusChangeDTO.fromJson(value);
        case 'ShipmentStatusType':
          return ShipmentStatusTypeTypeTransformer().decode(value);
        case 'ShipmentType':
          return ShipmentTypeTypeTransformer().decode(value);
        case 'ShowsSalesGroupingType':
          return ShowsSalesGroupingTypeTypeTransformer().decode(value);
        case 'SkipGoodsFeedbackReactionRequest':
          return SkipGoodsFeedbackReactionRequest.fromJson(value);
        case 'SkuBidItemDTO':
          return SkuBidItemDTO.fromJson(value);
        case 'SkuBidRecommendationItemDTO':
          return SkuBidRecommendationItemDTO.fromJson(value);
        case 'SortOrderType':
          return SortOrderTypeTypeTransformer().decode(value);
        case 'SuggestOfferPriceDTO':
          return SuggestOfferPriceDTO.fromJson(value);
        case 'SuggestPricesRequest':
          return SuggestPricesRequest.fromJson(value);
        case 'SuggestPricesResponse':
          return SuggestPricesResponse.fromJson(value);
        case 'SuggestPricesResultDTO':
          return SuggestPricesResultDTO.fromJson(value);
        case 'SuggestedOfferDTO':
          return SuggestedOfferDTO.fromJson(value);
        case 'SuggestedOfferMappingDTO':
          return SuggestedOfferMappingDTO.fromJson(value);
        case 'TariffDTO':
          return TariffDTO.fromJson(value);
        case 'TariffParameterDTO':
          return TariffParameterDTO.fromJson(value);
        case 'TariffType':
          return TariffTypeTypeTransformer().decode(value);
        case 'TimePeriodDTO':
          return TimePeriodDTO.fromJson(value);
        case 'TimeUnitType':
          return TimeUnitTypeTypeTransformer().decode(value);
        case 'TrackDTO':
          return TrackDTO.fromJson(value);
        case 'TransferOrdersFromShipmentRequest':
          return TransferOrdersFromShipmentRequest.fromJson(value);
        case 'TurnoverDTO':
          return TurnoverDTO.fromJson(value);
        case 'TurnoverType':
          return TurnoverTypeTypeTransformer().decode(value);
        case 'UnitDTO':
          return UnitDTO.fromJson(value);
        case 'UpdateBusinessOfferPriceDTO':
          return UpdateBusinessOfferPriceDTO.fromJson(value);
        case 'UpdateBusinessPricesRequest':
          return UpdateBusinessPricesRequest.fromJson(value);
        case 'UpdateCampaignOfferDTO':
          return UpdateCampaignOfferDTO.fromJson(value);
        case 'UpdateCampaignOffersRequest':
          return UpdateCampaignOffersRequest.fromJson(value);
        case 'UpdateGoodsFeedbackCommentDTO':
          return UpdateGoodsFeedbackCommentDTO.fromJson(value);
        case 'UpdateGoodsFeedbackCommentRequest':
          return UpdateGoodsFeedbackCommentRequest.fromJson(value);
        case 'UpdateGoodsFeedbackCommentResponse':
          return UpdateGoodsFeedbackCommentResponse.fromJson(value);
        case 'UpdateMappingDTO':
          return UpdateMappingDTO.fromJson(value);
        case 'UpdateMappingsOfferDTO':
          return UpdateMappingsOfferDTO.fromJson(value);
        case 'UpdateOfferContentRequest':
          return UpdateOfferContentRequest.fromJson(value);
        case 'UpdateOfferContentResponse':
          return UpdateOfferContentResponse.fromJson(value);
        case 'UpdateOfferContentResultDTO':
          return UpdateOfferContentResultDTO.fromJson(value);
        case 'UpdateOfferDTO':
          return UpdateOfferDTO.fromJson(value);
        case 'UpdateOfferMappingDTO':
          return UpdateOfferMappingDTO.fromJson(value);
        case 'UpdateOfferMappingEntryDTO':
          return UpdateOfferMappingEntryDTO.fromJson(value);
        case 'UpdateOfferMappingEntryRequest':
          return UpdateOfferMappingEntryRequest.fromJson(value);
        case 'UpdateOfferMappingResultDTO':
          return UpdateOfferMappingResultDTO.fromJson(value);
        case 'UpdateOfferMappingsRequest':
          return UpdateOfferMappingsRequest.fromJson(value);
        case 'UpdateOfferMappingsResponse':
          return UpdateOfferMappingsResponse.fromJson(value);
        case 'UpdateOrderItemRequest':
          return UpdateOrderItemRequest.fromJson(value);
        case 'UpdateOrderStatusDTO':
          return UpdateOrderStatusDTO.fromJson(value);
        case 'UpdateOrderStatusRequest':
          return UpdateOrderStatusRequest.fromJson(value);
        case 'UpdateOrderStatusResponse':
          return UpdateOrderStatusResponse.fromJson(value);
        case 'UpdateOrderStatusesDTO':
          return UpdateOrderStatusesDTO.fromJson(value);
        case 'UpdateOrderStatusesRequest':
          return UpdateOrderStatusesRequest.fromJson(value);
        case 'UpdateOrderStatusesResponse':
          return UpdateOrderStatusesResponse.fromJson(value);
        case 'UpdateOrderStorageLimitRequest':
          return UpdateOrderStorageLimitRequest.fromJson(value);
        case 'UpdateOutletLicenseRequest':
          return UpdateOutletLicenseRequest.fromJson(value);
        case 'UpdatePriceWithDiscountDTO':
          return UpdatePriceWithDiscountDTO.fromJson(value);
        case 'UpdatePricesRequest':
          return UpdatePricesRequest.fromJson(value);
        case 'UpdatePromoOfferDTO':
          return UpdatePromoOfferDTO.fromJson(value);
        case 'UpdatePromoOfferDiscountParamsDTO':
          return UpdatePromoOfferDiscountParamsDTO.fromJson(value);
        case 'UpdatePromoOfferParamsDTO':
          return UpdatePromoOfferParamsDTO.fromJson(value);
        case 'UpdatePromoOffersRequest':
          return UpdatePromoOffersRequest.fromJson(value);
        case 'UpdatePromoOffersResponse':
          return UpdatePromoOffersResponse.fromJson(value);
        case 'UpdatePromoOffersResultDTO':
          return UpdatePromoOffersResultDTO.fromJson(value);
        case 'UpdateStockDTO':
          return UpdateStockDTO.fromJson(value);
        case 'UpdateStockItemDTO':
          return UpdateStockItemDTO.fromJson(value);
        case 'UpdateStocksRequest':
          return UpdateStocksRequest.fromJson(value);
        case 'UpdateTimeDTO':
          return UpdateTimeDTO.fromJson(value);
        case 'ValueRestrictionDTO':
          return ValueRestrictionDTO.fromJson(value);
        case 'VerifyOrderEacRequest':
          return VerifyOrderEacRequest.fromJson(value);
        case 'VerifyOrderEacResponse':
          return VerifyOrderEacResponse.fromJson(value);
        case 'WarehouseAddressDTO':
          return WarehouseAddressDTO.fromJson(value);
        case 'WarehouseDTO':
          return WarehouseDTO.fromJson(value);
        case 'WarehouseGroupDTO':
          return WarehouseGroupDTO.fromJson(value);
        case 'WarehouseOfferDTO':
          return WarehouseOfferDTO.fromJson(value);
        case 'WarehouseOffersDTO':
          return WarehouseOffersDTO.fromJson(value);
        case 'WarehouseStockDTO':
          return WarehouseStockDTO.fromJson(value);
        case 'WarehouseStockType':
          return WarehouseStockTypeTypeTransformer().decode(value);
        case 'WarehousesDTO':
          return WarehousesDTO.fromJson(value);
        case 'WarningPromoOfferUpdateDTO':
          return WarningPromoOfferUpdateDTO.fromJson(value);
        default:
          dynamic match;
          if (value is List && (match = _regList.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toList(growable: growable);
          }
          if (value is Set && (match = _regSet.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toSet();
          }
          if (value is Map && (match = _regMap.firstMatch(targetType)?.group(1)) != null) {
            return Map<String, dynamic>.fromIterables(
              value.keys.cast<String>(),
              value.values.map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,)),
            );
          }
      }
    } on Exception catch (error, trace) {
      throw ApiException.withInner(HttpStatus.internalServerError, 'Exception during deserialization.', error, trace,);
    }
    throw ApiException(HttpStatus.internalServerError, 'Could not find a suitable class for deserialization',);
  }
}

/// Primarily intended for use in an isolate.
class DeserializationMessage {
  const DeserializationMessage({
    required this.json,
    required this.targetType,
    this.growable = false,
  });

  /// The JSON value to deserialize.
  final String json;

  /// Target type to deserialize to.
  final String targetType;

  /// Whether to make deserialized lists or maps growable.
  final bool growable;
}

/// Primarily intended for use in an isolate.
Future<dynamic> decodeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : json.decode(message.json);
}

/// Primarily intended for use in an isolate.
Future<dynamic> deserializeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : ApiClient.fromJson(
        json.decode(message.json),
        targetType,
        growable: message.growable,
      );
}

/// Primarily intended for use in an isolate.
Future<String> serializeAsync(Object? value) async => value == null ? '' : json.encode(value);

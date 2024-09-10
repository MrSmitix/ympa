//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetGoodsFeedbackRequest {
  /// Returns a new [GetGoodsFeedbackRequest] instance.
  GetGoodsFeedbackRequest({
    this.dateTimeFrom,
    this.dateTimeTo,
    this.reactionStatus,
    this.ratingValues = const {},
    this.modelIds = const {},
    this.paid,
  });

  /// Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTimeFrom;

  /// Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTimeTo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FeedbackReactionStatusType? reactionStatus;

  /// Оценка товара.
  Set<int>? ratingValues;

  /// Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  Set<int>? modelIds;

  /// Фильтр отзывов за баллы Плюса.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? paid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetGoodsFeedbackRequest &&
    other.dateTimeFrom == dateTimeFrom &&
    other.dateTimeTo == dateTimeTo &&
    other.reactionStatus == reactionStatus &&
    _deepEquality.equals(other.ratingValues, ratingValues) &&
    _deepEquality.equals(other.modelIds, modelIds) &&
    other.paid == paid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateTimeFrom == null ? 0 : dateTimeFrom!.hashCode) +
    (dateTimeTo == null ? 0 : dateTimeTo!.hashCode) +
    (reactionStatus == null ? 0 : reactionStatus!.hashCode) +
    (ratingValues == null ? 0 : ratingValues!.hashCode) +
    (modelIds == null ? 0 : modelIds!.hashCode) +
    (paid == null ? 0 : paid!.hashCode);

  @override
  String toString() => 'GetGoodsFeedbackRequest[dateTimeFrom=$dateTimeFrom, dateTimeTo=$dateTimeTo, reactionStatus=$reactionStatus, ratingValues=$ratingValues, modelIds=$modelIds, paid=$paid]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dateTimeFrom != null) {
      json[r'dateTimeFrom'] = this.dateTimeFrom!.toUtc().toIso8601String();
    } else {
      json[r'dateTimeFrom'] = null;
    }
    if (this.dateTimeTo != null) {
      json[r'dateTimeTo'] = this.dateTimeTo!.toUtc().toIso8601String();
    } else {
      json[r'dateTimeTo'] = null;
    }
    if (this.reactionStatus != null) {
      json[r'reactionStatus'] = this.reactionStatus;
    } else {
      json[r'reactionStatus'] = null;
    }
    if (this.ratingValues != null) {
      json[r'ratingValues'] = this.ratingValues!.toList(growable: false);
    } else {
      json[r'ratingValues'] = null;
    }
    if (this.modelIds != null) {
      json[r'modelIds'] = this.modelIds!.toList(growable: false);
    } else {
      json[r'modelIds'] = null;
    }
    if (this.paid != null) {
      json[r'paid'] = this.paid;
    } else {
      json[r'paid'] = null;
    }
    return json;
  }

  /// Returns a new [GetGoodsFeedbackRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetGoodsFeedbackRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetGoodsFeedbackRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetGoodsFeedbackRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetGoodsFeedbackRequest(
        dateTimeFrom: mapDateTime(json, r'dateTimeFrom', r''),
        dateTimeTo: mapDateTime(json, r'dateTimeTo', r''),
        reactionStatus: FeedbackReactionStatusType.fromJson(json[r'reactionStatus']),
        ratingValues: json[r'ratingValues'] is Iterable
            ? (json[r'ratingValues'] as Iterable).cast<int>().toSet()
            : const {},
        modelIds: json[r'modelIds'] is Iterable
            ? (json[r'modelIds'] as Iterable).cast<int>().toSet()
            : const {},
        paid: mapValueOfType<bool>(json, r'paid'),
      );
    }
    return null;
  }

  static List<GetGoodsFeedbackRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetGoodsFeedbackRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetGoodsFeedbackRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetGoodsFeedbackRequest> mapFromJson(dynamic json) {
    final map = <String, GetGoodsFeedbackRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetGoodsFeedbackRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetGoodsFeedbackRequest-objects as value to a dart map
  static Map<String, List<GetGoodsFeedbackRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetGoodsFeedbackRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetGoodsFeedbackRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


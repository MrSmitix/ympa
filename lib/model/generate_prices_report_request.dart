//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GeneratePricesReportRequest {
  /// Returns a new [GeneratePricesReportRequest] instance.
  GeneratePricesReportRequest({
    this.businessId,
    this.campaignId,
    this.categoryIds = const [],
    this.creationDateFrom,
    this.creationDateTo,
  });

  /// Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? businessId;

  /// Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? campaignId;

  /// Фильтр по категориям на Маркете.
  List<int>? categoryIds;

  /// Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? creationDateFrom;

  /// Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? creationDateTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GeneratePricesReportRequest &&
    other.businessId == businessId &&
    other.campaignId == campaignId &&
    _deepEquality.equals(other.categoryIds, categoryIds) &&
    other.creationDateFrom == creationDateFrom &&
    other.creationDateTo == creationDateTo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId == null ? 0 : businessId!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode) +
    (creationDateFrom == null ? 0 : creationDateFrom!.hashCode) +
    (creationDateTo == null ? 0 : creationDateTo!.hashCode);

  @override
  String toString() => 'GeneratePricesReportRequest[businessId=$businessId, campaignId=$campaignId, categoryIds=$categoryIds, creationDateFrom=$creationDateFrom, creationDateTo=$creationDateTo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.businessId != null) {
      json[r'businessId'] = this.businessId;
    } else {
      json[r'businessId'] = null;
    }
    if (this.campaignId != null) {
      json[r'campaignId'] = this.campaignId;
    } else {
      json[r'campaignId'] = null;
    }
    if (this.categoryIds != null) {
      json[r'categoryIds'] = this.categoryIds;
    } else {
      json[r'categoryIds'] = null;
    }
    if (this.creationDateFrom != null) {
      json[r'creationDateFrom'] = _dateFormatter.format(this.creationDateFrom!.toUtc());
    } else {
      json[r'creationDateFrom'] = null;
    }
    if (this.creationDateTo != null) {
      json[r'creationDateTo'] = _dateFormatter.format(this.creationDateTo!.toUtc());
    } else {
      json[r'creationDateTo'] = null;
    }
    return json;
  }

  /// Returns a new [GeneratePricesReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GeneratePricesReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GeneratePricesReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GeneratePricesReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GeneratePricesReportRequest(
        businessId: mapValueOfType<int>(json, r'businessId'),
        campaignId: mapValueOfType<int>(json, r'campaignId'),
        categoryIds: json[r'categoryIds'] is Iterable
            ? (json[r'categoryIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        creationDateFrom: mapDateTime(json, r'creationDateFrom', r''),
        creationDateTo: mapDateTime(json, r'creationDateTo', r''),
      );
    }
    return null;
  }

  static List<GeneratePricesReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GeneratePricesReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GeneratePricesReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GeneratePricesReportRequest> mapFromJson(dynamic json) {
    final map = <String, GeneratePricesReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GeneratePricesReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GeneratePricesReportRequest-objects as value to a dart map
  static Map<String, List<GeneratePricesReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GeneratePricesReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GeneratePricesReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


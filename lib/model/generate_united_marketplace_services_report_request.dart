//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateUnitedMarketplaceServicesReportRequest {
  /// Returns a new [GenerateUnitedMarketplaceServicesReportRequest] instance.
  GenerateUnitedMarketplaceServicesReportRequest({
    required this.businessId,
    this.dateTimeFrom,
    this.dateTimeTo,
    this.dateFrom,
    this.dateTo,
    this.yearFrom,
    this.monthFrom,
    this.yearTo,
    this.monthTo,
    this.placementPrograms = const [],
    this.inns = const [],
    this.campaignIds = const [],
  });

  /// Идентификатор бизнеса.
  int businessId;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTimeFrom;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTimeTo;

  /// Начало периода, включительно.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateFrom;

  /// Конец периода, включительно. Максимальный период — 1 год.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTo;

  /// Начальный год формирования акта.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? yearFrom;

  /// Начальный номер месяца формирования акта.
  ///
  /// Minimum value: 1
  /// Maximum value: 12
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? monthFrom;

  /// Конечный год формирования акта.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? yearTo;

  /// Конечный номер месяца формирования акта.
  ///
  /// Minimum value: 1
  /// Maximum value: 12
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? monthTo;

  /// Список моделей, которые нужны в отчете. 
  List<PlacementType>? placementPrograms;

  /// Список ИНН, которые нужны в отчете.
  List<String>? inns;

  /// Список магазинов, которые нужны в отчете.
  List<int>? campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateUnitedMarketplaceServicesReportRequest &&
    other.businessId == businessId &&
    other.dateTimeFrom == dateTimeFrom &&
    other.dateTimeTo == dateTimeTo &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.yearFrom == yearFrom &&
    other.monthFrom == monthFrom &&
    other.yearTo == yearTo &&
    other.monthTo == monthTo &&
    _deepEquality.equals(other.placementPrograms, placementPrograms) &&
    _deepEquality.equals(other.inns, inns) &&
    _deepEquality.equals(other.campaignIds, campaignIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId.hashCode) +
    (dateTimeFrom == null ? 0 : dateTimeFrom!.hashCode) +
    (dateTimeTo == null ? 0 : dateTimeTo!.hashCode) +
    (dateFrom == null ? 0 : dateFrom!.hashCode) +
    (dateTo == null ? 0 : dateTo!.hashCode) +
    (yearFrom == null ? 0 : yearFrom!.hashCode) +
    (monthFrom == null ? 0 : monthFrom!.hashCode) +
    (yearTo == null ? 0 : yearTo!.hashCode) +
    (monthTo == null ? 0 : monthTo!.hashCode) +
    (placementPrograms == null ? 0 : placementPrograms!.hashCode) +
    (inns == null ? 0 : inns!.hashCode) +
    (campaignIds == null ? 0 : campaignIds!.hashCode);

  @override
  String toString() => 'GenerateUnitedMarketplaceServicesReportRequest[businessId=$businessId, dateTimeFrom=$dateTimeFrom, dateTimeTo=$dateTimeTo, dateFrom=$dateFrom, dateTo=$dateTo, yearFrom=$yearFrom, monthFrom=$monthFrom, yearTo=$yearTo, monthTo=$monthTo, placementPrograms=$placementPrograms, inns=$inns, campaignIds=$campaignIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'businessId'] = this.businessId;
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
    if (this.dateFrom != null) {
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom!.toUtc());
    } else {
      json[r'dateFrom'] = null;
    }
    if (this.dateTo != null) {
      json[r'dateTo'] = _dateFormatter.format(this.dateTo!.toUtc());
    } else {
      json[r'dateTo'] = null;
    }
    if (this.yearFrom != null) {
      json[r'yearFrom'] = this.yearFrom;
    } else {
      json[r'yearFrom'] = null;
    }
    if (this.monthFrom != null) {
      json[r'monthFrom'] = this.monthFrom;
    } else {
      json[r'monthFrom'] = null;
    }
    if (this.yearTo != null) {
      json[r'yearTo'] = this.yearTo;
    } else {
      json[r'yearTo'] = null;
    }
    if (this.monthTo != null) {
      json[r'monthTo'] = this.monthTo;
    } else {
      json[r'monthTo'] = null;
    }
    if (this.placementPrograms != null) {
      json[r'placementPrograms'] = this.placementPrograms;
    } else {
      json[r'placementPrograms'] = null;
    }
    if (this.inns != null) {
      json[r'inns'] = this.inns;
    } else {
      json[r'inns'] = null;
    }
    if (this.campaignIds != null) {
      json[r'campaignIds'] = this.campaignIds;
    } else {
      json[r'campaignIds'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateUnitedMarketplaceServicesReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateUnitedMarketplaceServicesReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateUnitedMarketplaceServicesReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateUnitedMarketplaceServicesReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateUnitedMarketplaceServicesReportRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        dateTimeFrom: mapDateTime(json, r'dateTimeFrom', r''),
        dateTimeTo: mapDateTime(json, r'dateTimeTo', r''),
        dateFrom: mapDateTime(json, r'dateFrom', r''),
        dateTo: mapDateTime(json, r'dateTo', r''),
        yearFrom: mapValueOfType<int>(json, r'yearFrom'),
        monthFrom: mapValueOfType<int>(json, r'monthFrom'),
        yearTo: mapValueOfType<int>(json, r'yearTo'),
        monthTo: mapValueOfType<int>(json, r'monthTo'),
        placementPrograms: PlacementType.listFromJson(json[r'placementPrograms']),
        inns: json[r'inns'] is Iterable
            ? (json[r'inns'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignIds: json[r'campaignIds'] is Iterable
            ? (json[r'campaignIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GenerateUnitedMarketplaceServicesReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateUnitedMarketplaceServicesReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateUnitedMarketplaceServicesReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateUnitedMarketplaceServicesReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateUnitedMarketplaceServicesReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateUnitedMarketplaceServicesReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateUnitedMarketplaceServicesReportRequest-objects as value to a dart map
  static Map<String, List<GenerateUnitedMarketplaceServicesReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateUnitedMarketplaceServicesReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateUnitedMarketplaceServicesReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
  };
}


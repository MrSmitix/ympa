//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateUnitedNettingReportRequest {
  /// Returns a new [GenerateUnitedNettingReportRequest] instance.
  GenerateUnitedNettingReportRequest({
    required this.businessId,
    this.dateTimeFrom,
    this.dateTimeTo,
    this.dateFrom,
    this.dateTo,
    this.bankOrderId,
    this.bankOrderDateTime,
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

  /// Номер платежного поручения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? bankOrderId;

  /// Дата платежного поручения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? bankOrderDateTime;

  /// Список моделей, которые нужны в отчете. 
  List<PlacementType>? placementPrograms;

  /// Список ИНН, которые нужны в отчете.
  List<String>? inns;

  /// Список магазинов, которые нужны в отчете.
  List<int>? campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateUnitedNettingReportRequest &&
    other.businessId == businessId &&
    other.dateTimeFrom == dateTimeFrom &&
    other.dateTimeTo == dateTimeTo &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.bankOrderId == bankOrderId &&
    other.bankOrderDateTime == bankOrderDateTime &&
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
    (bankOrderId == null ? 0 : bankOrderId!.hashCode) +
    (bankOrderDateTime == null ? 0 : bankOrderDateTime!.hashCode) +
    (placementPrograms == null ? 0 : placementPrograms!.hashCode) +
    (inns == null ? 0 : inns!.hashCode) +
    (campaignIds == null ? 0 : campaignIds!.hashCode);

  @override
  String toString() => 'GenerateUnitedNettingReportRequest[businessId=$businessId, dateTimeFrom=$dateTimeFrom, dateTimeTo=$dateTimeTo, dateFrom=$dateFrom, dateTo=$dateTo, bankOrderId=$bankOrderId, bankOrderDateTime=$bankOrderDateTime, placementPrograms=$placementPrograms, inns=$inns, campaignIds=$campaignIds]';

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
    if (this.bankOrderId != null) {
      json[r'bankOrderId'] = this.bankOrderId;
    } else {
      json[r'bankOrderId'] = null;
    }
    if (this.bankOrderDateTime != null) {
      json[r'bankOrderDateTime'] = this.bankOrderDateTime!.toUtc().toIso8601String();
    } else {
      json[r'bankOrderDateTime'] = null;
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

  /// Returns a new [GenerateUnitedNettingReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateUnitedNettingReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateUnitedNettingReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateUnitedNettingReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateUnitedNettingReportRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        dateTimeFrom: mapDateTime(json, r'dateTimeFrom', r''),
        dateTimeTo: mapDateTime(json, r'dateTimeTo', r''),
        dateFrom: mapDateTime(json, r'dateFrom', r''),
        dateTo: mapDateTime(json, r'dateTo', r''),
        bankOrderId: mapValueOfType<int>(json, r'bankOrderId'),
        bankOrderDateTime: mapDateTime(json, r'bankOrderDateTime', r''),
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

  static List<GenerateUnitedNettingReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateUnitedNettingReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateUnitedNettingReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateUnitedNettingReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateUnitedNettingReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateUnitedNettingReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateUnitedNettingReportRequest-objects as value to a dart map
  static Map<String, List<GenerateUnitedNettingReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateUnitedNettingReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateUnitedNettingReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
  };
}


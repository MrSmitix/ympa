//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateCompetitorsPositionReportRequest {
  /// Returns a new [GenerateCompetitorsPositionReportRequest] instance.
  GenerateCompetitorsPositionReportRequest({
    required this.businessId,
    required this.categoryId,
    required this.dateFrom,
    required this.dateTo,
  });

  /// Идентификатор бизнеса.
  int businessId;

  /// Идентификатор категории.
  int categoryId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно.
  DateTime dateTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateCompetitorsPositionReportRequest &&
    other.businessId == businessId &&
    other.categoryId == categoryId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId.hashCode) +
    (categoryId.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode);

  @override
  String toString() => 'GenerateCompetitorsPositionReportRequest[businessId=$businessId, categoryId=$categoryId, dateFrom=$dateFrom, dateTo=$dateTo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'businessId'] = this.businessId;
      json[r'categoryId'] = this.categoryId;
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
    return json;
  }

  /// Returns a new [GenerateCompetitorsPositionReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateCompetitorsPositionReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateCompetitorsPositionReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateCompetitorsPositionReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateCompetitorsPositionReportRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        categoryId: mapValueOfType<int>(json, r'categoryId')!,
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
      );
    }
    return null;
  }

  static List<GenerateCompetitorsPositionReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateCompetitorsPositionReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateCompetitorsPositionReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateCompetitorsPositionReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateCompetitorsPositionReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateCompetitorsPositionReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateCompetitorsPositionReportRequest-objects as value to a dart map
  static Map<String, List<GenerateCompetitorsPositionReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateCompetitorsPositionReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateCompetitorsPositionReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
    'categoryId',
    'dateFrom',
    'dateTo',
  };
}


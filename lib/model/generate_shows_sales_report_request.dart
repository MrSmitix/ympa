//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateShowsSalesReportRequest {
  /// Returns a new [GenerateShowsSalesReportRequest] instance.
  GenerateShowsSalesReportRequest({
    this.businessId,
    this.campaignId,
    required this.dateFrom,
    required this.dateTo,
    required this.grouping,
  });

  /// Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? businessId;

  /// Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? campaignId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно.
  DateTime dateTo;

  ShowsSalesGroupingType grouping;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateShowsSalesReportRequest &&
    other.businessId == businessId &&
    other.campaignId == campaignId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.grouping == grouping;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId == null ? 0 : businessId!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode) +
    (grouping.hashCode);

  @override
  String toString() => 'GenerateShowsSalesReportRequest[businessId=$businessId, campaignId=$campaignId, dateFrom=$dateFrom, dateTo=$dateTo, grouping=$grouping]';

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
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
      json[r'grouping'] = this.grouping;
    return json;
  }

  /// Returns a new [GenerateShowsSalesReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateShowsSalesReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateShowsSalesReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateShowsSalesReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateShowsSalesReportRequest(
        businessId: mapValueOfType<int>(json, r'businessId'),
        campaignId: mapValueOfType<int>(json, r'campaignId'),
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
        grouping: ShowsSalesGroupingType.fromJson(json[r'grouping'])!,
      );
    }
    return null;
  }

  static List<GenerateShowsSalesReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateShowsSalesReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateShowsSalesReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateShowsSalesReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateShowsSalesReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateShowsSalesReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateShowsSalesReportRequest-objects as value to a dart map
  static Map<String, List<GenerateShowsSalesReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateShowsSalesReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateShowsSalesReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'dateFrom',
    'dateTo',
    'grouping',
  };
}


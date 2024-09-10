//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateGoodsRealizationReportRequest {
  /// Returns a new [GenerateGoodsRealizationReportRequest] instance.
  GenerateGoodsRealizationReportRequest({
    required this.campaignId,
    required this.year,
    required this.month,
  });

  /// Идентификатор кампании.
  int campaignId;

  /// Год.
  int year;

  /// Номер месяца.
  ///
  /// Minimum value: 1
  /// Maximum value: 12
  int month;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateGoodsRealizationReportRequest &&
    other.campaignId == campaignId &&
    other.year == year &&
    other.month == month;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (year.hashCode) +
    (month.hashCode);

  @override
  String toString() => 'GenerateGoodsRealizationReportRequest[campaignId=$campaignId, year=$year, month=$month]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
      json[r'year'] = this.year;
      json[r'month'] = this.month;
    return json;
  }

  /// Returns a new [GenerateGoodsRealizationReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateGoodsRealizationReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateGoodsRealizationReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateGoodsRealizationReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateGoodsRealizationReportRequest(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        year: mapValueOfType<int>(json, r'year')!,
        month: mapValueOfType<int>(json, r'month')!,
      );
    }
    return null;
  }

  static List<GenerateGoodsRealizationReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateGoodsRealizationReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateGoodsRealizationReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateGoodsRealizationReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateGoodsRealizationReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateGoodsRealizationReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateGoodsRealizationReportRequest-objects as value to a dart map
  static Map<String, List<GenerateGoodsRealizationReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateGoodsRealizationReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateGoodsRealizationReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
    'year',
    'month',
  };
}


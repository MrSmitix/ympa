//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateShelfsStatisticsRequest {
  /// Returns a new [GenerateShelfsStatisticsRequest] instance.
  GenerateShelfsStatisticsRequest({
    required this.businessId,
    required this.dateFrom,
    required this.dateTo,
    required this.attributionType,
  });

  /// Идентификатор бизнеса.
  int businessId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно.
  DateTime dateTo;

  ShelfsStatisticsAttributionType attributionType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateShelfsStatisticsRequest &&
    other.businessId == businessId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.attributionType == attributionType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode) +
    (attributionType.hashCode);

  @override
  String toString() => 'GenerateShelfsStatisticsRequest[businessId=$businessId, dateFrom=$dateFrom, dateTo=$dateTo, attributionType=$attributionType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'businessId'] = this.businessId;
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
      json[r'attributionType'] = this.attributionType;
    return json;
  }

  /// Returns a new [GenerateShelfsStatisticsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateShelfsStatisticsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateShelfsStatisticsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateShelfsStatisticsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateShelfsStatisticsRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
        attributionType: ShelfsStatisticsAttributionType.fromJson(json[r'attributionType'])!,
      );
    }
    return null;
  }

  static List<GenerateShelfsStatisticsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateShelfsStatisticsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateShelfsStatisticsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateShelfsStatisticsRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateShelfsStatisticsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateShelfsStatisticsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateShelfsStatisticsRequest-objects as value to a dart map
  static Map<String, List<GenerateShelfsStatisticsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateShelfsStatisticsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateShelfsStatisticsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
    'dateFrom',
    'dateTo',
    'attributionType',
  };
}


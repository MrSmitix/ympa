//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateBoostConsolidatedRequest {
  /// Returns a new [GenerateBoostConsolidatedRequest] instance.
  GenerateBoostConsolidatedRequest({
    required this.businessId,
    required this.dateFrom,
    required this.dateTo,
  });

  /// Идентификатор бизнеса.
  int businessId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно.
  DateTime dateTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateBoostConsolidatedRequest &&
    other.businessId == businessId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode);

  @override
  String toString() => 'GenerateBoostConsolidatedRequest[businessId=$businessId, dateFrom=$dateFrom, dateTo=$dateTo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'businessId'] = this.businessId;
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
    return json;
  }

  /// Returns a new [GenerateBoostConsolidatedRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateBoostConsolidatedRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateBoostConsolidatedRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateBoostConsolidatedRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateBoostConsolidatedRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
      );
    }
    return null;
  }

  static List<GenerateBoostConsolidatedRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateBoostConsolidatedRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateBoostConsolidatedRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateBoostConsolidatedRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateBoostConsolidatedRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateBoostConsolidatedRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateBoostConsolidatedRequest-objects as value to a dart map
  static Map<String, List<GenerateBoostConsolidatedRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateBoostConsolidatedRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateBoostConsolidatedRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
    'dateFrom',
    'dateTo',
  };
}


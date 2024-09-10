//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PromoPeriodDTO {
  /// Returns a new [PromoPeriodDTO] instance.
  PromoPeriodDTO({
    required this.dateTimeFrom,
    required this.dateTimeTo,
  });

  /// Дата и время начала акции.
  DateTime dateTimeFrom;

  /// Дата и время окончания акции.
  DateTime dateTimeTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PromoPeriodDTO &&
    other.dateTimeFrom == dateTimeFrom &&
    other.dateTimeTo == dateTimeTo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateTimeFrom.hashCode) +
    (dateTimeTo.hashCode);

  @override
  String toString() => 'PromoPeriodDTO[dateTimeFrom=$dateTimeFrom, dateTimeTo=$dateTimeTo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'dateTimeFrom'] = this.dateTimeFrom.toUtc().toIso8601String();
      json[r'dateTimeTo'] = this.dateTimeTo.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [PromoPeriodDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PromoPeriodDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PromoPeriodDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PromoPeriodDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PromoPeriodDTO(
        dateTimeFrom: mapDateTime(json, r'dateTimeFrom', r'')!,
        dateTimeTo: mapDateTime(json, r'dateTimeTo', r'')!,
      );
    }
    return null;
  }

  static List<PromoPeriodDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoPeriodDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoPeriodDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PromoPeriodDTO> mapFromJson(dynamic json) {
    final map = <String, PromoPeriodDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PromoPeriodDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PromoPeriodDTO-objects as value to a dart map
  static Map<String, List<PromoPeriodDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PromoPeriodDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PromoPeriodDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'dateTimeFrom',
    'dateTimeTo',
  };
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TurnoverDTO {
  /// Returns a new [TurnoverDTO] instance.
  TurnoverDTO({
    required this.turnover,
    this.turnoverDays,
  });

  TurnoverType turnover;

  /// Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? turnoverDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TurnoverDTO &&
    other.turnover == turnover &&
    other.turnoverDays == turnoverDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (turnover.hashCode) +
    (turnoverDays == null ? 0 : turnoverDays!.hashCode);

  @override
  String toString() => 'TurnoverDTO[turnover=$turnover, turnoverDays=$turnoverDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'turnover'] = this.turnover;
    if (this.turnoverDays != null) {
      json[r'turnoverDays'] = this.turnoverDays;
    } else {
      json[r'turnoverDays'] = null;
    }
    return json;
  }

  /// Returns a new [TurnoverDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TurnoverDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TurnoverDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TurnoverDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TurnoverDTO(
        turnover: TurnoverType.fromJson(json[r'turnover'])!,
        turnoverDays: mapValueOfType<double>(json, r'turnoverDays'),
      );
    }
    return null;
  }

  static List<TurnoverDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TurnoverDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TurnoverDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TurnoverDTO> mapFromJson(dynamic json) {
    final map = <String, TurnoverDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TurnoverDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TurnoverDTO-objects as value to a dart map
  static Map<String, List<TurnoverDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TurnoverDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TurnoverDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'turnover',
  };
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromosResultDTO {
  /// Returns a new [GetPromosResultDTO] instance.
  GetPromosResultDTO({
    this.promos = const [],
  });

  /// Акции Маркета.
  List<GetPromoDTO> promos;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromosResultDTO &&
    _deepEquality.equals(other.promos, promos);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (promos.hashCode);

  @override
  String toString() => 'GetPromosResultDTO[promos=$promos]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'promos'] = this.promos;
    return json;
  }

  /// Returns a new [GetPromosResultDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromosResultDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromosResultDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromosResultDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromosResultDTO(
        promos: GetPromoDTO.listFromJson(json[r'promos']),
      );
    }
    return null;
  }

  static List<GetPromosResultDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromosResultDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromosResultDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromosResultDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromosResultDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromosResultDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromosResultDTO-objects as value to a dart map
  static Map<String, List<GetPromosResultDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromosResultDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromosResultDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'promos',
  };
}


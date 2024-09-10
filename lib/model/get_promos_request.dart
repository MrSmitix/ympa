//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromosRequest {
  /// Returns a new [GetPromosRequest] instance.
  GetPromosRequest({
    this.participation,
    this.mechanics,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PromoParticipationType? participation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MechanicsType? mechanics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromosRequest &&
    other.participation == participation &&
    other.mechanics == mechanics;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (participation == null ? 0 : participation!.hashCode) +
    (mechanics == null ? 0 : mechanics!.hashCode);

  @override
  String toString() => 'GetPromosRequest[participation=$participation, mechanics=$mechanics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.participation != null) {
      json[r'participation'] = this.participation;
    } else {
      json[r'participation'] = null;
    }
    if (this.mechanics != null) {
      json[r'mechanics'] = this.mechanics;
    } else {
      json[r'mechanics'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromosRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromosRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromosRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromosRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromosRequest(
        participation: PromoParticipationType.fromJson(json[r'participation']),
        mechanics: MechanicsType.fromJson(json[r'mechanics']),
      );
    }
    return null;
  }

  static List<GetPromosRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromosRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromosRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromosRequest> mapFromJson(dynamic json) {
    final map = <String, GetPromosRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromosRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromosRequest-objects as value to a dart map
  static Map<String, List<GetPromosRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromosRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromosRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


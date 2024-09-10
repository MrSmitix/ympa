//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PriceQuarantineVerdictDTO {
  /// Returns a new [PriceQuarantineVerdictDTO] instance.
  PriceQuarantineVerdictDTO({
    this.type,
    this.params = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PriceQuarantineVerdictType? type;

  /// Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
  List<PriceQuarantineVerdictParameterDTO> params;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PriceQuarantineVerdictDTO &&
    other.type == type &&
    _deepEquality.equals(other.params, params);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (params.hashCode);

  @override
  String toString() => 'PriceQuarantineVerdictDTO[type=$type, params=$params]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
      json[r'params'] = this.params;
    return json;
  }

  /// Returns a new [PriceQuarantineVerdictDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PriceQuarantineVerdictDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PriceQuarantineVerdictDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PriceQuarantineVerdictDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PriceQuarantineVerdictDTO(
        type: PriceQuarantineVerdictType.fromJson(json[r'type']),
        params: PriceQuarantineVerdictParameterDTO.listFromJson(json[r'params']),
      );
    }
    return null;
  }

  static List<PriceQuarantineVerdictDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceQuarantineVerdictDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceQuarantineVerdictDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PriceQuarantineVerdictDTO> mapFromJson(dynamic json) {
    final map = <String, PriceQuarantineVerdictDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PriceQuarantineVerdictDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PriceQuarantineVerdictDTO-objects as value to a dart map
  static Map<String, List<PriceQuarantineVerdictDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PriceQuarantineVerdictDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PriceQuarantineVerdictDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'params',
  };
}


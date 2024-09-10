//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ParameterValueDTO {
  /// Returns a new [ParameterValueDTO] instance.
  ParameterValueDTO({
    required this.parameterId,
    this.unitId,
    this.valueId,
    this.value,
  });

  /// Идентификатор характеристики.
  int parameterId;

  /// Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? unitId;

  /// Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? valueId;

  /// Значение.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ParameterValueDTO &&
    other.parameterId == parameterId &&
    other.unitId == unitId &&
    other.valueId == valueId &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (parameterId.hashCode) +
    (unitId == null ? 0 : unitId!.hashCode) +
    (valueId == null ? 0 : valueId!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'ParameterValueDTO[parameterId=$parameterId, unitId=$unitId, valueId=$valueId, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'parameterId'] = this.parameterId;
    if (this.unitId != null) {
      json[r'unitId'] = this.unitId;
    } else {
      json[r'unitId'] = null;
    }
    if (this.valueId != null) {
      json[r'valueId'] = this.valueId;
    } else {
      json[r'valueId'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [ParameterValueDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ParameterValueDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ParameterValueDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ParameterValueDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ParameterValueDTO(
        parameterId: mapValueOfType<int>(json, r'parameterId')!,
        unitId: mapValueOfType<int>(json, r'unitId'),
        valueId: mapValueOfType<int>(json, r'valueId'),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<ParameterValueDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ParameterValueDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ParameterValueDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ParameterValueDTO> mapFromJson(dynamic json) {
    final map = <String, ParameterValueDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ParameterValueDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ParameterValueDTO-objects as value to a dart map
  static Map<String, List<ParameterValueDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ParameterValueDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ParameterValueDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'parameterId',
  };
}


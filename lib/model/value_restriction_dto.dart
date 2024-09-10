//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ValueRestrictionDTO {
  /// Returns a new [ValueRestrictionDTO] instance.
  ValueRestrictionDTO({
    required this.limitingParameterId,
    this.limitedValues = const [],
  });

  /// Идентификатор ограничивающей характеристики.
  int limitingParameterId;

  /// Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  List<OptionValuesLimitedDTO> limitedValues;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ValueRestrictionDTO &&
    other.limitingParameterId == limitingParameterId &&
    _deepEquality.equals(other.limitedValues, limitedValues);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (limitingParameterId.hashCode) +
    (limitedValues.hashCode);

  @override
  String toString() => 'ValueRestrictionDTO[limitingParameterId=$limitingParameterId, limitedValues=$limitedValues]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'limitingParameterId'] = this.limitingParameterId;
      json[r'limitedValues'] = this.limitedValues;
    return json;
  }

  /// Returns a new [ValueRestrictionDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ValueRestrictionDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ValueRestrictionDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ValueRestrictionDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ValueRestrictionDTO(
        limitingParameterId: mapValueOfType<int>(json, r'limitingParameterId')!,
        limitedValues: OptionValuesLimitedDTO.listFromJson(json[r'limitedValues']),
      );
    }
    return null;
  }

  static List<ValueRestrictionDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ValueRestrictionDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ValueRestrictionDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ValueRestrictionDTO> mapFromJson(dynamic json) {
    final map = <String, ValueRestrictionDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ValueRestrictionDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ValueRestrictionDTO-objects as value to a dart map
  static Map<String, List<ValueRestrictionDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ValueRestrictionDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ValueRestrictionDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'limitingParameterId',
    'limitedValues',
  };
}


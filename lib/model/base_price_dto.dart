//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BasePriceDTO {
  /// Returns a new [BasePriceDTO] instance.
  BasePriceDTO({
    required this.value,
    required this.currencyId,
  });

  /// Значение.
  ///
  /// Minimum value: 0
  num value;

  CurrencyType currencyId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BasePriceDTO &&
    other.value == value &&
    other.currencyId == currencyId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (value.hashCode) +
    (currencyId.hashCode);

  @override
  String toString() => 'BasePriceDTO[value=$value, currencyId=$currencyId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'value'] = this.value;
      json[r'currencyId'] = this.currencyId;
    return json;
  }

  /// Returns a new [BasePriceDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BasePriceDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BasePriceDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BasePriceDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BasePriceDTO(
        value: num.parse('${json[r'value']}'),
        currencyId: CurrencyType.fromJson(json[r'currencyId'])!,
      );
    }
    return null;
  }

  static List<BasePriceDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BasePriceDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BasePriceDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BasePriceDTO> mapFromJson(dynamic json) {
    final map = <String, BasePriceDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BasePriceDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BasePriceDTO-objects as value to a dart map
  static Map<String, List<BasePriceDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BasePriceDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BasePriceDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'value',
    'currencyId',
  };
}


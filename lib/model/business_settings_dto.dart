//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessSettingsDTO {
  /// Returns a new [BusinessSettingsDTO] instance.
  BusinessSettingsDTO({
    this.onlyDefaultPrice,
    this.currency,
  });

  /// Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? onlyDefaultPrice;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CurrencyType? currency;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessSettingsDTO &&
    other.onlyDefaultPrice == onlyDefaultPrice &&
    other.currency == currency;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (onlyDefaultPrice == null ? 0 : onlyDefaultPrice!.hashCode) +
    (currency == null ? 0 : currency!.hashCode);

  @override
  String toString() => 'BusinessSettingsDTO[onlyDefaultPrice=$onlyDefaultPrice, currency=$currency]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.onlyDefaultPrice != null) {
      json[r'onlyDefaultPrice'] = this.onlyDefaultPrice;
    } else {
      json[r'onlyDefaultPrice'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    return json;
  }

  /// Returns a new [BusinessSettingsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessSettingsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BusinessSettingsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BusinessSettingsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BusinessSettingsDTO(
        onlyDefaultPrice: mapValueOfType<bool>(json, r'onlyDefaultPrice'),
        currency: CurrencyType.fromJson(json[r'currency']),
      );
    }
    return null;
  }

  static List<BusinessSettingsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessSettingsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessSettingsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessSettingsDTO> mapFromJson(dynamic json) {
    final map = <String, BusinessSettingsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessSettingsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessSettingsDTO-objects as value to a dart map
  static Map<String, List<BusinessSettingsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessSettingsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessSettingsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


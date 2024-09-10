//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderBusinessBuyerDTO {
  /// Returns a new [OrderBusinessBuyerDTO] instance.
  OrderBusinessBuyerDTO({
    this.inn,
    this.kpp,
    this.organizationName,
    this.organizationJurAddress,
  });

  /// ИНН.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? inn;

  /// КПП.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? kpp;

  /// Наименование юридического лица.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? organizationName;

  /// Юридический адрес.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? organizationJurAddress;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderBusinessBuyerDTO &&
    other.inn == inn &&
    other.kpp == kpp &&
    other.organizationName == organizationName &&
    other.organizationJurAddress == organizationJurAddress;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inn == null ? 0 : inn!.hashCode) +
    (kpp == null ? 0 : kpp!.hashCode) +
    (organizationName == null ? 0 : organizationName!.hashCode) +
    (organizationJurAddress == null ? 0 : organizationJurAddress!.hashCode);

  @override
  String toString() => 'OrderBusinessBuyerDTO[inn=$inn, kpp=$kpp, organizationName=$organizationName, organizationJurAddress=$organizationJurAddress]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.inn != null) {
      json[r'inn'] = this.inn;
    } else {
      json[r'inn'] = null;
    }
    if (this.kpp != null) {
      json[r'kpp'] = this.kpp;
    } else {
      json[r'kpp'] = null;
    }
    if (this.organizationName != null) {
      json[r'organizationName'] = this.organizationName;
    } else {
      json[r'organizationName'] = null;
    }
    if (this.organizationJurAddress != null) {
      json[r'organizationJurAddress'] = this.organizationJurAddress;
    } else {
      json[r'organizationJurAddress'] = null;
    }
    return json;
  }

  /// Returns a new [OrderBusinessBuyerDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderBusinessBuyerDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderBusinessBuyerDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderBusinessBuyerDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderBusinessBuyerDTO(
        inn: mapValueOfType<String>(json, r'inn'),
        kpp: mapValueOfType<String>(json, r'kpp'),
        organizationName: mapValueOfType<String>(json, r'organizationName'),
        organizationJurAddress: mapValueOfType<String>(json, r'organizationJurAddress'),
      );
    }
    return null;
  }

  static List<OrderBusinessBuyerDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderBusinessBuyerDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderBusinessBuyerDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderBusinessBuyerDTO> mapFromJson(dynamic json) {
    final map = <String, OrderBusinessBuyerDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderBusinessBuyerDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderBusinessBuyerDTO-objects as value to a dart map
  static Map<String, List<OrderBusinessBuyerDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderBusinessBuyerDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderBusinessBuyerDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


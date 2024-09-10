//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ReturnInstanceDTO {
  /// Returns a new [ReturnInstanceDTO] instance.
  ReturnInstanceDTO({
    this.stockType,
    this.status,
    this.cis,
    this.imei,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnInstanceStockType? stockType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnInstanceStatusType? status;

  /// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cis;

  /// Международный идентификатор мобильного оборудования.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? imei;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ReturnInstanceDTO &&
    other.stockType == stockType &&
    other.status == status &&
    other.cis == cis &&
    other.imei == imei;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (stockType == null ? 0 : stockType!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (cis == null ? 0 : cis!.hashCode) +
    (imei == null ? 0 : imei!.hashCode);

  @override
  String toString() => 'ReturnInstanceDTO[stockType=$stockType, status=$status, cis=$cis, imei=$imei]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.stockType != null) {
      json[r'stockType'] = this.stockType;
    } else {
      json[r'stockType'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.cis != null) {
      json[r'cis'] = this.cis;
    } else {
      json[r'cis'] = null;
    }
    if (this.imei != null) {
      json[r'imei'] = this.imei;
    } else {
      json[r'imei'] = null;
    }
    return json;
  }

  /// Returns a new [ReturnInstanceDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ReturnInstanceDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ReturnInstanceDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ReturnInstanceDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ReturnInstanceDTO(
        stockType: ReturnInstanceStockType.fromJson(json[r'stockType']),
        status: ReturnInstanceStatusType.fromJson(json[r'status']),
        cis: mapValueOfType<String>(json, r'cis'),
        imei: mapValueOfType<String>(json, r'imei'),
      );
    }
    return null;
  }

  static List<ReturnInstanceDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnInstanceDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnInstanceDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ReturnInstanceDTO> mapFromJson(dynamic json) {
    final map = <String, ReturnInstanceDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ReturnInstanceDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ReturnInstanceDTO-objects as value to a dart map
  static Map<String, List<ReturnInstanceDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ReturnInstanceDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ReturnInstanceDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


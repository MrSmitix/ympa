//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoPromocodeInfoDTO {
  /// Returns a new [GetPromoPromocodeInfoDTO] instance.
  GetPromoPromocodeInfoDTO({
    required this.promocode,
    required this.discount,
  });

  /// Промокод.
  String promocode;

  /// Процент скидки по промокоду.
  int discount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoPromocodeInfoDTO &&
    other.promocode == promocode &&
    other.discount == discount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (promocode.hashCode) +
    (discount.hashCode);

  @override
  String toString() => 'GetPromoPromocodeInfoDTO[promocode=$promocode, discount=$discount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'promocode'] = this.promocode;
      json[r'discount'] = this.discount;
    return json;
  }

  /// Returns a new [GetPromoPromocodeInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoPromocodeInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoPromocodeInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoPromocodeInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoPromocodeInfoDTO(
        promocode: mapValueOfType<String>(json, r'promocode')!,
        discount: mapValueOfType<int>(json, r'discount')!,
      );
    }
    return null;
  }

  static List<GetPromoPromocodeInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoPromocodeInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoPromocodeInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoPromocodeInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoPromocodeInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoPromocodeInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoPromocodeInfoDTO-objects as value to a dart map
  static Map<String, List<GetPromoPromocodeInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoPromocodeInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoPromocodeInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'promocode',
    'discount',
  };
}


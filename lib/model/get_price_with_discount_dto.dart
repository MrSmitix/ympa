//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPriceWithDiscountDTO {
  /// Returns a new [GetPriceWithDiscountDTO] instance.
  GetPriceWithDiscountDTO({
    required this.value,
    required this.currencyId,
    this.discountBase,
    required this.updatedAt,
  });

  /// Значение.
  ///
  /// Minimum value: 0
  num value;

  CurrencyType currencyId;

  /// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? discountBase;

  /// Время последнего обновления.
  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPriceWithDiscountDTO &&
    other.value == value &&
    other.currencyId == currencyId &&
    other.discountBase == discountBase &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (value.hashCode) +
    (currencyId.hashCode) +
    (discountBase == null ? 0 : discountBase!.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'GetPriceWithDiscountDTO[value=$value, currencyId=$currencyId, discountBase=$discountBase, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'value'] = this.value;
      json[r'currencyId'] = this.currencyId;
    if (this.discountBase != null) {
      json[r'discountBase'] = this.discountBase;
    } else {
      json[r'discountBase'] = null;
    }
      json[r'updatedAt'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [GetPriceWithDiscountDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPriceWithDiscountDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPriceWithDiscountDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPriceWithDiscountDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPriceWithDiscountDTO(
        value: num.parse('${json[r'value']}'),
        currencyId: CurrencyType.fromJson(json[r'currencyId'])!,
        discountBase: num.parse('${json[r'discountBase']}'),
        updatedAt: mapDateTime(json, r'updatedAt', r'')!,
      );
    }
    return null;
  }

  static List<GetPriceWithDiscountDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPriceWithDiscountDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPriceWithDiscountDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPriceWithDiscountDTO> mapFromJson(dynamic json) {
    final map = <String, GetPriceWithDiscountDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPriceWithDiscountDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPriceWithDiscountDTO-objects as value to a dart map
  static Map<String, List<GetPriceWithDiscountDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPriceWithDiscountDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPriceWithDiscountDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'value',
    'currencyId',
    'updatedAt',
  };
}


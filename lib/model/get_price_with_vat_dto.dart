//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPriceWithVatDTO {
  /// Returns a new [GetPriceWithVatDTO] instance.
  GetPriceWithVatDTO({
    this.value,
    this.discountBase,
    this.currencyId,
    this.vat,
    required this.updatedAt,
  });

  /// Цена на товар.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? value;

  /// Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? discountBase;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CurrencyType? currencyId;

  /// Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vat;

  /// Время последнего обновления.
  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPriceWithVatDTO &&
    other.value == value &&
    other.discountBase == discountBase &&
    other.currencyId == currencyId &&
    other.vat == vat &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (value == null ? 0 : value!.hashCode) +
    (discountBase == null ? 0 : discountBase!.hashCode) +
    (currencyId == null ? 0 : currencyId!.hashCode) +
    (vat == null ? 0 : vat!.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'GetPriceWithVatDTO[value=$value, discountBase=$discountBase, currencyId=$currencyId, vat=$vat, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.discountBase != null) {
      json[r'discountBase'] = this.discountBase;
    } else {
      json[r'discountBase'] = null;
    }
    if (this.currencyId != null) {
      json[r'currencyId'] = this.currencyId;
    } else {
      json[r'currencyId'] = null;
    }
    if (this.vat != null) {
      json[r'vat'] = this.vat;
    } else {
      json[r'vat'] = null;
    }
      json[r'updatedAt'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [GetPriceWithVatDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPriceWithVatDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPriceWithVatDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPriceWithVatDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPriceWithVatDTO(
        value: num.parse('${json[r'value']}'),
        discountBase: num.parse('${json[r'discountBase']}'),
        currencyId: CurrencyType.fromJson(json[r'currencyId']),
        vat: mapValueOfType<int>(json, r'vat'),
        updatedAt: mapDateTime(json, r'updatedAt', r'')!,
      );
    }
    return null;
  }

  static List<GetPriceWithVatDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPriceWithVatDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPriceWithVatDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPriceWithVatDTO> mapFromJson(dynamic json) {
    final map = <String, GetPriceWithVatDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPriceWithVatDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPriceWithVatDTO-objects as value to a dart map
  static Map<String, List<GetPriceWithVatDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPriceWithVatDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPriceWithVatDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'updatedAt',
  };
}


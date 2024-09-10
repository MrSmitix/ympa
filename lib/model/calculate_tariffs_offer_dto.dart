//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CalculateTariffsOfferDTO {
  /// Returns a new [CalculateTariffsOfferDTO] instance.
  CalculateTariffsOfferDTO({
    required this.categoryId,
    required this.price,
    required this.length,
    required this.width,
    required this.height,
    required this.weight,
    this.quantity = 1,
  });

  /// Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  ///
  /// Minimum value: 0
  int categoryId;

  /// Цена на товар в рублях.
  ///
  /// Minimum value: 0
  num price;

  /// Длина товара в сантиметрах.
  ///
  /// Minimum value: 0
  num length;

  /// Ширина товара в сантиметрах.
  ///
  /// Minimum value: 0
  num width;

  /// Высота товара в сантиметрах.
  ///
  /// Minimum value: 0
  num height;

  /// Вес товара в килограммах.
  ///
  /// Minimum value: 0
  num weight;

  /// Квант продажи — количество единиц товара в одном товарном предложении.
  ///
  /// Minimum value: 1
  int quantity;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CalculateTariffsOfferDTO &&
    other.categoryId == categoryId &&
    other.price == price &&
    other.length == length &&
    other.width == width &&
    other.height == height &&
    other.weight == weight &&
    other.quantity == quantity;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (categoryId.hashCode) +
    (price.hashCode) +
    (length.hashCode) +
    (width.hashCode) +
    (height.hashCode) +
    (weight.hashCode) +
    (quantity.hashCode);

  @override
  String toString() => 'CalculateTariffsOfferDTO[categoryId=$categoryId, price=$price, length=$length, width=$width, height=$height, weight=$weight, quantity=$quantity]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'categoryId'] = this.categoryId;
      json[r'price'] = this.price;
      json[r'length'] = this.length;
      json[r'width'] = this.width;
      json[r'height'] = this.height;
      json[r'weight'] = this.weight;
      json[r'quantity'] = this.quantity;
    return json;
  }

  /// Returns a new [CalculateTariffsOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CalculateTariffsOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CalculateTariffsOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CalculateTariffsOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CalculateTariffsOfferDTO(
        categoryId: mapValueOfType<int>(json, r'categoryId')!,
        price: num.parse('${json[r'price']}'),
        length: num.parse('${json[r'length']}'),
        width: num.parse('${json[r'width']}'),
        height: num.parse('${json[r'height']}'),
        weight: num.parse('${json[r'weight']}'),
        quantity: mapValueOfType<int>(json, r'quantity') ?? 1,
      );
    }
    return null;
  }

  static List<CalculateTariffsOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculateTariffsOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculateTariffsOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CalculateTariffsOfferDTO> mapFromJson(dynamic json) {
    final map = <String, CalculateTariffsOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CalculateTariffsOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CalculateTariffsOfferDTO-objects as value to a dart map
  static Map<String, List<CalculateTariffsOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CalculateTariffsOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CalculateTariffsOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'categoryId',
    'price',
    'length',
    'width',
    'height',
    'weight',
  };
}


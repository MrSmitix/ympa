//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PromoOfferDiscountParamsDTO {
  /// Returns a new [PromoOfferDiscountParamsDTO] instance.
  PromoOfferDiscountParamsDTO({
    this.price,
    this.promoPrice,
    required this.maxPromoPrice,
  });

  /// Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? price;

  /// Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? promoPrice;

  /// Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
  int maxPromoPrice;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PromoOfferDiscountParamsDTO &&
    other.price == price &&
    other.promoPrice == promoPrice &&
    other.maxPromoPrice == maxPromoPrice;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (price == null ? 0 : price!.hashCode) +
    (promoPrice == null ? 0 : promoPrice!.hashCode) +
    (maxPromoPrice.hashCode);

  @override
  String toString() => 'PromoOfferDiscountParamsDTO[price=$price, promoPrice=$promoPrice, maxPromoPrice=$maxPromoPrice]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.promoPrice != null) {
      json[r'promoPrice'] = this.promoPrice;
    } else {
      json[r'promoPrice'] = null;
    }
      json[r'maxPromoPrice'] = this.maxPromoPrice;
    return json;
  }

  /// Returns a new [PromoOfferDiscountParamsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PromoOfferDiscountParamsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PromoOfferDiscountParamsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PromoOfferDiscountParamsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PromoOfferDiscountParamsDTO(
        price: mapValueOfType<int>(json, r'price'),
        promoPrice: mapValueOfType<int>(json, r'promoPrice'),
        maxPromoPrice: mapValueOfType<int>(json, r'maxPromoPrice')!,
      );
    }
    return null;
  }

  static List<PromoOfferDiscountParamsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromoOfferDiscountParamsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromoOfferDiscountParamsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PromoOfferDiscountParamsDTO> mapFromJson(dynamic json) {
    final map = <String, PromoOfferDiscountParamsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PromoOfferDiscountParamsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PromoOfferDiscountParamsDTO-objects as value to a dart map
  static Map<String, List<PromoOfferDiscountParamsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PromoOfferDiscountParamsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PromoOfferDiscountParamsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'maxPromoPrice',
  };
}


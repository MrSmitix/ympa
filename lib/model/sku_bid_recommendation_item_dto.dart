//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SkuBidRecommendationItemDTO {
  /// Returns a new [SkuBidRecommendationItemDTO] instance.
  SkuBidRecommendationItemDTO({
    required this.sku,
    required this.bid,
    this.bidRecommendations = const [],
    this.priceRecommendations = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String sku;

  /// Значение ставки.
  ///
  /// Minimum value: 0
  /// Maximum value: 9999
  int bid;

  /// Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  List<BidRecommendationItemDTO>? bidRecommendations;

  /// Рекомендованные цены.
  List<PriceRecommendationItemDTO>? priceRecommendations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SkuBidRecommendationItemDTO &&
    other.sku == sku &&
    other.bid == bid &&
    _deepEquality.equals(other.bidRecommendations, bidRecommendations) &&
    _deepEquality.equals(other.priceRecommendations, priceRecommendations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (sku.hashCode) +
    (bid.hashCode) +
    (bidRecommendations == null ? 0 : bidRecommendations!.hashCode) +
    (priceRecommendations == null ? 0 : priceRecommendations!.hashCode);

  @override
  String toString() => 'SkuBidRecommendationItemDTO[sku=$sku, bid=$bid, bidRecommendations=$bidRecommendations, priceRecommendations=$priceRecommendations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'sku'] = this.sku;
      json[r'bid'] = this.bid;
    if (this.bidRecommendations != null) {
      json[r'bidRecommendations'] = this.bidRecommendations;
    } else {
      json[r'bidRecommendations'] = null;
    }
    if (this.priceRecommendations != null) {
      json[r'priceRecommendations'] = this.priceRecommendations;
    } else {
      json[r'priceRecommendations'] = null;
    }
    return json;
  }

  /// Returns a new [SkuBidRecommendationItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SkuBidRecommendationItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SkuBidRecommendationItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SkuBidRecommendationItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SkuBidRecommendationItemDTO(
        sku: mapValueOfType<String>(json, r'sku')!,
        bid: mapValueOfType<int>(json, r'bid')!,
        bidRecommendations: BidRecommendationItemDTO.listFromJson(json[r'bidRecommendations']),
        priceRecommendations: PriceRecommendationItemDTO.listFromJson(json[r'priceRecommendations']),
      );
    }
    return null;
  }

  static List<SkuBidRecommendationItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SkuBidRecommendationItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SkuBidRecommendationItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SkuBidRecommendationItemDTO> mapFromJson(dynamic json) {
    final map = <String, SkuBidRecommendationItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SkuBidRecommendationItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SkuBidRecommendationItemDTO-objects as value to a dart map
  static Map<String, List<SkuBidRecommendationItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SkuBidRecommendationItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SkuBidRecommendationItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'sku',
    'bid',
  };
}


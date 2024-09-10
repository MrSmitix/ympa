//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PriceRecommendationItemDTO {
  /// Returns a new [PriceRecommendationItemDTO] instance.
  PriceRecommendationItemDTO({
    required this.campaignId,
    required this.price,
  });

  /// Идентификатор кампании.
  int campaignId;

  /// Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
  ///
  /// Minimum value: 1
  num price;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PriceRecommendationItemDTO &&
    other.campaignId == campaignId &&
    other.price == price;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (price.hashCode);

  @override
  String toString() => 'PriceRecommendationItemDTO[campaignId=$campaignId, price=$price]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
      json[r'price'] = this.price;
    return json;
  }

  /// Returns a new [PriceRecommendationItemDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PriceRecommendationItemDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PriceRecommendationItemDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PriceRecommendationItemDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PriceRecommendationItemDTO(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        price: num.parse('${json[r'price']}'),
      );
    }
    return null;
  }

  static List<PriceRecommendationItemDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PriceRecommendationItemDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PriceRecommendationItemDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PriceRecommendationItemDTO> mapFromJson(dynamic json) {
    final map = <String, PriceRecommendationItemDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PriceRecommendationItemDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PriceRecommendationItemDTO-objects as value to a dart map
  static Map<String, List<PriceRecommendationItemDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PriceRecommendationItemDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PriceRecommendationItemDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
    'price',
  };
}


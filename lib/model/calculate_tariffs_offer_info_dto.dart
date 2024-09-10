//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CalculateTariffsOfferInfoDTO {
  /// Returns a new [CalculateTariffsOfferInfoDTO] instance.
  CalculateTariffsOfferInfoDTO({
    required this.offer,
    this.tariffs = const [],
  });

  CalculateTariffsOfferDTO offer;

  /// Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  List<CalculatedTariffDTO> tariffs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CalculateTariffsOfferInfoDTO &&
    other.offer == offer &&
    _deepEquality.equals(other.tariffs, tariffs);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offer.hashCode) +
    (tariffs.hashCode);

  @override
  String toString() => 'CalculateTariffsOfferInfoDTO[offer=$offer, tariffs=$tariffs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offer'] = this.offer;
      json[r'tariffs'] = this.tariffs;
    return json;
  }

  /// Returns a new [CalculateTariffsOfferInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CalculateTariffsOfferInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CalculateTariffsOfferInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CalculateTariffsOfferInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CalculateTariffsOfferInfoDTO(
        offer: CalculateTariffsOfferDTO.fromJson(json[r'offer'])!,
        tariffs: CalculatedTariffDTO.listFromJson(json[r'tariffs']),
      );
    }
    return null;
  }

  static List<CalculateTariffsOfferInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CalculateTariffsOfferInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CalculateTariffsOfferInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CalculateTariffsOfferInfoDTO> mapFromJson(dynamic json) {
    final map = <String, CalculateTariffsOfferInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CalculateTariffsOfferInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CalculateTariffsOfferInfoDTO-objects as value to a dart map
  static Map<String, List<CalculateTariffsOfferInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CalculateTariffsOfferInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CalculateTariffsOfferInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offer',
    'tariffs',
  };
}


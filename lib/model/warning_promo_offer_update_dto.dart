//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarningPromoOfferUpdateDTO {
  /// Returns a new [WarningPromoOfferUpdateDTO] instance.
  WarningPromoOfferUpdateDTO({
    required this.offerId,
    this.warnings = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  /// Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
  List<PromoOfferUpdateWarningDTO> warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarningPromoOfferUpdateDTO &&
    other.offerId == offerId &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'WarningPromoOfferUpdateDTO[offerId=$offerId, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [WarningPromoOfferUpdateDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarningPromoOfferUpdateDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarningPromoOfferUpdateDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarningPromoOfferUpdateDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarningPromoOfferUpdateDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        warnings: PromoOfferUpdateWarningDTO.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<WarningPromoOfferUpdateDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarningPromoOfferUpdateDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarningPromoOfferUpdateDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarningPromoOfferUpdateDTO> mapFromJson(dynamic json) {
    final map = <String, WarningPromoOfferUpdateDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarningPromoOfferUpdateDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarningPromoOfferUpdateDTO-objects as value to a dart map
  static Map<String, List<WarningPromoOfferUpdateDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarningPromoOfferUpdateDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarningPromoOfferUpdateDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
    'warnings',
  };
}


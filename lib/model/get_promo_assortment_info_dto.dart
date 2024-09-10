//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoAssortmentInfoDTO {
  /// Returns a new [GetPromoAssortmentInfoDTO] instance.
  GetPromoAssortmentInfoDTO({
    required this.activeOffers,
    this.potentialOffers,
    this.processing,
  });

  /// Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  int activeOffers;

  /// Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? potentialOffers;

  /// Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? processing;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoAssortmentInfoDTO &&
    other.activeOffers == activeOffers &&
    other.potentialOffers == potentialOffers &&
    other.processing == processing;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (activeOffers.hashCode) +
    (potentialOffers == null ? 0 : potentialOffers!.hashCode) +
    (processing == null ? 0 : processing!.hashCode);

  @override
  String toString() => 'GetPromoAssortmentInfoDTO[activeOffers=$activeOffers, potentialOffers=$potentialOffers, processing=$processing]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'activeOffers'] = this.activeOffers;
    if (this.potentialOffers != null) {
      json[r'potentialOffers'] = this.potentialOffers;
    } else {
      json[r'potentialOffers'] = null;
    }
    if (this.processing != null) {
      json[r'processing'] = this.processing;
    } else {
      json[r'processing'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoAssortmentInfoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoAssortmentInfoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoAssortmentInfoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoAssortmentInfoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoAssortmentInfoDTO(
        activeOffers: mapValueOfType<int>(json, r'activeOffers')!,
        potentialOffers: mapValueOfType<int>(json, r'potentialOffers'),
        processing: mapValueOfType<bool>(json, r'processing'),
      );
    }
    return null;
  }

  static List<GetPromoAssortmentInfoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoAssortmentInfoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoAssortmentInfoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoAssortmentInfoDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoAssortmentInfoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoAssortmentInfoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoAssortmentInfoDTO-objects as value to a dart map
  static Map<String, List<GetPromoAssortmentInfoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoAssortmentInfoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoAssortmentInfoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'activeOffers',
  };
}


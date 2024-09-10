//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoDTO {
  /// Returns a new [GetPromoDTO] instance.
  GetPromoDTO({
    required this.id,
    required this.name,
    required this.period,
    required this.participating,
    required this.assortmentInfo,
    required this.mechanicsInfo,
    required this.bestsellerInfo,
    this.channels = const [],
    this.constraints,
  });

  /// Идентификатор акции.
  String id;

  /// Название акции.
  String name;

  PromoPeriodDTO period;

  /// Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  bool participating;

  GetPromoAssortmentInfoDTO assortmentInfo;

  GetPromoMechanicsInfoDTO mechanicsInfo;

  GetPromoBestsellerInfoDTO bestsellerInfo;

  /// Список каналов продвижения товаров.
  List<ChannelType>? channels;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetPromoConstraintsDTO? constraints;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoDTO &&
    other.id == id &&
    other.name == name &&
    other.period == period &&
    other.participating == participating &&
    other.assortmentInfo == assortmentInfo &&
    other.mechanicsInfo == mechanicsInfo &&
    other.bestsellerInfo == bestsellerInfo &&
    _deepEquality.equals(other.channels, channels) &&
    other.constraints == constraints;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (period.hashCode) +
    (participating.hashCode) +
    (assortmentInfo.hashCode) +
    (mechanicsInfo.hashCode) +
    (bestsellerInfo.hashCode) +
    (channels == null ? 0 : channels!.hashCode) +
    (constraints == null ? 0 : constraints!.hashCode);

  @override
  String toString() => 'GetPromoDTO[id=$id, name=$name, period=$period, participating=$participating, assortmentInfo=$assortmentInfo, mechanicsInfo=$mechanicsInfo, bestsellerInfo=$bestsellerInfo, channels=$channels, constraints=$constraints]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'period'] = this.period;
      json[r'participating'] = this.participating;
      json[r'assortmentInfo'] = this.assortmentInfo;
      json[r'mechanicsInfo'] = this.mechanicsInfo;
      json[r'bestsellerInfo'] = this.bestsellerInfo;
    if (this.channels != null) {
      json[r'channels'] = this.channels;
    } else {
      json[r'channels'] = null;
    }
    if (this.constraints != null) {
      json[r'constraints'] = this.constraints;
    } else {
      json[r'constraints'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoDTO(
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        period: PromoPeriodDTO.fromJson(json[r'period'])!,
        participating: mapValueOfType<bool>(json, r'participating')!,
        assortmentInfo: GetPromoAssortmentInfoDTO.fromJson(json[r'assortmentInfo'])!,
        mechanicsInfo: GetPromoMechanicsInfoDTO.fromJson(json[r'mechanicsInfo'])!,
        bestsellerInfo: GetPromoBestsellerInfoDTO.fromJson(json[r'bestsellerInfo'])!,
        channels: ChannelType.listFromJson(json[r'channels']),
        constraints: GetPromoConstraintsDTO.fromJson(json[r'constraints']),
      );
    }
    return null;
  }

  static List<GetPromoDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoDTO-objects as value to a dart map
  static Map<String, List<GetPromoDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'period',
    'participating',
    'assortmentInfo',
    'mechanicsInfo',
    'bestsellerInfo',
  };
}


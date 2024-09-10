//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehouseOfferDTO {
  /// Returns a new [WarehouseOfferDTO] instance.
  WarehouseOfferDTO({
    required this.offerId,
    this.turnoverSummary,
    this.stocks = const [],
    this.updatedAt,
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TurnoverDTO? turnoverSummary;

  /// Информация об остатках.
  List<WarehouseStockDTO> stocks;

  /// Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehouseOfferDTO &&
    other.offerId == offerId &&
    other.turnoverSummary == turnoverSummary &&
    _deepEquality.equals(other.stocks, stocks) &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (turnoverSummary == null ? 0 : turnoverSummary!.hashCode) +
    (stocks.hashCode) +
    (updatedAt == null ? 0 : updatedAt!.hashCode);

  @override
  String toString() => 'WarehouseOfferDTO[offerId=$offerId, turnoverSummary=$turnoverSummary, stocks=$stocks, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.turnoverSummary != null) {
      json[r'turnoverSummary'] = this.turnoverSummary;
    } else {
      json[r'turnoverSummary'] = null;
    }
      json[r'stocks'] = this.stocks;
    if (this.updatedAt != null) {
      json[r'updatedAt'] = this.updatedAt!.toUtc().toIso8601String();
    } else {
      json[r'updatedAt'] = null;
    }
    return json;
  }

  /// Returns a new [WarehouseOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehouseOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehouseOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehouseOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehouseOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        turnoverSummary: TurnoverDTO.fromJson(json[r'turnoverSummary']),
        stocks: WarehouseStockDTO.listFromJson(json[r'stocks']),
        updatedAt: mapDateTime(json, r'updatedAt', r''),
      );
    }
    return null;
  }

  static List<WarehouseOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehouseOfferDTO> mapFromJson(dynamic json) {
    final map = <String, WarehouseOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehouseOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehouseOfferDTO-objects as value to a dart map
  static Map<String, List<WarehouseOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehouseOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehouseOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
    'stocks',
  };
}


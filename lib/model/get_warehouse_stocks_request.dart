//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetWarehouseStocksRequest {
  /// Returns a new [GetWarehouseStocksRequest] instance.
  GetWarehouseStocksRequest({
    this.withTurnover = false,
    this.archived,
    this.offerIds = const {},
  });

  /// **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
  bool withTurnover;

  /// Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? archived;

  /// Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
  Set<String>? offerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetWarehouseStocksRequest &&
    other.withTurnover == withTurnover &&
    other.archived == archived &&
    _deepEquality.equals(other.offerIds, offerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (withTurnover.hashCode) +
    (archived == null ? 0 : archived!.hashCode) +
    (offerIds == null ? 0 : offerIds!.hashCode);

  @override
  String toString() => 'GetWarehouseStocksRequest[withTurnover=$withTurnover, archived=$archived, offerIds=$offerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'withTurnover'] = this.withTurnover;
    if (this.archived != null) {
      json[r'archived'] = this.archived;
    } else {
      json[r'archived'] = null;
    }
    if (this.offerIds != null) {
      json[r'offerIds'] = this.offerIds!.toList(growable: false);
    } else {
      json[r'offerIds'] = null;
    }
    return json;
  }

  /// Returns a new [GetWarehouseStocksRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetWarehouseStocksRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetWarehouseStocksRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetWarehouseStocksRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetWarehouseStocksRequest(
        withTurnover: mapValueOfType<bool>(json, r'withTurnover') ?? false,
        archived: mapValueOfType<bool>(json, r'archived'),
        offerIds: json[r'offerIds'] is Iterable
            ? (json[r'offerIds'] as Iterable).cast<String>().toSet()
            : const {},
      );
    }
    return null;
  }

  static List<GetWarehouseStocksRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetWarehouseStocksRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetWarehouseStocksRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetWarehouseStocksRequest> mapFromJson(dynamic json) {
    final map = <String, GetWarehouseStocksRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetWarehouseStocksRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetWarehouseStocksRequest-objects as value to a dart map
  static Map<String, List<GetWarehouseStocksRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetWarehouseStocksRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetWarehouseStocksRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


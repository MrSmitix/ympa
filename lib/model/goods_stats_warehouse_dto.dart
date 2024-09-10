//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GoodsStatsWarehouseDTO {
  /// Returns a new [GoodsStatsWarehouseDTO] instance.
  GoodsStatsWarehouseDTO({
    this.id,
    this.name,
    this.stocks = const [],
  });

  /// Идентификатор склада.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Название склада.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Информация об остатках товаров на складе.
  List<WarehouseStockDTO> stocks;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GoodsStatsWarehouseDTO &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.stocks, stocks);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (stocks.hashCode);

  @override
  String toString() => 'GoodsStatsWarehouseDTO[id=$id, name=$name, stocks=$stocks]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'stocks'] = this.stocks;
    return json;
  }

  /// Returns a new [GoodsStatsWarehouseDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GoodsStatsWarehouseDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GoodsStatsWarehouseDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GoodsStatsWarehouseDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GoodsStatsWarehouseDTO(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        stocks: WarehouseStockDTO.listFromJson(json[r'stocks']),
      );
    }
    return null;
  }

  static List<GoodsStatsWarehouseDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GoodsStatsWarehouseDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GoodsStatsWarehouseDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GoodsStatsWarehouseDTO> mapFromJson(dynamic json) {
    final map = <String, GoodsStatsWarehouseDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GoodsStatsWarehouseDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GoodsStatsWarehouseDTO-objects as value to a dart map
  static Map<String, List<GoodsStatsWarehouseDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GoodsStatsWarehouseDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GoodsStatsWarehouseDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'stocks',
  };
}


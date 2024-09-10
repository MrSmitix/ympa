//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateStocksOnWarehousesReportRequest {
  /// Returns a new [GenerateStocksOnWarehousesReportRequest] instance.
  GenerateStocksOnWarehousesReportRequest({
    required this.campaignId,
    this.warehouseIds = const [],
    this.reportDate,
    this.categoryIds = const [],
    this.hasStocks,
  });

  /// Идентификатор магазина.
  int campaignId;

  /// Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  List<int>? warehouseIds;

  /// Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? reportDate;

  /// Фильтр по категориям на Маркете (кроме модели FBY).
  List<int>? categoryIds;

  /// Фильтр по наличию остатков (кроме модели FBY).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasStocks;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateStocksOnWarehousesReportRequest &&
    other.campaignId == campaignId &&
    _deepEquality.equals(other.warehouseIds, warehouseIds) &&
    other.reportDate == reportDate &&
    _deepEquality.equals(other.categoryIds, categoryIds) &&
    other.hasStocks == hasStocks;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (warehouseIds == null ? 0 : warehouseIds!.hashCode) +
    (reportDate == null ? 0 : reportDate!.hashCode) +
    (categoryIds == null ? 0 : categoryIds!.hashCode) +
    (hasStocks == null ? 0 : hasStocks!.hashCode);

  @override
  String toString() => 'GenerateStocksOnWarehousesReportRequest[campaignId=$campaignId, warehouseIds=$warehouseIds, reportDate=$reportDate, categoryIds=$categoryIds, hasStocks=$hasStocks]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
    if (this.warehouseIds != null) {
      json[r'warehouseIds'] = this.warehouseIds;
    } else {
      json[r'warehouseIds'] = null;
    }
    if (this.reportDate != null) {
      json[r'reportDate'] = _dateFormatter.format(this.reportDate!.toUtc());
    } else {
      json[r'reportDate'] = null;
    }
    if (this.categoryIds != null) {
      json[r'categoryIds'] = this.categoryIds;
    } else {
      json[r'categoryIds'] = null;
    }
    if (this.hasStocks != null) {
      json[r'hasStocks'] = this.hasStocks;
    } else {
      json[r'hasStocks'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateStocksOnWarehousesReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateStocksOnWarehousesReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateStocksOnWarehousesReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateStocksOnWarehousesReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateStocksOnWarehousesReportRequest(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        warehouseIds: json[r'warehouseIds'] is Iterable
            ? (json[r'warehouseIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        reportDate: mapDateTime(json, r'reportDate', r''),
        categoryIds: json[r'categoryIds'] is Iterable
            ? (json[r'categoryIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        hasStocks: mapValueOfType<bool>(json, r'hasStocks'),
      );
    }
    return null;
  }

  static List<GenerateStocksOnWarehousesReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateStocksOnWarehousesReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateStocksOnWarehousesReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateStocksOnWarehousesReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateStocksOnWarehousesReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateStocksOnWarehousesReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateStocksOnWarehousesReportRequest-objects as value to a dart map
  static Map<String, List<GenerateStocksOnWarehousesReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateStocksOnWarehousesReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateStocksOnWarehousesReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
  };
}


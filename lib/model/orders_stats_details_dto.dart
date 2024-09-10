//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsDetailsDTO {
  /// Returns a new [OrdersStatsDetailsDTO] instance.
  OrdersStatsDetailsDTO({
    this.itemStatus,
    this.itemCount,
    this.updateDate,
    this.stockType,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsItemStatusType? itemStatus;

  /// Количество товара со статусом, указанном в параметре `itemStatus`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? itemCount;

  /// Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? updateDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsStockType? stockType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsDetailsDTO &&
    other.itemStatus == itemStatus &&
    other.itemCount == itemCount &&
    other.updateDate == updateDate &&
    other.stockType == stockType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemStatus == null ? 0 : itemStatus!.hashCode) +
    (itemCount == null ? 0 : itemCount!.hashCode) +
    (updateDate == null ? 0 : updateDate!.hashCode) +
    (stockType == null ? 0 : stockType!.hashCode);

  @override
  String toString() => 'OrdersStatsDetailsDTO[itemStatus=$itemStatus, itemCount=$itemCount, updateDate=$updateDate, stockType=$stockType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.itemStatus != null) {
      json[r'itemStatus'] = this.itemStatus;
    } else {
      json[r'itemStatus'] = null;
    }
    if (this.itemCount != null) {
      json[r'itemCount'] = this.itemCount;
    } else {
      json[r'itemCount'] = null;
    }
    if (this.updateDate != null) {
      json[r'updateDate'] = _dateFormatter.format(this.updateDate!.toUtc());
    } else {
      json[r'updateDate'] = null;
    }
    if (this.stockType != null) {
      json[r'stockType'] = this.stockType;
    } else {
      json[r'stockType'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsDetailsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsDetailsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsDetailsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsDetailsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsDetailsDTO(
        itemStatus: OrdersStatsItemStatusType.fromJson(json[r'itemStatus']),
        itemCount: mapValueOfType<int>(json, r'itemCount'),
        updateDate: mapDateTime(json, r'updateDate', r''),
        stockType: OrdersStatsStockType.fromJson(json[r'stockType']),
      );
    }
    return null;
  }

  static List<OrdersStatsDetailsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsDetailsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsDetailsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsDetailsDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsDetailsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsDetailsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsDetailsDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsDetailsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsDetailsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsDetailsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SearchShipmentsRequest {
  /// Returns a new [SearchShipmentsRequest] instance.
  SearchShipmentsRequest({
    required this.dateFrom,
    required this.dateTo,
    this.statuses = const {},
    this.orderIds = const {},
    this.cancelledOrders = true,
  });

  /// Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  DateTime dateFrom;

  /// Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  DateTime dateTo;

  /// Список статусов отгрузок.
  Set<ShipmentStatusType>? statuses;

  /// Список идентификаторов заказов из отгрузок.
  Set<int>? orderIds;

  /// Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
  bool cancelledOrders;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SearchShipmentsRequest &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    _deepEquality.equals(other.statuses, statuses) &&
    _deepEquality.equals(other.orderIds, orderIds) &&
    other.cancelledOrders == cancelledOrders;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateFrom.hashCode) +
    (dateTo.hashCode) +
    (statuses == null ? 0 : statuses!.hashCode) +
    (orderIds == null ? 0 : orderIds!.hashCode) +
    (cancelledOrders.hashCode);

  @override
  String toString() => 'SearchShipmentsRequest[dateFrom=$dateFrom, dateTo=$dateTo, statuses=$statuses, orderIds=$orderIds, cancelledOrders=$cancelledOrders]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
    if (this.statuses != null) {
      json[r'statuses'] = this.statuses!.toList(growable: false);
    } else {
      json[r'statuses'] = null;
    }
    if (this.orderIds != null) {
      json[r'orderIds'] = this.orderIds!.toList(growable: false);
    } else {
      json[r'orderIds'] = null;
    }
      json[r'cancelledOrders'] = this.cancelledOrders;
    return json;
  }

  /// Returns a new [SearchShipmentsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SearchShipmentsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SearchShipmentsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SearchShipmentsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SearchShipmentsRequest(
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
        statuses: ShipmentStatusType.listFromJson(json[r'statuses']).toSet(),
        orderIds: json[r'orderIds'] is Iterable
            ? (json[r'orderIds'] as Iterable).cast<int>().toSet()
            : const {},
        cancelledOrders: mapValueOfType<bool>(json, r'cancelledOrders') ?? true,
      );
    }
    return null;
  }

  static List<SearchShipmentsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SearchShipmentsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SearchShipmentsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SearchShipmentsRequest> mapFromJson(dynamic json) {
    final map = <String, SearchShipmentsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SearchShipmentsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SearchShipmentsRequest-objects as value to a dart map
  static Map<String, List<SearchShipmentsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SearchShipmentsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SearchShipmentsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'dateFrom',
    'dateTo',
  };
}


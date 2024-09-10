//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOrdersStatsRequest {
  /// Returns a new [GetOrdersStatsRequest] instance.
  GetOrdersStatsRequest({
    this.dateFrom,
    this.dateTo,
    this.updateFrom,
    this.updateTo,
    this.orders = const [],
    this.statuses = const [],
    this.hasCis,
  });

  /// Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateFrom;

  /// Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? dateTo;

  /// Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? updateFrom;

  /// Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? updateTo;

  /// Список идентификаторов заказов.
  List<int>? orders;

  /// Список статусов заказов.
  List<OrderStatsStatusType>? statuses;

  /// Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasCis;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOrdersStatsRequest &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.updateFrom == updateFrom &&
    other.updateTo == updateTo &&
    _deepEquality.equals(other.orders, orders) &&
    _deepEquality.equals(other.statuses, statuses) &&
    other.hasCis == hasCis;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateFrom == null ? 0 : dateFrom!.hashCode) +
    (dateTo == null ? 0 : dateTo!.hashCode) +
    (updateFrom == null ? 0 : updateFrom!.hashCode) +
    (updateTo == null ? 0 : updateTo!.hashCode) +
    (orders == null ? 0 : orders!.hashCode) +
    (statuses == null ? 0 : statuses!.hashCode) +
    (hasCis == null ? 0 : hasCis!.hashCode);

  @override
  String toString() => 'GetOrdersStatsRequest[dateFrom=$dateFrom, dateTo=$dateTo, updateFrom=$updateFrom, updateTo=$updateTo, orders=$orders, statuses=$statuses, hasCis=$hasCis]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dateFrom != null) {
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom!.toUtc());
    } else {
      json[r'dateFrom'] = null;
    }
    if (this.dateTo != null) {
      json[r'dateTo'] = _dateFormatter.format(this.dateTo!.toUtc());
    } else {
      json[r'dateTo'] = null;
    }
    if (this.updateFrom != null) {
      json[r'updateFrom'] = _dateFormatter.format(this.updateFrom!.toUtc());
    } else {
      json[r'updateFrom'] = null;
    }
    if (this.updateTo != null) {
      json[r'updateTo'] = _dateFormatter.format(this.updateTo!.toUtc());
    } else {
      json[r'updateTo'] = null;
    }
    if (this.orders != null) {
      json[r'orders'] = this.orders;
    } else {
      json[r'orders'] = null;
    }
    if (this.statuses != null) {
      json[r'statuses'] = this.statuses;
    } else {
      json[r'statuses'] = null;
    }
    if (this.hasCis != null) {
      json[r'hasCis'] = this.hasCis;
    } else {
      json[r'hasCis'] = null;
    }
    return json;
  }

  /// Returns a new [GetOrdersStatsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOrdersStatsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOrdersStatsRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOrdersStatsRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOrdersStatsRequest(
        dateFrom: mapDateTime(json, r'dateFrom', r''),
        dateTo: mapDateTime(json, r'dateTo', r''),
        updateFrom: mapDateTime(json, r'updateFrom', r''),
        updateTo: mapDateTime(json, r'updateTo', r''),
        orders: json[r'orders'] is Iterable
            ? (json[r'orders'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        statuses: OrderStatsStatusType.listFromJson(json[r'statuses']),
        hasCis: mapValueOfType<bool>(json, r'hasCis'),
      );
    }
    return null;
  }

  static List<GetOrdersStatsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOrdersStatsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOrdersStatsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOrdersStatsRequest> mapFromJson(dynamic json) {
    final map = <String, GetOrdersStatsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOrdersStatsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOrdersStatsRequest-objects as value to a dart map
  static Map<String, List<GetOrdersStatsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOrdersStatsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOrdersStatsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


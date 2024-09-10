//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsPaymentOrderDTO {
  /// Returns a new [OrdersStatsPaymentOrderDTO] instance.
  OrdersStatsPaymentOrderDTO({
    this.id,
    this.date,
  });

  /// Номер платежного поручения.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? date;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsPaymentOrderDTO &&
    other.id == id &&
    other.date == date;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (date == null ? 0 : date!.hashCode);

  @override
  String toString() => 'OrdersStatsPaymentOrderDTO[id=$id, date=$date]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.date != null) {
      json[r'date'] = _dateFormatter.format(this.date!.toUtc());
    } else {
      json[r'date'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsPaymentOrderDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsPaymentOrderDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsPaymentOrderDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsPaymentOrderDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsPaymentOrderDTO(
        id: mapValueOfType<String>(json, r'id'),
        date: mapDateTime(json, r'date', r''),
      );
    }
    return null;
  }

  static List<OrdersStatsPaymentOrderDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPaymentOrderDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPaymentOrderDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsPaymentOrderDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsPaymentOrderDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsPaymentOrderDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsPaymentOrderDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsPaymentOrderDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsPaymentOrderDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsPaymentOrderDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


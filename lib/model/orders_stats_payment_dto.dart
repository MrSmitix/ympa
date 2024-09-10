//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsPaymentDTO {
  /// Returns a new [OrdersStatsPaymentDTO] instance.
  OrdersStatsPaymentDTO({
    this.id,
    this.date,
    this.type,
    this.source_,
    this.total,
    this.paymentOrder,
  });

  /// Идентификатор денежного перевода.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? date;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsPaymentType? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsPaymentSourceType? source_;

  /// Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? total;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsPaymentOrderDTO? paymentOrder;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsPaymentDTO &&
    other.id == id &&
    other.date == date &&
    other.type == type &&
    other.source_ == source_ &&
    other.total == total &&
    other.paymentOrder == paymentOrder;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (date == null ? 0 : date!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (total == null ? 0 : total!.hashCode) +
    (paymentOrder == null ? 0 : paymentOrder!.hashCode);

  @override
  String toString() => 'OrdersStatsPaymentDTO[id=$id, date=$date, type=$type, source_=$source_, total=$total, paymentOrder=$paymentOrder]';

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
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.source_ != null) {
      json[r'source'] = this.source_;
    } else {
      json[r'source'] = null;
    }
    if (this.total != null) {
      json[r'total'] = this.total;
    } else {
      json[r'total'] = null;
    }
    if (this.paymentOrder != null) {
      json[r'paymentOrder'] = this.paymentOrder;
    } else {
      json[r'paymentOrder'] = null;
    }
    return json;
  }

  /// Returns a new [OrdersStatsPaymentDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsPaymentDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsPaymentDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsPaymentDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsPaymentDTO(
        id: mapValueOfType<String>(json, r'id'),
        date: mapDateTime(json, r'date', r''),
        type: OrdersStatsPaymentType.fromJson(json[r'type']),
        source_: OrdersStatsPaymentSourceType.fromJson(json[r'source']),
        total: num.parse('${json[r'total']}'),
        paymentOrder: OrdersStatsPaymentOrderDTO.fromJson(json[r'paymentOrder']),
      );
    }
    return null;
  }

  static List<OrdersStatsPaymentDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsPaymentDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsPaymentDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsPaymentDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsPaymentDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsPaymentDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsPaymentDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsPaymentDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsPaymentDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsPaymentDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


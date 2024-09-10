//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderStatusChangeDeliveryDatesDTO {
  /// Returns a new [OrderStatusChangeDeliveryDatesDTO] instance.
  OrderStatusChangeDeliveryDatesDTO({
    this.realDeliveryDate,
  });

  /// **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? realDeliveryDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderStatusChangeDeliveryDatesDTO &&
    other.realDeliveryDate == realDeliveryDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (realDeliveryDate == null ? 0 : realDeliveryDate!.hashCode);

  @override
  String toString() => 'OrderStatusChangeDeliveryDatesDTO[realDeliveryDate=$realDeliveryDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.realDeliveryDate != null) {
      json[r'realDeliveryDate'] = _dateFormatter.format(this.realDeliveryDate!.toUtc());
    } else {
      json[r'realDeliveryDate'] = null;
    }
    return json;
  }

  /// Returns a new [OrderStatusChangeDeliveryDatesDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderStatusChangeDeliveryDatesDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderStatusChangeDeliveryDatesDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderStatusChangeDeliveryDatesDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderStatusChangeDeliveryDatesDTO(
        realDeliveryDate: mapDateTime(json, r'realDeliveryDate', r''),
      );
    }
    return null;
  }

  static List<OrderStatusChangeDeliveryDatesDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderStatusChangeDeliveryDatesDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderStatusChangeDeliveryDatesDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderStatusChangeDeliveryDatesDTO> mapFromJson(dynamic json) {
    final map = <String, OrderStatusChangeDeliveryDatesDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderStatusChangeDeliveryDatesDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderStatusChangeDeliveryDatesDTO-objects as value to a dart map
  static Map<String, List<OrderStatusChangeDeliveryDatesDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderStatusChangeDeliveryDatesDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderStatusChangeDeliveryDatesDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


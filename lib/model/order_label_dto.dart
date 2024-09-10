//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderLabelDTO {
  /// Returns a new [OrderLabelDTO] instance.
  OrderLabelDTO({
    required this.orderId,
    required this.placesNumber,
    required this.url,
    this.parcelBoxLabels = const [],
  });

  /// Идентификатор заказа.
  int orderId;

  /// Количество коробок в заказе.
  int placesNumber;

  /// URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  String url;

  /// Информация на ярлыке.
  List<ParcelBoxLabelDTO> parcelBoxLabels;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderLabelDTO &&
    other.orderId == orderId &&
    other.placesNumber == placesNumber &&
    other.url == url &&
    _deepEquality.equals(other.parcelBoxLabels, parcelBoxLabels);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderId.hashCode) +
    (placesNumber.hashCode) +
    (url.hashCode) +
    (parcelBoxLabels.hashCode);

  @override
  String toString() => 'OrderLabelDTO[orderId=$orderId, placesNumber=$placesNumber, url=$url, parcelBoxLabels=$parcelBoxLabels]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderId'] = this.orderId;
      json[r'placesNumber'] = this.placesNumber;
      json[r'url'] = this.url;
      json[r'parcelBoxLabels'] = this.parcelBoxLabels;
    return json;
  }

  /// Returns a new [OrderLabelDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderLabelDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderLabelDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderLabelDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderLabelDTO(
        orderId: mapValueOfType<int>(json, r'orderId')!,
        placesNumber: mapValueOfType<int>(json, r'placesNumber')!,
        url: mapValueOfType<String>(json, r'url')!,
        parcelBoxLabels: ParcelBoxLabelDTO.listFromJson(json[r'parcelBoxLabels']),
      );
    }
    return null;
  }

  static List<OrderLabelDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLabelDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLabelDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderLabelDTO> mapFromJson(dynamic json) {
    final map = <String, OrderLabelDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderLabelDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderLabelDTO-objects as value to a dart map
  static Map<String, List<OrderLabelDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderLabelDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderLabelDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderId',
    'placesNumber',
    'url',
    'parcelBoxLabels',
  };
}


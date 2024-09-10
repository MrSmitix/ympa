//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ParcelBoxLabelDTO {
  /// Returns a new [ParcelBoxLabelDTO] instance.
  ParcelBoxLabelDTO({
    required this.url,
    required this.supplierName,
    required this.deliveryServiceName,
    required this.orderId,
    required this.orderNum,
    required this.recipientName,
    required this.boxId,
    required this.fulfilmentId,
    required this.place,
    required this.weight,
    required this.deliveryServiceId,
    this.deliveryAddress,
    this.shipmentDate,
  });

  /// Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  String url;

  /// Юридическое название магазина.
  String supplierName;

  /// Юридическое название службы доставки.
  String deliveryServiceName;

  /// Идентификатор заказа в системе Маркета.
  int orderId;

  /// Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
  String orderNum;

  /// Фамилия и инициалы получателя заказа.
  String recipientName;

  /// Идентификатор коробки.
  int boxId;

  /// Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
  String fulfilmentId;

  /// Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
  String place;

  /// {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
  String weight;

  /// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  String deliveryServiceId;

  /// Адрес получателя.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? deliveryAddress;

  /// Дата отгрузки в формате `dd.MM.yyyy`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shipmentDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ParcelBoxLabelDTO &&
    other.url == url &&
    other.supplierName == supplierName &&
    other.deliveryServiceName == deliveryServiceName &&
    other.orderId == orderId &&
    other.orderNum == orderNum &&
    other.recipientName == recipientName &&
    other.boxId == boxId &&
    other.fulfilmentId == fulfilmentId &&
    other.place == place &&
    other.weight == weight &&
    other.deliveryServiceId == deliveryServiceId &&
    other.deliveryAddress == deliveryAddress &&
    other.shipmentDate == shipmentDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url.hashCode) +
    (supplierName.hashCode) +
    (deliveryServiceName.hashCode) +
    (orderId.hashCode) +
    (orderNum.hashCode) +
    (recipientName.hashCode) +
    (boxId.hashCode) +
    (fulfilmentId.hashCode) +
    (place.hashCode) +
    (weight.hashCode) +
    (deliveryServiceId.hashCode) +
    (deliveryAddress == null ? 0 : deliveryAddress!.hashCode) +
    (shipmentDate == null ? 0 : shipmentDate!.hashCode);

  @override
  String toString() => 'ParcelBoxLabelDTO[url=$url, supplierName=$supplierName, deliveryServiceName=$deliveryServiceName, orderId=$orderId, orderNum=$orderNum, recipientName=$recipientName, boxId=$boxId, fulfilmentId=$fulfilmentId, place=$place, weight=$weight, deliveryServiceId=$deliveryServiceId, deliveryAddress=$deliveryAddress, shipmentDate=$shipmentDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'url'] = this.url;
      json[r'supplierName'] = this.supplierName;
      json[r'deliveryServiceName'] = this.deliveryServiceName;
      json[r'orderId'] = this.orderId;
      json[r'orderNum'] = this.orderNum;
      json[r'recipientName'] = this.recipientName;
      json[r'boxId'] = this.boxId;
      json[r'fulfilmentId'] = this.fulfilmentId;
      json[r'place'] = this.place;
      json[r'weight'] = this.weight;
      json[r'deliveryServiceId'] = this.deliveryServiceId;
    if (this.deliveryAddress != null) {
      json[r'deliveryAddress'] = this.deliveryAddress;
    } else {
      json[r'deliveryAddress'] = null;
    }
    if (this.shipmentDate != null) {
      json[r'shipmentDate'] = this.shipmentDate;
    } else {
      json[r'shipmentDate'] = null;
    }
    return json;
  }

  /// Returns a new [ParcelBoxLabelDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ParcelBoxLabelDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ParcelBoxLabelDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ParcelBoxLabelDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ParcelBoxLabelDTO(
        url: mapValueOfType<String>(json, r'url')!,
        supplierName: mapValueOfType<String>(json, r'supplierName')!,
        deliveryServiceName: mapValueOfType<String>(json, r'deliveryServiceName')!,
        orderId: mapValueOfType<int>(json, r'orderId')!,
        orderNum: mapValueOfType<String>(json, r'orderNum')!,
        recipientName: mapValueOfType<String>(json, r'recipientName')!,
        boxId: mapValueOfType<int>(json, r'boxId')!,
        fulfilmentId: mapValueOfType<String>(json, r'fulfilmentId')!,
        place: mapValueOfType<String>(json, r'place')!,
        weight: mapValueOfType<String>(json, r'weight')!,
        deliveryServiceId: mapValueOfType<String>(json, r'deliveryServiceId')!,
        deliveryAddress: mapValueOfType<String>(json, r'deliveryAddress'),
        shipmentDate: mapValueOfType<String>(json, r'shipmentDate'),
      );
    }
    return null;
  }

  static List<ParcelBoxLabelDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ParcelBoxLabelDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ParcelBoxLabelDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ParcelBoxLabelDTO> mapFromJson(dynamic json) {
    final map = <String, ParcelBoxLabelDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ParcelBoxLabelDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ParcelBoxLabelDTO-objects as value to a dart map
  static Map<String, List<ParcelBoxLabelDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ParcelBoxLabelDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ParcelBoxLabelDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'url',
    'supplierName',
    'deliveryServiceName',
    'orderId',
    'orderNum',
    'recipientName',
    'boxId',
    'fulfilmentId',
    'place',
    'weight',
    'deliveryServiceId',
  };
}


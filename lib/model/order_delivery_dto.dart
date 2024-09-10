//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderDeliveryDTO {
  /// Returns a new [OrderDeliveryDTO] instance.
  OrderDeliveryDTO({
    this.id,
    this.type,
    this.serviceName,
    this.price,
    this.deliveryPartnerType,
    this.courier,
    this.dates,
    this.region,
    this.address,
    this.vat,
    this.deliveryServiceId,
    this.liftType,
    this.liftPrice,
    this.outletCode,
    this.outletStorageLimitDate,
    this.dispatchType,
    this.tracks = const [],
    this.shipments = const [],
    this.estimated,
    this.eacType,
    this.eacCode,
  });

  /// Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryType? type;

  /// Наименование службы доставки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? serviceName;

  /// {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? price;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryPartnerType? deliveryPartnerType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderCourierDTO? courier;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryDatesDTO? dates;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RegionDTO? region;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryAddressDTO? address;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderVatType? vat;

  /// Идентификатор службы доставки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? deliveryServiceId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderLiftType? liftType;

  /// Стоимость подъема на этаж.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? liftPrice;

  /// Идентификатор пункта самовывоза, присвоенный магазином.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? outletCode;

  /// Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? outletStorageLimitDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryDispatchType? dispatchType;

  /// Информация для отслеживания перемещений посылки.
  List<OrderTrackDTO>? tracks;

  /// Информация о посылках.
  List<OrderShipmentDTO>? shipments;

  /// Приблизительная ли дата доставки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? estimated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderDeliveryEacType? eacType;

  /// Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eacCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderDeliveryDTO &&
    other.id == id &&
    other.type == type &&
    other.serviceName == serviceName &&
    other.price == price &&
    other.deliveryPartnerType == deliveryPartnerType &&
    other.courier == courier &&
    other.dates == dates &&
    other.region == region &&
    other.address == address &&
    other.vat == vat &&
    other.deliveryServiceId == deliveryServiceId &&
    other.liftType == liftType &&
    other.liftPrice == liftPrice &&
    other.outletCode == outletCode &&
    other.outletStorageLimitDate == outletStorageLimitDate &&
    other.dispatchType == dispatchType &&
    _deepEquality.equals(other.tracks, tracks) &&
    _deepEquality.equals(other.shipments, shipments) &&
    other.estimated == estimated &&
    other.eacType == eacType &&
    other.eacCode == eacCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (price == null ? 0 : price!.hashCode) +
    (deliveryPartnerType == null ? 0 : deliveryPartnerType!.hashCode) +
    (courier == null ? 0 : courier!.hashCode) +
    (dates == null ? 0 : dates!.hashCode) +
    (region == null ? 0 : region!.hashCode) +
    (address == null ? 0 : address!.hashCode) +
    (vat == null ? 0 : vat!.hashCode) +
    (deliveryServiceId == null ? 0 : deliveryServiceId!.hashCode) +
    (liftType == null ? 0 : liftType!.hashCode) +
    (liftPrice == null ? 0 : liftPrice!.hashCode) +
    (outletCode == null ? 0 : outletCode!.hashCode) +
    (outletStorageLimitDate == null ? 0 : outletStorageLimitDate!.hashCode) +
    (dispatchType == null ? 0 : dispatchType!.hashCode) +
    (tracks == null ? 0 : tracks!.hashCode) +
    (shipments == null ? 0 : shipments!.hashCode) +
    (estimated == null ? 0 : estimated!.hashCode) +
    (eacType == null ? 0 : eacType!.hashCode) +
    (eacCode == null ? 0 : eacCode!.hashCode);

  @override
  String toString() => 'OrderDeliveryDTO[id=$id, type=$type, serviceName=$serviceName, price=$price, deliveryPartnerType=$deliveryPartnerType, courier=$courier, dates=$dates, region=$region, address=$address, vat=$vat, deliveryServiceId=$deliveryServiceId, liftType=$liftType, liftPrice=$liftPrice, outletCode=$outletCode, outletStorageLimitDate=$outletStorageLimitDate, dispatchType=$dispatchType, tracks=$tracks, shipments=$shipments, estimated=$estimated, eacType=$eacType, eacCode=$eacCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.price != null) {
      json[r'price'] = this.price;
    } else {
      json[r'price'] = null;
    }
    if (this.deliveryPartnerType != null) {
      json[r'deliveryPartnerType'] = this.deliveryPartnerType;
    } else {
      json[r'deliveryPartnerType'] = null;
    }
    if (this.courier != null) {
      json[r'courier'] = this.courier;
    } else {
      json[r'courier'] = null;
    }
    if (this.dates != null) {
      json[r'dates'] = this.dates;
    } else {
      json[r'dates'] = null;
    }
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    if (this.address != null) {
      json[r'address'] = this.address;
    } else {
      json[r'address'] = null;
    }
    if (this.vat != null) {
      json[r'vat'] = this.vat;
    } else {
      json[r'vat'] = null;
    }
    if (this.deliveryServiceId != null) {
      json[r'deliveryServiceId'] = this.deliveryServiceId;
    } else {
      json[r'deliveryServiceId'] = null;
    }
    if (this.liftType != null) {
      json[r'liftType'] = this.liftType;
    } else {
      json[r'liftType'] = null;
    }
    if (this.liftPrice != null) {
      json[r'liftPrice'] = this.liftPrice;
    } else {
      json[r'liftPrice'] = null;
    }
    if (this.outletCode != null) {
      json[r'outletCode'] = this.outletCode;
    } else {
      json[r'outletCode'] = null;
    }
    if (this.outletStorageLimitDate != null) {
      json[r'outletStorageLimitDate'] = this.outletStorageLimitDate;
    } else {
      json[r'outletStorageLimitDate'] = null;
    }
    if (this.dispatchType != null) {
      json[r'dispatchType'] = this.dispatchType;
    } else {
      json[r'dispatchType'] = null;
    }
    if (this.tracks != null) {
      json[r'tracks'] = this.tracks;
    } else {
      json[r'tracks'] = null;
    }
    if (this.shipments != null) {
      json[r'shipments'] = this.shipments;
    } else {
      json[r'shipments'] = null;
    }
    if (this.estimated != null) {
      json[r'estimated'] = this.estimated;
    } else {
      json[r'estimated'] = null;
    }
    if (this.eacType != null) {
      json[r'eacType'] = this.eacType;
    } else {
      json[r'eacType'] = null;
    }
    if (this.eacCode != null) {
      json[r'eacCode'] = this.eacCode;
    } else {
      json[r'eacCode'] = null;
    }
    return json;
  }

  /// Returns a new [OrderDeliveryDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderDeliveryDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderDeliveryDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderDeliveryDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderDeliveryDTO(
        id: mapValueOfType<String>(json, r'id'),
        type: OrderDeliveryType.fromJson(json[r'type']),
        serviceName: mapValueOfType<String>(json, r'serviceName'),
        price: num.parse('${json[r'price']}'),
        deliveryPartnerType: OrderDeliveryPartnerType.fromJson(json[r'deliveryPartnerType']),
        courier: OrderCourierDTO.fromJson(json[r'courier']),
        dates: OrderDeliveryDatesDTO.fromJson(json[r'dates']),
        region: RegionDTO.fromJson(json[r'region']),
        address: OrderDeliveryAddressDTO.fromJson(json[r'address']),
        vat: OrderVatType.fromJson(json[r'vat']),
        deliveryServiceId: mapValueOfType<int>(json, r'deliveryServiceId'),
        liftType: OrderLiftType.fromJson(json[r'liftType']),
        liftPrice: num.parse('${json[r'liftPrice']}'),
        outletCode: mapValueOfType<String>(json, r'outletCode'),
        outletStorageLimitDate: mapValueOfType<String>(json, r'outletStorageLimitDate'),
        dispatchType: OrderDeliveryDispatchType.fromJson(json[r'dispatchType']),
        tracks: OrderTrackDTO.listFromJson(json[r'tracks']),
        shipments: OrderShipmentDTO.listFromJson(json[r'shipments']),
        estimated: mapValueOfType<bool>(json, r'estimated'),
        eacType: OrderDeliveryEacType.fromJson(json[r'eacType']),
        eacCode: mapValueOfType<String>(json, r'eacCode'),
      );
    }
    return null;
  }

  static List<OrderDeliveryDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderDeliveryDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderDeliveryDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderDeliveryDTO> mapFromJson(dynamic json) {
    final map = <String, OrderDeliveryDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderDeliveryDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderDeliveryDTO-objects as value to a dart map
  static Map<String, List<OrderDeliveryDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderDeliveryDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderDeliveryDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


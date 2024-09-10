//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrdersStatsOrderDTO {
  /// Returns a new [OrdersStatsOrderDTO] instance.
  OrdersStatsOrderDTO({
    this.id,
    this.creationDate,
    this.statusUpdateDate,
    this.status,
    this.partnerOrderId,
    this.paymentType,
    this.fake,
    this.deliveryRegion,
    this.items = const [],
    this.initialItems = const [],
    this.payments = const [],
    this.commissions = const [],
  });

  /// Идентификатор заказа.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? creationDate;

  /// Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? statusUpdateDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderStatsStatusType? status;

  /// Идентификатор заказа в информационной системе магазина.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerOrderId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsOrderPaymentType? paymentType;

  /// Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? fake;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrdersStatsDeliveryRegionDTO? deliveryRegion;

  /// Список товаров в заказе после возможных изменений.
  List<OrdersStatsItemDTO> items;

  /// Список товаров в заказе до изменений.
  List<OrdersStatsItemDTO>? initialItems;

  /// Информация о денежных переводах по заказу.
  List<OrdersStatsPaymentDTO> payments;

  /// Информация о комиссиях за заказ.
  List<OrdersStatsCommissionDTO> commissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrdersStatsOrderDTO &&
    other.id == id &&
    other.creationDate == creationDate &&
    other.statusUpdateDate == statusUpdateDate &&
    other.status == status &&
    other.partnerOrderId == partnerOrderId &&
    other.paymentType == paymentType &&
    other.fake == fake &&
    other.deliveryRegion == deliveryRegion &&
    _deepEquality.equals(other.items, items) &&
    _deepEquality.equals(other.initialItems, initialItems) &&
    _deepEquality.equals(other.payments, payments) &&
    _deepEquality.equals(other.commissions, commissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (creationDate == null ? 0 : creationDate!.hashCode) +
    (statusUpdateDate == null ? 0 : statusUpdateDate!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (partnerOrderId == null ? 0 : partnerOrderId!.hashCode) +
    (paymentType == null ? 0 : paymentType!.hashCode) +
    (fake == null ? 0 : fake!.hashCode) +
    (deliveryRegion == null ? 0 : deliveryRegion!.hashCode) +
    (items.hashCode) +
    (initialItems == null ? 0 : initialItems!.hashCode) +
    (payments.hashCode) +
    (commissions.hashCode);

  @override
  String toString() => 'OrdersStatsOrderDTO[id=$id, creationDate=$creationDate, statusUpdateDate=$statusUpdateDate, status=$status, partnerOrderId=$partnerOrderId, paymentType=$paymentType, fake=$fake, deliveryRegion=$deliveryRegion, items=$items, initialItems=$initialItems, payments=$payments, commissions=$commissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.creationDate != null) {
      json[r'creationDate'] = _dateFormatter.format(this.creationDate!.toUtc());
    } else {
      json[r'creationDate'] = null;
    }
    if (this.statusUpdateDate != null) {
      json[r'statusUpdateDate'] = this.statusUpdateDate!.toUtc().toIso8601String();
    } else {
      json[r'statusUpdateDate'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.partnerOrderId != null) {
      json[r'partnerOrderId'] = this.partnerOrderId;
    } else {
      json[r'partnerOrderId'] = null;
    }
    if (this.paymentType != null) {
      json[r'paymentType'] = this.paymentType;
    } else {
      json[r'paymentType'] = null;
    }
    if (this.fake != null) {
      json[r'fake'] = this.fake;
    } else {
      json[r'fake'] = null;
    }
    if (this.deliveryRegion != null) {
      json[r'deliveryRegion'] = this.deliveryRegion;
    } else {
      json[r'deliveryRegion'] = null;
    }
      json[r'items'] = this.items;
    if (this.initialItems != null) {
      json[r'initialItems'] = this.initialItems;
    } else {
      json[r'initialItems'] = null;
    }
      json[r'payments'] = this.payments;
      json[r'commissions'] = this.commissions;
    return json;
  }

  /// Returns a new [OrdersStatsOrderDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrdersStatsOrderDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrdersStatsOrderDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrdersStatsOrderDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrdersStatsOrderDTO(
        id: mapValueOfType<int>(json, r'id'),
        creationDate: mapDateTime(json, r'creationDate', r''),
        statusUpdateDate: mapDateTime(json, r'statusUpdateDate', r''),
        status: OrderStatsStatusType.fromJson(json[r'status']),
        partnerOrderId: mapValueOfType<String>(json, r'partnerOrderId'),
        paymentType: OrdersStatsOrderPaymentType.fromJson(json[r'paymentType']),
        fake: mapValueOfType<bool>(json, r'fake'),
        deliveryRegion: OrdersStatsDeliveryRegionDTO.fromJson(json[r'deliveryRegion']),
        items: OrdersStatsItemDTO.listFromJson(json[r'items']),
        initialItems: OrdersStatsItemDTO.listFromJson(json[r'initialItems']),
        payments: OrdersStatsPaymentDTO.listFromJson(json[r'payments']),
        commissions: OrdersStatsCommissionDTO.listFromJson(json[r'commissions']),
      );
    }
    return null;
  }

  static List<OrdersStatsOrderDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrdersStatsOrderDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrdersStatsOrderDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrdersStatsOrderDTO> mapFromJson(dynamic json) {
    final map = <String, OrdersStatsOrderDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrdersStatsOrderDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrdersStatsOrderDTO-objects as value to a dart map
  static Map<String, List<OrdersStatsOrderDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrdersStatsOrderDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrdersStatsOrderDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
    'payments',
    'commissions',
  };
}


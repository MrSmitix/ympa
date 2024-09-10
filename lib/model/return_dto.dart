//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ReturnDTO {
  /// Returns a new [ReturnDTO] instance.
  ReturnDTO({
    this.id,
    this.orderId,
    this.creationDate,
    this.updateDate,
    this.refundStatus,
    this.logisticPickupPoint,
    this.shipmentRecipientType,
    this.shipmentStatus,
    this.refundAmount,
    this.items = const [],
    this.returnType,
    this.fastReturn,
  });

  /// Идентификатор возврата.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Номер заказа.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? orderId;

  /// Дата создания возврата клиентом.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? creationDate;

  /// Дата обновления возврата.
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
  RefundStatusType? refundStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LogisticPickupPointDTO? logisticPickupPoint;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RecipientType? shipmentRecipientType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnShipmentStatusType? shipmentStatus;

  /// Сумма возврата.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? refundAmount;

  /// Список товаров в возврате.
  List<ReturnItemDTO> items;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReturnType? returnType;

  /// Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? fastReturn;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ReturnDTO &&
    other.id == id &&
    other.orderId == orderId &&
    other.creationDate == creationDate &&
    other.updateDate == updateDate &&
    other.refundStatus == refundStatus &&
    other.logisticPickupPoint == logisticPickupPoint &&
    other.shipmentRecipientType == shipmentRecipientType &&
    other.shipmentStatus == shipmentStatus &&
    other.refundAmount == refundAmount &&
    _deepEquality.equals(other.items, items) &&
    other.returnType == returnType &&
    other.fastReturn == fastReturn;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (orderId == null ? 0 : orderId!.hashCode) +
    (creationDate == null ? 0 : creationDate!.hashCode) +
    (updateDate == null ? 0 : updateDate!.hashCode) +
    (refundStatus == null ? 0 : refundStatus!.hashCode) +
    (logisticPickupPoint == null ? 0 : logisticPickupPoint!.hashCode) +
    (shipmentRecipientType == null ? 0 : shipmentRecipientType!.hashCode) +
    (shipmentStatus == null ? 0 : shipmentStatus!.hashCode) +
    (refundAmount == null ? 0 : refundAmount!.hashCode) +
    (items.hashCode) +
    (returnType == null ? 0 : returnType!.hashCode) +
    (fastReturn == null ? 0 : fastReturn!.hashCode);

  @override
  String toString() => 'ReturnDTO[id=$id, orderId=$orderId, creationDate=$creationDate, updateDate=$updateDate, refundStatus=$refundStatus, logisticPickupPoint=$logisticPickupPoint, shipmentRecipientType=$shipmentRecipientType, shipmentStatus=$shipmentStatus, refundAmount=$refundAmount, items=$items, returnType=$returnType, fastReturn=$fastReturn]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.orderId != null) {
      json[r'orderId'] = this.orderId;
    } else {
      json[r'orderId'] = null;
    }
    if (this.creationDate != null) {
      json[r'creationDate'] = this.creationDate!.toUtc().toIso8601String();
    } else {
      json[r'creationDate'] = null;
    }
    if (this.updateDate != null) {
      json[r'updateDate'] = this.updateDate!.toUtc().toIso8601String();
    } else {
      json[r'updateDate'] = null;
    }
    if (this.refundStatus != null) {
      json[r'refundStatus'] = this.refundStatus;
    } else {
      json[r'refundStatus'] = null;
    }
    if (this.logisticPickupPoint != null) {
      json[r'logisticPickupPoint'] = this.logisticPickupPoint;
    } else {
      json[r'logisticPickupPoint'] = null;
    }
    if (this.shipmentRecipientType != null) {
      json[r'shipmentRecipientType'] = this.shipmentRecipientType;
    } else {
      json[r'shipmentRecipientType'] = null;
    }
    if (this.shipmentStatus != null) {
      json[r'shipmentStatus'] = this.shipmentStatus;
    } else {
      json[r'shipmentStatus'] = null;
    }
    if (this.refundAmount != null) {
      json[r'refundAmount'] = this.refundAmount;
    } else {
      json[r'refundAmount'] = null;
    }
      json[r'items'] = this.items;
    if (this.returnType != null) {
      json[r'returnType'] = this.returnType;
    } else {
      json[r'returnType'] = null;
    }
    if (this.fastReturn != null) {
      json[r'fastReturn'] = this.fastReturn;
    } else {
      json[r'fastReturn'] = null;
    }
    return json;
  }

  /// Returns a new [ReturnDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ReturnDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ReturnDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ReturnDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ReturnDTO(
        id: mapValueOfType<int>(json, r'id'),
        orderId: mapValueOfType<int>(json, r'orderId'),
        creationDate: mapDateTime(json, r'creationDate', r''),
        updateDate: mapDateTime(json, r'updateDate', r''),
        refundStatus: RefundStatusType.fromJson(json[r'refundStatus']),
        logisticPickupPoint: LogisticPickupPointDTO.fromJson(json[r'logisticPickupPoint']),
        shipmentRecipientType: RecipientType.fromJson(json[r'shipmentRecipientType']),
        shipmentStatus: ReturnShipmentStatusType.fromJson(json[r'shipmentStatus']),
        refundAmount: mapValueOfType<int>(json, r'refundAmount'),
        items: ReturnItemDTO.listFromJson(json[r'items']),
        returnType: ReturnType.fromJson(json[r'returnType']),
        fastReturn: mapValueOfType<bool>(json, r'fastReturn'),
      );
    }
    return null;
  }

  static List<ReturnDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReturnDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReturnDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ReturnDTO> mapFromJson(dynamic json) {
    final map = <String, ReturnDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ReturnDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ReturnDTO-objects as value to a dart map
  static Map<String, List<ReturnDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ReturnDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ReturnDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
  };
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ShipmentDTO {
  /// Returns a new [ShipmentDTO] instance.
  ShipmentDTO({
    this.id,
    this.planIntervalFrom,
    this.planIntervalTo,
    this.shipmentType,
    this.warehouse,
    this.warehouseTo,
    this.externalId,
    this.deliveryService,
    this.palletsCount,
    this.orderIds = const {},
    this.draftCount,
    this.plannedCount,
    this.factCount,
    this.currentStatus,
    this.availableActions = const {},
  });

  /// Идентификатор отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Начало планового интервала отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? planIntervalFrom;

  /// Конец планового интервала отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? planIntervalTo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ShipmentType? shipmentType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PartnerShipmentWarehouseDTO? warehouse;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PartnerShipmentWarehouseDTO? warehouseTo;

  /// Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? externalId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DeliveryServiceDTO? deliveryService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PalletsCountDTO? palletsCount;

  /// Идентификаторы заказов в отгрузке.
  Set<int> orderIds;

  /// Количество заказов, которое Маркет запланировал к отгрузке.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? draftCount;

  /// Количество заказов, которое Маркет подтвердил к отгрузке.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? plannedCount;

  /// Количество заказов, принятых в сортировочном центре или пункте приема.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? factCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ShipmentStatusChangeDTO? currentStatus;

  /// Доступные действия над отгрузкой.
  Set<ShipmentActionType> availableActions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ShipmentDTO &&
    other.id == id &&
    other.planIntervalFrom == planIntervalFrom &&
    other.planIntervalTo == planIntervalTo &&
    other.shipmentType == shipmentType &&
    other.warehouse == warehouse &&
    other.warehouseTo == warehouseTo &&
    other.externalId == externalId &&
    other.deliveryService == deliveryService &&
    other.palletsCount == palletsCount &&
    _deepEquality.equals(other.orderIds, orderIds) &&
    other.draftCount == draftCount &&
    other.plannedCount == plannedCount &&
    other.factCount == factCount &&
    other.currentStatus == currentStatus &&
    _deepEquality.equals(other.availableActions, availableActions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (planIntervalFrom == null ? 0 : planIntervalFrom!.hashCode) +
    (planIntervalTo == null ? 0 : planIntervalTo!.hashCode) +
    (shipmentType == null ? 0 : shipmentType!.hashCode) +
    (warehouse == null ? 0 : warehouse!.hashCode) +
    (warehouseTo == null ? 0 : warehouseTo!.hashCode) +
    (externalId == null ? 0 : externalId!.hashCode) +
    (deliveryService == null ? 0 : deliveryService!.hashCode) +
    (palletsCount == null ? 0 : palletsCount!.hashCode) +
    (orderIds.hashCode) +
    (draftCount == null ? 0 : draftCount!.hashCode) +
    (plannedCount == null ? 0 : plannedCount!.hashCode) +
    (factCount == null ? 0 : factCount!.hashCode) +
    (currentStatus == null ? 0 : currentStatus!.hashCode) +
    (availableActions.hashCode);

  @override
  String toString() => 'ShipmentDTO[id=$id, planIntervalFrom=$planIntervalFrom, planIntervalTo=$planIntervalTo, shipmentType=$shipmentType, warehouse=$warehouse, warehouseTo=$warehouseTo, externalId=$externalId, deliveryService=$deliveryService, palletsCount=$palletsCount, orderIds=$orderIds, draftCount=$draftCount, plannedCount=$plannedCount, factCount=$factCount, currentStatus=$currentStatus, availableActions=$availableActions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.planIntervalFrom != null) {
      json[r'planIntervalFrom'] = this.planIntervalFrom!.toUtc().toIso8601String();
    } else {
      json[r'planIntervalFrom'] = null;
    }
    if (this.planIntervalTo != null) {
      json[r'planIntervalTo'] = this.planIntervalTo!.toUtc().toIso8601String();
    } else {
      json[r'planIntervalTo'] = null;
    }
    if (this.shipmentType != null) {
      json[r'shipmentType'] = this.shipmentType;
    } else {
      json[r'shipmentType'] = null;
    }
    if (this.warehouse != null) {
      json[r'warehouse'] = this.warehouse;
    } else {
      json[r'warehouse'] = null;
    }
    if (this.warehouseTo != null) {
      json[r'warehouseTo'] = this.warehouseTo;
    } else {
      json[r'warehouseTo'] = null;
    }
    if (this.externalId != null) {
      json[r'externalId'] = this.externalId;
    } else {
      json[r'externalId'] = null;
    }
    if (this.deliveryService != null) {
      json[r'deliveryService'] = this.deliveryService;
    } else {
      json[r'deliveryService'] = null;
    }
    if (this.palletsCount != null) {
      json[r'palletsCount'] = this.palletsCount;
    } else {
      json[r'palletsCount'] = null;
    }
      json[r'orderIds'] = this.orderIds.toList(growable: false);
    if (this.draftCount != null) {
      json[r'draftCount'] = this.draftCount;
    } else {
      json[r'draftCount'] = null;
    }
    if (this.plannedCount != null) {
      json[r'plannedCount'] = this.plannedCount;
    } else {
      json[r'plannedCount'] = null;
    }
    if (this.factCount != null) {
      json[r'factCount'] = this.factCount;
    } else {
      json[r'factCount'] = null;
    }
    if (this.currentStatus != null) {
      json[r'currentStatus'] = this.currentStatus;
    } else {
      json[r'currentStatus'] = null;
    }
      json[r'availableActions'] = this.availableActions.toList(growable: false);
    return json;
  }

  /// Returns a new [ShipmentDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ShipmentDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ShipmentDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ShipmentDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ShipmentDTO(
        id: mapValueOfType<int>(json, r'id'),
        planIntervalFrom: mapDateTime(json, r'planIntervalFrom', r''),
        planIntervalTo: mapDateTime(json, r'planIntervalTo', r''),
        shipmentType: ShipmentType.fromJson(json[r'shipmentType']),
        warehouse: PartnerShipmentWarehouseDTO.fromJson(json[r'warehouse']),
        warehouseTo: PartnerShipmentWarehouseDTO.fromJson(json[r'warehouseTo']),
        externalId: mapValueOfType<String>(json, r'externalId'),
        deliveryService: DeliveryServiceDTO.fromJson(json[r'deliveryService']),
        palletsCount: PalletsCountDTO.fromJson(json[r'palletsCount']),
        orderIds: json[r'orderIds'] is Iterable
            ? (json[r'orderIds'] as Iterable).cast<int>().toSet()
            : const {},
        draftCount: mapValueOfType<int>(json, r'draftCount'),
        plannedCount: mapValueOfType<int>(json, r'plannedCount'),
        factCount: mapValueOfType<int>(json, r'factCount'),
        currentStatus: ShipmentStatusChangeDTO.fromJson(json[r'currentStatus']),
        availableActions: ShipmentActionType.listFromJson(json[r'availableActions']).toSet(),
      );
    }
    return null;
  }

  static List<ShipmentDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ShipmentDTO> mapFromJson(dynamic json) {
    final map = <String, ShipmentDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ShipmentDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ShipmentDTO-objects as value to a dart map
  static Map<String, List<ShipmentDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ShipmentDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ShipmentDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderIds',
    'availableActions',
  };
}


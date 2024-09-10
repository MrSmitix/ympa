//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderShipmentDTO {
  /// Returns a new [OrderShipmentDTO] instance.
  OrderShipmentDTO({
    this.id,
    this.shipmentDate,
    this.shipmentTime,
    this.tracks = const [],
    this.boxes = const [],
  });

  /// Идентификатор посылки, присвоенный Маркетом.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shipmentDate;

  /// **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shipmentTime;

  /// **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  List<OrderTrackDTO>? tracks;

  /// Список грузовых мест.
  List<OrderParcelBoxDTO>? boxes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderShipmentDTO &&
    other.id == id &&
    other.shipmentDate == shipmentDate &&
    other.shipmentTime == shipmentTime &&
    _deepEquality.equals(other.tracks, tracks) &&
    _deepEquality.equals(other.boxes, boxes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (shipmentDate == null ? 0 : shipmentDate!.hashCode) +
    (shipmentTime == null ? 0 : shipmentTime!.hashCode) +
    (tracks == null ? 0 : tracks!.hashCode) +
    (boxes == null ? 0 : boxes!.hashCode);

  @override
  String toString() => 'OrderShipmentDTO[id=$id, shipmentDate=$shipmentDate, shipmentTime=$shipmentTime, tracks=$tracks, boxes=$boxes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.shipmentDate != null) {
      json[r'shipmentDate'] = this.shipmentDate;
    } else {
      json[r'shipmentDate'] = null;
    }
    if (this.shipmentTime != null) {
      json[r'shipmentTime'] = this.shipmentTime;
    } else {
      json[r'shipmentTime'] = null;
    }
    if (this.tracks != null) {
      json[r'tracks'] = this.tracks;
    } else {
      json[r'tracks'] = null;
    }
    if (this.boxes != null) {
      json[r'boxes'] = this.boxes;
    } else {
      json[r'boxes'] = null;
    }
    return json;
  }

  /// Returns a new [OrderShipmentDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderShipmentDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderShipmentDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderShipmentDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderShipmentDTO(
        id: mapValueOfType<int>(json, r'id'),
        shipmentDate: mapValueOfType<String>(json, r'shipmentDate'),
        shipmentTime: mapValueOfType<String>(json, r'shipmentTime'),
        tracks: OrderTrackDTO.listFromJson(json[r'tracks']),
        boxes: OrderParcelBoxDTO.listFromJson(json[r'boxes']),
      );
    }
    return null;
  }

  static List<OrderShipmentDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderShipmentDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderShipmentDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderShipmentDTO> mapFromJson(dynamic json) {
    final map = <String, OrderShipmentDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderShipmentDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderShipmentDTO-objects as value to a dart map
  static Map<String, List<OrderShipmentDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderShipmentDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderShipmentDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


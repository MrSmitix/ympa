//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderItemDetailDTO {
  /// Returns a new [OrderItemDetailDTO] instance.
  OrderItemDetailDTO({
    this.itemCount,
    this.itemStatus,
    this.updateDate,
  });

  /// Количество единиц товара.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? itemCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderItemStatusType? itemStatus;

  /// Формат даты: `ДД-ММ-ГГГГ`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? updateDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderItemDetailDTO &&
    other.itemCount == itemCount &&
    other.itemStatus == itemStatus &&
    other.updateDate == updateDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemCount == null ? 0 : itemCount!.hashCode) +
    (itemStatus == null ? 0 : itemStatus!.hashCode) +
    (updateDate == null ? 0 : updateDate!.hashCode);

  @override
  String toString() => 'OrderItemDetailDTO[itemCount=$itemCount, itemStatus=$itemStatus, updateDate=$updateDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.itemCount != null) {
      json[r'itemCount'] = this.itemCount;
    } else {
      json[r'itemCount'] = null;
    }
    if (this.itemStatus != null) {
      json[r'itemStatus'] = this.itemStatus;
    } else {
      json[r'itemStatus'] = null;
    }
    if (this.updateDate != null) {
      json[r'updateDate'] = this.updateDate;
    } else {
      json[r'updateDate'] = null;
    }
    return json;
  }

  /// Returns a new [OrderItemDetailDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderItemDetailDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderItemDetailDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderItemDetailDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderItemDetailDTO(
        itemCount: mapValueOfType<int>(json, r'itemCount'),
        itemStatus: OrderItemStatusType.fromJson(json[r'itemStatus']),
        updateDate: mapValueOfType<String>(json, r'updateDate'),
      );
    }
    return null;
  }

  static List<OrderItemDetailDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderItemDetailDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderItemDetailDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderItemDetailDTO> mapFromJson(dynamic json) {
    final map = <String, OrderItemDetailDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderItemDetailDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderItemDetailDTO-objects as value to a dart map
  static Map<String, List<OrderItemDetailDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderItemDetailDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderItemDetailDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


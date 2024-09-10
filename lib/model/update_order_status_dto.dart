//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateOrderStatusDTO {
  /// Returns a new [UpdateOrderStatusDTO] instance.
  UpdateOrderStatusDTO({
    this.id,
    this.status,
    this.substatus,
    this.updateStatus,
    this.errorDetails,
  });

  /// Идентификатор заказа.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderStatusType? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderSubstatusType? substatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OrderUpdateStatusType? updateStatus;

  /// Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateOrderStatusDTO &&
    other.id == id &&
    other.status == status &&
    other.substatus == substatus &&
    other.updateStatus == updateStatus &&
    other.errorDetails == errorDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (substatus == null ? 0 : substatus!.hashCode) +
    (updateStatus == null ? 0 : updateStatus!.hashCode) +
    (errorDetails == null ? 0 : errorDetails!.hashCode);

  @override
  String toString() => 'UpdateOrderStatusDTO[id=$id, status=$status, substatus=$substatus, updateStatus=$updateStatus, errorDetails=$errorDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.substatus != null) {
      json[r'substatus'] = this.substatus;
    } else {
      json[r'substatus'] = null;
    }
    if (this.updateStatus != null) {
      json[r'updateStatus'] = this.updateStatus;
    } else {
      json[r'updateStatus'] = null;
    }
    if (this.errorDetails != null) {
      json[r'errorDetails'] = this.errorDetails;
    } else {
      json[r'errorDetails'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateOrderStatusDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateOrderStatusDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateOrderStatusDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateOrderStatusDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateOrderStatusDTO(
        id: mapValueOfType<int>(json, r'id'),
        status: OrderStatusType.fromJson(json[r'status']),
        substatus: OrderSubstatusType.fromJson(json[r'substatus']),
        updateStatus: OrderUpdateStatusType.fromJson(json[r'updateStatus']),
        errorDetails: mapValueOfType<String>(json, r'errorDetails'),
      );
    }
    return null;
  }

  static List<UpdateOrderStatusDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateOrderStatusDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateOrderStatusDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateOrderStatusDTO> mapFromJson(dynamic json) {
    final map = <String, UpdateOrderStatusDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateOrderStatusDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateOrderStatusDTO-objects as value to a dart map
  static Map<String, List<UpdateOrderStatusDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateOrderStatusDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateOrderStatusDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


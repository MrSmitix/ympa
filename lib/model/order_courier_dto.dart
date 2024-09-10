//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrderCourierDTO {
  /// Returns a new [OrderCourierDTO] instance.
  OrderCourierDTO({
    this.fullName,
    this.phone,
    this.phoneExtension,
    this.vehicleNumber,
    this.vehicleDescription,
  });

  /// Полное имя курьера.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fullName;

  /// Номер телефона курьера.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? phone;

  /// Добавочный номер телефона.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? phoneExtension;

  /// Номер транспортного средства.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vehicleNumber;

  /// Описание машины. Например, модель и цвет.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? vehicleDescription;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrderCourierDTO &&
    other.fullName == fullName &&
    other.phone == phone &&
    other.phoneExtension == phoneExtension &&
    other.vehicleNumber == vehicleNumber &&
    other.vehicleDescription == vehicleDescription;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fullName == null ? 0 : fullName!.hashCode) +
    (phone == null ? 0 : phone!.hashCode) +
    (phoneExtension == null ? 0 : phoneExtension!.hashCode) +
    (vehicleNumber == null ? 0 : vehicleNumber!.hashCode) +
    (vehicleDescription == null ? 0 : vehicleDescription!.hashCode);

  @override
  String toString() => 'OrderCourierDTO[fullName=$fullName, phone=$phone, phoneExtension=$phoneExtension, vehicleNumber=$vehicleNumber, vehicleDescription=$vehicleDescription]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fullName != null) {
      json[r'fullName'] = this.fullName;
    } else {
      json[r'fullName'] = null;
    }
    if (this.phone != null) {
      json[r'phone'] = this.phone;
    } else {
      json[r'phone'] = null;
    }
    if (this.phoneExtension != null) {
      json[r'phoneExtension'] = this.phoneExtension;
    } else {
      json[r'phoneExtension'] = null;
    }
    if (this.vehicleNumber != null) {
      json[r'vehicleNumber'] = this.vehicleNumber;
    } else {
      json[r'vehicleNumber'] = null;
    }
    if (this.vehicleDescription != null) {
      json[r'vehicleDescription'] = this.vehicleDescription;
    } else {
      json[r'vehicleDescription'] = null;
    }
    return json;
  }

  /// Returns a new [OrderCourierDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrderCourierDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrderCourierDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrderCourierDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrderCourierDTO(
        fullName: mapValueOfType<String>(json, r'fullName'),
        phone: mapValueOfType<String>(json, r'phone'),
        phoneExtension: mapValueOfType<String>(json, r'phoneExtension'),
        vehicleNumber: mapValueOfType<String>(json, r'vehicleNumber'),
        vehicleDescription: mapValueOfType<String>(json, r'vehicleDescription'),
      );
    }
    return null;
  }

  static List<OrderCourierDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderCourierDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderCourierDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrderCourierDTO> mapFromJson(dynamic json) {
    final map = <String, OrderCourierDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrderCourierDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrderCourierDTO-objects as value to a dart map
  static Map<String, List<OrderCourierDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrderCourierDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrderCourierDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


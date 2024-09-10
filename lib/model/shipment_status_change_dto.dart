//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ShipmentStatusChangeDTO {
  /// Returns a new [ShipmentStatusChangeDTO] instance.
  ShipmentStatusChangeDTO({
    this.status,
    this.description,
    this.updateTime,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ShipmentStatusType? status;

  /// Описание статуса отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Время последнего изменения статуса отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? updateTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ShipmentStatusChangeDTO &&
    other.status == status &&
    other.description == description &&
    other.updateTime == updateTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (updateTime == null ? 0 : updateTime!.hashCode);

  @override
  String toString() => 'ShipmentStatusChangeDTO[status=$status, description=$description, updateTime=$updateTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.updateTime != null) {
      json[r'updateTime'] = this.updateTime!.toUtc().toIso8601String();
    } else {
      json[r'updateTime'] = null;
    }
    return json;
  }

  /// Returns a new [ShipmentStatusChangeDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ShipmentStatusChangeDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ShipmentStatusChangeDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ShipmentStatusChangeDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ShipmentStatusChangeDTO(
        status: ShipmentStatusType.fromJson(json[r'status']),
        description: mapValueOfType<String>(json, r'description'),
        updateTime: mapDateTime(json, r'updateTime', r''),
      );
    }
    return null;
  }

  static List<ShipmentStatusChangeDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ShipmentStatusChangeDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ShipmentStatusChangeDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ShipmentStatusChangeDTO> mapFromJson(dynamic json) {
    final map = <String, ShipmentStatusChangeDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ShipmentStatusChangeDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ShipmentStatusChangeDTO-objects as value to a dart map
  static Map<String, List<ShipmentStatusChangeDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ShipmentStatusChangeDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ShipmentStatusChangeDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


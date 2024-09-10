//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ExtensionShipmentDTO {
  /// Returns a new [ExtensionShipmentDTO] instance.
  ExtensionShipmentDTO({
    this.currentStatus,
    this.availableActions = const {},
  });

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
  bool operator ==(Object other) => identical(this, other) || other is ExtensionShipmentDTO &&
    other.currentStatus == currentStatus &&
    _deepEquality.equals(other.availableActions, availableActions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (currentStatus == null ? 0 : currentStatus!.hashCode) +
    (availableActions.hashCode);

  @override
  String toString() => 'ExtensionShipmentDTO[currentStatus=$currentStatus, availableActions=$availableActions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.currentStatus != null) {
      json[r'currentStatus'] = this.currentStatus;
    } else {
      json[r'currentStatus'] = null;
    }
      json[r'availableActions'] = this.availableActions.toList(growable: false);
    return json;
  }

  /// Returns a new [ExtensionShipmentDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ExtensionShipmentDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ExtensionShipmentDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ExtensionShipmentDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ExtensionShipmentDTO(
        currentStatus: ShipmentStatusChangeDTO.fromJson(json[r'currentStatus']),
        availableActions: ShipmentActionType.listFromJson(json[r'availableActions']).toSet(),
      );
    }
    return null;
  }

  static List<ExtensionShipmentDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ExtensionShipmentDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ExtensionShipmentDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ExtensionShipmentDTO> mapFromJson(dynamic json) {
    final map = <String, ExtensionShipmentDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ExtensionShipmentDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ExtensionShipmentDTO-objects as value to a dart map
  static Map<String, List<ExtensionShipmentDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ExtensionShipmentDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ExtensionShipmentDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'availableActions',
  };
}


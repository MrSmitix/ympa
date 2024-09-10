//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TransferOrdersFromShipmentRequest {
  /// Returns a new [TransferOrdersFromShipmentRequest] instance.
  TransferOrdersFromShipmentRequest({
    this.orderIds = const [],
  });

  /// Список заказов, которые вы не успеваете подготовить.
  List<int> orderIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TransferOrdersFromShipmentRequest &&
    _deepEquality.equals(other.orderIds, orderIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orderIds.hashCode);

  @override
  String toString() => 'TransferOrdersFromShipmentRequest[orderIds=$orderIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'orderIds'] = this.orderIds;
    return json;
  }

  /// Returns a new [TransferOrdersFromShipmentRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TransferOrdersFromShipmentRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TransferOrdersFromShipmentRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TransferOrdersFromShipmentRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TransferOrdersFromShipmentRequest(
        orderIds: json[r'orderIds'] is Iterable
            ? (json[r'orderIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TransferOrdersFromShipmentRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TransferOrdersFromShipmentRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TransferOrdersFromShipmentRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TransferOrdersFromShipmentRequest> mapFromJson(dynamic json) {
    final map = <String, TransferOrdersFromShipmentRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TransferOrdersFromShipmentRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TransferOrdersFromShipmentRequest-objects as value to a dart map
  static Map<String, List<TransferOrdersFromShipmentRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TransferOrdersFromShipmentRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TransferOrdersFromShipmentRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orderIds',
  };
}


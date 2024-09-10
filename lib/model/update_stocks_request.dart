//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateStocksRequest {
  /// Returns a new [UpdateStocksRequest] instance.
  UpdateStocksRequest({
    this.skus = const {},
  });

  /// Данные об остатках товаров. 
  Set<UpdateStockDTO> skus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateStocksRequest &&
    _deepEquality.equals(other.skus, skus);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (skus.hashCode);

  @override
  String toString() => 'UpdateStocksRequest[skus=$skus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'skus'] = this.skus.toList(growable: false);
    return json;
  }

  /// Returns a new [UpdateStocksRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateStocksRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateStocksRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateStocksRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateStocksRequest(
        skus: UpdateStockDTO.listFromJson(json[r'skus']).toSet(),
      );
    }
    return null;
  }

  static List<UpdateStocksRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateStocksRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateStocksRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateStocksRequest> mapFromJson(dynamic json) {
    final map = <String, UpdateStocksRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateStocksRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateStocksRequest-objects as value to a dart map
  static Map<String, List<UpdateStocksRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateStocksRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateStocksRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'skus',
  };
}


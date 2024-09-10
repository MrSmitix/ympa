//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class WarehouseOffersDTO {
  /// Returns a new [WarehouseOffersDTO] instance.
  WarehouseOffersDTO({
    required this.warehouseId,
    this.offers = const [],
  });

  /// Идентификатор склада.
  int warehouseId;

  /// Информация об остатках.
  List<WarehouseOfferDTO> offers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is WarehouseOffersDTO &&
    other.warehouseId == warehouseId &&
    _deepEquality.equals(other.offers, offers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (warehouseId.hashCode) +
    (offers.hashCode);

  @override
  String toString() => 'WarehouseOffersDTO[warehouseId=$warehouseId, offers=$offers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'warehouseId'] = this.warehouseId;
      json[r'offers'] = this.offers;
    return json;
  }

  /// Returns a new [WarehouseOffersDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static WarehouseOffersDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "WarehouseOffersDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "WarehouseOffersDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return WarehouseOffersDTO(
        warehouseId: mapValueOfType<int>(json, r'warehouseId')!,
        offers: WarehouseOfferDTO.listFromJson(json[r'offers']),
      );
    }
    return null;
  }

  static List<WarehouseOffersDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <WarehouseOffersDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = WarehouseOffersDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, WarehouseOffersDTO> mapFromJson(dynamic json) {
    final map = <String, WarehouseOffersDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = WarehouseOffersDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of WarehouseOffersDTO-objects as value to a dart map
  static Map<String, List<WarehouseOffersDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<WarehouseOffersDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = WarehouseOffersDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'warehouseId',
    'offers',
  };
}


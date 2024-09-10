//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoConstraintsDTO {
  /// Returns a new [GetPromoConstraintsDTO] instance.
  GetPromoConstraintsDTO({
    this.warehouseIds = const [],
  });

  /// Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
  List<int>? warehouseIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoConstraintsDTO &&
    _deepEquality.equals(other.warehouseIds, warehouseIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (warehouseIds == null ? 0 : warehouseIds!.hashCode);

  @override
  String toString() => 'GetPromoConstraintsDTO[warehouseIds=$warehouseIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.warehouseIds != null) {
      json[r'warehouseIds'] = this.warehouseIds;
    } else {
      json[r'warehouseIds'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoConstraintsDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoConstraintsDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoConstraintsDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoConstraintsDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoConstraintsDTO(
        warehouseIds: json[r'warehouseIds'] is Iterable
            ? (json[r'warehouseIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GetPromoConstraintsDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoConstraintsDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoConstraintsDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoConstraintsDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoConstraintsDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoConstraintsDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoConstraintsDTO-objects as value to a dart map
  static Map<String, List<GetPromoConstraintsDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoConstraintsDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoConstraintsDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


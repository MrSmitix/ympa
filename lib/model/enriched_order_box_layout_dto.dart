//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EnrichedOrderBoxLayoutDTO {
  /// Returns a new [EnrichedOrderBoxLayoutDTO] instance.
  EnrichedOrderBoxLayoutDTO({
    this.items = const [],
    this.boxId,
  });

  /// Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  List<OrderBoxLayoutItemDTO> items;

  /// Идентификатор коробки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? boxId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EnrichedOrderBoxLayoutDTO &&
    _deepEquality.equals(other.items, items) &&
    other.boxId == boxId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode) +
    (boxId == null ? 0 : boxId!.hashCode);

  @override
  String toString() => 'EnrichedOrderBoxLayoutDTO[items=$items, boxId=$boxId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
    if (this.boxId != null) {
      json[r'boxId'] = this.boxId;
    } else {
      json[r'boxId'] = null;
    }
    return json;
  }

  /// Returns a new [EnrichedOrderBoxLayoutDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EnrichedOrderBoxLayoutDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EnrichedOrderBoxLayoutDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EnrichedOrderBoxLayoutDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EnrichedOrderBoxLayoutDTO(
        items: OrderBoxLayoutItemDTO.listFromJson(json[r'items']),
        boxId: mapValueOfType<int>(json, r'boxId'),
      );
    }
    return null;
  }

  static List<EnrichedOrderBoxLayoutDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EnrichedOrderBoxLayoutDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EnrichedOrderBoxLayoutDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EnrichedOrderBoxLayoutDTO> mapFromJson(dynamic json) {
    final map = <String, EnrichedOrderBoxLayoutDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EnrichedOrderBoxLayoutDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EnrichedOrderBoxLayoutDTO-objects as value to a dart map
  static Map<String, List<EnrichedOrderBoxLayoutDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EnrichedOrderBoxLayoutDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EnrichedOrderBoxLayoutDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
  };
}


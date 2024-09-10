//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OfferSellingProgramDTO {
  /// Returns a new [OfferSellingProgramDTO] instance.
  OfferSellingProgramDTO({
    required this.sellingProgram,
    required this.status,
  });

  SellingProgramType sellingProgram;

  OfferSellingProgramStatusType status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OfferSellingProgramDTO &&
    other.sellingProgram == sellingProgram &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (sellingProgram.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'OfferSellingProgramDTO[sellingProgram=$sellingProgram, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'sellingProgram'] = this.sellingProgram;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [OfferSellingProgramDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OfferSellingProgramDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OfferSellingProgramDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OfferSellingProgramDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OfferSellingProgramDTO(
        sellingProgram: SellingProgramType.fromJson(json[r'sellingProgram'])!,
        status: OfferSellingProgramStatusType.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<OfferSellingProgramDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OfferSellingProgramDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OfferSellingProgramDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OfferSellingProgramDTO> mapFromJson(dynamic json) {
    final map = <String, OfferSellingProgramDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OfferSellingProgramDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OfferSellingProgramDTO-objects as value to a dart map
  static Map<String, List<OfferSellingProgramDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OfferSellingProgramDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OfferSellingProgramDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'sellingProgram',
    'status',
  };
}


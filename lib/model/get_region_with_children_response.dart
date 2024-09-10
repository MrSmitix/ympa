//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetRegionWithChildrenResponse {
  /// Returns a new [GetRegionWithChildrenResponse] instance.
  GetRegionWithChildrenResponse({
    this.pager,
    this.regions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FlippingPagerDTO? pager;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RegionDTO? regions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetRegionWithChildrenResponse &&
    other.pager == pager &&
    other.regions == regions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pager == null ? 0 : pager!.hashCode) +
    (regions == null ? 0 : regions!.hashCode);

  @override
  String toString() => 'GetRegionWithChildrenResponse[pager=$pager, regions=$regions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pager != null) {
      json[r'pager'] = this.pager;
    } else {
      json[r'pager'] = null;
    }
    if (this.regions != null) {
      json[r'regions'] = this.regions;
    } else {
      json[r'regions'] = null;
    }
    return json;
  }

  /// Returns a new [GetRegionWithChildrenResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetRegionWithChildrenResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetRegionWithChildrenResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetRegionWithChildrenResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetRegionWithChildrenResponse(
        pager: FlippingPagerDTO.fromJson(json[r'pager']),
        regions: RegionDTO.fromJson(json[r'regions']),
      );
    }
    return null;
  }

  static List<GetRegionWithChildrenResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetRegionWithChildrenResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetRegionWithChildrenResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetRegionWithChildrenResponse> mapFromJson(dynamic json) {
    final map = <String, GetRegionWithChildrenResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetRegionWithChildrenResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetRegionWithChildrenResponse-objects as value to a dart map
  static Map<String, List<GetRegionWithChildrenResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetRegionWithChildrenResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetRegionWithChildrenResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


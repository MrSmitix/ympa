//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOutletsResponse {
  /// Returns a new [GetOutletsResponse] instance.
  GetOutletsResponse({
    this.outlets = const [],
    this.paging,
    this.pager,
  });

  /// Информация о точках продаж.
  List<FullOutletDTO> outlets;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScrollingPagerDTO? paging;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FlippingPagerDTO? pager;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOutletsResponse &&
    _deepEquality.equals(other.outlets, outlets) &&
    other.paging == paging &&
    other.pager == pager;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (outlets.hashCode) +
    (paging == null ? 0 : paging!.hashCode) +
    (pager == null ? 0 : pager!.hashCode);

  @override
  String toString() => 'GetOutletsResponse[outlets=$outlets, paging=$paging, pager=$pager]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'outlets'] = this.outlets;
    if (this.paging != null) {
      json[r'paging'] = this.paging;
    } else {
      json[r'paging'] = null;
    }
    if (this.pager != null) {
      json[r'pager'] = this.pager;
    } else {
      json[r'pager'] = null;
    }
    return json;
  }

  /// Returns a new [GetOutletsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOutletsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOutletsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOutletsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOutletsResponse(
        outlets: FullOutletDTO.listFromJson(json[r'outlets']),
        paging: ScrollingPagerDTO.fromJson(json[r'paging']),
        pager: FlippingPagerDTO.fromJson(json[r'pager']),
      );
    }
    return null;
  }

  static List<GetOutletsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOutletsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOutletsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOutletsResponse> mapFromJson(dynamic json) {
    final map = <String, GetOutletsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOutletsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOutletsResponse-objects as value to a dart map
  static Map<String, List<GetOutletsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOutletsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOutletsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'outlets',
  };
}


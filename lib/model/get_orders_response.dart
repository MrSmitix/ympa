//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetOrdersResponse {
  /// Returns a new [GetOrdersResponse] instance.
  GetOrdersResponse({
    this.pager,
    this.orders = const [],
    this.paging,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FlippingPagerDTO? pager;

  /// Модель заказа. 
  List<OrderDTO> orders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ForwardScrollingPagerDTO? paging;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetOrdersResponse &&
    other.pager == pager &&
    _deepEquality.equals(other.orders, orders) &&
    other.paging == paging;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pager == null ? 0 : pager!.hashCode) +
    (orders.hashCode) +
    (paging == null ? 0 : paging!.hashCode);

  @override
  String toString() => 'GetOrdersResponse[pager=$pager, orders=$orders, paging=$paging]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pager != null) {
      json[r'pager'] = this.pager;
    } else {
      json[r'pager'] = null;
    }
      json[r'orders'] = this.orders;
    if (this.paging != null) {
      json[r'paging'] = this.paging;
    } else {
      json[r'paging'] = null;
    }
    return json;
  }

  /// Returns a new [GetOrdersResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetOrdersResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetOrdersResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetOrdersResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetOrdersResponse(
        pager: FlippingPagerDTO.fromJson(json[r'pager']),
        orders: OrderDTO.listFromJson(json[r'orders']),
        paging: ForwardScrollingPagerDTO.fromJson(json[r'paging']),
      );
    }
    return null;
  }

  static List<GetOrdersResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetOrdersResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetOrdersResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetOrdersResponse> mapFromJson(dynamic json) {
    final map = <String, GetOrdersResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetOrdersResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetOrdersResponse-objects as value to a dart map
  static Map<String, List<GetOrdersResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetOrdersResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetOrdersResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'orders',
  };
}


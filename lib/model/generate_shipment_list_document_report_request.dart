//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateShipmentListDocumentReportRequest {
  /// Returns a new [GenerateShipmentListDocumentReportRequest] instance.
  GenerateShipmentListDocumentReportRequest({
    required this.campaignId,
    this.shipmentId,
    this.orderIds = const [],
  });

  /// Идентификатор кампании.
  int campaignId;

  /// Идентификатор отгрузки.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? shipmentId;

  /// Фильтр по идентификаторам заказа в отгрузке.
  List<int>? orderIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateShipmentListDocumentReportRequest &&
    other.campaignId == campaignId &&
    other.shipmentId == shipmentId &&
    _deepEquality.equals(other.orderIds, orderIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (shipmentId == null ? 0 : shipmentId!.hashCode) +
    (orderIds == null ? 0 : orderIds!.hashCode);

  @override
  String toString() => 'GenerateShipmentListDocumentReportRequest[campaignId=$campaignId, shipmentId=$shipmentId, orderIds=$orderIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
    if (this.shipmentId != null) {
      json[r'shipmentId'] = this.shipmentId;
    } else {
      json[r'shipmentId'] = null;
    }
    if (this.orderIds != null) {
      json[r'orderIds'] = this.orderIds;
    } else {
      json[r'orderIds'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateShipmentListDocumentReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateShipmentListDocumentReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateShipmentListDocumentReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateShipmentListDocumentReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateShipmentListDocumentReportRequest(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        shipmentId: mapValueOfType<int>(json, r'shipmentId'),
        orderIds: json[r'orderIds'] is Iterable
            ? (json[r'orderIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<GenerateShipmentListDocumentReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateShipmentListDocumentReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateShipmentListDocumentReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateShipmentListDocumentReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateShipmentListDocumentReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateShipmentListDocumentReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateShipmentListDocumentReportRequest-objects as value to a dart map
  static Map<String, List<GenerateShipmentListDocumentReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateShipmentListDocumentReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateShipmentListDocumentReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
  };
}


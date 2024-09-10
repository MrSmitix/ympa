//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateUnitedOrdersRequest {
  /// Returns a new [GenerateUnitedOrdersRequest] instance.
  GenerateUnitedOrdersRequest({
    required this.businessId,
    required this.dateFrom,
    required this.dateTo,
    this.campaignIds = const [],
    this.promoId,
  });

  /// Идентификатор бизнеса.
  int businessId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно. Максимальный период — 1 год.
  DateTime dateTo;

  /// Список магазинов, которые нужны в отчете.
  List<int>? campaignIds;

  /// Идентификатор акции, товары из которой нужны в отчете.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promoId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateUnitedOrdersRequest &&
    other.businessId == businessId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    _deepEquality.equals(other.campaignIds, campaignIds) &&
    other.promoId == promoId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessId.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode) +
    (campaignIds == null ? 0 : campaignIds!.hashCode) +
    (promoId == null ? 0 : promoId!.hashCode);

  @override
  String toString() => 'GenerateUnitedOrdersRequest[businessId=$businessId, dateFrom=$dateFrom, dateTo=$dateTo, campaignIds=$campaignIds, promoId=$promoId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'businessId'] = this.businessId;
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
    if (this.campaignIds != null) {
      json[r'campaignIds'] = this.campaignIds;
    } else {
      json[r'campaignIds'] = null;
    }
    if (this.promoId != null) {
      json[r'promoId'] = this.promoId;
    } else {
      json[r'promoId'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateUnitedOrdersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateUnitedOrdersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateUnitedOrdersRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateUnitedOrdersRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateUnitedOrdersRequest(
        businessId: mapValueOfType<int>(json, r'businessId')!,
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
        campaignIds: json[r'campaignIds'] is Iterable
            ? (json[r'campaignIds'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        promoId: mapValueOfType<String>(json, r'promoId'),
      );
    }
    return null;
  }

  static List<GenerateUnitedOrdersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateUnitedOrdersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateUnitedOrdersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateUnitedOrdersRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateUnitedOrdersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateUnitedOrdersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateUnitedOrdersRequest-objects as value to a dart map
  static Map<String, List<GenerateUnitedOrdersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateUnitedOrdersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateUnitedOrdersRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'businessId',
    'dateFrom',
    'dateTo',
  };
}


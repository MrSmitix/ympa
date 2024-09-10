//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerateGoodsMovementReportRequest {
  /// Returns a new [GenerateGoodsMovementReportRequest] instance.
  GenerateGoodsMovementReportRequest({
    required this.campaignId,
    required this.dateFrom,
    required this.dateTo,
    this.shopSku,
  });

  /// Идентификатор кампании.
  int campaignId;

  /// Начало периода, включительно.
  DateTime dateFrom;

  /// Конец периода, включительно.
  DateTime dateTo;

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? shopSku;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerateGoodsMovementReportRequest &&
    other.campaignId == campaignId &&
    other.dateFrom == dateFrom &&
    other.dateTo == dateTo &&
    other.shopSku == shopSku;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignId.hashCode) +
    (dateFrom.hashCode) +
    (dateTo.hashCode) +
    (shopSku == null ? 0 : shopSku!.hashCode);

  @override
  String toString() => 'GenerateGoodsMovementReportRequest[campaignId=$campaignId, dateFrom=$dateFrom, dateTo=$dateTo, shopSku=$shopSku]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaignId'] = this.campaignId;
      json[r'dateFrom'] = _dateFormatter.format(this.dateFrom.toUtc());
      json[r'dateTo'] = _dateFormatter.format(this.dateTo.toUtc());
    if (this.shopSku != null) {
      json[r'shopSku'] = this.shopSku;
    } else {
      json[r'shopSku'] = null;
    }
    return json;
  }

  /// Returns a new [GenerateGoodsMovementReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerateGoodsMovementReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerateGoodsMovementReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerateGoodsMovementReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerateGoodsMovementReportRequest(
        campaignId: mapValueOfType<int>(json, r'campaignId')!,
        dateFrom: mapDateTime(json, r'dateFrom', r'')!,
        dateTo: mapDateTime(json, r'dateTo', r'')!,
        shopSku: mapValueOfType<String>(json, r'shopSku'),
      );
    }
    return null;
  }

  static List<GenerateGoodsMovementReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerateGoodsMovementReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerateGoodsMovementReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerateGoodsMovementReportRequest> mapFromJson(dynamic json) {
    final map = <String, GenerateGoodsMovementReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerateGoodsMovementReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerateGoodsMovementReportRequest-objects as value to a dart map
  static Map<String, List<GenerateGoodsMovementReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerateGoodsMovementReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerateGoodsMovementReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'campaignId',
    'dateFrom',
    'dateTo',
  };
}


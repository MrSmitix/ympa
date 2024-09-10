//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetCampaignOfferDTO {
  /// Returns a new [GetCampaignOfferDTO] instance.
  GetCampaignOfferDTO({
    required this.offerId,
    this.quantum,
    this.available,
    this.basicPrice,
    this.campaignPrice,
    this.status,
    this.errors = const [],
    this.warnings = const [],
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  QuantumDTO? quantum;

  /// Есть ли товар в продаже. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? available;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetPriceWithDiscountDTO? basicPrice;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  GetPriceWithVatDTO? campaignPrice;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OfferCampaignStatusType? status;

  /// Ошибки, препятствующие размещению товара на витрине. 
  List<OfferErrorDTO>? errors;

  /// Предупреждения, не препятствующие размещению товара на витрине. 
  List<OfferErrorDTO>? warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetCampaignOfferDTO &&
    other.offerId == offerId &&
    other.quantum == quantum &&
    other.available == available &&
    other.basicPrice == basicPrice &&
    other.campaignPrice == campaignPrice &&
    other.status == status &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (quantum == null ? 0 : quantum!.hashCode) +
    (available == null ? 0 : available!.hashCode) +
    (basicPrice == null ? 0 : basicPrice!.hashCode) +
    (campaignPrice == null ? 0 : campaignPrice!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (errors == null ? 0 : errors!.hashCode) +
    (warnings == null ? 0 : warnings!.hashCode);

  @override
  String toString() => 'GetCampaignOfferDTO[offerId=$offerId, quantum=$quantum, available=$available, basicPrice=$basicPrice, campaignPrice=$campaignPrice, status=$status, errors=$errors, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.quantum != null) {
      json[r'quantum'] = this.quantum;
    } else {
      json[r'quantum'] = null;
    }
    if (this.available != null) {
      json[r'available'] = this.available;
    } else {
      json[r'available'] = null;
    }
    if (this.basicPrice != null) {
      json[r'basicPrice'] = this.basicPrice;
    } else {
      json[r'basicPrice'] = null;
    }
    if (this.campaignPrice != null) {
      json[r'campaignPrice'] = this.campaignPrice;
    } else {
      json[r'campaignPrice'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.errors != null) {
      json[r'errors'] = this.errors;
    } else {
      json[r'errors'] = null;
    }
    if (this.warnings != null) {
      json[r'warnings'] = this.warnings;
    } else {
      json[r'warnings'] = null;
    }
    return json;
  }

  /// Returns a new [GetCampaignOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetCampaignOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetCampaignOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetCampaignOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetCampaignOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        quantum: QuantumDTO.fromJson(json[r'quantum']),
        available: mapValueOfType<bool>(json, r'available'),
        basicPrice: GetPriceWithDiscountDTO.fromJson(json[r'basicPrice']),
        campaignPrice: GetPriceWithVatDTO.fromJson(json[r'campaignPrice']),
        status: OfferCampaignStatusType.fromJson(json[r'status']),
        errors: OfferErrorDTO.listFromJson(json[r'errors']),
        warnings: OfferErrorDTO.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<GetCampaignOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetCampaignOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetCampaignOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetCampaignOfferDTO> mapFromJson(dynamic json) {
    final map = <String, GetCampaignOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetCampaignOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetCampaignOfferDTO-objects as value to a dart map
  static Map<String, List<GetCampaignOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetCampaignOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetCampaignOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
  };
}


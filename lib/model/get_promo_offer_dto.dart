//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetPromoOfferDTO {
  /// Returns a new [GetPromoOfferDTO] instance.
  GetPromoOfferDTO({
    required this.offerId,
    required this.status,
    required this.params,
    this.autoParticipatingDetails,
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  PromoOfferParticipationStatusType status;

  PromoOfferParamsDTO params;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PromoOfferAutoParticipatingDetailsDTO? autoParticipatingDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetPromoOfferDTO &&
    other.offerId == offerId &&
    other.status == status &&
    other.params == params &&
    other.autoParticipatingDetails == autoParticipatingDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (status.hashCode) +
    (params.hashCode) +
    (autoParticipatingDetails == null ? 0 : autoParticipatingDetails!.hashCode);

  @override
  String toString() => 'GetPromoOfferDTO[offerId=$offerId, status=$status, params=$params, autoParticipatingDetails=$autoParticipatingDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
      json[r'status'] = this.status;
      json[r'params'] = this.params;
    if (this.autoParticipatingDetails != null) {
      json[r'autoParticipatingDetails'] = this.autoParticipatingDetails;
    } else {
      json[r'autoParticipatingDetails'] = null;
    }
    return json;
  }

  /// Returns a new [GetPromoOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetPromoOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetPromoOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetPromoOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetPromoOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        status: PromoOfferParticipationStatusType.fromJson(json[r'status'])!,
        params: PromoOfferParamsDTO.fromJson(json[r'params'])!,
        autoParticipatingDetails: PromoOfferAutoParticipatingDetailsDTO.fromJson(json[r'autoParticipatingDetails']),
      );
    }
    return null;
  }

  static List<GetPromoOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetPromoOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetPromoOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetPromoOfferDTO> mapFromJson(dynamic json) {
    final map = <String, GetPromoOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetPromoOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetPromoOfferDTO-objects as value to a dart map
  static Map<String, List<GetPromoOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetPromoOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetPromoOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
    'status',
    'params',
  };
}


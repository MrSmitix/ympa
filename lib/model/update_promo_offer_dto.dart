//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdatePromoOfferDTO {
  /// Returns a new [UpdatePromoOfferDTO] instance.
  UpdatePromoOfferDTO({
    required this.offerId,
    this.params,
  });

  /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  String offerId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  UpdatePromoOfferParamsDTO? params;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdatePromoOfferDTO &&
    other.offerId == offerId &&
    other.params == params;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerId.hashCode) +
    (params == null ? 0 : params!.hashCode);

  @override
  String toString() => 'UpdatePromoOfferDTO[offerId=$offerId, params=$params]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerId'] = this.offerId;
    if (this.params != null) {
      json[r'params'] = this.params;
    } else {
      json[r'params'] = null;
    }
    return json;
  }

  /// Returns a new [UpdatePromoOfferDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdatePromoOfferDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdatePromoOfferDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdatePromoOfferDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdatePromoOfferDTO(
        offerId: mapValueOfType<String>(json, r'offerId')!,
        params: UpdatePromoOfferParamsDTO.fromJson(json[r'params']),
      );
    }
    return null;
  }

  static List<UpdatePromoOfferDTO> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdatePromoOfferDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdatePromoOfferDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdatePromoOfferDTO> mapFromJson(dynamic json) {
    final map = <String, UpdatePromoOfferDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdatePromoOfferDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdatePromoOfferDTO-objects as value to a dart map
  static Map<String, List<UpdatePromoOfferDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdatePromoOfferDTO>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdatePromoOfferDTO.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerId',
  };
}

